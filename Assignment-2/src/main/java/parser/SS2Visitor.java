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
	 * Visit a parse tree produced by {@link SS2Parser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTail(SS2Parser.TailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SS2Parser#effect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffect(SS2Parser.EffectContext ctx);
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