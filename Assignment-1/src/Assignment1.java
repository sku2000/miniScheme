import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface ASTVisitor {
    public <T> T forVar(Var v);
    public <T> T forEmpty(Empty empty);
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
}

class SBool implements AST {
    int b;
    SBool(int b) {
        b = b;
    }
    @Override
    public <T> T accept(ASTVisitor ask) {
        return ask.forSBool(this);
    }
}

class SInt implements AST {
    int i;
    SInt(int i) {
        i = i;
    }
    @Override
    public <T> T accept(ASTVisitor ask) {
        return ask.forSInt(this);
    }
}

class Empty implements AST {
    @Override
    public <T> T accept(ASTVisitor ask) {
        return ask.forEmpty(this);
    }
}

class AList implements AST {
    ArrayList<AST> list;
    AList(String text, ArrayList<AST> list) {
        this.list = list;
    }
    @Override
    public <T> T accept(ASTVisitor ask) {
        return ask.forAList(this);
    }
}

class Parser {
//    char[] chs;
//    int opinter;
//    AST parseList() {
//        if (chs[opinter] == '(') {
//            opinter++;
//            AST ast = parseList();
//            if (chs[opinter] != ')')
//                throw new RuntimeException("不是合法的 list");
//            return ast;
//        } else {
//            if (chs[opinter] == ')')
//                return new Empty();
//            else if (chs[opinter] == '\s' )
//        }
//    }
//    void parseBlank() {
//        char[] blanks = {'\s', '\t', '\n', '\r'};
//
//        for (char c : ) {
//
//        }
//    }
//    AST parseGrammar() {
//        parseBlank();
//        if (chs[opinter] == '(') {
//            opinter++;
//            return parseList();
//        }
//    }
    String text;
    AST results;
    Parser parserSymbols(String pattern, Function<String, AST> f) {
        if (text.startsWith(pattern)) {
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(text);
            m.find();

            results = f.apply(m.group());
            text = m.replaceFirst("");
            return this;
        } else {
            Parser p = new Parser();
            p.text = "";
            p.results = null;
            return p;
        }
    }
    Parser parseBlank() {
        // limt = 2 表示匹配1次，如果匹配成功，strs 包含两个元素，第二个元素是需要的元素
        // 如何匹配失败，strs 则只包含一个元素
        String[] strs = text.split("^[\\s\\t\\n\\r]+", 2);
        if (strs.length == 2)
            text = strs[2];
        return this;
    }

    Parser ParseSubList() {
        if (text == null && results == null)
            return this;


        return null;
    }

    Parser parseList() {
        if (text == null && results == null)
            return this;
        text.split("\\)");

        return  null;
    }
    Parser AND(Parser p) {
        return null;
    }

    Parser OR(Parser p, Function<Parser, Parser> f) {
        if (this.text.isEmpty() && this.results == null)
            return f.apply(p);
        return this;
    }

    public AST parse(String text) {
        if (text.isEmpty() || (text == null))
            throw new RuntimeException("源代码不能为 null");
        text = text.trim();

        Parser parser = parseList().OR(this, (p) ->
                        p.parserSymbols("#t", (str) ->
                                new SBool(1))).
                OR(this, (p) ->
                        p.parserSymbols("#f", (str) ->
                                new SBool(0))).
                OR(this,(p) ->
                        p.parserSymbols("^(\\d+)", (str) ->
                                new SInt(Integer.parseInt(str)))).
                OR(this, (p) -> p.parserSymbols("[a-zA-Z][a-zA-Z0-9_@#]", (str) ->
                                new Var(str)));

        if (parser.results == null)
            throw new RuntimeException("解析错误");

        return new Program(parser.results);
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
        String str = "(begin\n" +
                "(set! rax 8)\n" +
                "(set! rcx 3)\n" +
                "(set! rax (- rax rcx)))";

//        String s1 = "   sadd";
//        String s2 = "s  add";
//        String s3 = "sadd   ";
//
//        String[] strs1 = s1.split("^[\\s\\t\\n\\r]+", 2);
//        System.out.println(Arrays.toString(strs1));
//        String[] strs2 = s2.split("^[\\s\\t\\n\\r]+", 2);
//        System.out.println(Arrays.toString(strs2));
//        String[] strs = s3.split("^[\\s\\t\\n\\r]+", 2);
//        System.out.println(Arrays.toString(strs));

        String str4 = "#t#tsadasd";
        Pattern p = Pattern.compile("#t");
        Matcher m = p.matcher(str4);
        m.find();
        System.out.println(m.group() + " : " + m.replaceFirst(""));

//        test("00123dada", "^(\\d+)");

        System.out.println(Integer.parseInt(test("00123 dada", "^(\\d+)")));

//        Parser p = new Parser();
//        p.parse(str);


    }
}