package check;

import org.apache.log4j.Logger;
import parser.SS2BaseListener;
import parser.SS2Parser;

import java.util.HashSet;
import java.util.Set;

public class GrammarCheck extends SS2BaseListener {
    private static Logger logger = Logger.getLogger(SS2BaseListener.class);
    private Set<Integer> set = new HashSet<>();

    boolean isUint6(int n) {
        if (n >= 0 && n <= 63)
            return true;
        else
            return false;
    }

    @Override
    public void enterAbstracts(SS2Parser.AbstractsContext ctx) {
        // LABEL
        var label = ctx.getChild(1);
        String text = label.getText();
        int i = Integer.parseInt(text.substring(text.lastIndexOf("$")+1));

        if (set.contains(i))
            logger.error("编译错误 " + ctx.getStart().getLine() +
                    "：label 后缀不唯一，" + ctx.getText());
        else
            set.add(i);
    }

    // (set! Var (op Triv1 Triv2))
    @Override
    public void enterExpressionAssign(SS2Parser.ExpressionAssignContext ctx) {
        var var = ctx.var();
        var lhs = ctx.triv(0);
        var rhs = ctx.triv(1);

        if (!var.getText().equals(lhs.getText()))
            logger.error("编译错误 " + var.getStart().getLine() +
                    "：在 (set! Var (op Triv1 Triv2)) 里，Var 和 Triv1 必需相同, "
                    + ctx.getText());

        if (lhs.getStart().getType() == SS2Parser.LABEL
                || rhs.getStart().getType() == SS2Parser.LABEL)
            logger.error("编译错误" + lhs.getStart().getLine() +
                    "：label 不能是二元运算的操作数, " + ctx.getText());
        if (ctx.op.getType() == SS2Parser.MUL)
            if (!(var.getStart().getType() == SS2Parser.REG))
                logger.error("编译错误" + var.getStart().getLine() +
                        "：乘法的赋值变量必须是寄存器变量, " + ctx.getText());

        if (ctx.op.getType() == SS2Parser.SRA)
            if (!isUint6(Integer.parseInt(rhs.getText())))
                logger.error("编译错误" + rhs.getStart().getLine() +
                        "：sra 的第二个操作数必须大于0，小于63, " + ctx.getText());

        if (rhs.getStart().getType() == SS2Parser.NUMBER)
            Integer.parseInt(rhs.getText());
    }

    @Override
    public void enterDirectAssign(SS2Parser.DirectAssignContext ctx) {
        var var = ctx.var();
        var triv = ctx.triv();

        if ((triv.getStart().getType() == SS2Parser.LABEL) &&
                (var.getStart().getType() != SS2Parser.REG))
            logger.error("编译错误" + var.getStart().getLine() +
                    "：如果 triv 是 label，那么 var 必须是 reg 类型, "
                    + ctx.getText());
        if (triv.getStart().getType() == SS2Parser.NUMBER)
            if (var.getStart().getType() != SS2Parser.REG)
                logger.error("编译错误" + var.getStart().getLine() +
                        "：如果 triv 是整数，那么 var 必须是 reg 类型, "
                        + ctx.getText());
            else
                Long.parseLong(triv.getText());

    }

    @Override
    public void enterImmediate(SS2Parser.ImmediateContext ctx) {
        if (ctx.triv().getStart().getType() == SS2Parser.NUMBER)
            logger.error("编译错误" + ctx.triv().getStart().getLine() +
                    "：在 (triv) 里，triv 不能是数字, "
                    + ctx.getText());
    }
}
