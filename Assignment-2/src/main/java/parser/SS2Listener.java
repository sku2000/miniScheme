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
	 * Enter a parse tree produced by {@link SS2Parser#tail}.
	 * @param ctx the parse tree
	 */
	void enterTail(SS2Parser.TailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SS2Parser#tail}.
	 * @param ctx the parse tree
	 */
	void exitTail(SS2Parser.TailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SS2Parser#effect}.
	 * @param ctx the parse tree
	 */
	void enterEffect(SS2Parser.EffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SS2Parser#effect}.
	 * @param ctx the parse tree
	 */
	void exitEffect(SS2Parser.EffectContext ctx);
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