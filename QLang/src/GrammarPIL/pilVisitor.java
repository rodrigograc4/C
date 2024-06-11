// Generated from pil.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pilParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pilVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pilParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(pilParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link pilParser#compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound(pilParser.CompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link pilParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(pilParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link pilParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(pilParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEquals}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEquals(pilParser.ExprEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRead(pilParser.ExprReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(pilParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAndThen}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAndThen(pilParser.ExprAndThenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBoolean(pilParser.ExprBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(pilParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAndOr}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAndOr(pilParser.ExprAndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOrElse}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOrElse(pilParser.ExprOrElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(pilParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumber(pilParser.ExprNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDiv(pilParser.ExprMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(pilParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(pilParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link pilParser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp(pilParser.BoolOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link pilParser#boolOp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp2(pilParser.BoolOp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link pilParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(pilParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pilParser#writestat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWritestat(pilParser.WritestatContext ctx);
	/**
	 * Visit a parse tree produced by {@link pilParser#conditionalStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStat(pilParser.ConditionalStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link pilParser#loopStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStat(pilParser.LoopStatContext ctx);
}