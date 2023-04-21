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
			setState(82);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				lost_lines_unknown();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				term();
				setState(91);
				match(SPACE);
				setState(92);
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
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				misspell();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				figural();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				abbrev();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				string();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
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
			setState(103);
			match(L_PAREN);
			setState(104);
			match(L_PAREN);
			setState(105);
			match(COLON);
			setState(106);
			desc(0);
			setState(107);
			match(R_PAREN);
			setState(108);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				word(0);
				setState(111);
				match(SPACE);
				setState(112);
				match(L_PAREN);
				setState(113);
				match(COLON);
				setState(114);
				string();
				setState(115);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				word(0);
				setState(118);
				match(SPACE);
				setState(119);
				match(L_PAREN);
				setState(120);
				match(COLON);
				setState(121);
				string();
				setState(122);
				match(QUESTION);
				setState(123);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Normal_abbrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				word(0);
				setState(128);
				match(L_PAREN);
				setState(129);
				string();
				setState(130);
				match(R_PAREN);
				}
				break;
			case 2:
				_localctx = new Uncertain_abbrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				word(0);
				setState(133);
				match(L_PAREN);
				setState(134);
				string();
				setState(135);
				match(QUESTION);
				setState(136);
				match(R_PAREN);
				}
				break;
			case 3:
				_localctx = new Unknown_abbr1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				word(0);
				setState(139);
				match(L_PAREN);
				setState(140);
				match(DASH);
				setState(141);
				match(DASH);
				setState(142);
				match(DASH);
				setState(143);
				match(R_PAREN);
				}
				break;
			case 4:
				_localctx = new Unknown_abbr2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				word(0);
				setState(146);
				match(L_PAREN);
				setState(147);
				match(DASH);
				setState(148);
				match(DASH);
				setState(149);
				match(DASH);
				setState(150);
				match(QUESTION);
				setState(151);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(156);
				word(0);
				setState(157);
				match(PUNCT);
				}
				break;
			case 2:
				{
				setState(159);
				word(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(162);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(163);
						match(SPACE);
						setState(164);
						word(0);
						setState(165);
						match(PUNCT);
						}
						break;
					case 2:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(167);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(168);
						match(SPACE);
						setState(169);
						word(0);
						}
						break;
					}
					} 
				}
				setState(174);
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
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				word(0);
				setState(176);
				match(SPACE);
				setState(177);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
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
			setState(183);
			chunk();
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
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
					setState(185);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(186);
					chunk();
					}
					} 
				}
				setState(191);
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
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				under_chunk();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				dot_chunk();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				erased();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				lost_chunk();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				gap_unknown();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				illegible();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
				surplus();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(200);
				joined();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(201);
				symbol();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(202);
				lost_chars();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(203);
				lost_chars_known();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(204);
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
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(LETTER);
				setState(208);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
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
			setState(212);
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
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(LETTER);
				setState(215);
				match(UNDERLINE);
				setState(216);
				under_helper();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(LETTER);
				setState(218);
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
			setState(221);
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
			setState(224);
			match(LETTER);
			setState(225);
			match(DOT);
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
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
					setState(227);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(228);
					match(LETTER);
					setState(229);
					match(DOT);
					}
					} 
				}
				setState(234);
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
			setState(235);
			match(L_BRACKET);
			setState(236);
			match(L_BRACKET);
			setState(237);
			line();
			setState(238);
			match(R_BRACKET);
			setState(239);
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
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(L_BRACKET);
				setState(242);
				line();
				setState(243);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(L_BRACKET);
				setState(246);
				line();
				setState(247);
				match(QUESTION);
				setState(248);
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(L_BRACKET);
				setState(253);
				match(DASH);
				setState(254);
				match(DASH);
				setState(255);
				match(DASH);
				setState(256);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(L_BRACKET);
				setState(258);
				match(SPACE);
				setState(259);
				match(DASH);
				setState(260);
				match(SPACE);
				setState(261);
				match(DASH);
				setState(262);
				match(SPACE);
				setState(263);
				match(DASH);
				setState(264);
				match(SPACE);
				setState(265);
				match(R_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(L_BRACKET);
				setState(267);
				match(DASH);
				setState(268);
				match(SPACE);
				setState(269);
				match(DASH);
				setState(270);
				match(SPACE);
				setState(271);
				match(DASH);
				setState(272);
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
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(PLUS);
				setState(276);
				illegible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
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
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(DASH);
				setState(281);
				match(DASH);
				setState(282);
				match(DASH);
				setState(283);
				match(DASH);
				setState(284);
				match(DASH);
				setState(285);
				match(DASH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(DASH);
				setState(287);
				match(SPACE);
				setState(288);
				match(DASH);
				setState(289);
				match(SPACE);
				setState(290);
				match(DASH);
				setState(291);
				match(SPACE);
				setState(292);
				match(DASH);
				setState(293);
				match(SPACE);
				setState(294);
				match(DASH);
				setState(295);
				match(SPACE);
				setState(296);
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
			setState(299);
			match(L_BRACKET);
			setState(300);
			dashes();
			setState(301);
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
			setState(303);
			match(L_BRACKET);
			setState(304);
			match(DASH);
			setState(305);
			match(DASH);
			setState(306);
			match(DASH);
			setState(307);
			match(DASH);
			setState(308);
			match(DASH);
			setState(309);
			match(DASH);
			setState(310);
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
			setState(313);
			lost_line();
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
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
					setState(315);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(316);
					match(NEWLINE);
					setState(317);
					lost_line();
					}
					} 
				}
				setState(322);
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
			setState(323);
			match(L_CURLY);
			setState(324);
			word(0);
			setState(325);
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
			setState(327);
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
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				joined_letters();
				setState(330);
				match(CIRCUMFLEX);
				setState(331);
				match(LETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
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
			setState(336);
			match(LETTER);
			setState(337);
			match(CIRCUMFLEX);
			setState(338);
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
			setState(340);
			match(L_PAREN);
			setState(341);
			match(L_PAREN);
			setState(342);
			word(0);
			setState(343);
			match(R_PAREN);
			setState(344);
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
			setState(346);
			match(L_BRACKET);
			setState(347);
			match(PLUS);
			setState(348);
			match(NUM);
			setState(349);
			match(QUESTION);
			setState(350);
			match(PLUS);
			setState(351);
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
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(DASH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(DASH);
				setState(355);
				match(DASH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				match(DASH);
				setState(357);
				match(DASH);
				setState(358);
				match(DASH);
				setState(359);
				match(DASH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				match(DASH);
				setState(361);
				match(DASH);
				setState(362);
				match(DASH);
				setState(363);
				match(DASH);
				setState(364);
				match(DASH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(365);
				match(DASH);
				setState(366);
				match(DASH);
				setState(367);
				match(DASH);
				setState(368);
				match(DASH);
				setState(369);
				match(DASH);
				setState(370);
				match(DASH);
				setState(371);
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
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VACAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				vacat();
				}
				break;
			case IANUA:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				ianua();
				}
				break;
			case L_PAREN:
			case L_ANGLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
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
			setState(379);
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
			setState(381);
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
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(L_ANGLE);
				setState(384);
				match(COLON);
				setState(385);
				normal_chunk();
				setState(386);
				match(R_ANGLE);
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(L_PAREN);
				setState(389);
				normal_chunk();
				setState(390);
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
			setState(394);
			match(L_ANGLE);
			setState(395);
			normal_chunk();
			setState(396);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u0191\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5"+
		"\3U\n\3\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\5\6h\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u009c\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a3\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ad\n\n\f\n\16\n\u00b0\13\n\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00b7\n\13\3\f\3\f\3\f\3\f\3\f\7\f\u00be\n\f\f\f\16"+
		"\f\u00c1\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00d0\n\r\3\16\3\16\3\16\5\16\u00d5\n\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00de\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u00e9\n\22\f\22\16\22\u00ec\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00fd\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0114\n\25\3\26\3\26\3\26\5\26\u0119\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u012c\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0141\n\32"+
		"\f\32\16\32\u0144\13\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u0151\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\5!\u0177\n!\3\"\3\"\3\"\5\"\u017c\n\"\3#\3#\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\5%\u018b\n%\3&\3&\3&\3&\3&\2\6\22\26\"\62\'\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\2"+
		"\2\u0199\2L\3\2\2\2\4T\3\2\2\2\6Y\3\2\2\2\b`\3\2\2\2\ng\3\2\2\2\fi\3\2"+
		"\2\2\16\177\3\2\2\2\20\u009b\3\2\2\2\22\u00a2\3\2\2\2\24\u00b6\3\2\2\2"+
		"\26\u00b8\3\2\2\2\30\u00cf\3\2\2\2\32\u00d4\3\2\2\2\34\u00d6\3\2\2\2\36"+
		"\u00dd\3\2\2\2 \u00df\3\2\2\2\"\u00e1\3\2\2\2$\u00ed\3\2\2\2&\u00fc\3"+
		"\2\2\2(\u0113\3\2\2\2*\u0118\3\2\2\2,\u012b\3\2\2\2.\u012d\3\2\2\2\60"+
		"\u0131\3\2\2\2\62\u013a\3\2\2\2\64\u0145\3\2\2\2\66\u0149\3\2\2\28\u0150"+
		"\3\2\2\2:\u0152\3\2\2\2<\u0156\3\2\2\2>\u015c\3\2\2\2@\u0176\3\2\2\2B"+
		"\u017b\3\2\2\2D\u017d\3\2\2\2F\u017f\3\2\2\2H\u018a\3\2\2\2J\u018c\3\2"+
		"\2\2LM\5\4\3\2MN\7\2\2\3N\3\3\2\2\2OP\5\6\4\2PQ\7\22\2\2QR\5\4\3\2RU\3"+
		"\2\2\2SU\5\6\4\2TO\3\2\2\2TS\3\2\2\2U\5\3\2\2\2VZ\5\b\5\2WZ\5,\27\2XZ"+
		"\5\62\32\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\7\3\2\2\2[a\5\n\6\2\\]\5\n\6"+
		"\2]^\7\21\2\2^_\5\b\5\2_a\3\2\2\2`[\3\2\2\2`\\\3\2\2\2a\t\3\2\2\2bh\5"+
		"\16\b\2ch\5\f\7\2dh\5\20\t\2eh\5\24\13\2fh\5B\"\2gb\3\2\2\2gc\3\2\2\2"+
		"gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\13\3\2\2\2ij\7\3\2\2jk\7\3\2\2kl\7\t\2"+
		"\2lm\5\22\n\2mn\7\4\2\2no\7\4\2\2o\r\3\2\2\2pq\5\26\f\2qr\7\21\2\2rs\7"+
		"\3\2\2st\7\t\2\2tu\5\24\13\2uv\7\4\2\2v\u0080\3\2\2\2wx\5\26\f\2xy\7\21"+
		"\2\2yz\7\3\2\2z{\7\t\2\2{|\5\24\13\2|}\7\n\2\2}~\7\4\2\2~\u0080\3\2\2"+
		"\2\177p\3\2\2\2\177w\3\2\2\2\u0080\17\3\2\2\2\u0081\u0082\5\26\f\2\u0082"+
		"\u0083\7\3\2\2\u0083\u0084\5\24\13\2\u0084\u0085\7\4\2\2\u0085\u009c\3"+
		"\2\2\2\u0086\u0087\5\26\f\2\u0087\u0088\7\3\2\2\u0088\u0089\5\24\13\2"+
		"\u0089\u008a\7\n\2\2\u008a\u008b\7\4\2\2\u008b\u009c\3\2\2\2\u008c\u008d"+
		"\5\26\f\2\u008d\u008e\7\3\2\2\u008e\u008f\7\13\2\2\u008f\u0090\7\13\2"+
		"\2\u0090\u0091\7\13\2\2\u0091\u0092\7\4\2\2\u0092\u009c\3\2\2\2\u0093"+
		"\u0094\5\26\f\2\u0094\u0095\7\3\2\2\u0095\u0096\7\13\2\2\u0096\u0097\7"+
		"\13\2\2\u0097\u0098\7\13\2\2\u0098\u0099\7\n\2\2\u0099\u009a\7\4\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0081\3\2\2\2\u009b\u0086\3\2\2\2\u009b\u008c\3\2"+
		"\2\2\u009b\u0093\3\2\2\2\u009c\21\3\2\2\2\u009d\u009e\b\n\1\2\u009e\u009f"+
		"\5\26\f\2\u009f\u00a0\7\23\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a3\5\26\f"+
		"\2\u00a2\u009d\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00ae\3\2\2\2\u00a4\u00a5"+
		"\f\6\2\2\u00a5\u00a6\7\21\2\2\u00a6\u00a7\5\26\f\2\u00a7\u00a8\7\23\2"+
		"\2\u00a8\u00ad\3\2\2\2\u00a9\u00aa\f\5\2\2\u00aa\u00ab\7\21\2\2\u00ab"+
		"\u00ad\5\26\f\2\u00ac\u00a4\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00b0\3"+
		"\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\23\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b2\5\26\f\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\5"+
		"\24\13\2\u00b4\u00b7\3\2\2\2\u00b5\u00b7\5\26\f\2\u00b6\u00b1\3\2\2\2"+
		"\u00b6\u00b5\3\2\2\2\u00b7\25\3\2\2\2\u00b8\u00b9\b\f\1\2\u00b9\u00ba"+
		"\5\30\r\2\u00ba\u00bf\3\2\2\2\u00bb\u00bc\f\4\2\2\u00bc\u00be\5\30\r\2"+
		"\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\27\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00d0\5\32\16\2\u00c3"+
		"\u00d0\5\34\17\2\u00c4\u00d0\5 \21\2\u00c5\u00d0\5$\23\2\u00c6\u00d0\5"+
		"&\24\2\u00c7\u00d0\5(\25\2\u00c8\u00d0\5*\26\2\u00c9\u00d0\5\64\33\2\u00ca"+
		"\u00d0\5\66\34\2\u00cb\u00d0\5<\37\2\u00cc\u00d0\5> \2\u00cd\u00d0\5."+
		"\30\2\u00ce\u00d0\5J&\2\u00cf\u00c2\3\2\2\2\u00cf\u00c3\3\2\2\2\u00cf"+
		"\u00c4\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00c7\3\2"+
		"\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf"+
		"\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\31\3\2\2\2\u00d1\u00d2\7\20\2\2\u00d2\u00d5\5\32\16\2\u00d3"+
		"\u00d5\7\20\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\33\3\2\2"+
		"\2\u00d6\u00d7\5\36\20\2\u00d7\35\3\2\2\2\u00d8\u00d9\7\20\2\2\u00d9\u00da"+
		"\7\r\2\2\u00da\u00de\5\36\20\2\u00db\u00dc\7\20\2\2\u00dc\u00de\7\r\2"+
		"\2\u00dd\u00d8\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\37\3\2\2\2\u00df\u00e0"+
		"\5\"\22\2\u00e0!\3\2\2\2\u00e1\u00e2\b\22\1\2\u00e2\u00e3\7\20\2\2\u00e3"+
		"\u00e4\7\17\2\2\u00e4\u00ea\3\2\2\2\u00e5\u00e6\f\4\2\2\u00e6\u00e7\7"+
		"\20\2\2\u00e7\u00e9\7\17\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb#\3\2\2\2\u00ec\u00ea\3\2\2\2"+
		"\u00ed\u00ee\7\5\2\2\u00ee\u00ef\7\5\2\2\u00ef\u00f0\5\b\5\2\u00f0\u00f1"+
		"\7\6\2\2\u00f1\u00f2\7\6\2\2\u00f2%\3\2\2\2\u00f3\u00f4\7\5\2\2\u00f4"+
		"\u00f5\5\b\5\2\u00f5\u00f6\7\6\2\2\u00f6\u00fd\3\2\2\2\u00f7\u00f8\7\5"+
		"\2\2\u00f8\u00f9\5\b\5\2\u00f9\u00fa\7\n\2\2\u00fa\u00fb\7\6\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fd\'\3\2\2\2"+
		"\u00fe\u00ff\7\5\2\2\u00ff\u0100\7\13\2\2\u0100\u0101\7\13\2\2\u0101\u0102"+
		"\7\13\2\2\u0102\u0114\7\6\2\2\u0103\u0104\7\5\2\2\u0104\u0105\7\21\2\2"+
		"\u0105\u0106\7\13\2\2\u0106\u0107\7\21\2\2\u0107\u0108\7\13\2\2\u0108"+
		"\u0109\7\21\2\2\u0109\u010a\7\13\2\2\u010a\u010b\7\21\2\2\u010b\u0114"+
		"\7\6\2\2\u010c\u010d\7\5\2\2\u010d\u010e\7\13\2\2\u010e\u010f\7\21\2\2"+
		"\u010f\u0110\7\13\2\2\u0110\u0111\7\21\2\2\u0111\u0112\7\13\2\2\u0112"+
		"\u0114\7\6\2\2\u0113\u00fe\3\2\2\2\u0113\u0103\3\2\2\2\u0113\u010c\3\2"+
		"\2\2\u0114)\3\2\2\2\u0115\u0116\7\f\2\2\u0116\u0119\5*\26\2\u0117\u0119"+
		"\7\f\2\2\u0118\u0115\3\2\2\2\u0118\u0117\3\2\2\2\u0119+\3\2\2\2\u011a"+
		"\u011b\7\13\2\2\u011b\u011c\7\13\2\2\u011c\u011d\7\13\2\2\u011d\u011e"+
		"\7\13\2\2\u011e\u011f\7\13\2\2\u011f\u012c\7\13\2\2\u0120\u0121\7\13\2"+
		"\2\u0121\u0122\7\21\2\2\u0122\u0123\7\13\2\2\u0123\u0124\7\21\2\2\u0124"+
		"\u0125\7\13\2\2\u0125\u0126\7\21\2\2\u0126\u0127\7\13\2\2\u0127\u0128"+
		"\7\21\2\2\u0128\u0129\7\13\2\2\u0129\u012a\7\21\2\2\u012a\u012c\7\13\2"+
		"\2\u012b\u011a\3\2\2\2\u012b\u0120\3\2\2\2\u012c-\3\2\2\2\u012d\u012e"+
		"\7\5\2\2\u012e\u012f\5@!\2\u012f\u0130\7\6\2\2\u0130/\3\2\2\2\u0131\u0132"+
		"\7\5\2\2\u0132\u0133\7\13\2\2\u0133\u0134\7\13\2\2\u0134\u0135\7\13\2"+
		"\2\u0135\u0136\7\13\2\2\u0136\u0137\7\13\2\2\u0137\u0138\7\13\2\2\u0138"+
		"\u0139\7\6\2\2\u0139\61\3\2\2\2\u013a\u013b\b\32\1\2\u013b\u013c\5\60"+
		"\31\2\u013c\u0142\3\2\2\2\u013d\u013e\f\4\2\2\u013e\u013f\7\22\2\2\u013f"+
		"\u0141\5\60\31\2\u0140\u013d\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\63\3\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"\u0146\7\7\2\2\u0146\u0147\5\26\f\2\u0147\u0148\7\b\2\2\u0148\65\3\2\2"+
		"\2\u0149\u014a\58\35\2\u014a\67\3\2\2\2\u014b\u014c\5:\36\2\u014c\u014d"+
		"\7\16\2\2\u014d\u014e\7\20\2\2\u014e\u0151\3\2\2\2\u014f\u0151\5:\36\2"+
		"\u0150\u014b\3\2\2\2\u0150\u014f\3\2\2\2\u01519\3\2\2\2\u0152\u0153\7"+
		"\20\2\2\u0153\u0154\7\16\2\2\u0154\u0155\7\20\2\2\u0155;\3\2\2\2\u0156"+
		"\u0157\7\3\2\2\u0157\u0158\7\3\2\2\u0158\u0159\5\26\f\2\u0159\u015a\7"+
		"\4\2\2\u015a\u015b\7\4\2\2\u015b=\3\2\2\2\u015c\u015d\7\5\2\2\u015d\u015e"+
		"\7\f\2\2\u015e\u015f\7\24\2\2\u015f\u0160\7\n\2\2\u0160\u0161\7\f\2\2"+
		"\u0161\u0162\7\6\2\2\u0162?\3\2\2\2\u0163\u0177\7\13\2\2\u0164\u0165\7"+
		"\13\2\2\u0165\u0177\7\13\2\2\u0166\u0167\7\13\2\2\u0167\u0168\7\13\2\2"+
		"\u0168\u0169\7\13\2\2\u0169\u0177\7\13\2\2\u016a\u016b\7\13\2\2\u016b"+
		"\u016c\7\13\2\2\u016c\u016d\7\13\2\2\u016d\u016e\7\13\2\2\u016e\u0177"+
		"\7\13\2\2\u016f\u0170\7\13\2\2\u0170\u0171\7\13\2\2\u0171\u0172\7\13\2"+
		"\2\u0172\u0173\7\13\2\2\u0173\u0174\7\13\2\2\u0174\u0175\7\13\2\2\u0175"+
		"\u0177\5@!\2\u0176\u0163\3\2\2\2\u0176\u0164\3\2\2\2\u0176\u0166\3\2\2"+
		"\2\u0176\u016a\3\2\2\2\u0176\u016f\3\2\2\2\u0177A\3\2\2\2\u0178\u017c"+
		"\5D#\2\u0179\u017c\5F$\2\u017a\u017c\5H%\2\u017b\u0178\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017a\3\2\2\2\u017cC\3\2\2\2\u017d\u017e\7\27\2\2\u017e"+
		"E\3\2\2\2\u017f\u0180\7\30\2\2\u0180G\3\2\2\2\u0181\u0182\7\25\2\2\u0182"+
		"\u0183\7\t\2\2\u0183\u0184\5\32\16\2\u0184\u0185\7\26\2\2\u0185\u018b"+
		"\3\2\2\2\u0186\u0187\7\3\2\2\u0187\u0188\5\32\16\2\u0188\u0189\7\4\2\2"+
		"\u0189\u018b\3\2\2\2\u018a\u0181\3\2\2\2\u018a\u0186\3\2\2\2\u018bI\3"+
		"\2\2\2\u018c\u018d\7\25\2\2\u018d\u018e\5\32\16\2\u018e\u018f\7\26\2\2"+
		"\u018fK\3\2\2\2\32TY`g\177\u009b\u00a2\u00ac\u00ae\u00b6\u00bf\u00cf\u00d4"+
		"\u00dd\u00ea\u00fc\u0113\u0118\u012b\u0142\u0150\u0176\u017b\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}