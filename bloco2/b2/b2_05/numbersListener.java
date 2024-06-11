// Generated from numbers.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link numbersParser}.
 */
public interface numbersListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link numbersParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(numbersParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link numbersParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(numbersParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link numbersParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(numbersParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link numbersParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(numbersParser.LineContext ctx);
}