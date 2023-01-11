package generatex8664;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.*;

import java.util.Map;

public class Generate extends SS2BaseVisitor<String> {

    @Override
    public String visitProgram(SS2Parser.ProgramContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append("\t.globl _shceme_entry\n");
        builder.append("_shceme_entry\n");
        builder.append("\tpushq %rbx\n");
        builder.append("\tpushq %rbp\n");
        builder.append("\tpushq %r12\n\n");
        builder.append("\tpushq %r13\n\n");
        builder.append("\tpushq %r14\n");
        builder.append("\tpushq %r15\n");
        builder.append("\tmovq %rdi, %rbp\n");
        builder.append("\tleaq _scheme_exit(%rip), %r15\n\n\n");

        builder.append(visit(ctx.tail()));

        for (var abs : ctx.abstracts())
            builder.append(visit(abs));

        builder.append("\n_scheme_exit:\n");
        builder.append("\tpopq %r15\n");
        builder.append("\tpopq %r14\n");
        builder.append("\tpopq %r13\n");
        builder.append("\tpopq %r12\n");
        builder.append("\tpopq %rbp\n");
        builder.append("\tpopq %rbx\n\n");
        builder.append("\tret\n");

        return new String(builder);
    }

    @Override
    public String visitAbstracts(SS2Parser.AbstractsContext ctx) {
        StringBuilder builder = new StringBuilder();
        String text = ctx.LABEL().getText();
        builder.append("L" + text.substring(text.lastIndexOf("$")+1) + "\n");
        builder.append(visit(ctx.tail()));

        return new String(builder);
    }

    @Override
    public String visitImmediate(SS2Parser.ImmediateContext ctx) {
        var token = ctx.triv().getStart();

        if (token.getType() == SS2Parser.LABEL)
            return "\tjmp " + visit(ctx.triv()) + "\n";
        return "\tjmp *" + visit(ctx.triv()) + "\n";

    }

    @Override
    public String visitSequence(SS2Parser.SequenceContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (var effect : ctx.effect())
            builder.append(visit(effect));
        builder.append(visit(ctx.tail()));
        return new String(builder);
    }

    @Override
    public String visitDirectAssign(SS2Parser.DirectAssignContext ctx) {
        StringBuilder builder = new StringBuilder();
        Token tirvToken = ctx.triv().getStart();
        if (tirvToken.getType() == SS2Parser.LABEL) {
            builder.append("leaq " + visit(ctx.triv()) + " " + visit(ctx.var()) + "\n");
        } else {
            builder.append("movq " + visit(ctx.triv()) + " " + visit(ctx.var()) + "\n");
        }
        return new String(builder);
    }

    @Override
    public String visitExpressionAssign(SS2Parser.ExpressionAssignContext ctx) {
        String op = "";
        String left = "";
        String right = "";
        if (ctx.op.getType() == SS2Parser.ADD)
            op = "addq";
        else if (ctx.op.getType() == SS2Parser.SUB)
            op = "subq";
        else if (ctx.op.getType() == SS2Parser.MUL)
            op = "imulq";
        else if (ctx.op.getType() == SS2Parser.SRA)
            op = "sarq";
        else if (ctx.op.getType() == SS2Parser.AND)
            op = "andq";
        else if (ctx.op.getType() == SS2Parser.OR)
            op = "orq";

        left = visit(ctx.triv(1));
        right = visit(ctx.var());

        return op + " " + left + " " + right + "\n";
    }

    public String exposeFrameVar(String register, int index) {
        return index + "(" + register + ")";
    }

    @Override
    public String visitVar(SS2Parser.VarContext ctx) {
        var token = ctx.getStart();

        if (token.getType() == SS2Parser.REG)
            return "%" + token.getText();

        String text = token.getText();
        return exposeFrameVar("%rbp", Integer.parseInt(text.substring(text.lastIndexOf("fv"))));
    }

    @Override
    public String visitTriv(SS2Parser.TrivContext ctx) {

        var token = ctx.getStart();

        if (token.getType() == SS2Parser.NUMBER)
            return "$" + token.getText();
        else if (token.getType() == SS2Parser.LABEL) {
            String text = token.getText();
            return "L" + text.substring(text.lastIndexOf("$")+1);
        } else
            return visit(ctx.var());
    }
}