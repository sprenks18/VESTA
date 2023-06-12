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
		RULE_desc = 13, RULE_string = 14, RULE_word = 15, RULE_line_in_bracket = 16, 
		RULE_term_in_bracket = 17, RULE_string_in_bracket = 18, RULE_word_in_bracket = 19, 
		RULE_missing_chunk = 20, RULE_standard_chunk = 21, RULE_chunk = 22, RULE_normal_chunk = 23, 
		RULE_under_chunk = 24, RULE_under_helper = 25, RULE_dot_chunk = 26, RULE_dot_helper = 27, 
		RULE_erased = 28, RULE_lost_chunk = 29, RULE_lost_with_gap = 30, RULE_gap_unknown = 31, 
		RULE_illegible = 32, RULE_lost_lines_unknown = 33, RULE_lost_chars_known = 34, 
		RULE_lost_line = 35, RULE_lost_lines = 36, RULE_surplus = 37, RULE_joined = 38, 
		RULE_joined_helper = 39, RULE_joined_letters = 40, RULE_symbol = 41, RULE_lost_chars = 42, 
		RULE_dashes = 43, RULE_editorial = 44, RULE_vacat = 45, RULE_ianua = 46, 
		RULE_subaudible = 47, RULE_omitted = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "column", "inscription", "continuation", "content", "row", "perp", 
			"horz", "line", "term", "figural", "misspell", "abbrev", "desc", "string", 
			"word", "line_in_bracket", "term_in_bracket", "string_in_bracket", "word_in_bracket", 
			"missing_chunk", "standard_chunk", "chunk", "normal_chunk", "under_chunk", 
			"under_helper", "dot_chunk", "dot_helper", "erased", "lost_chunk", "lost_with_gap", 
			"gap_unknown", "illegible", "lost_lines_unknown", "lost_chars_known", 
			"lost_line", "lost_lines", "surplus", "joined", "joined_helper", "joined_letters", 
			"symbol", "lost_chars", "dashes", "editorial", "vacat", "ianua", "subaudible", 
			"omitted"
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
			setState(98);
			column();
			setState(99);
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
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				inscription();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(COLUMN);
				setState(103);
				match(NEWLINE);
				setState(104);
				inscription();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(COLUMN);
				setState(106);
				match(NEWLINE);
				setState(107);
				inscription();
				setState(108);
				match(NEWLINE);
				setState(109);
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
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Multi_line_inscriptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				content();
				setState(114);
				match(NEWLINE);
				setState(115);
				inscription();
				}
				break;
			case 2:
				_localctx = new No_word_breakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				content();
				setState(118);
				continuation();
				}
				break;
			case 3:
				_localctx = new Excess_new_lineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				content();
				setState(121);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new Single_line_inscriptionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
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
			setState(126);
			match(EQUAL);
			setState(127);
			match(NEWLINE);
			setState(128);
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
			setState(132);
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
				setState(130);
				horz();
				}
				break;
			case PERPENDICULUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
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
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				lost_lines_unknown();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
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
			setState(139);
			match(PERPENDICULUM);
			setState(140);
			match(NEWLINE);
			setState(141);
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
			setState(143);
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
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				term();
				setState(147);
				match(SPACE);
				setState(148);
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				misspell();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				figural();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				abbrev();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				string();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
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
			setState(159);
			match(L_PAREN);
			setState(160);
			match(L_PAREN);
			setState(161);
			match(COLON);
			setState(162);
			desc(0);
			setState(163);
			match(R_PAREN);
			setState(164);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Normal_misspellContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				word(0);
				setState(167);
				match(SPACE);
				setState(168);
				match(L_PAREN);
				setState(169);
				match(COLON);
				setState(170);
				string();
				setState(171);
				match(R_PAREN);
				}
				break;
			case 2:
				_localctx = new No_space_misspellContext(_localctx);
				enterOuterAlt(_localctx, 2);
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
				match(R_PAREN);
				}
				break;
			case 3:
				_localctx = new Unsure_misspellContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				word(0);
				setState(180);
				match(SPACE);
				setState(181);
				match(L_PAREN);
				setState(182);
				match(COLON);
				setState(183);
				string();
				setState(184);
				match(QUESTION);
				setState(185);
				match(R_PAREN);
				}
				break;
			case 4:
				_localctx = new Unsure_no_space_misspellContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				word(0);
				setState(188);
				match(L_PAREN);
				setState(189);
				match(COLON);
				setState(190);
				string();
				setState(191);
				match(QUESTION);
				setState(192);
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Normal_abbrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				word(0);
				setState(197);
				match(L_PAREN);
				setState(198);
				string();
				setState(199);
				match(R_PAREN);
				}
				break;
			case 2:
				_localctx = new Uncertain_abbrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				word(0);
				setState(202);
				match(L_PAREN);
				setState(203);
				string();
				setState(204);
				match(QUESTION);
				setState(205);
				match(R_PAREN);
				}
				break;
			case 3:
				_localctx = new Unknown_abbr1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				word(0);
				setState(208);
				match(L_PAREN);
				setState(209);
				match(DASH);
				setState(210);
				match(DASH);
				setState(211);
				match(DASH);
				setState(212);
				match(R_PAREN);
				}
				break;
			case 4:
				_localctx = new Unknown_abbr2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				word(0);
				setState(215);
				match(L_PAREN);
				setState(216);
				match(DASH);
				setState(217);
				match(DASH);
				setState(218);
				match(DASH);
				setState(219);
				match(QUESTION);
				setState(220);
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
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(225);
				word(0);
				setState(226);
				match(PUNCT);
				}
				break;
			case 2:
				{
				setState(228);
				word(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(231);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(232);
						match(SPACE);
						setState(233);
						word(0);
						setState(234);
						match(PUNCT);
						}
						break;
					case 2:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(236);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(237);
						match(SPACE);
						setState(238);
						word(0);
						}
						break;
					}
					} 
				}
				setState(243);
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
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				word(0);
				setState(245);
				match(SPACE);
				setState(246);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
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
			setState(252);
			chunk();
			}
			_ctx.stop = _input.LT(-1);
			setState(258);
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
					setState(254);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(255);
					chunk();
					}
					} 
				}
				setState(260);
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

	public static class Line_in_bracketContext extends ParserRuleContext {
		public Term_in_bracketContext term_in_bracket() {
			return getRuleContext(Term_in_bracketContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EDRParser.SPACE, 0); }
		public Line_in_bracketContext line_in_bracket() {
			return getRuleContext(Line_in_bracketContext.class,0);
		}
		public Line_in_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_in_bracket; }
	}

	public final Line_in_bracketContext line_in_bracket() throws RecognitionException {
		Line_in_bracketContext _localctx = new Line_in_bracketContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_line_in_bracket);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				term_in_bracket();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				term_in_bracket();
				setState(263);
				match(SPACE);
				setState(264);
				line_in_bracket();
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

	public static class Term_in_bracketContext extends ParserRuleContext {
		public MisspellContext misspell() {
			return getRuleContext(MisspellContext.class,0);
		}
		public FiguralContext figural() {
			return getRuleContext(FiguralContext.class,0);
		}
		public AbbrevContext abbrev() {
			return getRuleContext(AbbrevContext.class,0);
		}
		public String_in_bracketContext string_in_bracket() {
			return getRuleContext(String_in_bracketContext.class,0);
		}
		public EditorialContext editorial() {
			return getRuleContext(EditorialContext.class,0);
		}
		public Term_in_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_in_bracket; }
	}

	public final Term_in_bracketContext term_in_bracket() throws RecognitionException {
		Term_in_bracketContext _localctx = new Term_in_bracketContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_term_in_bracket);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				misspell();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				figural();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				abbrev();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				string_in_bracket(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
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

	public static class String_in_bracketContext extends ParserRuleContext {
		public Word_in_bracketContext word_in_bracket() {
			return getRuleContext(Word_in_bracketContext.class,0);
		}
		public String_in_bracketContext string_in_bracket() {
			return getRuleContext(String_in_bracketContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(EDRParser.SPACE, 0); }
		public String_in_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_in_bracket; }
	}

	public final String_in_bracketContext string_in_bracket() throws RecognitionException {
		return string_in_bracket(0);
	}

	private String_in_bracketContext string_in_bracket(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_in_bracketContext _localctx = new String_in_bracketContext(_ctx, _parentState);
		String_in_bracketContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_string_in_bracket, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(276);
			word_in_bracket(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new String_in_bracketContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_string_in_bracket);
					setState(278);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(279);
					match(SPACE);
					setState(280);
					word_in_bracket(0);
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Word_in_bracketContext extends ParserRuleContext {
		public Standard_chunkContext standard_chunk() {
			return getRuleContext(Standard_chunkContext.class,0);
		}
		public Word_in_bracketContext word_in_bracket() {
			return getRuleContext(Word_in_bracketContext.class,0);
		}
		public Word_in_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word_in_bracket; }
	}

	public final Word_in_bracketContext word_in_bracket() throws RecognitionException {
		return word_in_bracket(0);
	}

	private Word_in_bracketContext word_in_bracket(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Word_in_bracketContext _localctx = new Word_in_bracketContext(_ctx, _parentState);
		Word_in_bracketContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_word_in_bracket, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(287);
			standard_chunk();
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Word_in_bracketContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_word_in_bracket);
					setState(289);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(290);
					standard_chunk();
					}
					} 
				}
				setState(295);
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

	public static class Missing_chunkContext extends ParserRuleContext {
		public Lost_chunkContext lost_chunk() {
			return getRuleContext(Lost_chunkContext.class,0);
		}
		public Lost_with_gapContext lost_with_gap() {
			return getRuleContext(Lost_with_gapContext.class,0);
		}
		public Lost_charsContext lost_chars() {
			return getRuleContext(Lost_charsContext.class,0);
		}
		public Lost_chars_knownContext lost_chars_known() {
			return getRuleContext(Lost_chars_knownContext.class,0);
		}
		public Gap_unknownContext gap_unknown() {
			return getRuleContext(Gap_unknownContext.class,0);
		}
		public Missing_chunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missing_chunk; }
	}

	public final Missing_chunkContext missing_chunk() throws RecognitionException {
		Missing_chunkContext _localctx = new Missing_chunkContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_missing_chunk);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				lost_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				lost_with_gap();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				lost_chars();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				lost_chars_known();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				gap_unknown();
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

	public static class Standard_chunkContext extends ParserRuleContext {
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
		public OmittedContext omitted() {
			return getRuleContext(OmittedContext.class,0);
		}
		public Standard_chunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_chunk; }
	}

	public final Standard_chunkContext standard_chunk() throws RecognitionException {
		Standard_chunkContext _localctx = new Standard_chunkContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_standard_chunk);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				under_chunk();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				dot_chunk();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				erased();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				illegible();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(308);
				surplus();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(309);
				joined();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(310);
				symbol();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(311);
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

	public static class ChunkContext extends ParserRuleContext {
		public Missing_chunkContext missing_chunk() {
			return getRuleContext(Missing_chunkContext.class,0);
		}
		public Standard_chunkContext standard_chunk() {
			return getRuleContext(Standard_chunkContext.class,0);
		}
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_chunk);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				missing_chunk();
				}
				break;
			case L_PAREN:
			case BIG_L_BRACKET:
			case L_CURLY:
			case PLUS:
			case LETTER:
			case L_ANGLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				standard_chunk();
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
		enterRule(_localctx, 46, RULE_normal_chunk);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(LETTER);
				setState(319);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
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
		enterRule(_localctx, 48, RULE_under_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
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
		enterRule(_localctx, 50, RULE_under_helper);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(LETTER);
				setState(326);
				match(UNDERLINE);
				setState(327);
				under_helper();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(LETTER);
				setState(329);
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
		enterRule(_localctx, 52, RULE_dot_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_dot_helper, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(335);
			match(LETTER);
			setState(336);
			match(DOT);
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dot_helperContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dot_helper);
					setState(338);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(339);
					match(LETTER);
					setState(340);
					match(DOT);
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 56, RULE_erased);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(BIG_L_BRACKET);
			setState(347);
			line();
			setState(348);
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
		public Line_in_bracketContext line_in_bracket() {
			return getRuleContext(Line_in_bracketContext.class,0);
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
		enterRule(_localctx, 58, RULE_lost_chunk);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(L_BRACKET);
				setState(351);
				line_in_bracket();
				setState(352);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(L_BRACKET);
				setState(355);
				line_in_bracket();
				setState(356);
				match(QUESTION);
				setState(357);
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

	public static class Lost_with_gapContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(EDRParser.L_BRACKET, 0); }
		public Line_in_bracketContext line_in_bracket() {
			return getRuleContext(Line_in_bracketContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(EDRParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(EDRParser.SPACE, i);
		}
		public List<TerminalNode> DASH() { return getTokens(EDRParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(EDRParser.DASH, i);
		}
		public TerminalNode R_BRACKET() { return getToken(EDRParser.R_BRACKET, 0); }
		public Lost_with_gapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lost_with_gap; }
	}

	public final Lost_with_gapContext lost_with_gap() throws RecognitionException {
		Lost_with_gapContext _localctx = new Lost_with_gapContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lost_with_gap);
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(L_BRACKET);
				setState(362);
				line_in_bracket();
				setState(363);
				match(SPACE);
				setState(364);
				match(DASH);
				setState(365);
				match(DASH);
				setState(366);
				match(DASH);
				setState(367);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(L_BRACKET);
				setState(370);
				line_in_bracket();
				setState(371);
				match(SPACE);
				setState(372);
				match(DASH);
				setState(373);
				match(SPACE);
				setState(374);
				match(DASH);
				setState(375);
				match(SPACE);
				setState(376);
				match(DASH);
				setState(377);
				match(R_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(L_BRACKET);
				setState(380);
				line_in_bracket();
				setState(381);
				match(DASH);
				setState(382);
				match(DASH);
				setState(383);
				match(DASH);
				setState(384);
				match(R_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				match(L_BRACKET);
				setState(387);
				line_in_bracket();
				setState(388);
				match(DASH);
				setState(389);
				match(SPACE);
				setState(390);
				match(DASH);
				setState(391);
				match(SPACE);
				setState(392);
				match(DASH);
				setState(393);
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
		enterRule(_localctx, 62, RULE_gap_unknown);
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(L_BRACKET);
				setState(398);
				match(DASH);
				setState(399);
				match(DASH);
				setState(400);
				match(DASH);
				setState(401);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(L_BRACKET);
				setState(403);
				match(SPACE);
				setState(404);
				match(DASH);
				setState(405);
				match(SPACE);
				setState(406);
				match(DASH);
				setState(407);
				match(SPACE);
				setState(408);
				match(DASH);
				setState(409);
				match(SPACE);
				setState(410);
				match(R_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				match(L_BRACKET);
				setState(412);
				match(DASH);
				setState(413);
				match(SPACE);
				setState(414);
				match(DASH);
				setState(415);
				match(SPACE);
				setState(416);
				match(DASH);
				setState(417);
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
		enterRule(_localctx, 64, RULE_illegible);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(PLUS);
				setState(421);
				illegible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
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
		enterRule(_localctx, 66, RULE_lost_lines_unknown);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(DASH);
				setState(426);
				match(DASH);
				setState(427);
				match(DASH);
				setState(428);
				match(DASH);
				setState(429);
				match(DASH);
				setState(430);
				match(DASH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(DASH);
				setState(432);
				match(SPACE);
				setState(433);
				match(DASH);
				setState(434);
				match(SPACE);
				setState(435);
				match(DASH);
				setState(436);
				match(SPACE);
				setState(437);
				match(DASH);
				setState(438);
				match(SPACE);
				setState(439);
				match(DASH);
				setState(440);
				match(SPACE);
				setState(441);
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
		enterRule(_localctx, 68, RULE_lost_chars_known);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(L_BRACKET);
			setState(445);
			dashes();
			setState(446);
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
		enterRule(_localctx, 70, RULE_lost_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(L_BRACKET);
			setState(449);
			match(DASH);
			setState(450);
			match(DASH);
			setState(451);
			match(DASH);
			setState(452);
			match(DASH);
			setState(453);
			match(DASH);
			setState(454);
			match(DASH);
			setState(455);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_lost_lines, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(458);
			lost_line();
			}
			_ctx.stop = _input.LT(-1);
			setState(465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lost_linesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lost_lines);
					setState(460);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(461);
					match(NEWLINE);
					setState(462);
					lost_line();
					}
					} 
				}
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 74, RULE_surplus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(L_CURLY);
			setState(469);
			word(0);
			setState(470);
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
		enterRule(_localctx, 76, RULE_joined);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
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
		enterRule(_localctx, 78, RULE_joined_helper);
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				joined_letters();
				setState(475);
				match(CIRCUMFLEX);
				setState(476);
				match(LETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
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
		enterRule(_localctx, 80, RULE_joined_letters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(LETTER);
			setState(482);
			match(CIRCUMFLEX);
			setState(483);
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
		enterRule(_localctx, 82, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(L_PAREN);
			setState(486);
			match(L_PAREN);
			setState(487);
			word(0);
			setState(488);
			match(R_PAREN);
			setState(489);
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
		enterRule(_localctx, 84, RULE_lost_chars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(L_BRACKET);
			setState(492);
			match(PLUS);
			setState(493);
			match(NUM);
			setState(494);
			match(QUESTION);
			setState(495);
			match(PLUS);
			setState(496);
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
		enterRule(_localctx, 86, RULE_dashes);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(DASH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				match(DASH);
				setState(500);
				match(DASH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				match(DASH);
				setState(502);
				match(DASH);
				setState(503);
				match(DASH);
				setState(504);
				match(DASH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				match(DASH);
				setState(506);
				match(DASH);
				setState(507);
				match(DASH);
				setState(508);
				match(DASH);
				setState(509);
				match(DASH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(510);
				match(DASH);
				setState(511);
				match(DASH);
				setState(512);
				match(DASH);
				setState(513);
				match(DASH);
				setState(514);
				match(DASH);
				setState(515);
				match(DASH);
				setState(516);
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
		enterRule(_localctx, 88, RULE_editorial);
		try {
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VACAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				vacat();
				}
				break;
			case IANUA:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				ianua();
				}
				break;
			case L_PAREN:
			case L_ANGLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
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
		enterRule(_localctx, 90, RULE_vacat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
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
		enterRule(_localctx, 92, RULE_ianua);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
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
		enterRule(_localctx, 94, RULE_subaudible);
		try {
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				match(L_ANGLE);
				setState(529);
				match(COLON);
				setState(530);
				desc(0);
				setState(531);
				match(R_ANGLE);
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(L_PAREN);
				setState(534);
				desc(0);
				setState(535);
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
		enterRule(_localctx, 96, RULE_omitted);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(L_ANGLE);
			setState(540);
			normal_chunk();
			setState(541);
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
		case 18:
			return string_in_bracket_sempred((String_in_bracketContext)_localctx, predIndex);
		case 19:
			return word_in_bracket_sempred((Word_in_bracketContext)_localctx, predIndex);
		case 27:
			return dot_helper_sempred((Dot_helperContext)_localctx, predIndex);
		case 36:
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
	private boolean string_in_bracket_sempred(String_in_bracketContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean word_in_bracket_sempred(Word_in_bracketContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean dot_helper_sempred(Dot_helperContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lost_lines_sempred(Lost_linesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0222\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3r\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4\177\n\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6\u0087\n\6\3"+
		"\7\3\7\3\7\5\7\u008c\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0099\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a0\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c5\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e1"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00e8\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00f2\n\17\f\17\16\17\u00f5\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00fc\n\20\3\21\3\21\3\21\3\21\3\21\7\21\u0103\n\21\f"+
		"\21\16\21\u0106\13\21\3\22\3\22\3\22\3\22\3\22\5\22\u010d\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u0114\n\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u011c\n\24\f\24\16\24\u011f\13\24\3\25\3\25\3\25\3\25\3\25\7\25\u0126"+
		"\n\25\f\25\16\25\u0129\13\25\3\26\3\26\3\26\3\26\3\26\5\26\u0130\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u013b\n\27\3\30\3\30"+
		"\5\30\u013f\n\30\3\31\3\31\3\31\5\31\u0144\n\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u014d\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\7\35\u0158\n\35\f\35\16\35\u015b\13\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u016a\n\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \5 \u018e\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01a5\n!\3\"\3\"\3\"\5\"\u01aa\n\"\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01bd\n#\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\7&\u01d2\n&\f&\16&\u01d5"+
		"\13&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\5)\u01e2\n)\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\5-\u0208\n-\3.\3.\3.\5.\u020d\n.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u021c\n\61\3\62\3\62"+
		"\3\62\3\62\3\62\2\b\34 &(8J\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\2\2\u0230\2d\3\2\2\2\4"+
		"q\3\2\2\2\6~\3\2\2\2\b\u0080\3\2\2\2\n\u0086\3\2\2\2\f\u008b\3\2\2\2\16"+
		"\u008d\3\2\2\2\20\u0091\3\2\2\2\22\u0098\3\2\2\2\24\u009f\3\2\2\2\26\u00a1"+
		"\3\2\2\2\30\u00c4\3\2\2\2\32\u00e0\3\2\2\2\34\u00e7\3\2\2\2\36\u00fb\3"+
		"\2\2\2 \u00fd\3\2\2\2\"\u010c\3\2\2\2$\u0113\3\2\2\2&\u0115\3\2\2\2(\u0120"+
		"\3\2\2\2*\u012f\3\2\2\2,\u013a\3\2\2\2.\u013e\3\2\2\2\60\u0143\3\2\2\2"+
		"\62\u0145\3\2\2\2\64\u014c\3\2\2\2\66\u014e\3\2\2\28\u0150\3\2\2\2:\u015c"+
		"\3\2\2\2<\u0169\3\2\2\2>\u018d\3\2\2\2@\u01a4\3\2\2\2B\u01a9\3\2\2\2D"+
		"\u01bc\3\2\2\2F\u01be\3\2\2\2H\u01c2\3\2\2\2J\u01cb\3\2\2\2L\u01d6\3\2"+
		"\2\2N\u01da\3\2\2\2P\u01e1\3\2\2\2R\u01e3\3\2\2\2T\u01e7\3\2\2\2V\u01ed"+
		"\3\2\2\2X\u0207\3\2\2\2Z\u020c\3\2\2\2\\\u020e\3\2\2\2^\u0210\3\2\2\2"+
		"`\u021b\3\2\2\2b\u021d\3\2\2\2de\5\4\3\2ef\7\2\2\3f\3\3\2\2\2gr\5\6\4"+
		"\2hi\7!\2\2ij\7\30\2\2jr\5\6\4\2kl\7!\2\2lm\7\30\2\2mn\5\6\4\2no\7\30"+
		"\2\2op\5\4\3\2pr\3\2\2\2qg\3\2\2\2qh\3\2\2\2qk\3\2\2\2r\5\3\2\2\2st\5"+
		"\n\6\2tu\7\30\2\2uv\5\6\4\2v\177\3\2\2\2wx\5\n\6\2xy\5\b\5\2y\177\3\2"+
		"\2\2z{\5\n\6\2{|\7\30\2\2|\177\3\2\2\2}\177\5\n\6\2~s\3\2\2\2~w\3\2\2"+
		"\2~z\3\2\2\2~}\3\2\2\2\177\7\3\2\2\2\u0080\u0081\7\17\2\2\u0081\u0082"+
		"\7\30\2\2\u0082\u0083\5\6\4\2\u0083\t\3\2\2\2\u0084\u0087\5\20\t\2\u0085"+
		"\u0087\5\16\b\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\13\3\2\2"+
		"\2\u0088\u008c\5\22\n\2\u0089\u008c\5D#\2\u008a\u008c\5J&\2\u008b\u0088"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\r\3\2\2\2\u008d"+
		"\u008e\7 \2\2\u008e\u008f\7\30\2\2\u008f\u0090\5\f\7\2\u0090\17\3\2\2"+
		"\2\u0091\u0092\5\f\7\2\u0092\21\3\2\2\2\u0093\u0099\5\24\13\2\u0094\u0095"+
		"\5\24\13\2\u0095\u0096\7\27\2\2\u0096\u0097\5\22\n\2\u0097\u0099\3\2\2"+
		"\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0099\23\3\2\2\2\u009a\u00a0"+
		"\5\30\r\2\u009b\u00a0\5\26\f\2\u009c\u00a0\5\32\16\2\u009d\u00a0\5\36"+
		"\20\2\u009e\u00a0\5Z.\2\u009f\u009a\3\2\2\2\u009f\u009b\3\2\2\2\u009f"+
		"\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\25\3\2\2"+
		"\2\u00a1\u00a2\7\3\2\2\u00a2\u00a3\7\3\2\2\u00a3\u00a4\7\13\2\2\u00a4"+
		"\u00a5\5\34\17\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7\7\4\2\2\u00a7\27\3\2"+
		"\2\2\u00a8\u00a9\5 \21\2\u00a9\u00aa\7\27\2\2\u00aa\u00ab\7\3\2\2\u00ab"+
		"\u00ac\7\13\2\2\u00ac\u00ad\5\36\20\2\u00ad\u00ae\7\4\2\2\u00ae\u00c5"+
		"\3\2\2\2\u00af\u00b0\5 \21\2\u00b0\u00b1\7\3\2\2\u00b1\u00b2\7\13\2\2"+
		"\u00b2\u00b3\5\36\20\2\u00b3\u00b4\7\4\2\2\u00b4\u00c5\3\2\2\2\u00b5\u00b6"+
		"\5 \21\2\u00b6\u00b7\7\27\2\2\u00b7\u00b8\7\3\2\2\u00b8\u00b9\7\13\2\2"+
		"\u00b9\u00ba\5\36\20\2\u00ba\u00bb\7\f\2\2\u00bb\u00bc\7\4\2\2\u00bc\u00c5"+
		"\3\2\2\2\u00bd\u00be\5 \21\2\u00be\u00bf\7\3\2\2\u00bf\u00c0\7\13\2\2"+
		"\u00c0\u00c1\5\36\20\2\u00c1\u00c2\7\f\2\2\u00c2\u00c3\7\4\2\2\u00c3\u00c5"+
		"\3\2\2\2\u00c4\u00a8\3\2\2\2\u00c4\u00af\3\2\2\2\u00c4\u00b5\3\2\2\2\u00c4"+
		"\u00bd\3\2\2\2\u00c5\31\3\2\2\2\u00c6\u00c7\5 \21\2\u00c7\u00c8\7\3\2"+
		"\2\u00c8\u00c9\5\36\20\2\u00c9\u00ca\7\4\2\2\u00ca\u00e1\3\2\2\2\u00cb"+
		"\u00cc\5 \21\2\u00cc\u00cd\7\3\2\2\u00cd\u00ce\5\36\20\2\u00ce\u00cf\7"+
		"\f\2\2\u00cf\u00d0\7\4\2\2\u00d0\u00e1\3\2\2\2\u00d1\u00d2\5 \21\2\u00d2"+
		"\u00d3\7\3\2\2\u00d3\u00d4\7\r\2\2\u00d4\u00d5\7\r\2\2\u00d5\u00d6\7\r"+
		"\2\2\u00d6\u00d7\7\4\2\2\u00d7\u00e1\3\2\2\2\u00d8\u00d9\5 \21\2\u00d9"+
		"\u00da\7\3\2\2\u00da\u00db\7\r\2\2\u00db\u00dc\7\r\2\2\u00dc\u00dd\7\r"+
		"\2\2\u00dd\u00de\7\f\2\2\u00de\u00df\7\4\2\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00c6\3\2\2\2\u00e0\u00cb\3\2\2\2\u00e0\u00d1\3\2\2\2\u00e0\u00d8\3\2"+
		"\2\2\u00e1\33\3\2\2\2\u00e2\u00e3\b\17\1\2\u00e3\u00e4\5 \21\2\u00e4\u00e5"+
		"\7\32\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e8\5 \21\2\u00e7\u00e2\3\2\2\2"+
		"\u00e7\u00e6\3\2\2\2\u00e8\u00f3\3\2\2\2\u00e9\u00ea\f\6\2\2\u00ea\u00eb"+
		"\7\27\2\2\u00eb\u00ec\5 \21\2\u00ec\u00ed\7\32\2\2\u00ed\u00f2\3\2\2\2"+
		"\u00ee\u00ef\f\5\2\2\u00ef\u00f0\7\27\2\2\u00f0\u00f2\5 \21\2\u00f1\u00e9"+
		"\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\35\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\5 \21"+
		"\2\u00f7\u00f8\7\27\2\2\u00f8\u00f9\5\36\20\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00fc\5 \21\2\u00fb\u00f6\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\37\3\2\2"+
		"\2\u00fd\u00fe\b\21\1\2\u00fe\u00ff\5.\30\2\u00ff\u0104\3\2\2\2\u0100"+
		"\u0101\f\4\2\2\u0101\u0103\5.\30\2\u0102\u0100\3\2\2\2\u0103\u0106\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105!\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0107\u010d\5$\23\2\u0108\u0109\5$\23\2\u0109\u010a\7\27\2\2"+
		"\u010a\u010b\5\"\22\2\u010b\u010d\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u0108"+
		"\3\2\2\2\u010d#\3\2\2\2\u010e\u0114\5\30\r\2\u010f\u0114\5\26\f\2\u0110"+
		"\u0114\5\32\16\2\u0111\u0114\5&\24\2\u0112\u0114\5Z.\2\u0113\u010e\3\2"+
		"\2\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114%\3\2\2\2\u0115\u0116\b\24\1\2\u0116\u0117\5(\25\2"+
		"\u0117\u011d\3\2\2\2\u0118\u0119\f\4\2\2\u0119\u011a\7\27\2\2\u011a\u011c"+
		"\5(\25\2\u011b\u0118\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\'\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\b\25\1"+
		"\2\u0121\u0122\5,\27\2\u0122\u0127\3\2\2\2\u0123\u0124\f\4\2\2\u0124\u0126"+
		"\5,\27\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128)\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u0130\5<\37\2"+
		"\u012b\u0130\5> \2\u012c\u0130\5V,\2\u012d\u0130\5F$\2\u012e\u0130\5@"+
		"!\2\u012f\u012a\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u012c\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130+\3\2\2\2\u0131\u013b\5\60\31"+
		"\2\u0132\u013b\5\62\32\2\u0133\u013b\5\66\34\2\u0134\u013b\5:\36\2\u0135"+
		"\u013b\5B\"\2\u0136\u013b\5L\'\2\u0137\u013b\5N(\2\u0138\u013b\5T+\2\u0139"+
		"\u013b\5b\62\2\u013a\u0131\3\2\2\2\u013a\u0132\3\2\2\2\u013a\u0133\3\2"+
		"\2\2\u013a\u0134\3\2\2\2\u013a\u0135\3\2\2\2\u013a\u0136\3\2\2\2\u013a"+
		"\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b-\3\2\2\2"+
		"\u013c\u013f\5*\26\2\u013d\u013f\5,\27\2\u013e\u013c\3\2\2\2\u013e\u013d"+
		"\3\2\2\2\u013f/\3\2\2\2\u0140\u0141\7\23\2\2\u0141\u0144\5\60\31\2\u0142"+
		"\u0144\7\23\2\2\u0143\u0140\3\2\2\2\u0143\u0142\3\2\2\2\u0144\61\3\2\2"+
		"\2\u0145\u0146\5\64\33\2\u0146\63\3\2\2\2\u0147\u0148\7\23\2\2\u0148\u0149"+
		"\7\20\2\2\u0149\u014d\5\64\33\2\u014a\u014b\7\23\2\2\u014b\u014d\7\20"+
		"\2\2\u014c\u0147\3\2\2\2\u014c\u014a\3\2\2\2\u014d\65\3\2\2\2\u014e\u014f"+
		"\58\35\2\u014f\67\3\2\2\2\u0150\u0151\b\35\1\2\u0151\u0152\7\23\2\2\u0152"+
		"\u0153\7\22\2\2\u0153\u0159\3\2\2\2\u0154\u0155\f\4\2\2\u0155\u0156\7"+
		"\23\2\2\u0156\u0158\7\22\2\2\u0157\u0154\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a9\3\2\2\2\u015b\u0159\3\2\2\2"+
		"\u015c\u015d\7\7\2\2\u015d\u015e\5\22\n\2\u015e\u015f\7\b\2\2\u015f;\3"+
		"\2\2\2\u0160\u0161\7\5\2\2\u0161\u0162\5\"\22\2\u0162\u0163\7\6\2\2\u0163"+
		"\u016a\3\2\2\2\u0164\u0165\7\5\2\2\u0165\u0166\5\"\22\2\u0166\u0167\7"+
		"\f\2\2\u0167\u0168\7\6\2\2\u0168\u016a\3\2\2\2\u0169\u0160\3\2\2\2\u0169"+
		"\u0164\3\2\2\2\u016a=\3\2\2\2\u016b\u016c\7\5\2\2\u016c\u016d\5\"\22\2"+
		"\u016d\u016e\7\27\2\2\u016e\u016f\7\r\2\2\u016f\u0170\7\r\2\2\u0170\u0171"+
		"\7\r\2\2\u0171\u0172\7\6\2\2\u0172\u018e\3\2\2\2\u0173\u0174\7\5\2\2\u0174"+
		"\u0175\5\"\22\2\u0175\u0176\7\27\2\2\u0176\u0177\7\r\2\2\u0177\u0178\7"+
		"\27\2\2\u0178\u0179\7\r\2\2\u0179\u017a\7\27\2\2\u017a\u017b\7\r\2\2\u017b"+
		"\u017c\7\6\2\2\u017c\u018e\3\2\2\2\u017d\u017e\7\5\2\2\u017e\u017f\5\""+
		"\22\2\u017f\u0180\7\r\2\2\u0180\u0181\7\r\2\2\u0181\u0182\7\r\2\2\u0182"+
		"\u0183\7\6\2\2\u0183\u018e\3\2\2\2\u0184\u0185\7\5\2\2\u0185\u0186\5\""+
		"\22\2\u0186\u0187\7\r\2\2\u0187\u0188\7\27\2\2\u0188\u0189\7\r\2\2\u0189"+
		"\u018a\7\27\2\2\u018a\u018b\7\r\2\2\u018b\u018c\7\6\2\2\u018c\u018e\3"+
		"\2\2\2\u018d\u016b\3\2\2\2\u018d\u0173\3\2\2\2\u018d\u017d\3\2\2\2\u018d"+
		"\u0184\3\2\2\2\u018e?\3\2\2\2\u018f\u0190\7\5\2\2\u0190\u0191\7\r\2\2"+
		"\u0191\u0192\7\r\2\2\u0192\u0193\7\r\2\2\u0193\u01a5\7\6\2\2\u0194\u0195"+
		"\7\5\2\2\u0195\u0196\7\27\2\2\u0196\u0197\7\r\2\2\u0197\u0198\7\27\2\2"+
		"\u0198\u0199\7\r\2\2\u0199\u019a\7\27\2\2\u019a\u019b\7\r\2\2\u019b\u019c"+
		"\7\27\2\2\u019c\u01a5\7\6\2\2\u019d\u019e\7\5\2\2\u019e\u019f\7\r\2\2"+
		"\u019f\u01a0\7\27\2\2\u01a0\u01a1\7\r\2\2\u01a1\u01a2\7\27\2\2\u01a2\u01a3"+
		"\7\r\2\2\u01a3\u01a5\7\6\2\2\u01a4\u018f\3\2\2\2\u01a4\u0194\3\2\2\2\u01a4"+
		"\u019d\3\2\2\2\u01a5A\3\2\2\2\u01a6\u01a7\7\16\2\2\u01a7\u01aa\5B\"\2"+
		"\u01a8\u01aa\7\16\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aaC\3"+
		"\2\2\2\u01ab\u01ac\7\r\2\2\u01ac\u01ad\7\r\2\2\u01ad\u01ae\7\r\2\2\u01ae"+
		"\u01af\7\r\2\2\u01af\u01b0\7\r\2\2\u01b0\u01bd\7\r\2\2\u01b1\u01b2\7\r"+
		"\2\2\u01b2\u01b3\7\27\2\2\u01b3\u01b4\7\r\2\2\u01b4\u01b5\7\27\2\2\u01b5"+
		"\u01b6\7\r\2\2\u01b6\u01b7\7\27\2\2\u01b7\u01b8\7\r\2\2\u01b8\u01b9\7"+
		"\27\2\2\u01b9\u01ba\7\r\2\2\u01ba\u01bb\7\27\2\2\u01bb\u01bd\7\r\2\2\u01bc"+
		"\u01ab\3\2\2\2\u01bc\u01b1\3\2\2\2\u01bdE\3\2\2\2\u01be\u01bf\7\5\2\2"+
		"\u01bf\u01c0\5X-\2\u01c0\u01c1\7\6\2\2\u01c1G\3\2\2\2\u01c2\u01c3\7\5"+
		"\2\2\u01c3\u01c4\7\r\2\2\u01c4\u01c5\7\r\2\2\u01c5\u01c6\7\r\2\2\u01c6"+
		"\u01c7\7\r\2\2\u01c7\u01c8\7\r\2\2\u01c8\u01c9\7\r\2\2\u01c9\u01ca\7\6"+
		"\2\2\u01caI\3\2\2\2\u01cb\u01cc\b&\1\2\u01cc\u01cd\5H%\2\u01cd\u01d3\3"+
		"\2\2\2\u01ce\u01cf\f\4\2\2\u01cf\u01d0\7\30\2\2\u01d0\u01d2\5H%\2\u01d1"+
		"\u01ce\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4K\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\7\t\2\2\u01d7\u01d8"+
		"\5 \21\2\u01d8\u01d9\7\n\2\2\u01d9M\3\2\2\2\u01da\u01db\5P)\2\u01dbO\3"+
		"\2\2\2\u01dc\u01dd\5R*\2\u01dd\u01de\7\21\2\2\u01de\u01df\7\23\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01e2\5R*\2\u01e1\u01dc\3\2\2\2\u01e1\u01e0\3\2\2"+
		"\2\u01e2Q\3\2\2\2\u01e3\u01e4\7\23\2\2\u01e4\u01e5\7\21\2\2\u01e5\u01e6"+
		"\7\23\2\2\u01e6S\3\2\2\2\u01e7\u01e8\7\3\2\2\u01e8\u01e9\7\3\2\2\u01e9"+
		"\u01ea\5 \21\2\u01ea\u01eb\7\4\2\2\u01eb\u01ec\7\4\2\2\u01ecU\3\2\2\2"+
		"\u01ed\u01ee\7\5\2\2\u01ee\u01ef\7\16\2\2\u01ef\u01f0\7\33\2\2\u01f0\u01f1"+
		"\7\f\2\2\u01f1\u01f2\7\16\2\2\u01f2\u01f3\7\6\2\2\u01f3W\3\2\2\2\u01f4"+
		"\u0208\7\r\2\2\u01f5\u01f6\7\r\2\2\u01f6\u0208\7\r\2\2\u01f7\u01f8\7\r"+
		"\2\2\u01f8\u01f9\7\r\2\2\u01f9\u01fa\7\r\2\2\u01fa\u0208\7\r\2\2\u01fb"+
		"\u01fc\7\r\2\2\u01fc\u01fd\7\r\2\2\u01fd\u01fe\7\r\2\2\u01fe\u01ff\7\r"+
		"\2\2\u01ff\u0208\7\r\2\2\u0200\u0201\7\r\2\2\u0201\u0202\7\r\2\2\u0202"+
		"\u0203\7\r\2\2\u0203\u0204\7\r\2\2\u0204\u0205\7\r\2\2\u0205\u0206\7\r"+
		"\2\2\u0206\u0208\5X-\2\u0207\u01f4\3\2\2\2\u0207\u01f5\3\2\2\2\u0207\u01f7"+
		"\3\2\2\2\u0207\u01fb\3\2\2\2\u0207\u0200\3\2\2\2\u0208Y\3\2\2\2\u0209"+
		"\u020d\5\\/\2\u020a\u020d\5^\60\2\u020b\u020d\5`\61\2\u020c\u0209\3\2"+
		"\2\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d[\3\2\2\2\u020e\u020f"+
		"\7\36\2\2\u020f]\3\2\2\2\u0210\u0211\7\37\2\2\u0211_\3\2\2\2\u0212\u0213"+
		"\7\34\2\2\u0213\u0214\7\13\2\2\u0214\u0215\5\34\17\2\u0215\u0216\7\35"+
		"\2\2\u0216\u021c\3\2\2\2\u0217\u0218\7\3\2\2\u0218\u0219\5\34\17\2\u0219"+
		"\u021a\7\4\2\2\u021a\u021c\3\2\2\2\u021b\u0212\3\2\2\2\u021b\u0217\3\2"+
		"\2\2\u021ca\3\2\2\2\u021d\u021e\7\34\2\2\u021e\u021f\5\60\31\2\u021f\u0220"+
		"\7\35\2\2\u0220c\3\2\2\2#q~\u0086\u008b\u0098\u009f\u00c4\u00e0\u00e7"+
		"\u00f1\u00f3\u00fb\u0104\u010c\u0113\u011d\u0127\u012f\u013a\u013e\u0143"+
		"\u014c\u0159\u0169\u018d\u01a4\u01a9\u01bc\u01d3\u01e1\u0207\u020c\u021b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}