// Generated from c:\Users\Trevor Alt\Documents\GitHub\edr_to_epidoc\EDR.g by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EDRParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		L_PAREN=1, R_PAREN=2, L_BRACKET=3, R_BRACKET=4, L_CURLY=5, R_CURLY=6, 
		COLON=7, QUESTION=8, DASH=9, PLUS=10, UNDERLINE=11, CIRCUMFLEX=12, DOT=13, 
		LETTER=14, SPACE=15, NEWLINE=16, PUNCT=17, NUM=18, L_ANGLE=19, R_ANGLE=20, 
		VACAT=21, IANUA=22;
	public static final int
		RULE_root = 0, RULE_inscription = 1, RULE_row = 2, RULE_line = 3, RULE_term = 4, 
		RULE_figural = 5, RULE_misspell = 6, RULE_abbrev = 7, RULE_desc = 8, RULE_string = 9, 
		RULE_word = 10, RULE_chunk = 11, RULE_normal_chunk = 12, RULE_under_chunk = 13, 
		RULE_under_helper = 14, RULE_dot_chunk = 15, RULE_dot_helper = 16, RULE_erased = 17, 
		RULE_lost_chunk = 18, RULE_gap_unknown = 19, RULE_illegible = 20, RULE_lost_lines_unknown = 21, 
		RULE_lost_chars_known = 22, RULE_lost_line = 23, RULE_lost_lines = 24, 
		RULE_surplus = 25, RULE_joined = 26, RULE_joined_helper = 27, RULE_joined_letters = 28, 
		RULE_symbol = 29, RULE_lost_chars = 30, RULE_dashes = 31, RULE_editorial = 32, 
		RULE_vacat = 33, RULE_ianua = 34, RULE_subaudible = 35, RULE_omitted = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "inscription", "row", "line", "term", "figural", "misspell", 
			"abbrev", "desc", "string", "word", "chunk", "normal_chunk", "under_chunk", 
			"under_helper", "dot_chunk", "dot_helper", "erased", "lost_chunk", "gap_unknown", 
			"illegible", "lost_lines_unknown", "lost_chars_known", "lost_line", "lost_lines", 
			"surplus", "joined", "joined_helper", "joined_letters", "symbol", "lost_chars", 
			"dashes", "editorial", "vacat", "ianua", "subaudible", "omitted"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "'?'", "'-'", 
			"'+'", "'&#818;'", "'&#770;'", "'&#803;'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "L_PAREN", "R_PAREN", "L_BRACKET", "R_BRACKET", "L_CURLY", "R_CURLY", 
			"COLON", "QUESTION", "DASH", "PLUS", "UNDERLINE", "CIRCUMFLEX", "DOT", 
			"LETTER", "SPACE", "NEWLINE", "PUNCT", "NUM", "L_ANGLE", "R_ANGLE", "VACAT", 
			"IANUA"
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
	public String getGrammarFileName() { return "EDR.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EDRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public InscriptionContext inscription() {
			return getRuleContext(InscriptionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EDRParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			inscription();
			setState(75);
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

	public static class InscriptionContext extends ParserRuleContext {
		public InscriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inscription; }
	 
		public InscriptionContext() { }
		public void copyFrom(InscriptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Inscription1Context extends InscriptionContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(EDRParser.NEWLINE, 0); }
		public InscriptionContext inscription() {
			return getRuleContext(InscriptionContext.class,0);
		}
		public Inscription1Context(InscriptionContext ctx) { copyFrom(ctx); }
	}
	public static class Inscription3Context extends InscriptionContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(EDRParser.NEWLINE, 0); }
		public Inscription3Context(InscriptionContext ctx) { copyFrom(ctx); }
	}
	public static class Inscription2Context extends InscriptionContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public Inscription2Context(InscriptionContext ctx) { copyFrom(ctx); }
	}

	public final InscriptionContext inscription() throws RecognitionException {
		InscriptionContext _localctx = new InscriptionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inscription);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new Inscription1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				row();
				setState(78);
				match(NEWLINE);
				setState(79);
				inscription();
				}
				break;
			case 2:
				_localctx = new Inscription2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				row();
				}
				break;
			case 3:
				_localctx = new Inscription3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				row();
				setState(83);
				match(NEWLINE);
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

	public static class RowContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public Lost_lines_unknownContext lost_lines_unknown() {
			return getRuleContext(Lost_lines_unknownContext.class,0);
		}
		public Lost_linesContext lost_lines() {
			return getRuleContext(Lost_linesContext.class,0);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				lost_lines_unknown();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				lost_lines(0);
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

	public static class LineContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EDRParser.SPACE, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_line);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				term();
				setState(94);
				match(SPACE);
				setState(95);
				line();
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

	public static class TermContext extends ParserRuleContext {
		public MisspellContext misspell() {
			return getRuleContext(MisspellContext.class,0);
		}
		public FiguralContext figural() {
			return getRuleContext(FiguralContext.class,0);
		}
		public AbbrevContext abbrev() {
			return getRuleContext(AbbrevContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public EditorialContext editorial() {
			return getRuleContext(EditorialContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				misspell();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				figural();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				abbrev();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				string();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				editorial();
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

	public static class FiguralContext extends ParserRuleContext {
		public List<TerminalNode> L_PAREN() { return getTokens(EDRParser.L_PAREN); }
		public TerminalNode L_PAREN(int i) {
			return getToken(EDRParser.L_PAREN, i);
		}
		public TerminalNode COLON() { return getToken(EDRParser.COLON, 0); }
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public List<TerminalNode> R_PAREN() { return getTokens(EDRParser.R_PAREN); }
		public TerminalNode R_PAREN(int i) {
			return getToken(EDRParser.R_PAREN, i);
		}
		public FiguralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figural; }
	}

	public final FiguralContext figural() throws RecognitionException {
		FiguralContext _localctx = new FiguralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_figural);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(L_PAREN);
			setState(107);
			match(L_PAREN);
			setState(108);
			match(COLON);
			setState(109);
			desc(0);
			setState(110);
			match(R_PAREN);
			setState(111);
			match(R_PAREN);
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

	public static class MisspellContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EDRParser.SPACE, 0); }
		public TerminalNode L_PAREN() { return getToken(EDRParser.L_PAREN, 0); }
		public TerminalNode COLON() { return getToken(EDRParser.COLON, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(EDRParser.R_PAREN, 0); }
		public TerminalNode QUESTION() { return getToken(EDRParser.QUESTION, 0); }
		public MisspellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misspell; }
	}

	public final MisspellContext misspell() throws RecognitionException {
		MisspellContext _localctx = new MisspellContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_misspell);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				word(0);
				setState(114);
				match(SPACE);
				setState(115);
				match(L_PAREN);
				setState(116);
				match(COLON);
				setState(117);
				string();
				setState(118);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				word(0);
				setState(121);
				match(SPACE);
				setState(122);
				match(L_PAREN);
				setState(123);
				match(COLON);
				setState(124);
				string();
				setState(125);
				match(QUESTION);
				setState(126);
				match(R_PAREN);
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

	public static class AbbrevContext extends ParserRuleContext {
		public AbbrevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbrev; }
	 
		public AbbrevContext() { }
		public void copyFrom(AbbrevContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Unknown_abbr1Context extends AbbrevContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(EDRParser.L_PAREN, 0); }
		public List<TerminalNode> DASH() { return getTokens(EDRParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(EDRParser.DASH, i);
		}
		public TerminalNode R_PAREN() { return getToken(EDRParser.R_PAREN, 0); }
		public Unknown_abbr1Context(AbbrevContext ctx) { copyFrom(ctx); }
	}
	public static class Uncertain_abbrContext extends AbbrevContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(EDRParser.L_PAREN, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(EDRParser.QUESTION, 0); }
		public TerminalNode R_PAREN() { return getToken(EDRParser.R_PAREN, 0); }
		public Uncertain_abbrContext(AbbrevContext ctx) { copyFrom(ctx); }
	}
	public static class Normal_abbrContext extends AbbrevContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(EDRParser.L_PAREN, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(EDRParser.R_PAREN, 0); }
		public Normal_abbrContext(AbbrevContext ctx) { copyFrom(ctx); }
	}
	public static class Unknown_abbr2Context extends AbbrevContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(EDRParser.L_PAREN, 0); }
		public List<TerminalNode> DASH() { return getTokens(EDRParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(EDRParser.DASH, i);
		}
		public TerminalNode QUESTION() { return getToken(EDRParser.QUESTION, 0); }
		public TerminalNode R_PAREN() { return getToken(EDRParser.R_PAREN, 0); }
		public Unknown_abbr2Context(AbbrevContext ctx) { copyFrom(ctx); }
	}

	public final AbbrevContext abbrev() throws RecognitionException {
		AbbrevContext _localctx = new AbbrevContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_abbrev);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Normal_abbrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				word(0);
				setState(131);
				match(L_PAREN);
				setState(132);
				string();
				setState(133);
				match(R_PAREN);
				}
				break;
			case 2:
				_localctx = new Uncertain_abbrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				word(0);
				setState(136);
				match(L_PAREN);
				setState(137);
				string();
				setState(138);
				match(QUESTION);
				setState(139);
				match(R_PAREN);
				}
				break;
			case 3:
				_localctx = new Unknown_abbr1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				word(0);
				setState(142);
				match(L_PAREN);
				setState(143);
				match(DASH);
				setState(144);
				match(DASH);
				setState(145);
				match(DASH);
				setState(146);
				match(R_PAREN);
				}
				break;
			case 4:
				_localctx = new Unknown_abbr2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				word(0);
				setState(149);
				match(L_PAREN);
				setState(150);
				match(DASH);
				setState(151);
				match(DASH);
				setState(152);
				match(DASH);
				setState(153);
				match(QUESTION);
				setState(154);
				match(R_PAREN);
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

	public static class DescContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode PUNCT() { return getToken(EDRParser.PUNCT, 0); }
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EDRParser.SPACE, 0); }
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
	}

	public final DescContext desc() throws RecognitionException {
		return desc(0);
	}

	private DescContext desc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DescContext _localctx = new DescContext(_ctx, _parentState);
		DescContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_desc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(159);
				word(0);
				setState(160);
				match(PUNCT);
				}
				break;
			case 2:
				{
				setState(162);
				word(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(165);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(166);
						match(SPACE);
						setState(167);
						word(0);
						setState(168);
						match(PUNCT);
						}
						break;
					case 2:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						match(SPACE);
						setState(172);
						word(0);
						}
						break;
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class StringContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EDRParser.SPACE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				word(0);
				setState(179);
				match(SPACE);
				setState(180);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				word(0);
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

	public static class WordContext extends ParserRuleContext {
		public ChunkContext chunk() {
			return getRuleContext(ChunkContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
	}

	public final WordContext word() throws RecognitionException {
		return word(0);
	}

	private WordContext word(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WordContext _localctx = new WordContext(_ctx, _parentState);
		WordContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_word, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(186);
			chunk();
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new WordContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_word);
					setState(188);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(189);
					chunk();
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ChunkContext extends ParserRuleContext {
		public Normal_chunkContext normal_chunk() {
			return getRuleContext(Normal_chunkContext.class,0);
		}
		public Under_chunkContext under_chunk() {
			return getRuleContext(Under_chunkContext.class,0);
		}
		public Dot_chunkContext dot_chunk() {
			return getRuleContext(Dot_chunkContext.class,0);
		}
		public ErasedContext erased() {
			return getRuleContext(ErasedContext.class,0);
		}
		public Lost_chunkContext lost_chunk() {
			return getRuleContext(Lost_chunkContext.class,0);
		}
		public Gap_unknownContext gap_unknown() {
			return getRuleContext(Gap_unknownContext.class,0);
		}
		public IllegibleContext illegible() {
			return getRuleContext(IllegibleContext.class,0);
		}
		public SurplusContext surplus() {
			return getRuleContext(SurplusContext.class,0);
		}
		public JoinedContext joined() {
			return getRuleContext(JoinedContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Lost_charsContext lost_chars() {
			return getRuleContext(Lost_charsContext.class,0);
		}
		public Lost_chars_knownContext lost_chars_known() {
			return getRuleContext(Lost_chars_knownContext.class,0);
		}
		public OmittedContext omitted() {
			return getRuleContext(OmittedContext.class,0);
		}
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_chunk);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				under_chunk();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				dot_chunk();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				erased();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				lost_chunk();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				gap_unknown();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(201);
				illegible();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(202);
				surplus();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(203);
				joined();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(204);
				symbol();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(205);
				lost_chars();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(206);
				lost_chars_known();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(207);
				omitted();
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

	public static class Normal_chunkContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(EDRParser.LETTER, 0); }
		public Normal_chunkContext normal_chunk() {
			return getRuleContext(Normal_chunkContext.class,0);
		}
		public Normal_chunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_chunk; }
	}

	public final Normal_chunkContext normal_chunk() throws RecognitionException {
		Normal_chunkContext _localctx = new Normal_chunkContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_normal_chunk);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(LETTER);
				setState(211);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(LETTER);
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

	public static class Under_chunkContext extends ParserRuleContext {
		public Under_helperContext under_helper() {
			return getRuleContext(Under_helperContext.class,0);
		}
		public Under_chunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_under_chunk; }
	}

	public final Under_chunkContext under_chunk() throws RecognitionException {
		Under_chunkContext _localctx = new Under_chunkContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_under_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			under_helper();
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

	public static class Under_helperContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(EDRParser.LETTER, 0); }
		public TerminalNode UNDERLINE() { return getToken(EDRParser.UNDERLINE, 0); }
		public Under_helperContext under_helper() {
			return getRuleContext(Under_helperContext.class,0);
		}
		public Under_helperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_under_helper; }
	}

	public final Under_helperContext under_helper() throws RecognitionException {
		Under_helperContext _localctx = new Under_helperContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_under_helper);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(LETTER);
				setState(218);
				match(UNDERLINE);
				setState(219);
				under_helper();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(LETTER);
				setState(221);
				match(UNDERLINE);
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

	public static class Dot_chunkContext extends ParserRuleContext {
		public Dot_helperContext dot_helper() {
			return getRuleContext(Dot_helperContext.class,0);
		}
		public Dot_chunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_chunk; }
	}

	public final Dot_chunkContext dot_chunk() throws RecognitionException {
		Dot_chunkContext _localctx = new Dot_chunkContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dot_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			dot_helper(0);
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

	public static class Dot_helperContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(EDRParser.LETTER, 0); }
		public TerminalNode DOT() { return getToken(EDRParser.DOT, 0); }
		public Dot_helperContext dot_helper() {
			return getRuleContext(Dot_helperContext.class,0);
		}
		public Dot_helperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_helper; }
	}

	public final Dot_helperContext dot_helper() throws RecognitionException {
		return dot_helper(0);
	}

	private Dot_helperContext dot_helper(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dot_helperContext _localctx = new Dot_helperContext(_ctx, _parentState);
		Dot_helperContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_dot_helper, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(227);
			match(LETTER);
			setState(228);
			match(DOT);
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dot_helperContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dot_helper);
					setState(230);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(231);
					match(LETTER);
					setState(232);
					match(DOT);
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ErasedContext extends ParserRuleContext {
		public List<TerminalNode> L_BRACKET() { return getTokens(EDRParser.L_BRACKET); }
		public TerminalNode L_BRACKET(int i) {
			return getToken(EDRParser.L_BRACKET, i);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public List<TerminalNode> R_BRACKET() { return getTokens(EDRParser.R_BRACKET); }
		public TerminalNode R_BRACKET(int i) {
			return getToken(EDRParser.R_BRACKET, i);
		}
		public ErasedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_erased; }
	}

	public final ErasedContext erased() throws RecognitionException {
		ErasedContext _localctx = new ErasedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_erased);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(L_BRACKET);
			setState(239);
			match(L_BRACKET);
			setState(240);
			line();
			setState(241);
			match(R_BRACKET);
			setState(242);
			match(R_BRACKET);
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

	public static class Lost_chunkContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(EDRParser.L_BRACKET, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(EDRParser.R_BRACKET, 0); }
		public TerminalNode QUESTION() { return getToken(EDRParser.QUESTION, 0); }
		public Lost_chunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lost_chunk; }
	}

	public final Lost_chunkContext lost_chunk() throws RecognitionException {
		Lost_chunkContext _localctx = new Lost_chunkContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lost_chunk);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(L_BRACKET);
				setState(245);
				line();
				setState(246);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(L_BRACKET);
				setState(249);
				line();
				setState(250);
				match(QUESTION);
				setState(251);
				match(R_BRACKET);
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

	public static class Gap_unknownContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(EDRParser.L_BRACKET, 0); }
		public List<TerminalNode> DASH() { return getTokens(EDRParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(EDRParser.DASH, i);
		}
		public TerminalNode R_BRACKET() { return getToken(EDRParser.R_BRACKET, 0); }
		public List<TerminalNode> SPACE() { return getTokens(EDRParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(EDRParser.SPACE, i);
		}
		public Gap_unknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gap_unknown; }
	}

	public final Gap_unknownContext gap_unknown() throws RecognitionException {
		Gap_unknownContext _localctx = new Gap_unknownContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_gap_unknown);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(L_BRACKET);
				setState(256);
				match(DASH);
				setState(257);
				match(DASH);
				setState(258);
				match(DASH);
				setState(259);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(L_BRACKET);
				setState(261);
				match(SPACE);
				setState(262);
				match(DASH);
				setState(263);
				match(SPACE);
				setState(264);
				match(DASH);
				setState(265);
				match(SPACE);
				setState(266);
				match(DASH);
				setState(267);
				match(SPACE);
				setState(268);
				match(R_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(L_BRACKET);
				setState(270);
				match(DASH);
				setState(271);
				match(SPACE);
				setState(272);
				match(DASH);
				setState(273);
				match(SPACE);
				setState(274);
				match(DASH);
				setState(275);
				match(R_BRACKET);
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

	public static class IllegibleContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(EDRParser.PLUS, 0); }
		public IllegibleContext illegible() {
			return getRuleContext(IllegibleContext.class,0);
		}
		public IllegibleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_illegible; }
	}

	public final IllegibleContext illegible() throws RecognitionException {
		IllegibleContext _localctx = new IllegibleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_illegible);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(PLUS);
				setState(279);
				illegible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(PLUS);
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

	public static class Lost_lines_unknownContext extends ParserRuleContext {
		public List<TerminalNode> DASH() { return getTokens(EDRParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(EDRParser.DASH, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(EDRParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(EDRParser.SPACE, i);
		}
		public Lost_lines_unknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lost_lines_unknown; }
	}

	public final Lost_lines_unknownContext lost_lines_unknown() throws RecognitionException {
		Lost_lines_unknownContext _localctx = new Lost_lines_unknownContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lost_lines_unknown);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(DASH);
				setState(284);
				match(DASH);
				setState(285);
				match(DASH);
				setState(286);
				match(DASH);
				setState(287);
				match(DASH);
				setState(288);
				match(DASH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(DASH);
				setState(290);
				match(SPACE);
				setState(291);
				match(DASH);
				setState(292);
				match(SPACE);
				setState(293);
				match(DASH);
				setState(294);
				match(SPACE);
				setState(295);
				match(DASH);
				setState(296);
				match(SPACE);
				setState(297);
				match(DASH);
				setState(298);
				match(SPACE);
				setState(299);
				match(DASH);
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

	public static class Lost_chars_knownContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(EDRParser.L_BRACKET, 0); }
		public DashesContext dashes() {
			return getRuleContext(DashesContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(EDRParser.R_BRACKET, 0); }
		public Lost_chars_knownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lost_chars_known; }
	}

	public final Lost_chars_knownContext lost_chars_known() throws RecognitionException {
		Lost_chars_knownContext _localctx = new Lost_chars_knownContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_lost_chars_known);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(L_BRACKET);
			setState(303);
			dashes();
			setState(304);
			match(R_BRACKET);
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

	public static class Lost_lineContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(EDRParser.L_BRACKET, 0); }
		public List<TerminalNode> DASH() { return getTokens(EDRParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(EDRParser.DASH, i);
		}
		public TerminalNode R_BRACKET() { return getToken(EDRParser.R_BRACKET, 0); }
		public Lost_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lost_line; }
	}

	public final Lost_lineContext lost_line() throws RecognitionException {
		Lost_lineContext _localctx = new Lost_lineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lost_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(L_BRACKET);
			setState(307);
			match(DASH);
			setState(308);
			match(DASH);
			setState(309);
			match(DASH);
			setState(310);
			match(DASH);
			setState(311);
			match(DASH);
			setState(312);
			match(DASH);
			setState(313);
			match(R_BRACKET);
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

	public static class Lost_linesContext extends ParserRuleContext {
		public Lost_lineContext lost_line() {
			return getRuleContext(Lost_lineContext.class,0);
		}
		public Lost_linesContext lost_lines() {
			return getRuleContext(Lost_linesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(EDRParser.NEWLINE, 0); }
		public Lost_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lost_lines; }
	}

	public final Lost_linesContext lost_lines() throws RecognitionException {
		return lost_lines(0);
	}

	private Lost_linesContext lost_lines(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lost_linesContext _localctx = new Lost_linesContext(_ctx, _parentState);
		Lost_linesContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_lost_lines, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(316);
			lost_line();
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lost_linesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lost_lines);
					setState(318);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(319);
					match(NEWLINE);
					setState(320);
					lost_line();
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class SurplusContext extends ParserRuleContext {
		public TerminalNode L_CURLY() { return getToken(EDRParser.L_CURLY, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode R_CURLY() { return getToken(EDRParser.R_CURLY, 0); }
		public SurplusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surplus; }
	}

	public final SurplusContext surplus() throws RecognitionException {
		SurplusContext _localctx = new SurplusContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_surplus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(L_CURLY);
			setState(327);
			word(0);
			setState(328);
			match(R_CURLY);
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

	public static class JoinedContext extends ParserRuleContext {
		public Joined_helperContext joined_helper() {
			return getRuleContext(Joined_helperContext.class,0);
		}
		public JoinedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joined; }
	}

	public final JoinedContext joined() throws RecognitionException {
		JoinedContext _localctx = new JoinedContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_joined);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			joined_helper();
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

	public static class Joined_helperContext extends ParserRuleContext {
		public Joined_lettersContext joined_letters() {
			return getRuleContext(Joined_lettersContext.class,0);
		}
		public TerminalNode CIRCUMFLEX() { return getToken(EDRParser.CIRCUMFLEX, 0); }
		public TerminalNode LETTER() { return getToken(EDRParser.LETTER, 0); }
		public Joined_helperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joined_helper; }
	}

	public final Joined_helperContext joined_helper() throws RecognitionException {
		Joined_helperContext _localctx = new Joined_helperContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_joined_helper);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				joined_letters();
				setState(333);
				match(CIRCUMFLEX);
				setState(334);
				match(LETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				joined_letters();
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

	public static class Joined_lettersContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(EDRParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(EDRParser.LETTER, i);
		}
		public TerminalNode CIRCUMFLEX() { return getToken(EDRParser.CIRCUMFLEX, 0); }
		public Joined_lettersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joined_letters; }
	}

	public final Joined_lettersContext joined_letters() throws RecognitionException {
		Joined_lettersContext _localctx = new Joined_lettersContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_joined_letters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(LETTER);
			setState(340);
			match(CIRCUMFLEX);
			setState(341);
			match(LETTER);
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

	public static class SymbolContext extends ParserRuleContext {
		public List<TerminalNode> L_PAREN() { return getTokens(EDRParser.L_PAREN); }
		public TerminalNode L_PAREN(int i) {
			return getToken(EDRParser.L_PAREN, i);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public List<TerminalNode> R_PAREN() { return getTokens(EDRParser.R_PAREN); }
		public TerminalNode R_PAREN(int i) {
			return getToken(EDRParser.R_PAREN, i);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(L_PAREN);
			setState(344);
			match(L_PAREN);
			setState(345);
			word(0);
			setState(346);
			match(R_PAREN);
			setState(347);
			match(R_PAREN);
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

	public static class Lost_charsContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(EDRParser.L_BRACKET, 0); }
		public List<TerminalNode> PLUS() { return getTokens(EDRParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(EDRParser.PLUS, i);
		}
		public TerminalNode NUM() { return getToken(EDRParser.NUM, 0); }
		public TerminalNode QUESTION() { return getToken(EDRParser.QUESTION, 0); }
		public TerminalNode R_BRACKET() { return getToken(EDRParser.R_BRACKET, 0); }
		public Lost_charsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lost_chars; }
	}

	public final Lost_charsContext lost_chars() throws RecognitionException {
		Lost_charsContext _localctx = new Lost_charsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lost_chars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(L_BRACKET);
			setState(350);
			match(PLUS);
			setState(351);
			match(NUM);
			setState(352);
			match(QUESTION);
			setState(353);
			match(PLUS);
			setState(354);
			match(R_BRACKET);
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

	public static class DashesContext extends ParserRuleContext {
		public List<TerminalNode> DASH() { return getTokens(EDRParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(EDRParser.DASH, i);
		}
		public DashesContext dashes() {
			return getRuleContext(DashesContext.class,0);
		}
		public DashesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dashes; }
	}

	public final DashesContext dashes() throws RecognitionException {
		DashesContext _localctx = new DashesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dashes);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(DASH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(DASH);
				setState(358);
				match(DASH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(DASH);
				setState(360);
				match(DASH);
				setState(361);
				match(DASH);
				setState(362);
				match(DASH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				match(DASH);
				setState(364);
				match(DASH);
				setState(365);
				match(DASH);
				setState(366);
				match(DASH);
				setState(367);
				match(DASH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				match(DASH);
				setState(369);
				match(DASH);
				setState(370);
				match(DASH);
				setState(371);
				match(DASH);
				setState(372);
				match(DASH);
				setState(373);
				match(DASH);
				setState(374);
				dashes();
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

	public static class EditorialContext extends ParserRuleContext {
		public VacatContext vacat() {
			return getRuleContext(VacatContext.class,0);
		}
		public IanuaContext ianua() {
			return getRuleContext(IanuaContext.class,0);
		}
		public SubaudibleContext subaudible() {
			return getRuleContext(SubaudibleContext.class,0);
		}
		public EditorialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_editorial; }
	}

	public final EditorialContext editorial() throws RecognitionException {
		EditorialContext _localctx = new EditorialContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_editorial);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VACAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				vacat();
				}
				break;
			case IANUA:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				ianua();
				}
				break;
			case L_PAREN:
			case L_ANGLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				subaudible();
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

	public static class VacatContext extends ParserRuleContext {
		public TerminalNode VACAT() { return getToken(EDRParser.VACAT, 0); }
		public VacatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacat; }
	}

	public final VacatContext vacat() throws RecognitionException {
		VacatContext _localctx = new VacatContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_vacat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(VACAT);
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

	public static class IanuaContext extends ParserRuleContext {
		public TerminalNode IANUA() { return getToken(EDRParser.IANUA, 0); }
		public IanuaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ianua; }
	}

	public final IanuaContext ianua() throws RecognitionException {
		IanuaContext _localctx = new IanuaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ianua);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(IANUA);
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

	public static class SubaudibleContext extends ParserRuleContext {
		public TerminalNode L_ANGLE() { return getToken(EDRParser.L_ANGLE, 0); }
		public TerminalNode COLON() { return getToken(EDRParser.COLON, 0); }
		public Normal_chunkContext normal_chunk() {
			return getRuleContext(Normal_chunkContext.class,0);
		}
		public TerminalNode R_ANGLE() { return getToken(EDRParser.R_ANGLE, 0); }
		public TerminalNode L_PAREN() { return getToken(EDRParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(EDRParser.R_PAREN, 0); }
		public SubaudibleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subaudible; }
	}

	public final SubaudibleContext subaudible() throws RecognitionException {
		SubaudibleContext _localctx = new SubaudibleContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_subaudible);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(L_ANGLE);
				setState(387);
				match(COLON);
				setState(388);
				normal_chunk();
				setState(389);
				match(R_ANGLE);
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(L_PAREN);
				setState(392);
				normal_chunk();
				setState(393);
				match(R_PAREN);
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

	public static class OmittedContext extends ParserRuleContext {
		public TerminalNode L_ANGLE() { return getToken(EDRParser.L_ANGLE, 0); }
		public Normal_chunkContext normal_chunk() {
			return getRuleContext(Normal_chunkContext.class,0);
		}
		public TerminalNode R_ANGLE() { return getToken(EDRParser.R_ANGLE, 0); }
		public OmittedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_omitted; }
	}

	public final OmittedContext omitted() throws RecognitionException {
		OmittedContext _localctx = new OmittedContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_omitted);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(L_ANGLE);
			setState(398);
			normal_chunk();
			setState(399);
			match(R_ANGLE);
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
		case 8:
			return desc_sempred((DescContext)_localctx, predIndex);
		case 10:
			return word_sempred((WordContext)_localctx, predIndex);
		case 16:
			return dot_helper_sempred((Dot_helperContext)_localctx, predIndex);
		case 24:
			return lost_lines_sempred((Lost_linesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean desc_sempred(DescContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean word_sempred(WordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean dot_helper_sempred(Dot_helperContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lost_lines_sempred(Lost_linesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u0194\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3X\n\3\3\4\3\4\3\4\5\4]\n\4\3\5\3\5\3\5\3\5\3\5\5\5d\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0083\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009f\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a6"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b0\n\n\f\n\16\n\u00b3\13\n"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00ba\n\13\3\f\3\f\3\f\3\f\3\f\7\f\u00c1"+
		"\n\f\f\f\16\f\u00c4\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00d3\n\r\3\16\3\16\3\16\5\16\u00d8\n\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00e1\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u00ec\n\22\f\22\16\22\u00ef\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0100\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0117\n\25\3\26\3\26\3\26\5\26\u011c"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u012f\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0144"+
		"\n\32\f\32\16\32\u0147\13\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u0154\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\5!\u017a\n!\3\"\3\"\3\"\5\"\u017f\n\"\3#\3#\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u018e\n%\3&\3&\3&\3&\3&\2\6\22\26\"\62"+
		"\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD"+
		"FHJ\2\2\2\u019d\2L\3\2\2\2\4W\3\2\2\2\6\\\3\2\2\2\bc\3\2\2\2\nj\3\2\2"+
		"\2\fl\3\2\2\2\16\u0082\3\2\2\2\20\u009e\3\2\2\2\22\u00a5\3\2\2\2\24\u00b9"+
		"\3\2\2\2\26\u00bb\3\2\2\2\30\u00d2\3\2\2\2\32\u00d7\3\2\2\2\34\u00d9\3"+
		"\2\2\2\36\u00e0\3\2\2\2 \u00e2\3\2\2\2\"\u00e4\3\2\2\2$\u00f0\3\2\2\2"+
		"&\u00ff\3\2\2\2(\u0116\3\2\2\2*\u011b\3\2\2\2,\u012e\3\2\2\2.\u0130\3"+
		"\2\2\2\60\u0134\3\2\2\2\62\u013d\3\2\2\2\64\u0148\3\2\2\2\66\u014c\3\2"+
		"\2\28\u0153\3\2\2\2:\u0155\3\2\2\2<\u0159\3\2\2\2>\u015f\3\2\2\2@\u0179"+
		"\3\2\2\2B\u017e\3\2\2\2D\u0180\3\2\2\2F\u0182\3\2\2\2H\u018d\3\2\2\2J"+
		"\u018f\3\2\2\2LM\5\4\3\2MN\7\2\2\3N\3\3\2\2\2OP\5\6\4\2PQ\7\22\2\2QR\5"+
		"\4\3\2RX\3\2\2\2SX\5\6\4\2TU\5\6\4\2UV\7\22\2\2VX\3\2\2\2WO\3\2\2\2WS"+
		"\3\2\2\2WT\3\2\2\2X\5\3\2\2\2Y]\5\b\5\2Z]\5,\27\2[]\5\62\32\2\\Y\3\2\2"+
		"\2\\Z\3\2\2\2\\[\3\2\2\2]\7\3\2\2\2^d\5\n\6\2_`\5\n\6\2`a\7\21\2\2ab\5"+
		"\b\5\2bd\3\2\2\2c^\3\2\2\2c_\3\2\2\2d\t\3\2\2\2ek\5\16\b\2fk\5\f\7\2g"+
		"k\5\20\t\2hk\5\24\13\2ik\5B\"\2je\3\2\2\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2"+
		"\2ji\3\2\2\2k\13\3\2\2\2lm\7\3\2\2mn\7\3\2\2no\7\t\2\2op\5\22\n\2pq\7"+
		"\4\2\2qr\7\4\2\2r\r\3\2\2\2st\5\26\f\2tu\7\21\2\2uv\7\3\2\2vw\7\t\2\2"+
		"wx\5\24\13\2xy\7\4\2\2y\u0083\3\2\2\2z{\5\26\f\2{|\7\21\2\2|}\7\3\2\2"+
		"}~\7\t\2\2~\177\5\24\13\2\177\u0080\7\n\2\2\u0080\u0081\7\4\2\2\u0081"+
		"\u0083\3\2\2\2\u0082s\3\2\2\2\u0082z\3\2\2\2\u0083\17\3\2\2\2\u0084\u0085"+
		"\5\26\f\2\u0085\u0086\7\3\2\2\u0086\u0087\5\24\13\2\u0087\u0088\7\4\2"+
		"\2\u0088\u009f\3\2\2\2\u0089\u008a\5\26\f\2\u008a\u008b\7\3\2\2\u008b"+
		"\u008c\5\24\13\2\u008c\u008d\7\n\2\2\u008d\u008e\7\4\2\2\u008e\u009f\3"+
		"\2\2\2\u008f\u0090\5\26\f\2\u0090\u0091\7\3\2\2\u0091\u0092\7\13\2\2\u0092"+
		"\u0093\7\13\2\2\u0093\u0094\7\13\2\2\u0094\u0095\7\4\2\2\u0095\u009f\3"+
		"\2\2\2\u0096\u0097\5\26\f\2\u0097\u0098\7\3\2\2\u0098\u0099\7\13\2\2\u0099"+
		"\u009a\7\13\2\2\u009a\u009b\7\13\2\2\u009b\u009c\7\n\2\2\u009c\u009d\7"+
		"\4\2\2\u009d\u009f\3\2\2\2\u009e\u0084\3\2\2\2\u009e\u0089\3\2\2\2\u009e"+
		"\u008f\3\2\2\2\u009e\u0096\3\2\2\2\u009f\21\3\2\2\2\u00a0\u00a1\b\n\1"+
		"\2\u00a1\u00a2\5\26\f\2\u00a2\u00a3\7\23\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a6\5\26\f\2\u00a5\u00a0\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00b1\3"+
		"\2\2\2\u00a7\u00a8\f\6\2\2\u00a8\u00a9\7\21\2\2\u00a9\u00aa\5\26\f\2\u00aa"+
		"\u00ab\7\23\2\2\u00ab\u00b0\3\2\2\2\u00ac\u00ad\f\5\2\2\u00ad\u00ae\7"+
		"\21\2\2\u00ae\u00b0\5\26\f\2\u00af\u00a7\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\23\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\5\26\f\2\u00b5\u00b6\7\21\2\2\u00b6"+
		"\u00b7\5\24\13\2\u00b7\u00ba\3\2\2\2\u00b8\u00ba\5\26\f\2\u00b9\u00b4"+
		"\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\25\3\2\2\2\u00bb\u00bc\b\f\1\2\u00bc"+
		"\u00bd\5\30\r\2\u00bd\u00c2\3\2\2\2\u00be\u00bf\f\4\2\2\u00bf\u00c1\5"+
		"\30\r\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\27\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00d3\5\32\16"+
		"\2\u00c6\u00d3\5\34\17\2\u00c7\u00d3\5 \21\2\u00c8\u00d3\5$\23\2\u00c9"+
		"\u00d3\5&\24\2\u00ca\u00d3\5(\25\2\u00cb\u00d3\5*\26\2\u00cc\u00d3\5\64"+
		"\33\2\u00cd\u00d3\5\66\34\2\u00ce\u00d3\5<\37\2\u00cf\u00d3\5> \2\u00d0"+
		"\u00d3\5.\30\2\u00d1\u00d3\5J&\2\u00d2\u00c5\3\2\2\2\u00d2\u00c6\3\2\2"+
		"\2\u00d2\u00c7\3\2\2\2\u00d2\u00c8\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00ca"+
		"\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2"+
		"\2\2\u00d3\31\3\2\2\2\u00d4\u00d5\7\20\2\2\u00d5\u00d8\5\32\16\2\u00d6"+
		"\u00d8\7\20\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\33\3\2\2"+
		"\2\u00d9\u00da\5\36\20\2\u00da\35\3\2\2\2\u00db\u00dc\7\20\2\2\u00dc\u00dd"+
		"\7\r\2\2\u00dd\u00e1\5\36\20\2\u00de\u00df\7\20\2\2\u00df\u00e1\7\r\2"+
		"\2\u00e0\u00db\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\37\3\2\2\2\u00e2\u00e3"+
		"\5\"\22\2\u00e3!\3\2\2\2\u00e4\u00e5\b\22\1\2\u00e5\u00e6\7\20\2\2\u00e6"+
		"\u00e7\7\17\2\2\u00e7\u00ed\3\2\2\2\u00e8\u00e9\f\4\2\2\u00e9\u00ea\7"+
		"\20\2\2\u00ea\u00ec\7\17\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee#\3\2\2\2\u00ef\u00ed\3\2\2\2"+
		"\u00f0\u00f1\7\5\2\2\u00f1\u00f2\7\5\2\2\u00f2\u00f3\5\b\5\2\u00f3\u00f4"+
		"\7\6\2\2\u00f4\u00f5\7\6\2\2\u00f5%\3\2\2\2\u00f6\u00f7\7\5\2\2\u00f7"+
		"\u00f8\5\b\5\2\u00f8\u00f9\7\6\2\2\u00f9\u0100\3\2\2\2\u00fa\u00fb\7\5"+
		"\2\2\u00fb\u00fc\5\b\5\2\u00fc\u00fd\7\n\2\2\u00fd\u00fe\7\6\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00f6\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100\'\3\2\2\2"+
		"\u0101\u0102\7\5\2\2\u0102\u0103\7\13\2\2\u0103\u0104\7\13\2\2\u0104\u0105"+
		"\7\13\2\2\u0105\u0117\7\6\2\2\u0106\u0107\7\5\2\2\u0107\u0108\7\21\2\2"+
		"\u0108\u0109\7\13\2\2\u0109\u010a\7\21\2\2\u010a\u010b\7\13\2\2\u010b"+
		"\u010c\7\21\2\2\u010c\u010d\7\13\2\2\u010d\u010e\7\21\2\2\u010e\u0117"+
		"\7\6\2\2\u010f\u0110\7\5\2\2\u0110\u0111\7\13\2\2\u0111\u0112\7\21\2\2"+
		"\u0112\u0113\7\13\2\2\u0113\u0114\7\21\2\2\u0114\u0115\7\13\2\2\u0115"+
		"\u0117\7\6\2\2\u0116\u0101\3\2\2\2\u0116\u0106\3\2\2\2\u0116\u010f\3\2"+
		"\2\2\u0117)\3\2\2\2\u0118\u0119\7\f\2\2\u0119\u011c\5*\26\2\u011a\u011c"+
		"\7\f\2\2\u011b\u0118\3\2\2\2\u011b\u011a\3\2\2\2\u011c+\3\2\2\2\u011d"+
		"\u011e\7\13\2\2\u011e\u011f\7\13\2\2\u011f\u0120\7\13\2\2\u0120\u0121"+
		"\7\13\2\2\u0121\u0122\7\13\2\2\u0122\u012f\7\13\2\2\u0123\u0124\7\13\2"+
		"\2\u0124\u0125\7\21\2\2\u0125\u0126\7\13\2\2\u0126\u0127\7\21\2\2\u0127"+
		"\u0128\7\13\2\2\u0128\u0129\7\21\2\2\u0129\u012a\7\13\2\2\u012a\u012b"+
		"\7\21\2\2\u012b\u012c\7\13\2\2\u012c\u012d\7\21\2\2\u012d\u012f\7\13\2"+
		"\2\u012e\u011d\3\2\2\2\u012e\u0123\3\2\2\2\u012f-\3\2\2\2\u0130\u0131"+
		"\7\5\2\2\u0131\u0132\5@!\2\u0132\u0133\7\6\2\2\u0133/\3\2\2\2\u0134\u0135"+
		"\7\5\2\2\u0135\u0136\7\13\2\2\u0136\u0137\7\13\2\2\u0137\u0138\7\13\2"+
		"\2\u0138\u0139\7\13\2\2\u0139\u013a\7\13\2\2\u013a\u013b\7\13\2\2\u013b"+
		"\u013c\7\6\2\2\u013c\61\3\2\2\2\u013d\u013e\b\32\1\2\u013e\u013f\5\60"+
		"\31\2\u013f\u0145\3\2\2\2\u0140\u0141\f\4\2\2\u0141\u0142\7\22\2\2\u0142"+
		"\u0144\5\60\31\2\u0143\u0140\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0146\63\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u0149\7\7\2\2\u0149\u014a\5\26\f\2\u014a\u014b\7\b\2\2\u014b\65\3\2\2"+
		"\2\u014c\u014d\58\35\2\u014d\67\3\2\2\2\u014e\u014f\5:\36\2\u014f\u0150"+
		"\7\16\2\2\u0150\u0151\7\20\2\2\u0151\u0154\3\2\2\2\u0152\u0154\5:\36\2"+
		"\u0153\u014e\3\2\2\2\u0153\u0152\3\2\2\2\u01549\3\2\2\2\u0155\u0156\7"+
		"\20\2\2\u0156\u0157\7\16\2\2\u0157\u0158\7\20\2\2\u0158;\3\2\2\2\u0159"+
		"\u015a\7\3\2\2\u015a\u015b\7\3\2\2\u015b\u015c\5\26\f\2\u015c\u015d\7"+
		"\4\2\2\u015d\u015e\7\4\2\2\u015e=\3\2\2\2\u015f\u0160\7\5\2\2\u0160\u0161"+
		"\7\f\2\2\u0161\u0162\7\24\2\2\u0162\u0163\7\n\2\2\u0163\u0164\7\f\2\2"+
		"\u0164\u0165\7\6\2\2\u0165?\3\2\2\2\u0166\u017a\7\13\2\2\u0167\u0168\7"+
		"\13\2\2\u0168\u017a\7\13\2\2\u0169\u016a\7\13\2\2\u016a\u016b\7\13\2\2"+
		"\u016b\u016c\7\13\2\2\u016c\u017a\7\13\2\2\u016d\u016e\7\13\2\2\u016e"+
		"\u016f\7\13\2\2\u016f\u0170\7\13\2\2\u0170\u0171\7\13\2\2\u0171\u017a"+
		"\7\13\2\2\u0172\u0173\7\13\2\2\u0173\u0174\7\13\2\2\u0174\u0175\7\13\2"+
		"\2\u0175\u0176\7\13\2\2\u0176\u0177\7\13\2\2\u0177\u0178\7\13\2\2\u0178"+
		"\u017a\5@!\2\u0179\u0166\3\2\2\2\u0179\u0167\3\2\2\2\u0179\u0169\3\2\2"+
		"\2\u0179\u016d\3\2\2\2\u0179\u0172\3\2\2\2\u017aA\3\2\2\2\u017b\u017f"+
		"\5D#\2\u017c\u017f\5F$\2\u017d\u017f\5H%\2\u017e\u017b\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017d\3\2\2\2\u017fC\3\2\2\2\u0180\u0181\7\27\2\2\u0181"+
		"E\3\2\2\2\u0182\u0183\7\30\2\2\u0183G\3\2\2\2\u0184\u0185\7\25\2\2\u0185"+
		"\u0186\7\t\2\2\u0186\u0187\5\32\16\2\u0187\u0188\7\26\2\2\u0188\u018e"+
		"\3\2\2\2\u0189\u018a\7\3\2\2\u018a\u018b\5\32\16\2\u018b\u018c\7\4\2\2"+
		"\u018c\u018e\3\2\2\2\u018d\u0184\3\2\2\2\u018d\u0189\3\2\2\2\u018eI\3"+
		"\2\2\2\u018f\u0190\7\25\2\2\u0190\u0191\5\32\16\2\u0191\u0192\7\26\2\2"+
		"\u0192K\3\2\2\2\32W\\cj\u0082\u009e\u00a5\u00af\u00b1\u00b9\u00c2\u00d2"+
		"\u00d7\u00e0\u00ed\u00ff\u0116\u011b\u012e\u0145\u0153\u0179\u017e\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}