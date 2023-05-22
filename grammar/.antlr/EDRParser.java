// Generated from c:\Users\Trevor Alt\Documents\GitHub\edr_to_epidoc\grammar\EDR.g by ANTLR 4.9.2
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
		L_PAREN=1, R_PAREN=2, L_BRACKET=3, R_BRACKET=4, BIG_L_BRACKET=5, BIG_R_BRACKET=6, 
		L_CURLY=7, R_CURLY=8, COLON=9, QUESTION=10, DASH=11, PLUS=12, EQUAL=13, 
		UNDERLINE=14, CIRCUMFLEX=15, DOT=16, LETTER=17, CAPITAL_GREEK=18, LOWER_GREEK=19, 
		OTHER_LETTERS=20, SPACE=21, NEWLINE=22, LINE_BREAK=23, PUNCT=24, NUM=25, 
		L_ANGLE=26, R_ANGLE=27, VACAT=28, IANUA=29, PERPENDICULUM=30, COLUMN=31;
	public static final int
		RULE_root = 0, RULE_column = 1, RULE_inscription = 2, RULE_continuation = 3, 
		RULE_content = 4, RULE_row = 5, RULE_perp = 6, RULE_horz = 7, RULE_line = 8, 
		RULE_term = 9, RULE_figural = 10, RULE_misspell = 11, RULE_abbrev = 12, 
		RULE_desc = 13, RULE_string = 14, RULE_word = 15, RULE_chunk = 16, RULE_normal_chunk = 17, 
		RULE_under_chunk = 18, RULE_under_helper = 19, RULE_dot_chunk = 20, RULE_dot_helper = 21, 
		RULE_erased = 22, RULE_lost_chunk = 23, RULE_gap_unknown = 24, RULE_illegible = 25, 
		RULE_lost_lines_unknown = 26, RULE_lost_chars_known = 27, RULE_lost_line = 28, 
		RULE_lost_lines = 29, RULE_surplus = 30, RULE_joined = 31, RULE_joined_helper = 32, 
		RULE_joined_letters = 33, RULE_symbol = 34, RULE_lost_chars = 35, RULE_dashes = 36, 
		RULE_editorial = 37, RULE_vacat = 38, RULE_ianua = 39, RULE_subaudible = 40, 
		RULE_omitted = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "column", "inscription", "continuation", "content", "row", "perp", 
			"horz", "line", "term", "figural", "misspell", "abbrev", "desc", "string", 
			"word", "chunk", "normal_chunk", "under_chunk", "under_helper", "dot_chunk", 
			"dot_helper", "erased", "lost_chunk", "gap_unknown", "illegible", "lost_lines_unknown", 
			"lost_chars_known", "lost_line", "lost_lines", "surplus", "joined", "joined_helper", 
			"joined_letters", "symbol", "lost_chars", "dashes", "editorial", "vacat", 
			"ianua", "subaudible", "omitted"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", null, null, "'{'", "'}'", "':'", "'?'", 
			"'-'", "'+'", "'='", "'&#818;'", "'&#770;'", "'&#803;'", null, null, 
			null, "'&#390;'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "L_PAREN", "R_PAREN", "L_BRACKET", "R_BRACKET", "BIG_L_BRACKET", 
			"BIG_R_BRACKET", "L_CURLY", "R_CURLY", "COLON", "QUESTION", "DASH", "PLUS", 
			"EQUAL", "UNDERLINE", "CIRCUMFLEX", "DOT", "LETTER", "CAPITAL_GREEK", 
			"LOWER_GREEK", "OTHER_LETTERS", "SPACE", "NEWLINE", "LINE_BREAK", "PUNCT", 
			"NUM", "L_ANGLE", "R_ANGLE", "VACAT", "IANUA", "PERPENDICULUM", "COLUMN"
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
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
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
			setState(84);
			column();
			setState(85);
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

	public static class ColumnContext extends ParserRuleContext {
		public InscriptionContext inscription() {
			return getRuleContext(InscriptionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(EDRParser.COLUMN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(EDRParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EDRParser.NEWLINE, i);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_column);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				inscription();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(COLUMN);
				setState(89);
				match(NEWLINE);
				setState(90);
				inscription();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(COLUMN);
				setState(92);
				match(NEWLINE);
				setState(93);
				inscription();
				setState(94);
				match(NEWLINE);
				setState(95);
				column();
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
	public static class Excess_new_lineContext extends InscriptionContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(EDRParser.NEWLINE, 0); }
		public Excess_new_lineContext(InscriptionContext ctx) { copyFrom(ctx); }
	}
	public static class Single_line_inscriptionContext extends InscriptionContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Single_line_inscriptionContext(InscriptionContext ctx) { copyFrom(ctx); }
	}
	public static class Multi_line_inscriptionContext extends InscriptionContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(EDRParser.NEWLINE, 0); }
		public InscriptionContext inscription() {
			return getRuleContext(InscriptionContext.class,0);
		}
		public Multi_line_inscriptionContext(InscriptionContext ctx) { copyFrom(ctx); }
	}
	public static class No_word_breakContext extends InscriptionContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public ContinuationContext continuation() {
			return getRuleContext(ContinuationContext.class,0);
		}
		public No_word_breakContext(InscriptionContext ctx) { copyFrom(ctx); }
	}

	public final InscriptionContext inscription() throws RecognitionException {
		InscriptionContext _localctx = new InscriptionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inscription);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Multi_line_inscriptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				content();
				setState(100);
				match(NEWLINE);
				setState(101);
				inscription();
				}
				break;
			case 2:
				_localctx = new No_word_breakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				content();
				setState(104);
				continuation();
				}
				break;
			case 3:
				_localctx = new Excess_new_lineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				content();
				setState(107);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new Single_line_inscriptionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				content();
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

	public static class ContinuationContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(EDRParser.EQUAL, 0); }
		public TerminalNode NEWLINE() { return getToken(EDRParser.NEWLINE, 0); }
		public InscriptionContext inscription() {
			return getRuleContext(InscriptionContext.class,0);
		}
		public ContinuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuation; }
	}

	public final ContinuationContext continuation() throws RecognitionException {
		ContinuationContext _localctx = new ContinuationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_continuation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(EQUAL);
			setState(113);
			match(NEWLINE);
			setState(114);
			inscription();
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

	public static class ContentContext extends ParserRuleContext {
		public HorzContext horz() {
			return getRuleContext(HorzContext.class,0);
		}
		public PerpContext perp() {
			return getRuleContext(PerpContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_content);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PAREN:
			case L_BRACKET:
			case BIG_L_BRACKET:
			case L_CURLY:
			case DASH:
			case PLUS:
			case LETTER:
			case L_ANGLE:
			case VACAT:
			case IANUA:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				horz();
				}
				break;
			case PERPENDICULUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				perp();
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
		enterRule(_localctx, 10, RULE_row);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				lost_lines_unknown();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
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

	public static class PerpContext extends ParserRuleContext {
		public TerminalNode PERPENDICULUM() { return getToken(EDRParser.PERPENDICULUM, 0); }
		public TerminalNode NEWLINE() { return getToken(EDRParser.NEWLINE, 0); }
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public PerpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perp; }
	}

	public final PerpContext perp() throws RecognitionException {
		PerpContext _localctx = new PerpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_perp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(PERPENDICULUM);
			setState(126);
			match(NEWLINE);
			setState(127);
			row();
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

	public static class HorzContext extends ParserRuleContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public HorzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_horz; }
	}

	public final HorzContext horz() throws RecognitionException {
		HorzContext _localctx = new HorzContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_horz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			row();
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
		enterRule(_localctx, 16, RULE_line);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				term();
				setState(133);
				match(SPACE);
				setState(134);
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
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				misspell();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				figural();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				abbrev();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				string();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
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
		enterRule(_localctx, 20, RULE_figural);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(L_PAREN);
			setState(146);
			match(L_PAREN);
			setState(147);
			match(COLON);
			setState(148);
			desc(0);
			setState(149);
			match(R_PAREN);
			setState(150);
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
		public MisspellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misspell; }
	 
		public MisspellContext() { }
		public void copyFrom(MisspellContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Normal_misspellContext extends MisspellContext {
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
		public Normal_misspellContext(MisspellContext ctx) { copyFrom(ctx); }
	}
	public static class Unsure_no_space_misspellContext extends MisspellContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(EDRParser.L_PAREN, 0); }
		public TerminalNode COLON() { return getToken(EDRParser.COLON, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(EDRParser.QUESTION, 0); }
		public TerminalNode R_PAREN() { return getToken(EDRParser.R_PAREN, 0); }
		public Unsure_no_space_misspellContext(MisspellContext ctx) { copyFrom(ctx); }
	}
	public static class No_space_misspellContext extends MisspellContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(EDRParser.L_PAREN, 0); }
		public TerminalNode COLON() { return getToken(EDRParser.COLON, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(EDRParser.R_PAREN, 0); }
		public No_space_misspellContext(MisspellContext ctx) { copyFrom(ctx); }
	}
	public static class Unsure_misspellContext extends MisspellContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EDRParser.SPACE, 0); }
		public TerminalNode L_PAREN() { return getToken(EDRParser.L_PAREN, 0); }
		public TerminalNode COLON() { return getToken(EDRParser.COLON, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(EDRParser.QUESTION, 0); }
		public TerminalNode R_PAREN() { return getToken(EDRParser.R_PAREN, 0); }
		public Unsure_misspellContext(MisspellContext ctx) { copyFrom(ctx); }
	}

	public final MisspellContext misspell() throws RecognitionException {
		MisspellContext _localctx = new MisspellContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_misspell);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Normal_misspellContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				word(0);
				setState(153);
				match(SPACE);
				setState(154);
				match(L_PAREN);
				setState(155);
				match(COLON);
				setState(156);
				string();
				setState(157);
				match(R_PAREN);
				}
				break;
			case 2:
				_localctx = new No_space_misspellContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				word(0);
				setState(160);
				match(L_PAREN);
				setState(161);
				match(COLON);
				setState(162);
				string();
				setState(163);
				match(R_PAREN);
				}
				break;
			case 3:
				_localctx = new Unsure_misspellContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				word(0);
				setState(166);
				match(SPACE);
				setState(167);
				match(L_PAREN);
				setState(168);
				match(COLON);
				setState(169);
				string();
				setState(170);
				match(QUESTION);
				setState(171);
				match(R_PAREN);
				}
				break;
			case 4:
				_localctx = new Unsure_no_space_misspellContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				word(0);
				setState(174);
				match(L_PAREN);
				setState(175);
				match(COLON);
				setState(176);
				string();
				setState(177);
				match(QUESTION);
				setState(178);
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
		enterRule(_localctx, 24, RULE_abbrev);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Normal_abbrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				word(0);
				setState(183);
				match(L_PAREN);
				setState(184);
				string();
				setState(185);
				match(R_PAREN);
				}
				break;
			case 2:
				_localctx = new Uncertain_abbrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				word(0);
				setState(188);
				match(L_PAREN);
				setState(189);
				string();
				setState(190);
				match(QUESTION);
				setState(191);
				match(R_PAREN);
				}
				break;
			case 3:
				_localctx = new Unknown_abbr1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				word(0);
				setState(194);
				match(L_PAREN);
				setState(195);
				match(DASH);
				setState(196);
				match(DASH);
				setState(197);
				match(DASH);
				setState(198);
				match(R_PAREN);
				}
				break;
			case 4:
				_localctx = new Unknown_abbr2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				word(0);
				setState(201);
				match(L_PAREN);
				setState(202);
				match(DASH);
				setState(203);
				match(DASH);
				setState(204);
				match(DASH);
				setState(205);
				match(QUESTION);
				setState(206);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_desc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(211);
				word(0);
				setState(212);
				match(PUNCT);
				}
				break;
			case 2:
				{
				setState(214);
				word(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(217);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(218);
						match(SPACE);
						setState(219);
						word(0);
						setState(220);
						match(PUNCT);
						}
						break;
					case 2:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(222);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(223);
						match(SPACE);
						setState(224);
						word(0);
						}
						break;
					}
					} 
				}
				setState(229);
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
		enterRule(_localctx, 28, RULE_string);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				word(0);
				setState(231);
				match(SPACE);
				setState(232);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_word, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(238);
			chunk();
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new WordContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_word);
					setState(240);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(241);
					chunk();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 32, RULE_chunk);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				under_chunk();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				dot_chunk();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				erased();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				lost_chunk();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				gap_unknown();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
				illegible();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				surplus();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(255);
				joined();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(256);
				symbol();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(257);
				lost_chars();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(258);
				lost_chars_known();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(259);
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
		enterRule(_localctx, 34, RULE_normal_chunk);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(LETTER);
				setState(263);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
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
		enterRule(_localctx, 36, RULE_under_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
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
		enterRule(_localctx, 38, RULE_under_helper);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(LETTER);
				setState(270);
				match(UNDERLINE);
				setState(271);
				under_helper();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(LETTER);
				setState(273);
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
		enterRule(_localctx, 40, RULE_dot_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_dot_helper, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(279);
			match(LETTER);
			setState(280);
			match(DOT);
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dot_helperContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dot_helper);
					setState(282);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(283);
					match(LETTER);
					setState(284);
					match(DOT);
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public TerminalNode BIG_L_BRACKET() { return getToken(EDRParser.BIG_L_BRACKET, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode BIG_R_BRACKET() { return getToken(EDRParser.BIG_R_BRACKET, 0); }
		public ErasedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_erased; }
	}

	public final ErasedContext erased() throws RecognitionException {
		ErasedContext _localctx = new ErasedContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_erased);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(BIG_L_BRACKET);
			setState(291);
			line();
			setState(292);
			match(BIG_R_BRACKET);
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
		enterRule(_localctx, 46, RULE_lost_chunk);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(L_BRACKET);
				setState(295);
				line();
				setState(296);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(L_BRACKET);
				setState(299);
				line();
				setState(300);
				match(QUESTION);
				setState(301);
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
		enterRule(_localctx, 48, RULE_gap_unknown);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(L_BRACKET);
				setState(306);
				match(DASH);
				setState(307);
				match(DASH);
				setState(308);
				match(DASH);
				setState(309);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(L_BRACKET);
				setState(311);
				match(SPACE);
				setState(312);
				match(DASH);
				setState(313);
				match(SPACE);
				setState(314);
				match(DASH);
				setState(315);
				match(SPACE);
				setState(316);
				match(DASH);
				setState(317);
				match(SPACE);
				setState(318);
				match(R_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				match(L_BRACKET);
				setState(320);
				match(DASH);
				setState(321);
				match(SPACE);
				setState(322);
				match(DASH);
				setState(323);
				match(SPACE);
				setState(324);
				match(DASH);
				setState(325);
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
		enterRule(_localctx, 50, RULE_illegible);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(PLUS);
				setState(329);
				illegible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
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
		enterRule(_localctx, 52, RULE_lost_lines_unknown);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(DASH);
				setState(334);
				match(DASH);
				setState(335);
				match(DASH);
				setState(336);
				match(DASH);
				setState(337);
				match(DASH);
				setState(338);
				match(DASH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(DASH);
				setState(340);
				match(SPACE);
				setState(341);
				match(DASH);
				setState(342);
				match(SPACE);
				setState(343);
				match(DASH);
				setState(344);
				match(SPACE);
				setState(345);
				match(DASH);
				setState(346);
				match(SPACE);
				setState(347);
				match(DASH);
				setState(348);
				match(SPACE);
				setState(349);
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
		enterRule(_localctx, 54, RULE_lost_chars_known);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(L_BRACKET);
			setState(353);
			dashes();
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
		enterRule(_localctx, 56, RULE_lost_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(L_BRACKET);
			setState(357);
			match(DASH);
			setState(358);
			match(DASH);
			setState(359);
			match(DASH);
			setState(360);
			match(DASH);
			setState(361);
			match(DASH);
			setState(362);
			match(DASH);
			setState(363);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_lost_lines, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(366);
			lost_line();
			}
			_ctx.stop = _input.LT(-1);
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lost_linesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lost_lines);
					setState(368);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(369);
					match(NEWLINE);
					setState(370);
					lost_line();
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 60, RULE_surplus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(L_CURLY);
			setState(377);
			word(0);
			setState(378);
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
		enterRule(_localctx, 62, RULE_joined);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
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
		enterRule(_localctx, 64, RULE_joined_helper);
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				joined_letters();
				setState(383);
				match(CIRCUMFLEX);
				setState(384);
				match(LETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
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
		enterRule(_localctx, 66, RULE_joined_letters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(LETTER);
			setState(390);
			match(CIRCUMFLEX);
			setState(391);
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
		enterRule(_localctx, 68, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(L_PAREN);
			setState(394);
			match(L_PAREN);
			setState(395);
			word(0);
			setState(396);
			match(R_PAREN);
			setState(397);
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
		enterRule(_localctx, 70, RULE_lost_chars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(L_BRACKET);
			setState(400);
			match(PLUS);
			setState(401);
			match(NUM);
			setState(402);
			match(QUESTION);
			setState(403);
			match(PLUS);
			setState(404);
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
		enterRule(_localctx, 72, RULE_dashes);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(DASH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(DASH);
				setState(408);
				match(DASH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				match(DASH);
				setState(410);
				match(DASH);
				setState(411);
				match(DASH);
				setState(412);
				match(DASH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				match(DASH);
				setState(414);
				match(DASH);
				setState(415);
				match(DASH);
				setState(416);
				match(DASH);
				setState(417);
				match(DASH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
				match(DASH);
				setState(419);
				match(DASH);
				setState(420);
				match(DASH);
				setState(421);
				match(DASH);
				setState(422);
				match(DASH);
				setState(423);
				match(DASH);
				setState(424);
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
		enterRule(_localctx, 74, RULE_editorial);
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VACAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				vacat();
				}
				break;
			case IANUA:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				ianua();
				}
				break;
			case L_PAREN:
			case L_ANGLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
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
		enterRule(_localctx, 76, RULE_vacat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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
		enterRule(_localctx, 78, RULE_ianua);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
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
		enterRule(_localctx, 80, RULE_subaudible);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(L_ANGLE);
				setState(437);
				match(COLON);
				setState(438);
				normal_chunk();
				setState(439);
				match(R_ANGLE);
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				match(L_PAREN);
				setState(442);
				normal_chunk();
				setState(443);
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
		enterRule(_localctx, 82, RULE_omitted);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(L_ANGLE);
			setState(448);
			normal_chunk();
			setState(449);
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
		case 13:
			return desc_sempred((DescContext)_localctx, predIndex);
		case 15:
			return word_sempred((WordContext)_localctx, predIndex);
		case 21:
			return dot_helper_sempred((Dot_helperContext)_localctx, predIndex);
		case 29:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u01c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3d\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4q\n\4\3\5\3\5\3\5\3\5\3\6\3\6\5"+
		"\6y\n\6\3\7\3\7\3\7\5\7~\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u008b\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u0092\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b7\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d3"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00da\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00e4\n\17\f\17\16\17\u00e7\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00ee\n\20\3\21\3\21\3\21\3\21\3\21\7\21\u00f5\n\21\f"+
		"\21\16\21\u00f8\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0107\n\22\3\23\3\23\3\23\5\23\u010c\n\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\5\25\u0115\n\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0120\n\27\f\27\16\27\u0123\13\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0132\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0149\n\32\3\33\3\33\3\33\5\33"+
		"\u014e\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u0161\n\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u0176\n\37\f\37\16\37\u0179\13\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\5\"\u0186\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01ac\n&\3"+
		"\'\3\'\3\'\5\'\u01b1\n\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01c0"+
		"\n*\3+\3+\3+\3+\3+\2\6\34 ,<,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\2\2\u01d0\2V\3\2\2\2\4c\3\2\2\2"+
		"\6p\3\2\2\2\br\3\2\2\2\nx\3\2\2\2\f}\3\2\2\2\16\177\3\2\2\2\20\u0083\3"+
		"\2\2\2\22\u008a\3\2\2\2\24\u0091\3\2\2\2\26\u0093\3\2\2\2\30\u00b6\3\2"+
		"\2\2\32\u00d2\3\2\2\2\34\u00d9\3\2\2\2\36\u00ed\3\2\2\2 \u00ef\3\2\2\2"+
		"\"\u0106\3\2\2\2$\u010b\3\2\2\2&\u010d\3\2\2\2(\u0114\3\2\2\2*\u0116\3"+
		"\2\2\2,\u0118\3\2\2\2.\u0124\3\2\2\2\60\u0131\3\2\2\2\62\u0148\3\2\2\2"+
		"\64\u014d\3\2\2\2\66\u0160\3\2\2\28\u0162\3\2\2\2:\u0166\3\2\2\2<\u016f"+
		"\3\2\2\2>\u017a\3\2\2\2@\u017e\3\2\2\2B\u0185\3\2\2\2D\u0187\3\2\2\2F"+
		"\u018b\3\2\2\2H\u0191\3\2\2\2J\u01ab\3\2\2\2L\u01b0\3\2\2\2N\u01b2\3\2"+
		"\2\2P\u01b4\3\2\2\2R\u01bf\3\2\2\2T\u01c1\3\2\2\2VW\5\4\3\2WX\7\2\2\3"+
		"X\3\3\2\2\2Yd\5\6\4\2Z[\7!\2\2[\\\7\30\2\2\\d\5\6\4\2]^\7!\2\2^_\7\30"+
		"\2\2_`\5\6\4\2`a\7\30\2\2ab\5\4\3\2bd\3\2\2\2cY\3\2\2\2cZ\3\2\2\2c]\3"+
		"\2\2\2d\5\3\2\2\2ef\5\n\6\2fg\7\30\2\2gh\5\6\4\2hq\3\2\2\2ij\5\n\6\2j"+
		"k\5\b\5\2kq\3\2\2\2lm\5\n\6\2mn\7\30\2\2nq\3\2\2\2oq\5\n\6\2pe\3\2\2\2"+
		"pi\3\2\2\2pl\3\2\2\2po\3\2\2\2q\7\3\2\2\2rs\7\17\2\2st\7\30\2\2tu\5\6"+
		"\4\2u\t\3\2\2\2vy\5\20\t\2wy\5\16\b\2xv\3\2\2\2xw\3\2\2\2y\13\3\2\2\2"+
		"z~\5\22\n\2{~\5\66\34\2|~\5<\37\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\r\3\2"+
		"\2\2\177\u0080\7 \2\2\u0080\u0081\7\30\2\2\u0081\u0082\5\f\7\2\u0082\17"+
		"\3\2\2\2\u0083\u0084\5\f\7\2\u0084\21\3\2\2\2\u0085\u008b\5\24\13\2\u0086"+
		"\u0087\5\24\13\2\u0087\u0088\7\27\2\2\u0088\u0089\5\22\n\2\u0089\u008b"+
		"\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2\2\2\u008b\23\3\2\2\2\u008c"+
		"\u0092\5\30\r\2\u008d\u0092\5\26\f\2\u008e\u0092\5\32\16\2\u008f\u0092"+
		"\5\36\20\2\u0090\u0092\5L\'\2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2"+
		"\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\25"+
		"\3\2\2\2\u0093\u0094\7\3\2\2\u0094\u0095\7\3\2\2\u0095\u0096\7\13\2\2"+
		"\u0096\u0097\5\34\17\2\u0097\u0098\7\4\2\2\u0098\u0099\7\4\2\2\u0099\27"+
		"\3\2\2\2\u009a\u009b\5 \21\2\u009b\u009c\7\27\2\2\u009c\u009d\7\3\2\2"+
		"\u009d\u009e\7\13\2\2\u009e\u009f\5\36\20\2\u009f\u00a0\7\4\2\2\u00a0"+
		"\u00b7\3\2\2\2\u00a1\u00a2\5 \21\2\u00a2\u00a3\7\3\2\2\u00a3\u00a4\7\13"+
		"\2\2\u00a4\u00a5\5\36\20\2\u00a5\u00a6\7\4\2\2\u00a6\u00b7\3\2\2\2\u00a7"+
		"\u00a8\5 \21\2\u00a8\u00a9\7\27\2\2\u00a9\u00aa\7\3\2\2\u00aa\u00ab\7"+
		"\13\2\2\u00ab\u00ac\5\36\20\2\u00ac\u00ad\7\f\2\2\u00ad\u00ae\7\4\2\2"+
		"\u00ae\u00b7\3\2\2\2\u00af\u00b0\5 \21\2\u00b0\u00b1\7\3\2\2\u00b1\u00b2"+
		"\7\13\2\2\u00b2\u00b3\5\36\20\2\u00b3\u00b4\7\f\2\2\u00b4\u00b5\7\4\2"+
		"\2\u00b5\u00b7\3\2\2\2\u00b6\u009a\3\2\2\2\u00b6\u00a1\3\2\2\2\u00b6\u00a7"+
		"\3\2\2\2\u00b6\u00af\3\2\2\2\u00b7\31\3\2\2\2\u00b8\u00b9\5 \21\2\u00b9"+
		"\u00ba\7\3\2\2\u00ba\u00bb\5\36\20\2\u00bb\u00bc\7\4\2\2\u00bc\u00d3\3"+
		"\2\2\2\u00bd\u00be\5 \21\2\u00be\u00bf\7\3\2\2\u00bf\u00c0\5\36\20\2\u00c0"+
		"\u00c1\7\f\2\2\u00c1\u00c2\7\4\2\2\u00c2\u00d3\3\2\2\2\u00c3\u00c4\5 "+
		"\21\2\u00c4\u00c5\7\3\2\2\u00c5\u00c6\7\r\2\2\u00c6\u00c7\7\r\2\2\u00c7"+
		"\u00c8\7\r\2\2\u00c8\u00c9\7\4\2\2\u00c9\u00d3\3\2\2\2\u00ca\u00cb\5 "+
		"\21\2\u00cb\u00cc\7\3\2\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\7\r\2\2\u00ce"+
		"\u00cf\7\r\2\2\u00cf\u00d0\7\f\2\2\u00d0\u00d1\7\4\2\2\u00d1\u00d3\3\2"+
		"\2\2\u00d2\u00b8\3\2\2\2\u00d2\u00bd\3\2\2\2\u00d2\u00c3\3\2\2\2\u00d2"+
		"\u00ca\3\2\2\2\u00d3\33\3\2\2\2\u00d4\u00d5\b\17\1\2\u00d5\u00d6\5 \21"+
		"\2\u00d6\u00d7\7\32\2\2\u00d7\u00da\3\2\2\2\u00d8\u00da\5 \21\2\u00d9"+
		"\u00d4\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00e5\3\2\2\2\u00db\u00dc\f\6"+
		"\2\2\u00dc\u00dd\7\27\2\2\u00dd\u00de\5 \21\2\u00de\u00df\7\32\2\2\u00df"+
		"\u00e4\3\2\2\2\u00e0\u00e1\f\5\2\2\u00e1\u00e2\7\27\2\2\u00e2\u00e4\5"+
		" \21\2\u00e3\u00db\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\35\3\2\2\2\u00e7\u00e5\3\2\2"+
		"\2\u00e8\u00e9\5 \21\2\u00e9\u00ea\7\27\2\2\u00ea\u00eb\5\36\20\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ee\5 \21\2\u00ed\u00e8\3\2\2\2\u00ed\u00ec\3\2"+
		"\2\2\u00ee\37\3\2\2\2\u00ef\u00f0\b\21\1\2\u00f0\u00f1\5\"\22\2\u00f1"+
		"\u00f6\3\2\2\2\u00f2\u00f3\f\4\2\2\u00f3\u00f5\5\"\22\2\u00f4\u00f2\3"+
		"\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"!\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u0107\5$\23\2\u00fa\u0107\5&\24\2"+
		"\u00fb\u0107\5*\26\2\u00fc\u0107\5.\30\2\u00fd\u0107\5\60\31\2\u00fe\u0107"+
		"\5\62\32\2\u00ff\u0107\5\64\33\2\u0100\u0107\5> \2\u0101\u0107\5@!\2\u0102"+
		"\u0107\5F$\2\u0103\u0107\5H%\2\u0104\u0107\58\35\2\u0105\u0107\5T+\2\u0106"+
		"\u00f9\3\2\2\2\u0106\u00fa\3\2\2\2\u0106\u00fb\3\2\2\2\u0106\u00fc\3\2"+
		"\2\2\u0106\u00fd\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u00ff\3\2\2\2\u0106"+
		"\u0100\3\2\2\2\u0106\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107#\3\2\2\2\u0108\u0109"+
		"\7\23\2\2\u0109\u010c\5$\23\2\u010a\u010c\7\23\2\2\u010b\u0108\3\2\2\2"+
		"\u010b\u010a\3\2\2\2\u010c%\3\2\2\2\u010d\u010e\5(\25\2\u010e\'\3\2\2"+
		"\2\u010f\u0110\7\23\2\2\u0110\u0111\7\20\2\2\u0111\u0115\5(\25\2\u0112"+
		"\u0113\7\23\2\2\u0113\u0115\7\20\2\2\u0114\u010f\3\2\2\2\u0114\u0112\3"+
		"\2\2\2\u0115)\3\2\2\2\u0116\u0117\5,\27\2\u0117+\3\2\2\2\u0118\u0119\b"+
		"\27\1\2\u0119\u011a\7\23\2\2\u011a\u011b\7\22\2\2\u011b\u0121\3\2\2\2"+
		"\u011c\u011d\f\4\2\2\u011d\u011e\7\23\2\2\u011e\u0120\7\22\2\2\u011f\u011c"+
		"\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"-\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\7\2\2\u0125\u0126\5\22\n\2"+
		"\u0126\u0127\7\b\2\2\u0127/\3\2\2\2\u0128\u0129\7\5\2\2\u0129\u012a\5"+
		"\22\n\2\u012a\u012b\7\6\2\2\u012b\u0132\3\2\2\2\u012c\u012d\7\5\2\2\u012d"+
		"\u012e\5\22\n\2\u012e\u012f\7\f\2\2\u012f\u0130\7\6\2\2\u0130\u0132\3"+
		"\2\2\2\u0131\u0128\3\2\2\2\u0131\u012c\3\2\2\2\u0132\61\3\2\2\2\u0133"+
		"\u0134\7\5\2\2\u0134\u0135\7\r\2\2\u0135\u0136\7\r\2\2\u0136\u0137\7\r"+
		"\2\2\u0137\u0149\7\6\2\2\u0138\u0139\7\5\2\2\u0139\u013a\7\27\2\2\u013a"+
		"\u013b\7\r\2\2\u013b\u013c\7\27\2\2\u013c\u013d\7\r\2\2\u013d\u013e\7"+
		"\27\2\2\u013e\u013f\7\r\2\2\u013f\u0140\7\27\2\2\u0140\u0149\7\6\2\2\u0141"+
		"\u0142\7\5\2\2\u0142\u0143\7\r\2\2\u0143\u0144\7\27\2\2\u0144\u0145\7"+
		"\r\2\2\u0145\u0146\7\27\2\2\u0146\u0147\7\r\2\2\u0147\u0149\7\6\2\2\u0148"+
		"\u0133\3\2\2\2\u0148\u0138\3\2\2\2\u0148\u0141\3\2\2\2\u0149\63\3\2\2"+
		"\2\u014a\u014b\7\16\2\2\u014b\u014e\5\64\33\2\u014c\u014e\7\16\2\2\u014d"+
		"\u014a\3\2\2\2\u014d\u014c\3\2\2\2\u014e\65\3\2\2\2\u014f\u0150\7\r\2"+
		"\2\u0150\u0151\7\r\2\2\u0151\u0152\7\r\2\2\u0152\u0153\7\r\2\2\u0153\u0154"+
		"\7\r\2\2\u0154\u0161\7\r\2\2\u0155\u0156\7\r\2\2\u0156\u0157\7\27\2\2"+
		"\u0157\u0158\7\r\2\2\u0158\u0159\7\27\2\2\u0159\u015a\7\r\2\2\u015a\u015b"+
		"\7\27\2\2\u015b\u015c\7\r\2\2\u015c\u015d\7\27\2\2\u015d\u015e\7\r\2\2"+
		"\u015e\u015f\7\27\2\2\u015f\u0161\7\r\2\2\u0160\u014f\3\2\2\2\u0160\u0155"+
		"\3\2\2\2\u0161\67\3\2\2\2\u0162\u0163\7\5\2\2\u0163\u0164\5J&\2\u0164"+
		"\u0165\7\6\2\2\u01659\3\2\2\2\u0166\u0167\7\5\2\2\u0167\u0168\7\r\2\2"+
		"\u0168\u0169\7\r\2\2\u0169\u016a\7\r\2\2\u016a\u016b\7\r\2\2\u016b\u016c"+
		"\7\r\2\2\u016c\u016d\7\r\2\2\u016d\u016e\7\6\2\2\u016e;\3\2\2\2\u016f"+
		"\u0170\b\37\1\2\u0170\u0171\5:\36\2\u0171\u0177\3\2\2\2\u0172\u0173\f"+
		"\4\2\2\u0173\u0174\7\30\2\2\u0174\u0176\5:\36\2\u0175\u0172\3\2\2\2\u0176"+
		"\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178=\3\2\2\2"+
		"\u0179\u0177\3\2\2\2\u017a\u017b\7\t\2\2\u017b\u017c\5 \21\2\u017c\u017d"+
		"\7\n\2\2\u017d?\3\2\2\2\u017e\u017f\5B\"\2\u017fA\3\2\2\2\u0180\u0181"+
		"\5D#\2\u0181\u0182\7\21\2\2\u0182\u0183\7\23\2\2\u0183\u0186\3\2\2\2\u0184"+
		"\u0186\5D#\2\u0185\u0180\3\2\2\2\u0185\u0184\3\2\2\2\u0186C\3\2\2\2\u0187"+
		"\u0188\7\23\2\2\u0188\u0189\7\21\2\2\u0189\u018a\7\23\2\2\u018aE\3\2\2"+
		"\2\u018b\u018c\7\3\2\2\u018c\u018d\7\3\2\2\u018d\u018e\5 \21\2\u018e\u018f"+
		"\7\4\2\2\u018f\u0190\7\4\2\2\u0190G\3\2\2\2\u0191\u0192\7\5\2\2\u0192"+
		"\u0193\7\16\2\2\u0193\u0194\7\33\2\2\u0194\u0195\7\f\2\2\u0195\u0196\7"+
		"\16\2\2\u0196\u0197\7\6\2\2\u0197I\3\2\2\2\u0198\u01ac\7\r\2\2\u0199\u019a"+
		"\7\r\2\2\u019a\u01ac\7\r\2\2\u019b\u019c\7\r\2\2\u019c\u019d\7\r\2\2\u019d"+
		"\u019e\7\r\2\2\u019e\u01ac\7\r\2\2\u019f\u01a0\7\r\2\2\u01a0\u01a1\7\r"+
		"\2\2\u01a1\u01a2\7\r\2\2\u01a2\u01a3\7\r\2\2\u01a3\u01ac\7\r\2\2\u01a4"+
		"\u01a5\7\r\2\2\u01a5\u01a6\7\r\2\2\u01a6\u01a7\7\r\2\2\u01a7\u01a8\7\r"+
		"\2\2\u01a8\u01a9\7\r\2\2\u01a9\u01aa\7\r\2\2\u01aa\u01ac\5J&\2\u01ab\u0198"+
		"\3\2\2\2\u01ab\u0199\3\2\2\2\u01ab\u019b\3\2\2\2\u01ab\u019f\3\2\2\2\u01ab"+
		"\u01a4\3\2\2\2\u01acK\3\2\2\2\u01ad\u01b1\5N(\2\u01ae\u01b1\5P)\2\u01af"+
		"\u01b1\5R*\2\u01b0\u01ad\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2"+
		"\2\u01b1M\3\2\2\2\u01b2\u01b3\7\36\2\2\u01b3O\3\2\2\2\u01b4\u01b5\7\37"+
		"\2\2\u01b5Q\3\2\2\2\u01b6\u01b7\7\34\2\2\u01b7\u01b8\7\13\2\2\u01b8\u01b9"+
		"\5$\23\2\u01b9\u01ba\7\35\2\2\u01ba\u01c0\3\2\2\2\u01bb\u01bc\7\3\2\2"+
		"\u01bc\u01bd\5$\23\2\u01bd\u01be\7\4\2\2\u01be\u01c0\3\2\2\2\u01bf\u01b6"+
		"\3\2\2\2\u01bf\u01bb\3\2\2\2\u01c0S\3\2\2\2\u01c1\u01c2\7\34\2\2\u01c2"+
		"\u01c3\5$\23\2\u01c3\u01c4\7\35\2\2\u01c4U\3\2\2\2\34cpx}\u008a\u0091"+
		"\u00b6\u00d2\u00d9\u00e3\u00e5\u00ed\u00f6\u0106\u010b\u0114\u0121\u0131"+
		"\u0148\u014d\u0160\u0177\u0185\u01ab\u01b0\u01bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}