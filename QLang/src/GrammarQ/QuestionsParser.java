// Generated from Questions.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QuestionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		ID=46, NUMBER=47, WS=48, COMMENT=49, VERBATIM_STRING=50, STRING=51, ERROR=52;
	public static final int
		RULE_program = 0, RULE_compound = 1, RULE_statement = 2, RULE_multiChoice = 3, 
		RULE_choiceList = 4, RULE_choice = 5, RULE_hole = 6, RULE_construct = 7, 
		RULE_action = 8, RULE_assignment = 9, RULE_expression = 10, RULE_creation = 11, 
		RULE_execution = 12, RULE_code = 13, RULE_verbatim = 14, RULE_grade = 15, 
		RULE_answer = 16, RULE_line = 17, RULE_contentList = 18, RULE_content = 19, 
		RULE_export = 20, RULE_read = 21, RULE_conversion = 22, RULE_print = 23, 
		RULE_standardtInput = 24, RULE_type = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "compound", "statement", "multiChoice", "choiceList", "choice", 
			"hole", "construct", "action", "assignment", "expression", "creation", 
			"execution", "code", "verbatim", "grade", "answer", "line", "contentList", 
			"content", "export", "read", "conversion", "print", "standardtInput", 
			"type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'multi-choice'", "'is'", "'end'", "'|'", "','", "'/'", 
			"'hole'", "':'", "'open'", "'code'", "'code-hole'", "'code-open'", "'code-output'", 
			"'->'", "'\":=\"'", "':='", "'-'", "'+'", "'*'", "'%'", "'=='", "'!='", 
			"'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", "'('", "')'", "'new'", 
			"'run'", "'execute'", "'uses code from'", "'uses code'", "'line'", "'export'", 
			"'to'", "'read'", "'println'", "'question'", "'fraction'", "'text'", 
			"'integer'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ID", "NUMBER", 
			"WS", "COMMENT", "VERBATIM_STRING", "STRING", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Questions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QuestionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public CompoundContext compound() {
			return getRuleContext(CompoundContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QuestionsParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			compound();
			setState(53);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitCompound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundContext compound() throws RecognitionException {
		CompoundContext _localctx = new CompoundContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3658484282064180L) != 0)) {
				{
				{
				setState(55);
				statement();
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(56);
					match(T__0);
					}
				}

				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConstructContext construct() {
			return getRuleContext(ConstructContext.class,0);
		}
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public MultiChoiceContext multiChoice() {
			return getRuleContext(MultiChoiceContext.class,0);
		}
		public HoleContext hole() {
			return getRuleContext(HoleContext.class,0);
		}
		public ChoiceListContext choiceList() {
			return getRuleContext(ChoiceListContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				action();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				construct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				export();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				code();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				multiChoice();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				hole();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				choiceList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiChoiceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public ChoiceListContext choiceList() {
			return getRuleContext(ChoiceListContext.class,0);
		}
		public StandardtInputContext standardtInput() {
			return getRuleContext(StandardtInputContext.class,0);
		}
		public ExecutionContext execution() {
			return getRuleContext(ExecutionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultiChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiChoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterMultiChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitMultiChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitMultiChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiChoiceContext multiChoice() throws RecognitionException {
		MultiChoiceContext _localctx = new MultiChoiceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multiChoice);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__1);
				setState(75);
				match(ID);
				setState(76);
				match(T__2);
				setState(77);
				choiceList();
				setState(78);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				standardtInput();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				execution();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChoiceListContext extends ParserRuleContext {
		public List<ChoiceContext> choice() {
			return getRuleContexts(ChoiceContext.class);
		}
		public ChoiceContext choice(int i) {
			return getRuleContext(ChoiceContext.class,i);
		}
		public ChoiceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterChoiceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitChoiceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitChoiceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceListContext choiceList() throws RecognitionException {
		ChoiceListContext _localctx = new ChoiceListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_choiceList);
		int _la;
		try {
			int _alt;
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				choice();
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(86);
						match(T__4);
						setState(87);
						choice();
						}
						} 
					}
					setState(92);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				choice();
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(94);
						match(T__0);
						setState(95);
						choice();
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				choice();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(102);
					match(T__5);
					setState(103);
					choice();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				choice();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(110);
					match(T__6);
					setState(111);
					choice();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChoiceContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_choice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HoleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public List<ContentListContext> contentList() {
			return getRuleContexts(ContentListContext.class);
		}
		public ContentListContext contentList(int i) {
			return getRuleContext(ContentListContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterHole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitHole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitHole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoleContext hole() throws RecognitionException {
		HoleContext _localctx = new HoleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_hole);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__7);
				setState(122);
				match(ID);
				setState(123);
				match(T__2);
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					contentList();
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__40 );
				setState(129);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitConstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitConstruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructContext construct() throws RecognitionException {
		ConstructContext _localctx = new ConstructContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_construct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ID);
			setState(135);
			match(T__8);
			setState(136);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	 
		public ActionContext() { }
		public void copyFrom(ActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcHoleContext extends ActionContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public AcHoleContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAcHole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAcHole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAcHole(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcIDContext extends ActionContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public AcIDContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAcID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAcID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAcID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccodeContext extends ActionContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public AccodeContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAccode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAccode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAccode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcstandardtInputContext extends ActionContext {
		public StandardtInputContext standardtInput() {
			return getRuleContext(StandardtInputContext.class,0);
		}
		public AcstandardtInputContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAcstandardtInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAcstandardtInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAcstandardtInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccodeOpenContext extends ActionContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public AccodeOpenContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAccodeOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAccodeOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAccodeOpen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcexecutionContext extends ActionContext {
		public ExecutionContext execution() {
			return getRuleContext(ExecutionContext.class,0);
		}
		public AcexecutionContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAcexecution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAcexecution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAcexecution(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccodeOutputContext extends ActionContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public AccodeOutputContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAccodeOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAccodeOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAccodeOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcQuestionContext extends ActionContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public AcQuestionContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAcQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAcQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAcQuestion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcDataContext extends ActionContext {
		public List<TerminalNode> NUMBER() { return getTokens(QuestionsParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(QuestionsParser.NUMBER, i);
		}
		public AcDataContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAcData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAcData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAcData(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccodeHoleContext extends ActionContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public AccodeHoleContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAccodeHole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAccodeHole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAccodeHole(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcmultiChoiceContext extends ActionContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public ChoiceListContext choiceList() {
			return getRuleContext(ChoiceListContext.class,0);
		}
		public AcmultiChoiceContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAcmultiChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAcmultiChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAcmultiChoice(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcpopenContext extends ActionContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public AcpopenContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAcpopen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAcpopen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAcpopen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AcEndContext extends ActionContext {
		public AcEndContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAcEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAcEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAcEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_action);
		int _la;
		try {
			int _alt;
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new AcHoleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(T__7);
				setState(139);
				match(ID);
				setState(140);
				match(T__2);
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					content();
					}
					}
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__40 );
				setState(146);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new AcpopenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__9);
				setState(149);
				match(ID);
				setState(150);
				match(T__2);
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(151);
					content();
					}
					}
					setState(154); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__40 );
				setState(156);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new AccodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(T__10);
				setState(159);
				match(ID);
				setState(160);
				match(T__2);
				setState(162); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(161);
						code();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(164); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(166);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new AccodeHoleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(T__11);
				setState(169);
				match(ID);
				setState(170);
				match(T__2);
				setState(172); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(171);
						code();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(174); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(176);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new AccodeOpenContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(T__12);
				setState(179);
				match(ID);
				setState(180);
				match(T__2);
				setState(182); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(181);
						code();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(184); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(186);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new AccodeOutputContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(T__13);
				setState(189);
				match(ID);
				setState(190);
				match(T__2);
				setState(192); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(191);
						code();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(194); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(196);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new AcmultiChoiceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				match(T__1);
				setState(199);
				match(ID);
				setState(200);
				match(T__2);
				setState(201);
				choiceList();
				setState(202);
				match(T__3);
				}
				break;
			case 8:
				_localctx = new AcIDContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(204);
				match(ID);
				}
				break;
			case 9:
				_localctx = new AcQuestionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(205);
					match(T__1);
					}
					}
					setState(208); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				{
				setState(210);
				match(ID);
				}
				setState(211);
				match(T__2);
				}
				break;
			case 10:
				_localctx = new AcstandardtInputContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(212);
				standardtInput();
				}
				break;
			case 11:
				_localctx = new AcexecutionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(213);
				execution();
				}
				break;
			case 12:
				_localctx = new AcEndContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(214);
				match(T__3);
				}
				break;
			case 13:
				_localctx = new AcDataContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(215);
				match(NUMBER);
				setState(216);
				match(T__6);
				setState(217);
				match(NUMBER);
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(218);
					match(T__5);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentQuestionContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public AssignmentQuestionContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAssignmentQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAssignmentQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAssignmentQuestion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStandardtInputContext extends AssignmentContext {
		public StandardtInputContext standardtInput() {
			return getRuleContext(StandardtInputContext.class,0);
		}
		public AssignmentStandardtInputContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAssignmentStandardtInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAssignmentStandardtInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAssignmentStandardtInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStringContext extends AssignmentContext {
		public TerminalNode STRING() { return getToken(QuestionsParser.STRING, 0); }
		public AssignmentStringContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAssignmentString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAssignmentString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAssignmentString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentIDContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StandardtInputContext standardtInput() {
			return getRuleContext(StandardtInputContext.class,0);
		}
		public AssignmentIDContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAssignmentID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAssignmentID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAssignmentID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new AssignmentIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(ID);
				setState(227);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					{
					setState(224);
					match(T__14);
					setState(225);
					match(T__15);
					}
					}
					break;
				case T__16:
					{
					setState(226);
					match(T__16);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(229);
				expression(0);
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(230);
					standardtInput();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AssignmentQuestionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(ID);
				}
				break;
			case 3:
				_localctx = new AssignmentStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new AssignmentStandardtInputContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				standardtInput();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAddSubExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprAddSubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprReadContext extends ExpressionContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public ExprReadContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(QuestionsParser.STRING, 0); }
		public ExprStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCompContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprCompContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprComp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprExecutionContext extends ExpressionContext {
		public ExecutionContext execution() {
			return getRuleContext(ExecutionContext.class,0);
		}
		public ExprExecutionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprExecution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprExecution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprExecution(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParentesesExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprParentesesExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprParentesesExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprParentesesExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprParentesesExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprVerbatimContext extends ExpressionContext {
		public VerbatimContext verbatim() {
			return getRuleContext(VerbatimContext.class,0);
		}
		public ExprVerbatimContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprVerbatim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprVerbatim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprVerbatim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAndOrContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprAndOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAssigmentContext extends ExpressionContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprAssigmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprAssigment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprActionContext extends ExpressionContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ExprActionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprAction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprConversionContext extends ExpressionContext {
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public ExprConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprConversion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprUnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCreationContext extends ExpressionContext {
		public CreationContext creation() {
			return getRuleContext(CreationContext.class,0);
		}
		public ExprCreationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprCreation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNumberContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(QuestionsParser.NUMBER, 0); }
		public ExprNumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultDivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprMultDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpIDContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public ExpIDContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExpID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExpID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExpID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprModDivContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprModDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExprModDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExprModDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExprModDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(239);
				((ExprUnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((ExprUnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				expression(17);
				}
				break;
			case 2:
				{
				_localctx = new ExprCreationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				creation();
				}
				break;
			case 3:
				{
				_localctx = new ExprExecutionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				execution();
				}
				break;
			case 4:
				{
				_localctx = new ExprActionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				action();
				}
				break;
			case 5:
				{
				_localctx = new ExprReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				read();
				}
				break;
			case 6:
				{
				_localctx = new ExprConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				conversion();
				}
				break;
			case 7:
				{
				_localctx = new ExprAssigmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				assignment();
				}
				break;
			case 8:
				{
				_localctx = new ExprVerbatimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				verbatim();
				}
				break;
			case 9:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new ExpIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(ID);
				}
				break;
			case 11:
				{
				_localctx = new ExprParentesesExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				match(T__29);
				setState(251);
				expression(0);
				setState(252);
				match(T__30);
				}
				break;
			case 12:
				{
				_localctx = new ExprNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				match(NUMBER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(272);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(258);
						((ExprMultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__19) ) {
							((ExprMultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(259);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprModDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(261);
						((ExprModDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__20) ) {
							((ExprModDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(262);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprAddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(264);
						((ExprAddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((ExprAddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(265);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprCompContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(267);
						((ExprCompContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) ) {
							((ExprCompContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(268);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprAndOrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(270);
						((ExprAndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((ExprAndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(271);
						expression(13);
						}
						break;
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public CreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreationContext creation() throws RecognitionException {
		CreationContext _localctx = new CreationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_creation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__31);
			setState(278);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecutionContext extends ParserRuleContext {
		public ExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execution; }
	 
		public ExecutionContext() { }
		public void copyFrom(ExecutionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExExecuteContext extends ExecutionContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public CreationContext creation() {
			return getRuleContext(CreationContext.class,0);
		}
		public ExExecuteContext(ExecutionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExExecute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExRunContext extends ExecutionContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public ExRunContext(ExecutionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExRun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExRun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecutionContext execution() throws RecognitionException {
		ExecutionContext _localctx = new ExecutionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_execution);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				_localctx = new ExRunContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(T__32);
				setState(281);
				match(ID);
				}
				break;
			case T__33:
				_localctx = new ExExecuteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(T__33);
				setState(285);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(283);
					match(ID);
					}
					break;
				case T__31:
					{
					setState(284);
					creation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	 
		public CodeContext() { }
		public void copyFrom(CodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodePrintContext extends CodeContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public CodePrintContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterCodePrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitCodePrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitCodePrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeIDContext extends CodeContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VERBATIM_STRING() { return getToken(QuestionsParser.VERBATIM_STRING, 0); }
		public CodeIDContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterCodeID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitCodeID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitCodeID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeStringContext extends CodeContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeStringContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterCodeString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitCodeString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitCodeString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeQuestionContext extends CodeContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public CodeQuestionContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterCodeQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitCodeQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitCodeQuestion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeVerbatimContext extends CodeContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeVerbatimContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterCodeVerbatim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitCodeVerbatim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitCodeVerbatim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CodeGradeAnswerContext extends CodeContext {
		public GradeContext grade() {
			return getRuleContext(GradeContext.class,0);
		}
		public AnswerContext answer() {
			return getRuleContext(AnswerContext.class,0);
		}
		public CodeGradeAnswerContext(CodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterCodeGradeAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitCodeGradeAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitCodeGradeAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_code);
		try {
			int _alt;
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new CodeIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(T__10);
				setState(290);
				expression(0);
				setState(291);
				match(T__2);
				setState(292);
				match(VERBATIM_STRING);
				setState(293);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new CodePrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				print();
				setState(296);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new CodeVerbatimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				expression(0);
				}
				break;
			case 4:
				_localctx = new CodeStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				match(T__34);
				setState(300);
				expression(0);
				setState(301);
				match(T__3);
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(302);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new CodeQuestionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				match(T__35);
				setState(306);
				match(ID);
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(307);
						code();
						}
						} 
					}
					setState(312);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(313);
				match(T__3);
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(314);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new CodeGradeAnswerContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(317);
				grade();
				setState(318);
				match(T__5);
				setState(319);
				answer();
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(320);
					match(T__0);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VerbatimContext extends ParserRuleContext {
		public TerminalNode VERBATIM_STRING() { return getToken(QuestionsParser.VERBATIM_STRING, 0); }
		public VerbatimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbatim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterVerbatim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitVerbatim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitVerbatim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbatimContext verbatim() throws RecognitionException {
		VerbatimContext _localctx = new VerbatimContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_verbatim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(VERBATIM_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GradeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GradeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterGrade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitGrade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitGrade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GradeContext grade() throws RecognitionException {
		GradeContext _localctx = new GradeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_grade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnswerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			expression(0);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(330);
				line();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__36);
			setState(334);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentListContext extends ParserRuleContext {
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public ContentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterContentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitContentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitContentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentListContext contentList() throws RecognitionException {
		ContentListContext _localctx = new ContentListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_contentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			content();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(337);
				match(T__5);
				setState(338);
				content();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			print();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QuestionsParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__37);
			setState(347);
			match(ID);
			setState(348);
			match(T__38);
			setState(349);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__39);
			setState(352);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConversionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitConversion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_conversion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			type();
			setState(355);
			match(T__29);
			setState(356);
			expression(0);
			setState(357);
			match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_print);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__40);
			setState(360);
			expression(0);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(361);
						match(T__5);
						}
					}

					setState(364);
					expression(0);
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StandardtInputContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StandardtInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardtInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterStandardtInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitStandardtInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitStandardtInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardtInputContext standardtInput() throws RecognitionException {
		StandardtInputContext _localctx = new StandardtInputContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_standardtInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__4);
			setState(371);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeQuestionContext extends TypeContext {
		public TypeQuestionContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterTypeQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitTypeQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitTypeQuestion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeFractionContext extends TypeContext {
		public TypeFractionContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterTypeFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitTypeFraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitTypeFraction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIntegerContext extends TypeContext {
		public TypeIntegerContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterTypeInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitTypeInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitTypeInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCodeContext extends TypeContext {
		public TypeCodeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterTypeCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitTypeCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitTypeCode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeTextContext extends TypeContext {
		public TypeTextContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).enterTypeText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuestionsListener ) ((QuestionsListener)listener).exitTypeText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuestionsVisitor ) return ((QuestionsVisitor<? extends T>)visitor).visitTypeText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				_localctx = new TypeQuestionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(T__41);
				}
				break;
			case T__42:
				_localctx = new TypeFractionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(T__42);
				}
				break;
			case T__43:
				_localctx = new TypeTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				match(T__43);
				}
				break;
			case T__44:
				_localctx = new TypeIntegerContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				match(T__44);
				}
				break;
			case T__10:
				_localctx = new TypeCodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(377);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u017d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001:\b\u0001\u0005\u0001<\b\u0001\n\u0001\f\u0001"+
		"?\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003T\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004Y\b\u0004\n\u0004\f\u0004\\\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004a\b\u0004\n\u0004\f\u0004d\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004i\b\u0004\n\u0004\f\u0004"+
		"l\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004q\b\u0004\n\u0004"+
		"\f\u0004t\t\u0004\u0003\u0004v\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006~\b\u0006\u000b\u0006"+
		"\f\u0006\u007f\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0085\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0004\b\u008f\b\b\u000b\b\f\b\u0090\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0004\b\u0099\b\b\u000b\b\f\b\u009a\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00a3\b\b\u000b\b\f\b"+
		"\u00a4\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00ad\b"+
		"\b\u000b\b\f\b\u00ae\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004"+
		"\b\u00b7\b\b\u000b\b\f\b\u00b8\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0004\b\u00c1\b\b\u000b\b\f\b\u00c2\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00cf\b\b\u000b"+
		"\b\f\b\u00d0\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00dc\b\b\u0003\b\u00de\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u00e4\b\t\u0001\t\u0001\t\u0003\t\u00e8\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00ed\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0100\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0111\b\n\n\n\f\n\u0114\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u011e\b\f"+
		"\u0003\f\u0120\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0130"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0005\r\u0135\b\r\n\r\f\r\u0138\t\r\u0001"+
		"\r\u0001\r\u0003\r\u013c\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0142"+
		"\b\r\u0003\r\u0144\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u014c\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0154\b\u0012"+
		"\n\u0012\f\u0012\u0157\t\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u016b\b\u0017\u0001\u0017\u0005"+
		"\u0017\u016e\b\u0017\n\u0017\f\u0017\u0171\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u017b\b\u0019\u0001\u0019\u0000\u0001\u0014\u001a\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02\u0000\u0005\u0001\u0000\u0012\u0013\u0002\u0000\u0007\u0007"+
		"\u0014\u0014\u0002\u0000\t\t\u0015\u0015\u0001\u0000\u0016\u001b\u0001"+
		"\u0000\u001c\u001d\u01b3\u00004\u0001\u0000\u0000\u0000\u0002=\u0001\u0000"+
		"\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006S\u0001\u0000\u0000\u0000"+
		"\bu\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000\f\u0084\u0001\u0000"+
		"\u0000\u0000\u000e\u0086\u0001\u0000\u0000\u0000\u0010\u00dd\u0001\u0000"+
		"\u0000\u0000\u0012\u00ec\u0001\u0000\u0000\u0000\u0014\u00ff\u0001\u0000"+
		"\u0000\u0000\u0016\u0115\u0001\u0000\u0000\u0000\u0018\u011f\u0001\u0000"+
		"\u0000\u0000\u001a\u0143\u0001\u0000\u0000\u0000\u001c\u0145\u0001\u0000"+
		"\u0000\u0000\u001e\u0147\u0001\u0000\u0000\u0000 \u0149\u0001\u0000\u0000"+
		"\u0000\"\u014d\u0001\u0000\u0000\u0000$\u0150\u0001\u0000\u0000\u0000"+
		"&\u0158\u0001\u0000\u0000\u0000(\u015a\u0001\u0000\u0000\u0000*\u015f"+
		"\u0001\u0000\u0000\u0000,\u0162\u0001\u0000\u0000\u0000.\u0167\u0001\u0000"+
		"\u0000\u00000\u0172\u0001\u0000\u0000\u00002\u017a\u0001\u0000\u0000\u0000"+
		"45\u0003\u0002\u0001\u000056\u0005\u0000\u0000\u00016\u0001\u0001\u0000"+
		"\u0000\u000079\u0003\u0004\u0002\u00008:\u0005\u0001\u0000\u000098\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000"+
		";7\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>\u0003\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000@I\u0003\u0010\b\u0000AI\u0003\u0012\t\u0000BI\u0003"+
		"\u000e\u0007\u0000CI\u0003(\u0014\u0000DI\u0003\u001a\r\u0000EI\u0003"+
		"\u0006\u0003\u0000FI\u0003\f\u0006\u0000GI\u0003\b\u0004\u0000H@\u0001"+
		"\u0000\u0000\u0000HA\u0001\u0000\u0000\u0000HB\u0001\u0000\u0000\u0000"+
		"HC\u0001\u0000\u0000\u0000HD\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000I\u0005\u0001"+
		"\u0000\u0000\u0000JK\u0005\u0002\u0000\u0000KL\u0005.\u0000\u0000LM\u0005"+
		"\u0003\u0000\u0000MN\u0003\b\u0004\u0000NO\u0005\u0004\u0000\u0000OT\u0001"+
		"\u0000\u0000\u0000PT\u00030\u0018\u0000QT\u0003\u0018\f\u0000RT\u0003"+
		"\u0014\n\u0000SJ\u0001\u0000\u0000\u0000SP\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000T\u0007\u0001\u0000\u0000"+
		"\u0000UZ\u0003\n\u0005\u0000VW\u0005\u0005\u0000\u0000WY\u0003\n\u0005"+
		"\u0000XV\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[v\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000]b\u0003\n\u0005\u0000^_\u0005\u0001\u0000\u0000_a\u0003"+
		"\n\u0005\u0000`^\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cv\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000ej\u0003\n\u0005\u0000fg\u0005\u0006\u0000\u0000"+
		"gi\u0003\n\u0005\u0000hf\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kv\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000mr\u0003\n\u0005\u0000no\u0005\u0007\u0000"+
		"\u0000oq\u0003\n\u0005\u0000pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sv\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000uU\u0001\u0000\u0000\u0000u]\u0001"+
		"\u0000\u0000\u0000ue\u0001\u0000\u0000\u0000um\u0001\u0000\u0000\u0000"+
		"v\t\u0001\u0000\u0000\u0000wx\u0003\u0014\n\u0000x\u000b\u0001\u0000\u0000"+
		"\u0000yz\u0005\b\u0000\u0000z{\u0005.\u0000\u0000{}\u0005\u0003\u0000"+
		"\u0000|~\u0003$\u0012\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0004\u0000"+
		"\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0085\u0003\u0014\n\u0000"+
		"\u0084y\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\r\u0001\u0000\u0000\u0000\u0086\u0087\u0005.\u0000\u0000\u0087\u0088"+
		"\u0005\t\u0000\u0000\u0088\u0089\u00032\u0019\u0000\u0089\u000f\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\b\u0000\u0000\u008b\u008c\u0005."+
		"\u0000\u0000\u008c\u008e\u0005\u0003\u0000\u0000\u008d\u008f\u0003&\u0013"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0004\u0000"+
		"\u0000\u0093\u00de\u0001\u0000\u0000\u0000\u0094\u0095\u0005\n\u0000\u0000"+
		"\u0095\u0096\u0005.\u0000\u0000\u0096\u0098\u0005\u0003\u0000\u0000\u0097"+
		"\u0099\u0003&\u0013\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005\u0004\u0000\u0000\u009d\u00de\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005\u000b\u0000\u0000\u009f\u00a0\u0005.\u0000\u0000\u00a0\u00a2\u0005"+
		"\u0003\u0000\u0000\u00a1\u00a3\u0003\u001a\r\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0004\u0000\u0000\u00a7\u00de\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0005\f\u0000\u0000\u00a9\u00aa\u0005.\u0000"+
		"\u0000\u00aa\u00ac\u0005\u0003\u0000\u0000\u00ab\u00ad\u0003\u001a\r\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0004\u0000\u0000"+
		"\u00b1\u00de\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\r\u0000\u0000\u00b3"+
		"\u00b4\u0005.\u0000\u0000\u00b4\u00b6\u0005\u0003\u0000\u0000\u00b5\u00b7"+
		"\u0003\u001a\r\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"+
		"\u0004\u0000\u0000\u00bb\u00de\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005"+
		"\u000e\u0000\u0000\u00bd\u00be\u0005.\u0000\u0000\u00be\u00c0\u0005\u0003"+
		"\u0000\u0000\u00bf\u00c1\u0003\u001a\r\u0000\u00c0\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0005\u0004\u0000\u0000\u00c5\u00de\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0005\u0002\u0000\u0000\u00c7\u00c8\u0005.\u0000\u0000"+
		"\u00c8\u00c9\u0005\u0003\u0000\u0000\u00c9\u00ca\u0003\b\u0004\u0000\u00ca"+
		"\u00cb\u0005\u0004\u0000\u0000\u00cb\u00de\u0001\u0000\u0000\u0000\u00cc"+
		"\u00de\u0005.\u0000\u0000\u00cd\u00cf\u0005\u0002\u0000\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005.\u0000\u0000\u00d3\u00de\u0005"+
		"\u0003\u0000\u0000\u00d4\u00de\u00030\u0018\u0000\u00d5\u00de\u0003\u0018"+
		"\f\u0000\u00d6\u00de\u0005\u0004\u0000\u0000\u00d7\u00d8\u0005/\u0000"+
		"\u0000\u00d8\u00d9\u0005\u0007\u0000\u0000\u00d9\u00db\u0005/\u0000\u0000"+
		"\u00da\u00dc\u0005\u0006\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000"+
		"\u00dd\u008a\u0001\u0000\u0000\u0000\u00dd\u0094\u0001\u0000\u0000\u0000"+
		"\u00dd\u009e\u0001\u0000\u0000\u0000\u00dd\u00a8\u0001\u0000\u0000\u0000"+
		"\u00dd\u00b2\u0001\u0000\u0000\u0000\u00dd\u00bc\u0001\u0000\u0000\u0000"+
		"\u00dd\u00c6\u0001\u0000\u0000\u0000\u00dd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00dd\u00ce\u0001\u0000\u0000\u0000\u00dd\u00d4\u0001\u0000\u0000\u0000"+
		"\u00dd\u00d5\u0001\u0000\u0000\u0000\u00dd\u00d6\u0001\u0000\u0000\u0000"+
		"\u00dd\u00d7\u0001\u0000\u0000\u0000\u00de\u0011\u0001\u0000\u0000\u0000"+
		"\u00df\u00e3\u0005.\u0000\u0000\u00e0\u00e1\u0005\u000f\u0000\u0000\u00e1"+
		"\u00e4\u0005\u0010\u0000\u0000\u00e2\u00e4\u0005\u0011\u0000\u0000\u00e3"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0003\u0014\n\u0000\u00e6\u00e8"+
		"\u00030\u0018\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e8\u00ed\u0001\u0000\u0000\u0000\u00e9\u00ed\u0005"+
		".\u0000\u0000\u00ea\u00ed\u00053\u0000\u0000\u00eb\u00ed\u00030\u0018"+
		"\u0000\u00ec\u00df\u0001\u0000\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u0013\u0001\u0000\u0000\u0000\u00ee\u00ef\u0006\n\uffff\uffff"+
		"\u0000\u00ef\u00f0\u0007\u0000\u0000\u0000\u00f0\u0100\u0003\u0014\n\u0011"+
		"\u00f1\u0100\u0003\u0016\u000b\u0000\u00f2\u0100\u0003\u0018\f\u0000\u00f3"+
		"\u0100\u0003\u0010\b\u0000\u00f4\u0100\u0003*\u0015\u0000\u00f5\u0100"+
		"\u0003,\u0016\u0000\u00f6\u0100\u0003\u0012\t\u0000\u00f7\u0100\u0003"+
		"\u001c\u000e\u0000\u00f8\u0100\u00053\u0000\u0000\u00f9\u0100\u0005.\u0000"+
		"\u0000\u00fa\u00fb\u0005\u001e\u0000\u0000\u00fb\u00fc\u0003\u0014\n\u0000"+
		"\u00fc\u00fd\u0005\u001f\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000"+
		"\u00fe\u0100\u0005/\u0000\u0000\u00ff\u00ee\u0001\u0000\u0000\u0000\u00ff"+
		"\u00f1\u0001\u0000\u0000\u0000\u00ff\u00f2\u0001\u0000\u0000\u0000\u00ff"+
		"\u00f3\u0001\u0000\u0000\u0000\u00ff\u00f4\u0001\u0000\u0000\u0000\u00ff"+
		"\u00f5\u0001\u0000\u0000\u0000\u00ff\u00f6\u0001\u0000\u0000\u0000\u00ff"+
		"\u00f7\u0001\u0000\u0000\u0000\u00ff\u00f8\u0001\u0000\u0000\u0000\u00ff"+
		"\u00f9\u0001\u0000\u0000\u0000\u00ff\u00fa\u0001\u0000\u0000\u0000\u00ff"+
		"\u00fe\u0001\u0000\u0000\u0000\u0100\u0112\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\n\u0010\u0000\u0000\u0102\u0103\u0007\u0001\u0000\u0000\u0103\u0111"+
		"\u0003\u0014\n\u0011\u0104\u0105\n\u000f\u0000\u0000\u0105\u0106\u0007"+
		"\u0002\u0000\u0000\u0106\u0111\u0003\u0014\n\u0010\u0107\u0108\n\u000e"+
		"\u0000\u0000\u0108\u0109\u0007\u0000\u0000\u0000\u0109\u0111\u0003\u0014"+
		"\n\u000f\u010a\u010b\n\r\u0000\u0000\u010b\u010c\u0007\u0003\u0000\u0000"+
		"\u010c\u0111\u0003\u0014\n\u000e\u010d\u010e\n\f\u0000\u0000\u010e\u010f"+
		"\u0007\u0004\u0000\u0000\u010f\u0111\u0003\u0014\n\r\u0110\u0101\u0001"+
		"\u0000\u0000\u0000\u0110\u0104\u0001\u0000\u0000\u0000\u0110\u0107\u0001"+
		"\u0000\u0000\u0000\u0110\u010a\u0001\u0000\u0000\u0000\u0110\u010d\u0001"+
		"\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0015\u0001"+
		"\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0005"+
		" \u0000\u0000\u0116\u0117\u0005.\u0000\u0000\u0117\u0017\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0005!\u0000\u0000\u0119\u0120\u0005.\u0000\u0000\u011a"+
		"\u011d\u0005\"\u0000\u0000\u011b\u011e\u0005.\u0000\u0000\u011c\u011e"+
		"\u0003\u0016\u000b\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011c"+
		"\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u0118"+
		"\u0001\u0000\u0000\u0000\u011f\u011a\u0001\u0000\u0000\u0000\u0120\u0019"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u000b\u0000\u0000\u0122\u0123"+
		"\u0003\u0014\n\u0000\u0123\u0124\u0005\u0003\u0000\u0000\u0124\u0125\u0005"+
		"2\u0000\u0000\u0125\u0126\u0005\u0004\u0000\u0000\u0126\u0144\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0003.\u0017\u0000\u0128\u0129\u0005\u0001\u0000"+
		"\u0000\u0129\u0144\u0001\u0000\u0000\u0000\u012a\u0144\u0003\u0014\n\u0000"+
		"\u012b\u012c\u0005#\u0000\u0000\u012c\u012d\u0003\u0014\n\u0000\u012d"+
		"\u012f\u0005\u0004\u0000\u0000\u012e\u0130\u0005\u0001\u0000\u0000\u012f"+
		"\u012e\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130"+
		"\u0144\u0001\u0000\u0000\u0000\u0131\u0132\u0005$\u0000\u0000\u0132\u0136"+
		"\u0005.\u0000\u0000\u0133\u0135\u0003\u001a\r\u0000\u0134\u0133\u0001"+
		"\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0001"+
		"\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013b\u0005"+
		"\u0004\u0000\u0000\u013a\u013c\u0005\u0001\u0000\u0000\u013b\u013a\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u0144\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0003\u001e\u000f\u0000\u013e\u013f\u0005"+
		"\u0006\u0000\u0000\u013f\u0141\u0003 \u0010\u0000\u0140\u0142\u0005\u0001"+
		"\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000"+
		"\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0121\u0001\u0000"+
		"\u0000\u0000\u0143\u0127\u0001\u0000\u0000\u0000\u0143\u012a\u0001\u0000"+
		"\u0000\u0000\u0143\u012b\u0001\u0000\u0000\u0000\u0143\u0131\u0001\u0000"+
		"\u0000\u0000\u0143\u013d\u0001\u0000\u0000\u0000\u0144\u001b\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u00052\u0000\u0000\u0146\u001d\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0003\u0014\n\u0000\u0148\u001f\u0001\u0000\u0000\u0000"+
		"\u0149\u014b\u0003\u0014\n\u0000\u014a\u014c\u0003\"\u0011\u0000\u014b"+
		"\u014a\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"!\u0001\u0000\u0000\u0000\u014d\u014e\u0005%\u0000\u0000\u014e\u014f\u0003"+
		"\u0014\n\u0000\u014f#\u0001\u0000\u0000\u0000\u0150\u0155\u0003&\u0013"+
		"\u0000\u0151\u0152\u0005\u0006\u0000\u0000\u0152\u0154\u0003&\u0013\u0000"+
		"\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000"+
		"\u0156%\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0003.\u0017\u0000\u0159\'\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0005&\u0000\u0000\u015b\u015c\u0005.\u0000\u0000\u015c\u015d\u0005\'"+
		"\u0000\u0000\u015d\u015e\u0003\u0014\n\u0000\u015e)\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0005(\u0000\u0000\u0160\u0161\u0003\u0014\n\u0000"+
		"\u0161+\u0001\u0000\u0000\u0000\u0162\u0163\u00032\u0019\u0000\u0163\u0164"+
		"\u0005\u001e\u0000\u0000\u0164\u0165\u0003\u0014\n\u0000\u0165\u0166\u0005"+
		"\u001f\u0000\u0000\u0166-\u0001\u0000\u0000\u0000\u0167\u0168\u0005)\u0000"+
		"\u0000\u0168\u016f\u0003\u0014\n\u0000\u0169\u016b\u0005\u0006\u0000\u0000"+
		"\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0003\u0014\n\u0000\u016d"+
		"\u016a\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f"+
		"\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170"+
		"/\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0005\u0005\u0000\u0000\u0173\u0174\u0003\u0014\n\u0000\u01741\u0001"+
		"\u0000\u0000\u0000\u0175\u017b\u0005*\u0000\u0000\u0176\u017b\u0005+\u0000"+
		"\u0000\u0177\u017b\u0005,\u0000\u0000\u0178\u017b\u0005-\u0000\u0000\u0179"+
		"\u017b\u0005\u000b\u0000\u0000\u017a\u0175\u0001\u0000\u0000\u0000\u017a"+
		"\u0176\u0001\u0000\u0000\u0000\u017a\u0177\u0001\u0000\u0000\u0000\u017a"+
		"\u0178\u0001\u0000\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017b"+
		"3\u0001\u0000\u0000\u0000&9=HSZbjru\u007f\u0084\u0090\u009a\u00a4\u00ae"+
		"\u00b8\u00c2\u00d0\u00db\u00dd\u00e3\u00e7\u00ec\u00ff\u0110\u0112\u011d"+
		"\u011f\u012f\u0136\u013b\u0141\u0143\u014b\u0155\u016a\u016f\u017a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}