// Generated from pil.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pilParser}.
 */
public interface pilListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pilParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pilParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pilParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pilParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link pilParser#compound}.
	 * @param ctx the parse tree
	 */
	void enterCompound(pilParser.CompoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link pilParser#compound}.
	 * @param ctx the parse tree
	 */
	void exitCompound(pilParser.CompoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link pilParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(pilParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link pilParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(pilParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link pilParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(pilParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pilParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(pilParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEquals}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprEquals(pilParser.ExprEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEquals}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprEquals(pilParser.ExprEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(pilParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(pilParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprString(pilParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprString(pilParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAndThen}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAndThen(pilParser.ExprAndThenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAndThen}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAndThen(pilParser.ExprAndThenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolean(pilParser.ExprBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolean(pilParser.ExprBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(pilParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(pilParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAndOr}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAndOr(pilParser.ExprAndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAndOr}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAndOr(pilParser.ExprAndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOrElse}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOrElse(pilParser.ExprOrElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOrElse}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOrElse(pilParser.ExprOrElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(pilParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(pilParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(pilParser.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(pilParser.ExprNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(pilParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(pilParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(pilParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(pilParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(pilParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link pilParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(pilParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link pilParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(pilParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link pilParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(pilParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link pilParser#boolOp2}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp2(pilParser.BoolOp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link pilParser#boolOp2}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp2(pilParser.BoolOp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link pilParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(pilParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pilParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(pilParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pilParser#writestat}.
	 * @param ctx the parse tree
	 */
	void enterWritestat(pilParser.WritestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link pilParser#writestat}.
	 * @param ctx the parse tree
	 */
	void exitWritestat(pilParser.WritestatContext ctx);
	/**
	 * Enter a parse tree produced by {@link pilParser#conditionalStat}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStat(pilParser.ConditionalStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link pilParser#conditionalStat}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStat(pilParser.ConditionalStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link pilParser#loopStat}.
	 * @param ctx the parse tree
	 */
	void enterLoopStat(pilParser.LoopStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link pilParser#loopStat}.
	 * @param ctx the parse tree
	 */
	void exitLoopStat(pilParser.LoopStatContext ctx);
}