// Generated from Questions.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuestionsParser}.
 */
public interface QuestionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QuestionsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QuestionsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#compound}.
	 * @param ctx the parse tree
	 */
	void enterCompound(QuestionsParser.CompoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#compound}.
	 * @param ctx the parse tree
	 */
	void exitCompound(QuestionsParser.CompoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(QuestionsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(QuestionsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#multiChoice}.
	 * @param ctx the parse tree
	 */
	void enterMultiChoice(QuestionsParser.MultiChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#multiChoice}.
	 * @param ctx the parse tree
	 */
	void exitMultiChoice(QuestionsParser.MultiChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#choiceList}.
	 * @param ctx the parse tree
	 */
	void enterChoiceList(QuestionsParser.ChoiceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#choiceList}.
	 * @param ctx the parse tree
	 */
	void exitChoiceList(QuestionsParser.ChoiceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(QuestionsParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(QuestionsParser.ChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#hole}.
	 * @param ctx the parse tree
	 */
	void enterHole(QuestionsParser.HoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#hole}.
	 * @param ctx the parse tree
	 */
	void exitHole(QuestionsParser.HoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#construct}.
	 * @param ctx the parse tree
	 */
	void enterConstruct(QuestionsParser.ConstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#construct}.
	 * @param ctx the parse tree
	 */
	void exitConstruct(QuestionsParser.ConstructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AcHole}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAcHole(QuestionsParser.AcHoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AcHole}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAcHole(QuestionsParser.AcHoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Acpopen}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAcpopen(QuestionsParser.AcpopenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Acpopen}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAcpopen(QuestionsParser.AcpopenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Accode}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAccode(QuestionsParser.AccodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Accode}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAccode(QuestionsParser.AccodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccodeHole}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAccodeHole(QuestionsParser.AccodeHoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccodeHole}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAccodeHole(QuestionsParser.AccodeHoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccodeOpen}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAccodeOpen(QuestionsParser.AccodeOpenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccodeOpen}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAccodeOpen(QuestionsParser.AccodeOpenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccodeOutput}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAccodeOutput(QuestionsParser.AccodeOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccodeOutput}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAccodeOutput(QuestionsParser.AccodeOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AcmultiChoice}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAcmultiChoice(QuestionsParser.AcmultiChoiceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AcmultiChoice}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAcmultiChoice(QuestionsParser.AcmultiChoiceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AcID}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAcID(QuestionsParser.AcIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AcID}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAcID(QuestionsParser.AcIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AcQuestion}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAcQuestion(QuestionsParser.AcQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AcQuestion}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAcQuestion(QuestionsParser.AcQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AcstandardtInput}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAcstandardtInput(QuestionsParser.AcstandardtInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AcstandardtInput}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAcstandardtInput(QuestionsParser.AcstandardtInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Acexecution}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAcexecution(QuestionsParser.AcexecutionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Acexecution}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAcexecution(QuestionsParser.AcexecutionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AcEnd}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAcEnd(QuestionsParser.AcEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AcEnd}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAcEnd(QuestionsParser.AcEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AcData}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAcData(QuestionsParser.AcDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AcData}
	 * labeled alternative in {@link QuestionsParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAcData(QuestionsParser.AcDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentID}
	 * labeled alternative in {@link QuestionsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentID(QuestionsParser.AssignmentIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentID}
	 * labeled alternative in {@link QuestionsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentID(QuestionsParser.AssignmentIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentQuestion}
	 * labeled alternative in {@link QuestionsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentQuestion(QuestionsParser.AssignmentQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentQuestion}
	 * labeled alternative in {@link QuestionsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentQuestion(QuestionsParser.AssignmentQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentString}
	 * labeled alternative in {@link QuestionsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentString(QuestionsParser.AssignmentStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentString}
	 * labeled alternative in {@link QuestionsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentString(QuestionsParser.AssignmentStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStandardtInput}
	 * labeled alternative in {@link QuestionsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStandardtInput(QuestionsParser.AssignmentStandardtInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStandardtInput}
	 * labeled alternative in {@link QuestionsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStandardtInput(QuestionsParser.AssignmentStandardtInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSubExpr}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSubExpr(QuestionsParser.ExprAddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSubExpr}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSubExpr(QuestionsParser.ExprAddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprRead(QuestionsParser.ExprReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRead}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprRead(QuestionsParser.ExprReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprString(QuestionsParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprString}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprString(QuestionsParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprComp}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprComp(QuestionsParser.ExprCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprComp}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprComp(QuestionsParser.ExprCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprExecution}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprExecution(QuestionsParser.ExprExecutionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprExecution}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprExecution(QuestionsParser.ExprExecutionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParentesesExp}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprParentesesExp(QuestionsParser.ExprParentesesExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParentesesExp}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprParentesesExp(QuestionsParser.ExprParentesesExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVerbatim}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprVerbatim(QuestionsParser.ExprVerbatimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVerbatim}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprVerbatim(QuestionsParser.ExprVerbatimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAndOr}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAndOr(QuestionsParser.ExprAndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAndOr}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAndOr(QuestionsParser.ExprAndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAssigment}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAssigment(QuestionsParser.ExprAssigmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAssigment}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAssigment(QuestionsParser.ExprAssigmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAction}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAction(QuestionsParser.ExprActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAction}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAction(QuestionsParser.ExprActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprConversion}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprConversion(QuestionsParser.ExprConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprConversion}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprConversion(QuestionsParser.ExprConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(QuestionsParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(QuestionsParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCreation}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprCreation(QuestionsParser.ExprCreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCreation}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprCreation(QuestionsParser.ExprCreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprNumber(QuestionsParser.ExprNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumber}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprNumber(QuestionsParser.ExprNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(QuestionsParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(QuestionsParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpID}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpID(QuestionsParser.ExpIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpID}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpID(QuestionsParser.ExpIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprModDiv}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprModDiv(QuestionsParser.ExprModDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprModDiv}
	 * labeled alternative in {@link QuestionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprModDiv(QuestionsParser.ExprModDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#creation}.
	 * @param ctx the parse tree
	 */
	void enterCreation(QuestionsParser.CreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#creation}.
	 * @param ctx the parse tree
	 */
	void exitCreation(QuestionsParser.CreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExRun}
	 * labeled alternative in {@link QuestionsParser#execution}.
	 * @param ctx the parse tree
	 */
	void enterExRun(QuestionsParser.ExRunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExRun}
	 * labeled alternative in {@link QuestionsParser#execution}.
	 * @param ctx the parse tree
	 */
	void exitExRun(QuestionsParser.ExRunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExExecute}
	 * labeled alternative in {@link QuestionsParser#execution}.
	 * @param ctx the parse tree
	 */
	void enterExExecute(QuestionsParser.ExExecuteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExExecute}
	 * labeled alternative in {@link QuestionsParser#execution}.
	 * @param ctx the parse tree
	 */
	void exitExExecute(QuestionsParser.ExExecuteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeID}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCodeID(QuestionsParser.CodeIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeID}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCodeID(QuestionsParser.CodeIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodePrint}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCodePrint(QuestionsParser.CodePrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodePrint}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCodePrint(QuestionsParser.CodePrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeVerbatim}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCodeVerbatim(QuestionsParser.CodeVerbatimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeVerbatim}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCodeVerbatim(QuestionsParser.CodeVerbatimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeString}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCodeString(QuestionsParser.CodeStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeString}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCodeString(QuestionsParser.CodeStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeQuestion}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCodeQuestion(QuestionsParser.CodeQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeQuestion}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCodeQuestion(QuestionsParser.CodeQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeGradeAnswer}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCodeGradeAnswer(QuestionsParser.CodeGradeAnswerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeGradeAnswer}
	 * labeled alternative in {@link QuestionsParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCodeGradeAnswer(QuestionsParser.CodeGradeAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#verbatim}.
	 * @param ctx the parse tree
	 */
	void enterVerbatim(QuestionsParser.VerbatimContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#verbatim}.
	 * @param ctx the parse tree
	 */
	void exitVerbatim(QuestionsParser.VerbatimContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#grade}.
	 * @param ctx the parse tree
	 */
	void enterGrade(QuestionsParser.GradeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#grade}.
	 * @param ctx the parse tree
	 */
	void exitGrade(QuestionsParser.GradeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(QuestionsParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(QuestionsParser.AnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(QuestionsParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(QuestionsParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#contentList}.
	 * @param ctx the parse tree
	 */
	void enterContentList(QuestionsParser.ContentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#contentList}.
	 * @param ctx the parse tree
	 */
	void exitContentList(QuestionsParser.ContentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(QuestionsParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(QuestionsParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(QuestionsParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(QuestionsParser.ExportContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(QuestionsParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(QuestionsParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#conversion}.
	 * @param ctx the parse tree
	 */
	void enterConversion(QuestionsParser.ConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#conversion}.
	 * @param ctx the parse tree
	 */
	void exitConversion(QuestionsParser.ConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(QuestionsParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(QuestionsParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuestionsParser#standardtInput}.
	 * @param ctx the parse tree
	 */
	void enterStandardtInput(QuestionsParser.StandardtInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuestionsParser#standardtInput}.
	 * @param ctx the parse tree
	 */
	void exitStandardtInput(QuestionsParser.StandardtInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeQuestion}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeQuestion(QuestionsParser.TypeQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeQuestion}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeQuestion(QuestionsParser.TypeQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeFraction}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeFraction(QuestionsParser.TypeFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeFraction}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeFraction(QuestionsParser.TypeFractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeText}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeText(QuestionsParser.TypeTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeText}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeText(QuestionsParser.TypeTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeInteger}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInteger(QuestionsParser.TypeIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeInteger}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInteger(QuestionsParser.TypeIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeCode}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeCode(QuestionsParser.TypeCodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeCode}
	 * labeled alternative in {@link QuestionsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeCode(QuestionsParser.TypeCodeContext ctx);
}