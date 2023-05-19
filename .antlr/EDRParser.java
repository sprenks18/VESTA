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
		LETTER=14, CAPITAL_GREEK=15, LOWER_GREEK=16, SPACE=17, NEWLINE=18, LINE_BREAK=19, 
		PUNCT=20, NUM=21, L_ANGLE=22, R_ANGLE=23, VACAT=24, IANUA=25, PERPENDICULUM=26, 
		COLUMN=27;
	public static final int
		RULE_root = 0, RULE_column = 1, RULE_inscription = 2, RULE_content = 3, 
		RULE_row = 4, RULE_perp = 5, RULE_horz = 6, RULE_line = 7, RULE_term = 8, 
		RULE_figural = 9, RULE_misspell = 10, RULE_abbrev = 11, RULE_desc = 12, 
		RULE_string = 13, RULE_word = 14, RULE_chunk = 15, RULE_normal_chunk = 16, 
		RULE_under_chunk = 17, RULE_under_helper = 18, RULE_dot_chunk = 19, RULE_dot_helper = 20, 
		RULE_erased = 21, RULE_lost_chunk = 22, RULE_gap_unknown = 23, RULE_illegible = 24, 
		RULE_lost_lines_unknown = 25, RULE_lost_chars_known = 26, RULE_lost_line = 27, 
		RULE_lost_lines = 28, RULE_surplus = 29, RULE_joined = 30, RULE_joined_helper = 31, 
		RULE_joined_letters = 32, RULE_symbol = 33, RULE_lost_chars = 34, RULE_dashes = 35, 
		RULE_editorial = 36, RULE_vacat = 37, RULE_ianua = 38, RULE_subaudible = 39, 
		RULE_omitted = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "column", "inscription", "content", "row", "perp", "horz", "line", 
			"term", "figural", "misspell", "abbrev", "desc", "string", "word", "chunk", 
			"normal_chunk", "under_chunk", "under_helper", "dot_chunk", "dot_helper", 
			"erased", "lost_chunk", "gap_unknown", "illegible", "lost_lines_unknown", 
			"lost_chars_known", "lost_line", "lost_lines", "surplus", "joined", "joined_helper", 
			"joined_letters", "symbol", "lost_chars", "dashes", "editorial", "vacat", 
			"ianua", "subaudible", "omitted"
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
			"LETTER", "CAPITAL_GREEK", "LOWER_GREEK", "SPACE", "NEWLINE", "LINE_BREAK", 
			"PUNCT", "NUM", "L_ANGLE", "R_ANGLE", "VACAT", "IANUA", "PERPENDICULUM", 
			"COLUMN"
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
			setState(82);
			column();
			setState(83);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				inscription();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(COLUMN);
				setState(87);
				match(NEWLINE);
				setState(88);
				inscription();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(COLUMN);
				setState(90);
				match(NEWLINE);
				setState(91);
				inscription();
				setState(92);
				match(NEWLINE);
				setState(93);
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
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
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
		enterRule(_localctx, 4, RULE_inscription);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				content();
				setState(98);
				match(NEWLINE);
				setState(99);
				inscription();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				content();
				setState(102);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
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
		enterRule(_localctx, 6, RULE_content);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PAREN:
			case L_BRACKET:
			case L_CURLY:
			case DASH:
			case PLUS:
			case LETTER:
			case L_ANGLE:
			case VACAT:
			case IANUA:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				horz();
				}
				break;
			case PERPENDICULUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
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
		enterRule(_localctx, 8, RULE_row);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				lost_lines_unknown();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
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
		enterRule(_localctx, 10, RULE_perp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(PERPENDICULUM);
			setState(117);
			match(NEWLINE);
			setState(118);
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
		enterRule(_localctx, 12, RULE_horz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
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
		enterRule(_localctx, 14, RULE_line);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				term();
				setState(124);
				match(SPACE);
				setState(125);
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
		enterRule(_localctx, 16, RULE_term);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				misspell();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				figural();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				abbrev();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				string();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
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
		enterRule(_localctx, 18, RULE_figural);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(L_PAREN);
			setState(137);
			match(L_PAREN);
			setState(138);
			match(COLON);
			setState(139);
			desc(0);
			setState(140);
			match(R_PAREN);
			setState(141);
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
		enterRule(_localctx, 20, RULE_misspell);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Normal_misspellContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				word(0);
				setState(144);
				match(SPACE);
				setState(145);
				match(L_PAREN);
				setState(146);
				match(COLON);
				setState(147);
				string();
				setState(148);
				match(R_PAREN);
				}
				break;
			case 2:
				_localctx = new No_space_misspellContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				word(0);
				setState(151);
				match(L_PAREN);
				setState(152);
				match(COLON);
				setState(153);
				string();
				setState(154);
				match(R_PAREN);
				}
				break;
			case 3:
				_localctx = new Unsure_misspellContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				word(0);
				setState(157);
				match(SPACE);
				setState(158);
				match(L_PAREN);
				setState(159);
				match(COLON);
				setState(160);
				string();
				setState(161);
				match(QUESTION);
				setState(162);
				match(R_PAREN);
				}
				break;
			case 4:
				_localctx = new Unsure_no_space_misspellContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				word(0);
				setState(165);
				match(L_PAREN);
				setState(166);
				match(COLON);
				setState(167);
				string();
				setState(168);
				match(QUESTION);
				setState(169);
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
		enterRule(_localctx, 22, RULE_abbrev);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Normal_abbrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				word(0);
				setState(174);
				match(L_PAREN);
				setState(175);
				string();
				setState(176);
				match(R_PAREN);
				}
				break;
			case 2:
				_localctx = new Uncertain_abbrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				word(0);
				setState(179);
				match(L_PAREN);
				setState(180);
				string();
				setState(181);
				match(QUESTION);
				setState(182);
				match(R_PAREN);
				}
				break;
			case 3:
				_localctx = new Unknown_abbr1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				word(0);
				setState(185);
				match(L_PAREN);
				setState(186);
				match(DASH);
				setState(187);
				match(DASH);
				setState(188);
				match(DASH);
				setState(189);
				match(R_PAREN);
				}
				break;
			case 4:
				_localctx = new Unknown_abbr2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				word(0);
				setState(192);
				match(L_PAREN);
				setState(193);
				match(DASH);
				setState(194);
				match(DASH);
				setState(195);
				match(DASH);
				setState(196);
				match(QUESTION);
				setState(197);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_desc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(202);
				word(0);
				setState(203);
				match(PUNCT);
				}
				break;
			case 2:
				{
				setState(205);
				word(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(208);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(209);
						match(SPACE);
						setState(210);
						word(0);
						setState(211);
						match(PUNCT);
						}
						break;
					case 2:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(213);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(214);
						match(SPACE);
						setState(215);
						word(0);
						}
						break;
					}
					} 
				}
				setState(220);
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
		enterRule(_localctx, 26, RULE_string);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				word(0);
				setState(222);
				match(SPACE);
				setState(223);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_word, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(229);
			chunk();
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
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
					setState(231);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(232);
					chunk();
					}
					} 
				}
				setState(237);
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
		enterRule(_localctx, 30, RULE_chunk);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				under_chunk();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				dot_chunk();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				erased();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				lost_chunk();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				gap_unknown();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				illegible();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(245);
				surplus();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(246);
				joined();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(247);
				symbol();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(248);
				lost_chars();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(249);
				lost_chars_known();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(250);
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
		enterRule(_localctx, 32, RULE_normal_chunk);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(LETTER);
				setState(254);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
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
		enterRule(_localctx, 34, RULE_under_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		enterRule(_localctx, 36, RULE_under_helper);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(LETTER);
				setState(261);
				match(UNDERLINE);
				setState(262);
				under_helper();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(LETTER);
				setState(264);
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
		enterRule(_localctx, 38, RULE_dot_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_dot_helper, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(270);
			match(LETTER);
			setState(271);
			match(DOT);
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
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
					setState(273);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(274);
					match(LETTER);
					setState(275);
					match(DOT);
					}
					} 
				}
				setState(280);
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
		enterRule(_localctx, 42, RULE_erased);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(L_BRACKET);
			setState(282);
			match(L_BRACKET);
			setState(283);
			line();
			setState(284);
			match(R_BRACKET);
			setState(285);
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
		enterRule(_localctx, 44, RULE_lost_chunk);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(L_BRACKET);
				setState(288);
				line();
				setState(289);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(L_BRACKET);
				setState(292);
				line();
				setState(293);
				match(QUESTION);
				setState(294);
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
		enterRule(_localctx, 46, RULE_gap_unknown);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(L_BRACKET);
				setState(299);
				match(DASH);
				setState(300);
				match(DASH);
				setState(301);
				match(DASH);
				setState(302);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(L_BRACKET);
				setState(304);
				match(SPACE);
				setState(305);
				match(DASH);
				setState(306);
				match(SPACE);
				setState(307);
				match(DASH);
				setState(308);
				match(SPACE);
				setState(309);
				match(DASH);
				setState(310);
				match(SPACE);
				setState(311);
				match(R_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				match(L_BRACKET);
				setState(313);
				match(DASH);
				setState(314);
				match(SPACE);
				setState(315);
				match(DASH);
				setState(316);
				match(SPACE);
				setState(317);
				match(DASH);
				setState(318);
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
		enterRule(_localctx, 48, RULE_illegible);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(PLUS);
				setState(322);
				illegible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
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
		enterRule(_localctx, 50, RULE_lost_lines_unknown);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(DASH);
				setState(327);
				match(DASH);
				setState(328);
				match(DASH);
				setState(329);
				match(DASH);
				setState(330);
				match(DASH);
				setState(331);
				match(DASH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(DASH);
				setState(333);
				match(SPACE);
				setState(334);
				match(DASH);
				setState(335);
				match(SPACE);
				setState(336);
				match(DASH);
				setState(337);
				match(SPACE);
				setState(338);
				match(DASH);
				setState(339);
				match(SPACE);
				setState(340);
				match(DASH);
				setState(341);
				match(SPACE);
				setState(342);
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
		enterRule(_localctx, 52, RULE_lost_chars_known);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(L_BRACKET);
			setState(346);
			dashes();
			setState(347);
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
		enterRule(_localctx, 54, RULE_lost_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(L_BRACKET);
			setState(350);
			match(DASH);
			setState(351);
			match(DASH);
			setState(352);
			match(DASH);
			setState(353);
			match(DASH);
			setState(354);
			match(DASH);
			setState(355);
			match(DASH);
			setState(356);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_lost_lines, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(359);
			lost_line();
			}
			_ctx.stop = _input.LT(-1);
			setState(366);
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
					setState(361);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(362);
					match(NEWLINE);
					setState(363);
					lost_line();
					}
					} 
				}
				setState(368);
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
		enterRule(_localctx, 58, RULE_surplus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(L_CURLY);
			setState(370);
			word(0);
			setState(371);
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
		enterRule(_localctx, 60, RULE_joined);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
		enterRule(_localctx, 62, RULE_joined_helper);
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				joined_letters();
				setState(376);
				match(CIRCUMFLEX);
				setState(377);
				match(LETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
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
		enterRule(_localctx, 64, RULE_joined_letters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(LETTER);
			setState(383);
			match(CIRCUMFLEX);
			setState(384);
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
		enterRule(_localctx, 66, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(L_PAREN);
			setState(387);
			match(L_PAREN);
			setState(388);
			word(0);
			setState(389);
			match(R_PAREN);
			setState(390);
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
		enterRule(_localctx, 68, RULE_lost_chars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(L_BRACKET);
			setState(393);
			match(PLUS);
			setState(394);
			match(NUM);
			setState(395);
			match(QUESTION);
			setState(396);
			match(PLUS);
			setState(397);
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
		enterRule(_localctx, 70, RULE_dashes);
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(DASH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(DASH);
				setState(401);
				match(DASH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				match(DASH);
				setState(403);
				match(DASH);
				setState(404);
				match(DASH);
				setState(405);
				match(DASH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				match(DASH);
				setState(407);
				match(DASH);
				setState(408);
				match(DASH);
				setState(409);
				match(DASH);
				setState(410);
				match(DASH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(411);
				match(DASH);
				setState(412);
				match(DASH);
				setState(413);
				match(DASH);
				setState(414);
				match(DASH);
				setState(415);
				match(DASH);
				setState(416);
				match(DASH);
				setState(417);
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
		enterRule(_localctx, 72, RULE_editorial);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VACAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				vacat();
				}
				break;
			case IANUA:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				ianua();
				}
				break;
			case L_PAREN:
			case L_ANGLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
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
		enterRule(_localctx, 74, RULE_vacat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
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
		enterRule(_localctx, 76, RULE_ianua);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
		enterRule(_localctx, 78, RULE_subaudible);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(L_ANGLE);
				setState(430);
				match(COLON);
				setState(431);
				normal_chunk();
				setState(432);
				match(R_ANGLE);
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(L_PAREN);
				setState(435);
				normal_chunk();
				setState(436);
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
		enterRule(_localctx, 80, RULE_omitted);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(L_ANGLE);
			setState(441);
			normal_chunk();
			setState(442);
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
		case 12:
			return desc_sempred((DescContext)_localctx, predIndex);
		case 14:
			return word_sempred((WordContext)_localctx, predIndex);
		case 20:
			return dot_helper_sempred((Dot_helperContext)_localctx, predIndex);
		case 28:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u01bf\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3b\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\5\5p\n\5\3\6\3\6\3\6\5\6u\n\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0089\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ae\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00ca\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00d1\n\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\7\16\u00db\n\16\f\16\16\16\u00de\13\16\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00e5\n\17\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00ec\n\20\f\20\16\20\u00ef\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00fe\n\21\3\22\3\22\3\22\5\22\u0103"+
		"\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u010c\n\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0117\n\26\f\26\16\26\u011a\13\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u012b\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0142\n\31"+
		"\3\32\3\32\3\32\5\32\u0147\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u015a\n\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\7\36\u016f\n\36\f\36\16\36\u0172\13\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3!\3!\3!\5!\u017f\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\5%\u01a5\n%\3&\3&\3&\5&\u01aa\n&\3\'\3\'\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u01b9\n)\3*\3*\3*\3*\3*\2\6\32\36*:+\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\2\2\u01c9"+
		"\2T\3\2\2\2\4a\3\2\2\2\6k\3\2\2\2\bo\3\2\2\2\nt\3\2\2\2\fv\3\2\2\2\16"+
		"z\3\2\2\2\20\u0081\3\2\2\2\22\u0088\3\2\2\2\24\u008a\3\2\2\2\26\u00ad"+
		"\3\2\2\2\30\u00c9\3\2\2\2\32\u00d0\3\2\2\2\34\u00e4\3\2\2\2\36\u00e6\3"+
		"\2\2\2 \u00fd\3\2\2\2\"\u0102\3\2\2\2$\u0104\3\2\2\2&\u010b\3\2\2\2(\u010d"+
		"\3\2\2\2*\u010f\3\2\2\2,\u011b\3\2\2\2.\u012a\3\2\2\2\60\u0141\3\2\2\2"+
		"\62\u0146\3\2\2\2\64\u0159\3\2\2\2\66\u015b\3\2\2\28\u015f\3\2\2\2:\u0168"+
		"\3\2\2\2<\u0173\3\2\2\2>\u0177\3\2\2\2@\u017e\3\2\2\2B\u0180\3\2\2\2D"+
		"\u0184\3\2\2\2F\u018a\3\2\2\2H\u01a4\3\2\2\2J\u01a9\3\2\2\2L\u01ab\3\2"+
		"\2\2N\u01ad\3\2\2\2P\u01b8\3\2\2\2R\u01ba\3\2\2\2TU\5\4\3\2UV\7\2\2\3"+
		"V\3\3\2\2\2Wb\5\6\4\2XY\7\35\2\2YZ\7\24\2\2Zb\5\6\4\2[\\\7\35\2\2\\]\7"+
		"\24\2\2]^\5\6\4\2^_\7\24\2\2_`\5\4\3\2`b\3\2\2\2aW\3\2\2\2aX\3\2\2\2a"+
		"[\3\2\2\2b\5\3\2\2\2cd\5\b\5\2de\7\24\2\2ef\5\6\4\2fl\3\2\2\2gh\5\b\5"+
		"\2hi\7\24\2\2il\3\2\2\2jl\5\b\5\2kc\3\2\2\2kg\3\2\2\2kj\3\2\2\2l\7\3\2"+
		"\2\2mp\5\16\b\2np\5\f\7\2om\3\2\2\2on\3\2\2\2p\t\3\2\2\2qu\5\20\t\2ru"+
		"\5\64\33\2su\5:\36\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\13\3\2\2\2vw\7\34"+
		"\2\2wx\7\24\2\2xy\5\n\6\2y\r\3\2\2\2z{\5\n\6\2{\17\3\2\2\2|\u0082\5\22"+
		"\n\2}~\5\22\n\2~\177\7\23\2\2\177\u0080\5\20\t\2\u0080\u0082\3\2\2\2\u0081"+
		"|\3\2\2\2\u0081}\3\2\2\2\u0082\21\3\2\2\2\u0083\u0089\5\26\f\2\u0084\u0089"+
		"\5\24\13\2\u0085\u0089\5\30\r\2\u0086\u0089\5\34\17\2\u0087\u0089\5J&"+
		"\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0087\3\2\2\2\u0089\23\3\2\2\2\u008a\u008b\7\3\2\2\u008b"+
		"\u008c\7\3\2\2\u008c\u008d\7\t\2\2\u008d\u008e\5\32\16\2\u008e\u008f\7"+
		"\4\2\2\u008f\u0090\7\4\2\2\u0090\25\3\2\2\2\u0091\u0092\5\36\20\2\u0092"+
		"\u0093\7\23\2\2\u0093\u0094\7\3\2\2\u0094\u0095\7\t\2\2\u0095\u0096\5"+
		"\34\17\2\u0096\u0097\7\4\2\2\u0097\u00ae\3\2\2\2\u0098\u0099\5\36\20\2"+
		"\u0099\u009a\7\3\2\2\u009a\u009b\7\t\2\2\u009b\u009c\5\34\17\2\u009c\u009d"+
		"\7\4\2\2\u009d\u00ae\3\2\2\2\u009e\u009f\5\36\20\2\u009f\u00a0\7\23\2"+
		"\2\u00a0\u00a1\7\3\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\5\34\17\2\u00a3"+
		"\u00a4\7\n\2\2\u00a4\u00a5\7\4\2\2\u00a5\u00ae\3\2\2\2\u00a6\u00a7\5\36"+
		"\20\2\u00a7\u00a8\7\3\2\2\u00a8\u00a9\7\t\2\2\u00a9\u00aa\5\34\17\2\u00aa"+
		"\u00ab\7\n\2\2\u00ab\u00ac\7\4\2\2\u00ac\u00ae\3\2\2\2\u00ad\u0091\3\2"+
		"\2\2\u00ad\u0098\3\2\2\2\u00ad\u009e\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ae"+
		"\27\3\2\2\2\u00af\u00b0\5\36\20\2\u00b0\u00b1\7\3\2\2\u00b1\u00b2\5\34"+
		"\17\2\u00b2\u00b3\7\4\2\2\u00b3\u00ca\3\2\2\2\u00b4\u00b5\5\36\20\2\u00b5"+
		"\u00b6\7\3\2\2\u00b6\u00b7\5\34\17\2\u00b7\u00b8\7\n\2\2\u00b8\u00b9\7"+
		"\4\2\2\u00b9\u00ca\3\2\2\2\u00ba\u00bb\5\36\20\2\u00bb\u00bc\7\3\2\2\u00bc"+
		"\u00bd\7\13\2\2\u00bd\u00be\7\13\2\2\u00be\u00bf\7\13\2\2\u00bf\u00c0"+
		"\7\4\2\2\u00c0\u00ca\3\2\2\2\u00c1\u00c2\5\36\20\2\u00c2\u00c3\7\3\2\2"+
		"\u00c3\u00c4\7\13\2\2\u00c4\u00c5\7\13\2\2\u00c5\u00c6\7\13\2\2\u00c6"+
		"\u00c7\7\n\2\2\u00c7\u00c8\7\4\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00af\3\2"+
		"\2\2\u00c9\u00b4\3\2\2\2\u00c9\u00ba\3\2\2\2\u00c9\u00c1\3\2\2\2\u00ca"+
		"\31\3\2\2\2\u00cb\u00cc\b\16\1\2\u00cc\u00cd\5\36\20\2\u00cd\u00ce\7\26"+
		"\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00d1\5\36\20\2\u00d0\u00cb\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00dc\3\2\2\2\u00d2\u00d3\f\6\2\2\u00d3\u00d4\7\23"+
		"\2\2\u00d4\u00d5\5\36\20\2\u00d5\u00d6\7\26\2\2\u00d6\u00db\3\2\2\2\u00d7"+
		"\u00d8\f\5\2\2\u00d8\u00d9\7\23\2\2\u00d9\u00db\5\36\20\2\u00da\u00d2"+
		"\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\33\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\5\36\20"+
		"\2\u00e0\u00e1\7\23\2\2\u00e1\u00e2\5\34\17\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e5\5\36\20\2\u00e4\u00df\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\35\3\2"+
		"\2\2\u00e6\u00e7\b\20\1\2\u00e7\u00e8\5 \21\2\u00e8\u00ed\3\2\2\2\u00e9"+
		"\u00ea\f\4\2\2\u00ea\u00ec\5 \21\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\37\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00f0\u00fe\5\"\22\2\u00f1\u00fe\5$\23\2\u00f2\u00fe\5(\25\2"+
		"\u00f3\u00fe\5,\27\2\u00f4\u00fe\5.\30\2\u00f5\u00fe\5\60\31\2\u00f6\u00fe"+
		"\5\62\32\2\u00f7\u00fe\5<\37\2\u00f8\u00fe\5> \2\u00f9\u00fe\5D#\2\u00fa"+
		"\u00fe\5F$\2\u00fb\u00fe\5\66\34\2\u00fc\u00fe\5R*\2\u00fd\u00f0\3\2\2"+
		"\2\u00fd\u00f1\3\2\2\2\u00fd\u00f2\3\2\2\2\u00fd\u00f3\3\2\2\2\u00fd\u00f4"+
		"\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd"+
		"\u00f8\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fc\3\2\2\2\u00fe!\3\2\2\2\u00ff\u0100\7\20\2\2\u0100\u0103"+
		"\5\"\22\2\u0101\u0103\7\20\2\2\u0102\u00ff\3\2\2\2\u0102\u0101\3\2\2\2"+
		"\u0103#\3\2\2\2\u0104\u0105\5&\24\2\u0105%\3\2\2\2\u0106\u0107\7\20\2"+
		"\2\u0107\u0108\7\r\2\2\u0108\u010c\5&\24\2\u0109\u010a\7\20\2\2\u010a"+
		"\u010c\7\r\2\2\u010b\u0106\3\2\2\2\u010b\u0109\3\2\2\2\u010c\'\3\2\2\2"+
		"\u010d\u010e\5*\26\2\u010e)\3\2\2\2\u010f\u0110\b\26\1\2\u0110\u0111\7"+
		"\20\2\2\u0111\u0112\7\17\2\2\u0112\u0118\3\2\2\2\u0113\u0114\f\4\2\2\u0114"+
		"\u0115\7\20\2\2\u0115\u0117\7\17\2\2\u0116\u0113\3\2\2\2\u0117\u011a\3"+
		"\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119+\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011b\u011c\7\5\2\2\u011c\u011d\7\5\2\2\u011d\u011e\5\20\t\2"+
		"\u011e\u011f\7\6\2\2\u011f\u0120\7\6\2\2\u0120-\3\2\2\2\u0121\u0122\7"+
		"\5\2\2\u0122\u0123\5\20\t\2\u0123\u0124\7\6\2\2\u0124\u012b\3\2\2\2\u0125"+
		"\u0126\7\5\2\2\u0126\u0127\5\20\t\2\u0127\u0128\7\n\2\2\u0128\u0129\7"+
		"\6\2\2\u0129\u012b\3\2\2\2\u012a\u0121\3\2\2\2\u012a\u0125\3\2\2\2\u012b"+
		"/\3\2\2\2\u012c\u012d\7\5\2\2\u012d\u012e\7\13\2\2\u012e\u012f\7\13\2"+
		"\2\u012f\u0130\7\13\2\2\u0130\u0142\7\6\2\2\u0131\u0132\7\5\2\2\u0132"+
		"\u0133\7\23\2\2\u0133\u0134\7\13\2\2\u0134\u0135\7\23\2\2\u0135\u0136"+
		"\7\13\2\2\u0136\u0137\7\23\2\2\u0137\u0138\7\13\2\2\u0138\u0139\7\23\2"+
		"\2\u0139\u0142\7\6\2\2\u013a\u013b\7\5\2\2\u013b\u013c\7\13\2\2\u013c"+
		"\u013d\7\23\2\2\u013d\u013e\7\13\2\2\u013e\u013f\7\23\2\2\u013f\u0140"+
		"\7\13\2\2\u0140\u0142\7\6\2\2\u0141\u012c\3\2\2\2\u0141\u0131\3\2\2\2"+
		"\u0141\u013a\3\2\2\2\u0142\61\3\2\2\2\u0143\u0144\7\f\2\2\u0144\u0147"+
		"\5\62\32\2\u0145\u0147\7\f\2\2\u0146\u0143\3\2\2\2\u0146\u0145\3\2\2\2"+
		"\u0147\63\3\2\2\2\u0148\u0149\7\13\2\2\u0149\u014a\7\13\2\2\u014a\u014b"+
		"\7\13\2\2\u014b\u014c\7\13\2\2\u014c\u014d\7\13\2\2\u014d\u015a\7\13\2"+
		"\2\u014e\u014f\7\13\2\2\u014f\u0150\7\23\2\2\u0150\u0151\7\13\2\2\u0151"+
		"\u0152\7\23\2\2\u0152\u0153\7\13\2\2\u0153\u0154\7\23\2\2\u0154\u0155"+
		"\7\13\2\2\u0155\u0156\7\23\2\2\u0156\u0157\7\13\2\2\u0157\u0158\7\23\2"+
		"\2\u0158\u015a\7\13\2\2\u0159\u0148\3\2\2\2\u0159\u014e\3\2\2\2\u015a"+
		"\65\3\2\2\2\u015b\u015c\7\5\2\2\u015c\u015d\5H%\2\u015d\u015e\7\6\2\2"+
		"\u015e\67\3\2\2\2\u015f\u0160\7\5\2\2\u0160\u0161\7\13\2\2\u0161\u0162"+
		"\7\13\2\2\u0162\u0163\7\13\2\2\u0163\u0164\7\13\2\2\u0164\u0165\7\13\2"+
		"\2\u0165\u0166\7\13\2\2\u0166\u0167\7\6\2\2\u01679\3\2\2\2\u0168\u0169"+
		"\b\36\1\2\u0169\u016a\58\35\2\u016a\u0170\3\2\2\2\u016b\u016c\f\4\2\2"+
		"\u016c\u016d\7\24\2\2\u016d\u016f\58\35\2\u016e\u016b\3\2\2\2\u016f\u0172"+
		"\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171;\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0173\u0174\7\7\2\2\u0174\u0175\5\36\20\2\u0175\u0176\7"+
		"\b\2\2\u0176=\3\2\2\2\u0177\u0178\5@!\2\u0178?\3\2\2\2\u0179\u017a\5B"+
		"\"\2\u017a\u017b\7\16\2\2\u017b\u017c\7\20\2\2\u017c\u017f\3\2\2\2\u017d"+
		"\u017f\5B\"\2\u017e\u0179\3\2\2\2\u017e\u017d\3\2\2\2\u017fA\3\2\2\2\u0180"+
		"\u0181\7\20\2\2\u0181\u0182\7\16\2\2\u0182\u0183\7\20\2\2\u0183C\3\2\2"+
		"\2\u0184\u0185\7\3\2\2\u0185\u0186\7\3\2\2\u0186\u0187\5\36\20\2\u0187"+
		"\u0188\7\4\2\2\u0188\u0189\7\4\2\2\u0189E\3\2\2\2\u018a\u018b\7\5\2\2"+
		"\u018b\u018c\7\f\2\2\u018c\u018d\7\27\2\2\u018d\u018e\7\n\2\2\u018e\u018f"+
		"\7\f\2\2\u018f\u0190\7\6\2\2\u0190G\3\2\2\2\u0191\u01a5\7\13\2\2\u0192"+
		"\u0193\7\13\2\2\u0193\u01a5\7\13\2\2\u0194\u0195\7\13\2\2\u0195\u0196"+
		"\7\13\2\2\u0196\u0197\7\13\2\2\u0197\u01a5\7\13\2\2\u0198\u0199\7\13\2"+
		"\2\u0199\u019a\7\13\2\2\u019a\u019b\7\13\2\2\u019b\u019c\7\13\2\2\u019c"+
		"\u01a5\7\13\2\2\u019d\u019e\7\13\2\2\u019e\u019f\7\13\2\2\u019f\u01a0"+
		"\7\13\2\2\u01a0\u01a1\7\13\2\2\u01a1\u01a2\7\13\2\2\u01a2\u01a3\7\13\2"+
		"\2\u01a3\u01a5\5H%\2\u01a4\u0191\3\2\2\2\u01a4\u0192\3\2\2\2\u01a4\u0194"+
		"\3\2\2\2\u01a4\u0198\3\2\2\2\u01a4\u019d\3\2\2\2\u01a5I\3\2\2\2\u01a6"+
		"\u01aa\5L\'\2\u01a7\u01aa\5N(\2\u01a8\u01aa\5P)\2\u01a9\u01a6\3\2\2\2"+
		"\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aaK\3\2\2\2\u01ab\u01ac\7"+
		"\32\2\2\u01acM\3\2\2\2\u01ad\u01ae\7\33\2\2\u01aeO\3\2\2\2\u01af\u01b0"+
		"\7\30\2\2\u01b0\u01b1\7\t\2\2\u01b1\u01b2\5\"\22\2\u01b2\u01b3\7\31\2"+
		"\2\u01b3\u01b9\3\2\2\2\u01b4\u01b5\7\3\2\2\u01b5\u01b6\5\"\22\2\u01b6"+
		"\u01b7\7\4\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01af\3\2\2\2\u01b8\u01b4\3\2"+
		"\2\2\u01b9Q\3\2\2\2\u01ba\u01bb\7\30\2\2\u01bb\u01bc\5\"\22\2\u01bc\u01bd"+
		"\7\31\2\2\u01bdS\3\2\2\2\34akot\u0081\u0088\u00ad\u00c9\u00d0\u00da\u00dc"+
		"\u00e4\u00ed\u00fd\u0102\u010b\u0118\u012a\u0141\u0146\u0159\u0170\u017e"+
		"\u01a4\u01a9\u01b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}