// Generated from Questions.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QuestionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QuestionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(QuestionsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound(QuestionsParser.CompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(QuestionsParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#multiChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiChoice(QuestionsParser.MultiChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#choiceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoiceList(QuestionsParser.ChoiceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(QuestionsParser.ChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#hole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHole(QuestionsParser.HoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstruct(QuestionsParser.ConstructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcHole}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcHole(QuestionsParser.AcHoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Acpopen}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcpopen(QuestionsParser.AcpopenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Accode}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccode(QuestionsParser.AccodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AccodeHole}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccodeHole(QuestionsParser.AccodeHoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AccodeOpen}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccodeOpen(QuestionsParser.AccodeOpenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AccodeOutput}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccodeOutput(QuestionsParser.AccodeOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcmultiChoice}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcmultiChoice(QuestionsParser.AcmultiChoiceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcID}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcID(QuestionsParser.AcIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcQuestion}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcQuestion(QuestionsParser.AcQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcstandardtInput}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcstandardtInput(QuestionsParser.AcstandardtInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Acexecution}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcexecution(QuestionsParser.AcexecutionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcEnd}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcEnd(QuestionsParser.AcEndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcData}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcData(QuestionsParser.AcDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentID}
	 * labeled alternative in {@link QuestionsParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentID(QuestionsParser.AssignmentIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentQuestion}
	 * labeled alternative in {@link QuestionsParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentQuestion(QuestionsParser.AssignmentQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentString}
	 * labeled alternative in {@link QuestionsParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentString(QuestionsParser.AssignmentStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStandardtInput}
	 * labeled alternative in {@link QuestionsParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStandardtInput(QuestionsParser.AssignmentStandardtInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSubExpr}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSubExpr(QuestionsParser.ExprAddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRead(QuestionsParser.ExprReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(QuestionsParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprComp}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComp(QuestionsParser.ExprCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprExecution}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprExecution(QuestionsParser.ExprExecutionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParentesesExp}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParentesesExp(QuestionsParser.ExprParentesesExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVerbatim}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVerbatim(QuestionsParser.ExprVerbatimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAndOr}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAndOr(QuestionsParser.ExprAndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAssigment}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssigment(QuestionsParser.ExprAssigmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAction}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAction(QuestionsParser.ExprActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprConversion}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConversion(QuestionsParser.ExprConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(QuestionsParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCreation}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCreation(QuestionsParser.ExprCreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumber(QuestionsParser.ExprNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDiv(QuestionsParser.ExprMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpID}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpID(QuestionsParser.ExpIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprModDiv}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprModDiv(QuestionsParser.ExprModDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#creation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreation(QuestionsParser.CreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExRun}
	 * labeled alternative in {@link QuestionsParser#execution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExRun(QuestionsParser.ExRunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExExecute}
	 * labeled alternative in {@link QuestionsParser#execution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExExecute(QuestionsParser.ExExecuteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CodeID}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeID(QuestionsParser.CodeIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CodePrint}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodePrint(QuestionsParser.CodePrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CodeVerbatim}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeVerbatim(QuestionsParser.CodeVerbatimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CodeString}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeString(QuestionsParser.CodeStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CodeQuestion}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeQuestion(QuestionsParser.CodeQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CodeGradeAnswer}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeGradeAnswer(QuestionsParser.CodeGradeAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#verbatim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbatim(QuestionsParser.VerbatimContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#grade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrade(QuestionsParser.GradeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(QuestionsParser.AnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(QuestionsParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#contentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContentList(QuestionsParser.ContentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(QuestionsParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(QuestionsParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(QuestionsParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#conversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversion(QuestionsParser.ConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(QuestionsParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuestionsParser#standardtInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardtInput(QuestionsParser.StandardtInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeQuestion}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQuestion(QuestionsParser.TypeQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeFraction}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFraction(QuestionsParser.TypeFractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeText}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeText(QuestionsParser.TypeTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeInteger}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInteger(QuestionsParser.TypeIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeCode}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCode(QuestionsParser.TypeCodeContext ctx);
}