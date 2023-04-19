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
		COLON=7, QUESTION=8, DASH=9, PLUS=10, UNDERLINE=11, CIRUMFLEX=12, DOT=13, 
		LETTER=14, SPACE=15, NEWLINE=16, PUNCT=17;
	public static final int
		RULE_root = 0, RULE_inscription = 1, RULE_row = 2, RULE_line = 3, RULE_term = 4, 
		RULE_figural = 5, RULE_misspell = 6, RULE_abbrev = 7, RULE_desc = 8, RULE_string = 9, 
		RULE_word = 10, RULE_chunk = 11, RULE_normal_chunk = 12, RULE_under_chunk = 13, 
		RULE_under_helper = 14, RULE_dot_chunk = 15, RULE_dot_helper = 16, RULE_erased = 17, 
		RULE_lost_chunk = 18, RULE_gap_unknown = 19, RULE_illegible = 20, RULE_lost_lines_unknown = 21, 
		RULE_lost_line = 22, RULE_lost_lines = 23, RULE_surplus = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "inscription", "row", "line", "term", "figural", "misspell", 
			"abbrev", "desc", "string", "word", "chunk", "normal_chunk", "under_chunk", 
			"under_helper", "dot_chunk", "dot_helper", "erased", "lost_chunk", "gap_unknown", 
			"illegible", "lost_lines_unknown", "lost_line", "lost_lines", "surplus"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "'?'", "'-'", 
			"'+'", "'&#818;'", "'\u0302'", "'&#803;'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "L_PAREN", "R_PAREN", "L_BRACKET", "R_BRACKET", "L_CURLY", "R_CURLY", 
			"COLON", "QUESTION", "DASH", "PLUS", "UNDERLINE", "CIRUMFLEX", "DOT", 
			"LETTER", "SPACE", "NEWLINE", "PUNCT"
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
			setState(50);
			inscription();
			setState(51);
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
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new Inscription1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				row();
				setState(54);
				match(NEWLINE);
				setState(55);
				inscription();
				}
				break;
			case 2:
				_localctx = new Inscription2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				lost_lines_unknown();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				term();
				setState(67);
				match(SPACE);
				setState(68);
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
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				misspell();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				figural();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				abbrev();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				string();
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
			setState(78);
			match(L_PAREN);
			setState(79);
			match(L_PAREN);
			setState(80);
			match(COLON);
			setState(81);
			desc(0);
			setState(82);
			match(R_PAREN);
			setState(83);
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				word(0);
				setState(86);
				match(SPACE);
				setState(87);
				match(L_PAREN);
				setState(88);
				match(COLON);
				setState(89);
				string();
				setState(90);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				word(0);
				setState(93);
				match(SPACE);
				setState(94);
				match(L_PAREN);
				setState(95);
				match(COLON);
				setState(96);
				string();
				setState(97);
				match(QUESTION);
				setState(98);
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Normal_abbrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				word(0);
				setState(103);
				match(L_PAREN);
				setState(104);
				string();
				setState(105);
				match(R_PAREN);
				}
				break;
			case 2:
				_localctx = new Uncertain_abbrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				word(0);
				setState(108);
				match(L_PAREN);
				setState(109);
				string();
				setState(110);
				match(QUESTION);
				setState(111);
				match(R_PAREN);
				}
				break;
			case 3:
				_localctx = new Unknown_abbr1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				word(0);
				setState(114);
				match(L_PAREN);
				setState(115);
				match(DASH);
				setState(116);
				match(DASH);
				setState(117);
				match(DASH);
				setState(118);
				match(R_PAREN);
				}
				break;
			case 4:
				_localctx = new Unknown_abbr2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				word(0);
				setState(121);
				match(L_PAREN);
				setState(122);
				match(DASH);
				setState(123);
				match(DASH);
				setState(124);
				match(DASH);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(131);
				word(0);
				setState(132);
				match(PUNCT);
				}
				break;
			case 2:
				{
				setState(134);
				word(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(137);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(138);
						match(SPACE);
						setState(139);
						word(0);
						setState(140);
						match(PUNCT);
						}
						break;
					case 2:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(142);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(143);
						match(SPACE);
						setState(144);
						word(0);
						}
						break;
					}
					} 
				}
				setState(149);
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
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				word(0);
				setState(151);
				match(SPACE);
				setState(152);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
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
			setState(158);
			chunk();
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
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
					setState(160);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(161);
					chunk();
					}
					} 
				}
				setState(166);
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
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_chunk);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				under_chunk();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				dot_chunk();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				erased();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				lost_chunk();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				gap_unknown();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				illegible();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				surplus();
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
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(LETTER);
				setState(178);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
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
			setState(182);
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(LETTER);
				setState(185);
				match(UNDERLINE);
				setState(186);
				under_helper();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(LETTER);
				setState(188);
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
			setState(191);
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
			setState(194);
			match(LETTER);
			setState(195);
			match(DOT);
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
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
					setState(197);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(198);
					match(LETTER);
					setState(199);
					match(DOT);
					}
					} 
				}
				setState(204);
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
			setState(205);
			match(L_BRACKET);
			setState(206);
			match(L_BRACKET);
			setState(207);
			line();
			setState(208);
			match(R_BRACKET);
			setState(209);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(L_BRACKET);
				setState(212);
				line();
				setState(213);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(L_BRACKET);
				setState(216);
				line();
				setState(217);
				match(QUESTION);
				setState(218);
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
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(L_BRACKET);
				setState(223);
				match(DASH);
				setState(224);
				match(DASH);
				setState(225);
				match(DASH);
				setState(226);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(L_BRACKET);
				setState(228);
				match(SPACE);
				setState(229);
				match(DASH);
				setState(230);
				match(SPACE);
				setState(231);
				match(DASH);
				setState(232);
				match(SPACE);
				setState(233);
				match(DASH);
				setState(234);
				match(SPACE);
				setState(235);
				match(R_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(L_BRACKET);
				setState(237);
				match(DASH);
				setState(238);
				match(SPACE);
				setState(239);
				match(DASH);
				setState(240);
				match(SPACE);
				setState(241);
				match(DASH);
				setState(242);
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
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(PLUS);
				setState(246);
				illegible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(DASH);
				setState(251);
				match(DASH);
				setState(252);
				match(DASH);
				setState(253);
				match(DASH);
				setState(254);
				match(DASH);
				setState(255);
				match(DASH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(DASH);
				setState(257);
				match(SPACE);
				setState(258);
				match(DASH);
				setState(259);
				match(SPACE);
				setState(260);
				match(DASH);
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
		enterRule(_localctx, 44, RULE_lost_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(L_BRACKET);
			setState(270);
			match(DASH);
			setState(271);
			match(DASH);
			setState(272);
			match(DASH);
			setState(273);
			match(DASH);
			setState(274);
			match(DASH);
			setState(275);
			match(DASH);
			setState(276);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_lost_lines, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(279);
			lost_line();
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
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
					setState(281);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(282);
					match(NEWLINE);
					setState(283);
					lost_line();
					}
					} 
				}
				setState(288);
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
		enterRule(_localctx, 48, RULE_surplus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(L_CURLY);
			setState(290);
			word(0);
			setState(291);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return desc_sempred((DescContext)_localctx, predIndex);
		case 10:
			return word_sempred((WordContext)_localctx, predIndex);
		case 16:
			return dot_helper_sempred((Dot_helperContext)_localctx, predIndex);
		case 23:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u0128\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\5\4B\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\5\5I\n\5\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bg\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0083\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u008a\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0094\n"+
		"\n\f\n\16\n\u0097\13\n\3\13\3\13\3\13\3\13\3\13\5\13\u009e\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00a5\n\f\f\f\16\f\u00a8\13\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00b2\n\r\3\16\3\16\3\16\5\16\u00b7\n\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00c0\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00cb\n\22\f\22\16\22\u00ce\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00df\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f6\n\25\3\26\3\26\3\26\5\26"+
		"\u00fb\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u010e\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u011f\n\31\f\31\16"+
		"\31\u0122\13\31\3\32\3\32\3\32\3\32\3\32\2\6\22\26\"\60\33\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\2\2\u012e\2\64\3\2\2\2\4"+
		"<\3\2\2\2\6A\3\2\2\2\bH\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16f\3\2\2\2\20\u0082"+
		"\3\2\2\2\22\u0089\3\2\2\2\24\u009d\3\2\2\2\26\u009f\3\2\2\2\30\u00b1\3"+
		"\2\2\2\32\u00b6\3\2\2\2\34\u00b8\3\2\2\2\36\u00bf\3\2\2\2 \u00c1\3\2\2"+
		"\2\"\u00c3\3\2\2\2$\u00cf\3\2\2\2&\u00de\3\2\2\2(\u00f5\3\2\2\2*\u00fa"+
		"\3\2\2\2,\u010d\3\2\2\2.\u010f\3\2\2\2\60\u0118\3\2\2\2\62\u0123\3\2\2"+
		"\2\64\65\5\4\3\2\65\66\7\2\2\3\66\3\3\2\2\2\678\5\6\4\289\7\22\2\29:\5"+
		"\4\3\2:=\3\2\2\2;=\5\6\4\2<\67\3\2\2\2<;\3\2\2\2=\5\3\2\2\2>B\5\b\5\2"+
		"?B\5,\27\2@B\5\60\31\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\7\3\2\2\2CI\5\n"+
		"\6\2DE\5\n\6\2EF\7\21\2\2FG\5\b\5\2GI\3\2\2\2HC\3\2\2\2HD\3\2\2\2I\t\3"+
		"\2\2\2JO\5\16\b\2KO\5\f\7\2LO\5\20\t\2MO\5\24\13\2NJ\3\2\2\2NK\3\2\2\2"+
		"NL\3\2\2\2NM\3\2\2\2O\13\3\2\2\2PQ\7\3\2\2QR\7\3\2\2RS\7\t\2\2ST\5\22"+
		"\n\2TU\7\4\2\2UV\7\4\2\2V\r\3\2\2\2WX\5\26\f\2XY\7\21\2\2YZ\7\3\2\2Z["+
		"\7\t\2\2[\\\5\24\13\2\\]\7\4\2\2]g\3\2\2\2^_\5\26\f\2_`\7\21\2\2`a\7\3"+
		"\2\2ab\7\t\2\2bc\5\24\13\2cd\7\n\2\2de\7\4\2\2eg\3\2\2\2fW\3\2\2\2f^\3"+
		"\2\2\2g\17\3\2\2\2hi\5\26\f\2ij\7\3\2\2jk\5\24\13\2kl\7\4\2\2l\u0083\3"+
		"\2\2\2mn\5\26\f\2no\7\3\2\2op\5\24\13\2pq\7\n\2\2qr\7\4\2\2r\u0083\3\2"+
		"\2\2st\5\26\f\2tu\7\3\2\2uv\7\13\2\2vw\7\13\2\2wx\7\13\2\2xy\7\4\2\2y"+
		"\u0083\3\2\2\2z{\5\26\f\2{|\7\3\2\2|}\7\13\2\2}~\7\13\2\2~\177\7\13\2"+
		"\2\177\u0080\7\n\2\2\u0080\u0081\7\4\2\2\u0081\u0083\3\2\2\2\u0082h\3"+
		"\2\2\2\u0082m\3\2\2\2\u0082s\3\2\2\2\u0082z\3\2\2\2\u0083\21\3\2\2\2\u0084"+
		"\u0085\b\n\1\2\u0085\u0086\5\26\f\2\u0086\u0087\7\23\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u008a\5\26\f\2\u0089\u0084\3\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u0095\3\2\2\2\u008b\u008c\f\6\2\2\u008c\u008d\7\21\2\2\u008d\u008e\5"+
		"\26\f\2\u008e\u008f\7\23\2\2\u008f\u0094\3\2\2\2\u0090\u0091\f\5\2\2\u0091"+
		"\u0092\7\21\2\2\u0092\u0094\5\26\f\2\u0093\u008b\3\2\2\2\u0093\u0090\3"+
		"\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\23\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\5\26\f\2\u0099\u009a\7\21"+
		"\2\2\u009a\u009b\5\24\13\2\u009b\u009e\3\2\2\2\u009c\u009e\5\26\f\2\u009d"+
		"\u0098\3\2\2\2\u009d\u009c\3\2\2\2\u009e\25\3\2\2\2\u009f\u00a0\b\f\1"+
		"\2\u00a0\u00a1\5\30\r\2\u00a1\u00a6\3\2\2\2\u00a2\u00a3\f\4\2\2\u00a3"+
		"\u00a5\5\30\r\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\27\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00b2\5\32\16\2\u00aa\u00b2\5\34\17\2\u00ab\u00b2\5 \21\2\u00ac\u00b2"+
		"\5$\23\2\u00ad\u00b2\5&\24\2\u00ae\u00b2\5(\25\2\u00af\u00b2\5*\26\2\u00b0"+
		"\u00b2\5\62\32\2\u00b1\u00a9\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b1\u00ab\3"+
		"\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b4\7\20\2"+
		"\2\u00b4\u00b7\5\32\16\2\u00b5\u00b7\7\20\2\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\33\3\2\2\2\u00b8\u00b9\5\36\20\2\u00b9\35\3\2\2\2"+
		"\u00ba\u00bb\7\20\2\2\u00bb\u00bc\7\r\2\2\u00bc\u00c0\5\36\20\2\u00bd"+
		"\u00be\7\20\2\2\u00be\u00c0\7\r\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bd\3"+
		"\2\2\2\u00c0\37\3\2\2\2\u00c1\u00c2\5\"\22\2\u00c2!\3\2\2\2\u00c3\u00c4"+
		"\b\22\1\2\u00c4\u00c5\7\20\2\2\u00c5\u00c6\7\17\2\2\u00c6\u00cc\3\2\2"+
		"\2\u00c7\u00c8\f\4\2\2\u00c8\u00c9\7\20\2\2\u00c9\u00cb\7\17\2\2\u00ca"+
		"\u00c7\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd#\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\5\2\2\u00d0\u00d1"+
		"\7\5\2\2\u00d1\u00d2\5\b\5\2\u00d2\u00d3\7\6\2\2\u00d3\u00d4\7\6\2\2\u00d4"+
		"%\3\2\2\2\u00d5\u00d6\7\5\2\2\u00d6\u00d7\5\b\5\2\u00d7\u00d8\7\6\2\2"+
		"\u00d8\u00df\3\2\2\2\u00d9\u00da\7\5\2\2\u00da\u00db\5\b\5\2\u00db\u00dc"+
		"\7\n\2\2\u00dc\u00dd\7\6\2\2\u00dd\u00df\3\2\2\2\u00de\u00d5\3\2\2\2\u00de"+
		"\u00d9\3\2\2\2\u00df\'\3\2\2\2\u00e0\u00e1\7\5\2\2\u00e1\u00e2\7\13\2"+
		"\2\u00e2\u00e3\7\13\2\2\u00e3\u00e4\7\13\2\2\u00e4\u00f6\7\6\2\2\u00e5"+
		"\u00e6\7\5\2\2\u00e6\u00e7\7\21\2\2\u00e7\u00e8\7\13\2\2\u00e8\u00e9\7"+
		"\21\2\2\u00e9\u00ea\7\13\2\2\u00ea\u00eb\7\21\2\2\u00eb\u00ec\7\13\2\2"+
		"\u00ec\u00ed\7\21\2\2\u00ed\u00f6\7\6\2\2\u00ee\u00ef\7\5\2\2\u00ef\u00f0"+
		"\7\13\2\2\u00f0\u00f1\7\21\2\2\u00f1\u00f2\7\13\2\2\u00f2\u00f3\7\21\2"+
		"\2\u00f3\u00f4\7\13\2\2\u00f4\u00f6\7\6\2\2\u00f5\u00e0\3\2\2\2\u00f5"+
		"\u00e5\3\2\2\2\u00f5\u00ee\3\2\2\2\u00f6)\3\2\2\2\u00f7\u00f8\7\f\2\2"+
		"\u00f8\u00fb\5*\26\2\u00f9\u00fb\7\f\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb+\3\2\2\2\u00fc\u00fd\7\13\2\2\u00fd\u00fe\7\13\2\2\u00fe"+
		"\u00ff\7\13\2\2\u00ff\u0100\7\13\2\2\u0100\u0101\7\13\2\2\u0101\u010e"+
		"\7\13\2\2\u0102\u0103\7\13\2\2\u0103\u0104\7\21\2\2\u0104\u0105\7\13\2"+
		"\2\u0105\u0106\7\21\2\2\u0106\u0107\7\13\2\2\u0107\u0108\7\21\2\2\u0108"+
		"\u0109\7\13\2\2\u0109\u010a\7\21\2\2\u010a\u010b\7\13\2\2\u010b\u010c"+
		"\7\21\2\2\u010c\u010e\7\13\2\2\u010d\u00fc\3\2\2\2\u010d\u0102\3\2\2\2"+
		"\u010e-\3\2\2\2\u010f\u0110\7\5\2\2\u0110\u0111\7\13\2\2\u0111\u0112\7"+
		"\13\2\2\u0112\u0113\7\13\2\2\u0113\u0114\7\13\2\2\u0114\u0115\7\13\2\2"+
		"\u0115\u0116\7\13\2\2\u0116\u0117\7\6\2\2\u0117/\3\2\2\2\u0118\u0119\b"+
		"\31\1\2\u0119\u011a\5.\30\2\u011a\u0120\3\2\2\2\u011b\u011c\f\4\2\2\u011c"+
		"\u011d\7\22\2\2\u011d\u011f\5.\30\2\u011e\u011b\3\2\2\2\u011f\u0122\3"+
		"\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\61\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0124\7\7\2\2\u0124\u0125\5\26\f\2\u0125\u0126\7"+
		"\b\2\2\u0126\63\3\2\2\2\26<AHNf\u0082\u0089\u0093\u0095\u009d\u00a6\u00b1"+
		"\u00b6\u00bf\u00cc\u00de\u00f5\u00fa\u010d\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}