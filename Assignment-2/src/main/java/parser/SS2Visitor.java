// Generated from java-escape by ANTLR 4.11.1

package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SS2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SS2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SS2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SS2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SS2Parser#abstracts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstracts(SS2Parser.AbstractsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code immediate}
	 * labeled alternative in {@link SS2Parser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmediate(SS2Parser.ImmediateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sequence}
	 * labeled alternative in {@link SS2Parser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(SS2Parser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directAssign}
	 * labeled alternative in {@link SS2Parser#effect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAssign(SS2Parser.DirectAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAssign}
	 * labeled alternative in {@link SS2Parser#effect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAssign(SS2Parser.ExpressionAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SS2Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SS2Parser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SS2Parser#triv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriv(SS2Parser.TrivContext ctx);
}