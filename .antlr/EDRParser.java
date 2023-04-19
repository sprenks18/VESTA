// Generated from c:\Users\Trevor Alt\Desktop\antlr_playground\edr\EDR.g by ANTLR 4.9.2
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
		L_PAREN=1, R_PAREN=2, L_BRACKET=3, R_BRACKET=4, COLON=5, QUESTION=6, DASH=7, 
		UNDERLINE=8, CIRUMFLEX=9, DOT=10, LETTER=11, SPACE=12, NEWLINE=13, PUNCT=14;
	public static final int
		RULE_root = 0, RULE_inscription = 1, RULE_line = 2, RULE_term = 3, RULE_figural = 4, 
		RULE_misspell = 5, RULE_abbrev = 6, RULE_desc = 7, RULE_string = 8, RULE_word = 9, 
		RULE_chunk = 10, RULE_normal_chunk = 11, RULE_under_chunk = 12, RULE_under_helper = 13, 
		RULE_dot_chunk = 14, RULE_dot_helper = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "inscription", "line", "term", "figural", "misspell", "abbrev", 
			"desc", "string", "word", "chunk", "normal_chunk", "under_chunk", "under_helper", 
			"dot_chunk", "dot_helper"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "':'", "'?'", "'-'", "'&#818;'", "'\u0302'", 
			"'&#803;'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "L_PAREN", "R_PAREN", "L_BRACKET", "R_BRACKET", "COLON", "QUESTION", 
			"DASH", "UNDERLINE", "CIRUMFLEX", "DOT", "LETTER", "SPACE", "NEWLINE", 
			"PUNCT"
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
			setState(32);
			inscription();
			setState(33);
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
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(EDRParser.NEWLINE, 0); }
		public InscriptionContext inscription() {
			return getRuleContext(InscriptionContext.class,0);
		}
		public InscriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inscription; }
	}

	public final InscriptionContext inscription() throws RecognitionException {
		InscriptionContext _localctx = new InscriptionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inscription);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				line();
				setState(36);
				match(NEWLINE);
				setState(37);
				inscription();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
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
		enterRule(_localctx, 4, RULE_line);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				term();
				setState(44);
				match(SPACE);
				setState(45);
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
		enterRule(_localctx, 6, RULE_term);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				misspell();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				figural();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				abbrev();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
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
		enterRule(_localctx, 8, RULE_figural);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(L_PAREN);
			setState(56);
			match(L_PAREN);
			setState(57);
			match(COLON);
			setState(58);
			desc(0);
			setState(59);
			match(R_PAREN);
			setState(60);
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
		enterRule(_localctx, 10, RULE_misspell);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				word(0);
				setState(63);
				match(SPACE);
				setState(64);
				match(L_PAREN);
				setState(65);
				match(COLON);
				setState(66);
				string();
				setState(67);
				match(R_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				word(0);
				setState(70);
				match(SPACE);
				setState(71);
				match(L_PAREN);
				setState(72);
				match(COLON);
				setState(73);
				string();
				setState(74);
				match(QUESTION);
				setState(75);
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
		enterRule(_localctx, 12, RULE_abbrev);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Normal_abbrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				word(0);
				setState(80);
				match(L_PAREN);
				setState(81);
				string();
				setState(82);
				match(R_PAREN);
				}
				break;
			case 2:
				_localctx = new Uncertain_abbrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				word(0);
				setState(85);
				match(L_PAREN);
				setState(86);
				string();
				setState(87);
				match(QUESTION);
				setState(88);
				match(R_PAREN);
				}
				break;
			case 3:
				_localctx = new Unknown_abbr1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				word(0);
				setState(91);
				match(L_PAREN);
				setState(92);
				match(DASH);
				setState(93);
				match(DASH);
				setState(94);
				match(DASH);
				setState(95);
				match(R_PAREN);
				}
				break;
			case 4:
				_localctx = new Unknown_abbr2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				word(0);
				setState(98);
				match(L_PAREN);
				setState(99);
				match(DASH);
				setState(100);
				match(DASH);
				setState(101);
				match(DASH);
				setState(102);
				match(QUESTION);
				setState(103);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_desc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(108);
				word(0);
				setState(109);
				match(PUNCT);
				}
				break;
			case 2:
				{
				setState(111);
				word(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(114);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(115);
						match(SPACE);
						setState(116);
						word(0);
						setState(117);
						match(PUNCT);
						}
						break;
					case 2:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						match(SPACE);
						setState(121);
						word(0);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 16, RULE_string);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				word(0);
				setState(128);
				match(SPACE);
				setState(129);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_word, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(135);
			chunk();
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new WordContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_word);
					setState(137);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(138);
					chunk();
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_chunk);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				under_chunk();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				dot_chunk();
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
		enterRule(_localctx, 22, RULE_normal_chunk);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(LETTER);
				setState(150);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
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
		enterRule(_localctx, 24, RULE_under_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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
		enterRule(_localctx, 26, RULE_under_helper);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(LETTER);
				setState(157);
				match(UNDERLINE);
				setState(158);
				under_helper();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(LETTER);
				setState(160);
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
		enterRule(_localctx, 28, RULE_dot_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_dot_helper, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			match(LETTER);
			setState(167);
			match(DOT);
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dot_helperContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dot_helper);
					setState(169);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(170);
					match(LETTER);
					setState(171);
					match(DOT);
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return desc_sempred((DescContext)_localctx, predIndex);
		case 9:
			return word_sempred((WordContext)_localctx, predIndex);
		case 15:
			return dot_helper_sempred((Dot_helperContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u00b4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3"+
		"\5\3\5\3\5\5\58\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\5\ts\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\t}\n\t\f\t\16\t\u0080\13\t\3\n\3\n\3\n\3\n\3\n\5\n\u0087"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\7\13\u008e\n\13\f\13\16\13\u0091\13\13\3"+
		"\f\3\f\3\f\5\f\u0096\n\f\3\r\3\r\3\r\5\r\u009b\n\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00a4\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u00af\n\21\f\21\16\21\u00b2\13\21\3\21\2\5\20\24 \22\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u00b6\2\"\3\2\2\2\4*\3\2\2\2"+
		"\6\61\3\2\2\2\b\67\3\2\2\2\n9\3\2\2\2\fO\3\2\2\2\16k\3\2\2\2\20r\3\2\2"+
		"\2\22\u0086\3\2\2\2\24\u0088\3\2\2\2\26\u0095\3\2\2\2\30\u009a\3\2\2\2"+
		"\32\u009c\3\2\2\2\34\u00a3\3\2\2\2\36\u00a5\3\2\2\2 \u00a7\3\2\2\2\"#"+
		"\5\4\3\2#$\7\2\2\3$\3\3\2\2\2%&\5\6\4\2&\'\7\17\2\2\'(\5\4\3\2(+\3\2\2"+
		"\2)+\5\6\4\2*%\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,\62\5\b\5\2-.\5\b\5\2./\7"+
		"\16\2\2/\60\5\6\4\2\60\62\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\62\7\3\2\2\2"+
		"\638\5\f\7\2\648\5\n\6\2\658\5\16\b\2\668\5\22\n\2\67\63\3\2\2\2\67\64"+
		"\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\t\3\2\2\29:\7\3\2\2:;\7\3\2\2;<"+
		"\7\7\2\2<=\5\20\t\2=>\7\4\2\2>?\7\4\2\2?\13\3\2\2\2@A\5\24\13\2AB\7\16"+
		"\2\2BC\7\3\2\2CD\7\7\2\2DE\5\22\n\2EF\7\4\2\2FP\3\2\2\2GH\5\24\13\2HI"+
		"\7\16\2\2IJ\7\3\2\2JK\7\7\2\2KL\5\22\n\2LM\7\b\2\2MN\7\4\2\2NP\3\2\2\2"+
		"O@\3\2\2\2OG\3\2\2\2P\r\3\2\2\2QR\5\24\13\2RS\7\3\2\2ST\5\22\n\2TU\7\4"+
		"\2\2Ul\3\2\2\2VW\5\24\13\2WX\7\3\2\2XY\5\22\n\2YZ\7\b\2\2Z[\7\4\2\2[l"+
		"\3\2\2\2\\]\5\24\13\2]^\7\3\2\2^_\7\t\2\2_`\7\t\2\2`a\7\t\2\2ab\7\4\2"+
		"\2bl\3\2\2\2cd\5\24\13\2de\7\3\2\2ef\7\t\2\2fg\7\t\2\2gh\7\t\2\2hi\7\b"+
		"\2\2ij\7\4\2\2jl\3\2\2\2kQ\3\2\2\2kV\3\2\2\2k\\\3\2\2\2kc\3\2\2\2l\17"+
		"\3\2\2\2mn\b\t\1\2no\5\24\13\2op\7\20\2\2ps\3\2\2\2qs\5\24\13\2rm\3\2"+
		"\2\2rq\3\2\2\2s~\3\2\2\2tu\f\6\2\2uv\7\16\2\2vw\5\24\13\2wx\7\20\2\2x"+
		"}\3\2\2\2yz\f\5\2\2z{\7\16\2\2{}\5\24\13\2|t\3\2\2\2|y\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\21\3\2\2\2\u0080~\3\2\2\2\u0081\u0082"+
		"\5\24\13\2\u0082\u0083\7\16\2\2\u0083\u0084\5\22\n\2\u0084\u0087\3\2\2"+
		"\2\u0085\u0087\5\24\13\2\u0086\u0081\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\23\3\2\2\2\u0088\u0089\b\13\1\2\u0089\u008a\5\26\f\2\u008a\u008f\3\2"+
		"\2\2\u008b\u008c\f\4\2\2\u008c\u008e\5\26\f\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\25\3\2\2"+
		"\2\u0091\u008f\3\2\2\2\u0092\u0096\5\30\r\2\u0093\u0096\5\32\16\2\u0094"+
		"\u0096\5\36\20\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3"+
		"\2\2\2\u0096\27\3\2\2\2\u0097\u0098\7\r\2\2\u0098\u009b\5\30\r\2\u0099"+
		"\u009b\7\r\2\2\u009a\u0097\3\2\2\2\u009a\u0099\3\2\2\2\u009b\31\3\2\2"+
		"\2\u009c\u009d\5\34\17\2\u009d\33\3\2\2\2\u009e\u009f\7\r\2\2\u009f\u00a0"+
		"\7\n\2\2\u00a0\u00a4\5\34\17\2\u00a1\u00a2\7\r\2\2\u00a2\u00a4\7\n\2\2"+
		"\u00a3\u009e\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\35\3\2\2\2\u00a5\u00a6"+
		"\5 \21\2\u00a6\37\3\2\2\2\u00a7\u00a8\b\21\1\2\u00a8\u00a9\7\r\2\2\u00a9"+
		"\u00aa\7\f\2\2\u00aa\u00b0\3\2\2\2\u00ab\u00ac\f\4\2\2\u00ac\u00ad\7\r"+
		"\2\2\u00ad\u00af\7\f\2\2\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1!\3\2\2\2\u00b2\u00b0\3\2\2\2"+
		"\20*\61\67Okr|~\u0086\u008f\u0095\u009a\u00a3\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}