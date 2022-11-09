import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface ASTVisitor {
    public <T> T forVar(Var v);
    public <T> T forSBool(SBool sBool);
    public <T> T forSInt(SInt sInt);
    public <T> T forAList(AList aList);
    public <T> T forProgram(Program program);
}

interface AST {
    public <T> T accept(ASTVisitor ask);
}

class Program implements AST {
    AST program;
    Program(AST p) {
        program = p;
    }
    @Override
    public <T> T accept(ASTVisitor ask) {
        return ask.forProgram(this);
    }

    @Override
    public String toString() {
        return program.toString();
    }
}
class Var implements AST {
    String v;
    Var(String text) {
        v = text;
    }
    @Override
    public <T> T accept(ASTVisitor ask) {
        return ask.forVar(this);
    }

    @Override
    public String toString() {
        return v;
    }
}

class SBool implements AST {
    int b;
    SBool(int b) {
        this.b = b;
    }
    @Override
    public <T> T accept(ASTVisitor ask) {
        return ask.forSBool(this);
    }

    @Override
    public String toString() {
        if (b == 0)
            return "#f";
        else
            return "#t";
    }
}

class SInt implements AST {
    long i;
    SInt(long i) {
        this.i = i;
    }
    @Override
    public <T> T accept(ASTVisitor ask) {
        return ask.forSInt(this);
    }

    @Override
    public String toString() {
        return String.valueOf(i);
    }
}

class AList implements AST {
    ArrayList<AST> list;
    AList(ArrayList<AST> list) {
        this.list = list;
    }
    @Override
    public <T> T accept(ASTVisitor ask) {
        return ask.forAList(this);
    }

    @Override
    public String toString() {
        list.toString();
        Iterator<AST> it = list.iterator();
        if (!it.hasNext())
            return "()";

        String str = "(";
        for (;;) {
            AST ast = it.next();
            str += ast.toString();

            if (!it.hasNext())
                return str + ")";
            str += " ";
        }
    }
}

class Parser {
    String text;
    AST results;
    Parser parserSymbols(String pattern, Function<String, AST> f) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if (m.find()) {
            results = f.apply(m.group());
            text = m.replaceFirst("");
            return this;
        } else {
            Parser parser = new Parser();
            parser.text = "";
            parser.results = null;
            return parser;
        }
    }

    Parser parseSubList(Function<AST, AList> f) {
        if (this.text.isEmpty() && results == null)
            return this;
        text = text.trim();
        Parser parser = parseSub();

        if (parser.text.isEmpty() && parser.results == null) {
            results = f.apply(null);
            return this;
        }

        AList aList = f.apply(parser.results);

        text = text.trim();

        parseSubList((res) -> {
            if (res == null)
                return aList;
            aList.list.add(res);
            return aList;
        });
        return this;
    }

    Parser parseList() {
        if (text.isEmpty() && results == null)
            return this;

        return parserSymbols("^\\(", (str) -> new Var(str)).
                parseSubList((res) -> {
                    AList aList = new AList(new ArrayList<>());
                    if (res == null)
                        return aList;
                    aList.list.add(res);
                    return aList;
                }).parserSymbols("^\\)", (str) -> results);
    }

    Parser OR(Parser p, Function<Parser, Parser> f) {
        if (this.text.isEmpty() && this.results == null)
            return f.apply(p);
        return this;
    }

    Parser parseSub() {
        return parseList().OR(this, (p) ->
                        p.parserSymbols("^#t", (str) ->
                                new SBool(1))).
                OR(this, (p) ->
                        p.parserSymbols("^#f", (str) ->
                                new SBool(0))).
                OR(this,(p) ->
                        p.parserSymbols("^[\\d]+", (str) ->
                                new SInt(Long.parseLong(str)))).
                OR(this, (p) -> p.parserSymbols("^[a-zA-Z][a-zA-Z0-9_@#!]*", (str) ->
                        new Var(str))).
                OR(this, (p) -> p.parserSymbols("^[-+*]", (str) ->
                        new Var(str)));
    }

    public AST parse(String text) {
        if (text.isEmpty() || (text == null))
            throw new RuntimeException("源代码不能为 null");
        this.text = text.trim();

        Parser parser = parseSub();

        if (parser.results == null)
            throw new RuntimeException("解析错误" + this.text);

        return new Program(parser.results);
    }
}

interface PassBase<IR> {
    public IR run(IR ir);
}

class PassManager<T, P extends PassBase<T>> implements PassBase<T> {
    ArrayList<P> list;

    @Override
    public T run(T t) {
        for (P pass : list) {
            t = pass.run(t);
        }

        return t;
    }

