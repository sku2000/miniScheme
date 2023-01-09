// Generated from java-escape by ANTLR 4.11.1

package parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SS2Parser}.
 */
public interface SS2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SS2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SS2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SS2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SS2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SS2Parser#abstracts}.
	 * @param ctx the parse tree
	 */
	void enterAbstracts(SS2Parser.AbstractsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SS2Parser#abstracts}.
	 * @param ctx the parse tree
	 */
	void exitAbstracts(SS2Parser.AbstractsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code immediate}
	 * labeled alternative in {@link SS2Parser#tail}.
	 * @param ctx the parse tree
	 */
	void enterImmediate(SS2Parser.ImmediateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code immediate}
	 * labeled alternative in {@link SS2Parser#tail}.
	 * @param ctx the parse tree
	 */
	void exitImmediate(SS2Parser.ImmediateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link SS2Parser#tail}.
	 * @param ctx the parse tree
	 */
	void enterSequence(SS2Parser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link SS2Parser#tail}.
	 * @param ctx the parse tree
	 */
	void exitSequence(SS2Parser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directAssign}
	 * labeled alternative in {@link SS2Parser#effect}.
	 * @param ctx the parse tree
	 */
	void enterDirectAssign(SS2Parser.DirectAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directAssign}
	 * labeled alternative in {@link SS2Parser#effect}.
	 * @param ctx the parse tree
	 */
	void exitDirectAssign(SS2Parser.DirectAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAssign}
	 * labeled alternative in {@link SS2Parser#effect}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAssign(SS2Parser.ExpressionAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAssign}
	 * labeled alternative in {@link SS2Parser#effect}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAssign(SS2Parser.ExpressionAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SS2Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(SS2Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SS2Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(SS2Parser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SS2Parser#triv}.
	 * @param ctx the parse tree
	 */
	void enterTriv(SS2Parser.TrivContext ctx);
	/**
	 * Exit a parse tree produced by {@link SS2Parser#triv}.
	 * @param ctx the parse tree
	 */
	void exitTriv(SS2Parser.TrivContext ctx);
}