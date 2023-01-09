package test;

import check.GrammarCheck;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import parser.SS2Lexer;
import parser.SS2Parser;


public class SS2Test {

    @Test
    public void testGrammarCheck() {

        for (int i = 0; i < DataTest.data.length; i++) {
            System.out.println("第"+ (i + 1) + "个程序，如果有错误将打印错误信息：");
            CharStream charStream = CharStreams.fromString(DataTest.data[i]);
            SS2Lexer lexer = new SS2Lexer(charStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            SS2Parser parser = new SS2Parser(tokenStream);
            ParseTree tree = parser.program();

            ParseTreeWalker walker = new ParseTreeWalker();
            GrammarCheck check = new GrammarCheck();
            walker.walk(check, tree);

        }
    }
}