    PassManager() {
        list = new ArrayList<>();
    }
    public void addPass(P pass) {
        list.add(pass);
    }
}

class VerifierScheme implements PassBase<AST> {
    class Default implements ASTVisitor {
        @Override
        public <T> T forVar(Var v) {
            throw new RuntimeException("语法错误：" +  v.toString());
        }
        @Override
        public <T> T forSBool(SBool sBool) {
            throw new RuntimeException("语法错误：" +  sBool.toString());

        }
        @Override
        public <T> T forSInt(SInt sInt) {
            throw new RuntimeException("语法错误：" +  sInt.toString());
        }
        @Override
        public <T> T forAList(AList aList) {
            throw new RuntimeException("语法错误：" +  aList.toString());
        }
        @Override
        public <T> T forProgram(Program program) {
            throw new RuntimeException("语法错误：" +  program.toString());
        }
    }

    class StatementThird extends Default {
        String var;
        ArrayList<String> vars;
        ArrayList<String> binop = new ArrayList<>(Arrays.asList(new String[]{"+", "-", "*"}));
        StatementThird(ArrayList<String> vars, String var) {
            this.vars = vars;
            this.var = var;
        }
        @Override
        public Var forVar(Var v) {
            vars.contains(v.toString());
            return v;
        }

        @Override
        public SInt forSInt(SInt sInt) {
            return sInt;
        }

        @Override
        public AList forAList(AList aList) {
            if (aList.list.size() != 3)
                throw new RuntimeException("语法错误：" + aList.toString());
            if(binop.contains(aList.list.get(0).toString()) &&
                    aList.list.get(1).toString().equals(var)) {
                AST ast = aList.list.get(2);
                if (ast instanceof SInt) {
                    if ((-Math.pow(2, 31)) < ((SInt) ast).i && ((SInt) ast).i < Math.pow(2, 31))
                        return aList;
                    else
                        throw new RuntimeException("语法错误：" + aList.toString());
                } else if (ast instanceof Var) {
                    if (vars.contains(ast.toString()))
                        return aList;
                    else
                        throw new RuntimeException("语法错误：" + aList.toString());
                } else
                    throw new RuntimeException("语法错误：" + aList.toString());
            } else
                throw new RuntimeException("语法错误：" + aList.toString());
        }
    }

    class Statement extends Default {
        ArrayList<String> vars = new ArrayList<>(Arrays.asList(new String[]{"rax", "rcx", "rdx", "rbx", "rbp", "rsi", "rdi",
                "r8", "r9", "r10", "r11", "r12", "r13", "r14", "r15"}));
        @Override
        public AList forAList(AList aList) {
            if (aList.list.size() != 3)
                throw new RuntimeException("语法错误：" + aList.toString());
            if (aList.list.get(0).toString().equals("set!") &&
                    vars.contains(aList.list.get(1).toString())) {
                aList.list.get(2).accept(new StatementThird(vars, aList.list.get(1).toString()));
            } else
                throw new RuntimeException("语法错误：" + aList.toString());
            return aList;
        }
    }

    class Begin extends Default {
        @Override
        public AList forAList(AList aList) {
            Iterator<AST> it =  aList.list.iterator();
            if (!it.hasNext() || !it.next().toString().equals("begin"))
                throw new RuntimeException("语法错误：" + aList.toString());
            for (;;) {
                AST ast = it.next();
                ast.accept(new Statement());
                if (!it.hasNext()) {
                    if(!((AList)ast).list.get(1).toString().equals("rax"))
                        throw new RuntimeException("语法错误：" + aList.toString());
                    return aList;
                }
            }
        }

        @Override
        public Program forProgram(Program program) {
            program.program.accept(this);
            return program;
        }
    }
    @Override
    public AST run(AST ast) {
        return ast.accept(new Begin());
    }
}
class GenerateX8664 implements PassBase<AST> {

    @Override
    public AST run(AST ast) {
        return null;
    }
}
public class Assignment1 {
    public static String test(String str, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        m.find();

        String s = m.group();
        System.out.println(s + " : " + m.replaceFirst(""));

        return s;
    }
    public static void main(String[] args) {
        String str = " ( begin\n" +
                "(  set! rax 5000000000)\n" +
                "( set! rcx 3)\n" +
                "( set! rax (- rax rcx)))";

        Parser p = new Parser();
        AST ast = p.parse(str);

        VerifierScheme verifierScheme = new VerifierScheme();

        AST ast1 = verifierScheme.run(ast);

        String s = ast1.toString();

        System.out.println(s);

//        Pattern pattern = Pattern.compile("^[-+*]");
//        Matcher m = pattern.matcher("/ 1 2");

    }
}