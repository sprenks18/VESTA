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
		VACAT=21, IANUA=22, PERPENDICULUM=23, COLUMN=24;
	public static final int
		RULE_root = 0, RULE_column = 1, RULE_inscription = 2, RULE_row = 3, RULE_perp = 4, 
		RULE_line = 5, RULE_term = 6, RULE_figural = 7, RULE_misspell = 8, RULE_abbrev = 9, 
		RULE_desc = 10, RULE_string = 11, RULE_word = 12, RULE_chunk = 13, RULE_normal_chunk = 14, 
		RULE_under_chunk = 15, RULE_under_helper = 16, RULE_dot_chunk = 17, RULE_dot_helper = 18, 
		RULE_erased = 19, RULE_lost_chunk = 20, RULE_gap_unknown = 21, RULE_illegible = 22, 
		RULE_lost_lines_unknown = 23, RULE_lost_chars_known = 24, RULE_lost_line = 25, 
		RULE_lost_lines = 26, RULE_surplus = 27, RULE_joined = 28, RULE_joined_helper = 29, 
		RULE_joined_letters = 30, RULE_symbol = 31, RULE_lost_chars = 32, RULE_dashes = 33, 
		RULE_editorial = 34, RULE_vacat = 35, RULE_ianua = 36, RULE_subaudible = 37, 
		RULE_omitted = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "column", "inscription", "row", "perp", "line", "term", "figural", 
			"misspell", "abbrev", "desc", "string", "word", "chunk", "normal_chunk", 
			"under_chunk", "under_helper", "dot_chunk", "dot_helper", "erased", "lost_chunk", 
			"gap_unknown", "illegible", "lost_lines_unknown", "lost_chars_known", 
			"lost_line", "lost_lines", "surplus", "joined", "joined_helper", "joined_letters", 
			"symbol", "lost_chars", "dashes", "editorial", "vacat", "ianua", "subaudible", 
			"omitted"
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
			"IANUA", "PERPENDICULUM", "COLUMN"
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
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			setState(84);
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
			case PERPENDICULUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				inscription();
				setState(79);
				match(EOF);
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				column();
				setState(82);
				match(EOF);
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(EDRParser.COLUMN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(EDRParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(EDRParser.NEWLINE, i);
		}
		public InscriptionContext inscription() {
			return getRuleContext(InscriptionContext.class,0);
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
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(COLUMN);
				setState(87);
				match(NEWLINE);
				setState(88);
				inscription();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
		public InscriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inscription; }
	 
		public InscriptionContext() { }
		public void copyFrom(InscriptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Inscription5Context extends InscriptionContext {
		public PerpContext perp() {
			return getRuleContext(PerpContext.class,0);
		}
		public Inscription5Context(InscriptionContext ctx) { copyFrom(ctx); }
	}
	public static class Inscription4Context extends InscriptionContext {
		public PerpContext perp() {
			return getRuleContext(PerpContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(EDRParser.NEWLINE, 0); }
		public InscriptionContext inscription() {
			return getRuleContext(InscriptionContext.class,0);
		}
		public Inscription4Context(InscriptionContext ctx) { copyFrom(ctx); }
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
		enterRule(_localctx, 4, RULE_inscription);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Inscription1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				row();
				setState(98);
				match(NEWLINE);
				setState(99);
				inscription();
				}
				break;
			case 2:
				_localctx = new Inscription2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				row();
				}
				break;
			case 3:
				_localctx = new Inscription3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				row();
				setState(103);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new Inscription4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				perp();
				setState(106);
				match(NEWLINE);
				setState(107);
				inscription();
				}
				break;
			case 5:
				_localctx = new Inscription5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				perp();
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
		enterRule(_localctx, 6, RULE_row);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				lost_lines_unknown();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
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
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public PerpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perp; }
	}

	public final PerpContext perp() throws RecognitionException {
		PerpContext _localctx = new PerpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_perp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(PERPENDICULUM);
			setState(118);
			match(NEWLINE);
			setState(119);
			line();
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
		enterRule(_localctx, 10, RULE_line);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				term();
				setState(123);
				match(SPACE);
				setState(124);
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
		enterRule(_localctx, 12, RULE_term);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				misspell();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				figural();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				abbrev();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				string();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
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
		enterRule(_localctx, 14, RULE_figural);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(L_PAREN);
			setState(136);
			match(L_PAREN);
			setState(137);
			match(COLON);
			setState(138);
			desc(0);
			setState(139);
			match(R_PAREN);
			setState(140);
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
		enterRule(_localctx, 16, RULE_misspell);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Normal_misspellContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				word(0);
				setState(143);
				match(SPACE);
				setState(144);
				match(L_PAREN);
				setState(145);
				match(COLON);
				setState(146);
				string();
				setState(147);
				match(R_PAREN);
				}
				break;
			case 2:
				_localctx = new No_space_misspellContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				word(0);
				setState(150);
				match(L_PAREN);
				setState(151);
				match(COLON);
				setState(152);
				string();
				setState(153);
				match(R_PAREN);
				}
				break;
			case 3:
				_localctx = new Unsure_misspellContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				word(0);
				setState(156);
				match(SPACE);
				setState(157);
				match(L_PAREN);
				setState(158);
				match(COLON);
				setState(159);
				string();
				setState(160);
				match(QUESTION);
				setState(161);
				match(R_PAREN);
				}
				break;
			case 4:
				_localctx = new Unsure_no_space_misspellContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				word(0);
				setState(164);
				match(L_PAREN);
				setState(165);
				match(COLON);
				setState(166);
				string();
				setState(167);
				match(QUESTION);
				setState(168);
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
		enterRule(_localctx, 18, RULE_abbrev);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Normal_abbrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				word(0);
				setState(173);
				match(L_PAREN);
				setState(174);
				string();
				setState(175);
				match(R_PAREN);
				}
				break;
			case 2:
				_localctx = new Uncertain_abbrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				word(0);
				setState(178);
				match(L_PAREN);
				setState(179);
				string();
				setState(180);
				match(QUESTION);
				setState(181);
				match(R_PAREN);
				}
				break;
			case 3:
				_localctx = new Unknown_abbr1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				word(0);
				setState(184);
				match(L_PAREN);
				setState(185);
				match(DASH);
				setState(186);
				match(DASH);
				setState(187);
				match(DASH);
				setState(188);
				match(R_PAREN);
				}
				break;
			case 4:
				_localctx = new Unknown_abbr2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				word(0);
				setState(191);
				match(L_PAREN);
				setState(192);
				match(DASH);
				setState(193);
				match(DASH);
				setState(194);
				match(DASH);
				setState(195);
				match(QUESTION);
				setState(196);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_desc, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(201);
				word(0);
				setState(202);
				match(PUNCT);
				}
				break;
			case 2:
				{
				setState(204);
				word(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(207);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(208);
						match(SPACE);
						setState(209);
						word(0);
						setState(210);
						match(PUNCT);
						}
						break;
					case 2:
						{
						_localctx = new DescContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_desc);
						setState(212);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(213);
						match(SPACE);
						setState(214);
						word(0);
						}
						break;
					}
					} 
				}
				setState(219);
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
		enterRule(_localctx, 22, RULE_string);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				word(0);
				setState(221);
				match(SPACE);
				setState(222);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_word, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(228);
			chunk();
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
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
					setState(230);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(231);
					chunk();
					}
					} 
				}
				setState(236);
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
		enterRule(_localctx, 26, RULE_chunk);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				under_chunk();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				dot_chunk();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				erased();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				lost_chunk();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				gap_unknown();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(243);
				illegible();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				surplus();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(245);
				joined();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(246);
				symbol();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(247);
				lost_chars();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(248);
				lost_chars_known();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(249);
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
		enterRule(_localctx, 28, RULE_normal_chunk);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(LETTER);
				setState(253);
				normal_chunk();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
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
		enterRule(_localctx, 30, RULE_under_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
		enterRule(_localctx, 32, RULE_under_helper);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(LETTER);
				setState(260);
				match(UNDERLINE);
				setState(261);
				under_helper();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(LETTER);
				setState(263);
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
		enterRule(_localctx, 34, RULE_dot_chunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_dot_helper, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(269);
			match(LETTER);
			setState(270);
			match(DOT);
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
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
					setState(272);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(273);
					match(LETTER);
					setState(274);
					match(DOT);
					}
					} 
				}
				setState(279);
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
		enterRule(_localctx, 38, RULE_erased);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(L_BRACKET);
			setState(281);
			match(L_BRACKET);
			setState(282);
			line();
			setState(283);
			match(R_BRACKET);
			setState(284);
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
		enterRule(_localctx, 40, RULE_lost_chunk);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(L_BRACKET);
				setState(287);
				line();
				setState(288);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(L_BRACKET);
				setState(291);
				line();
				setState(292);
				match(QUESTION);
				setState(293);
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
		enterRule(_localctx, 42, RULE_gap_unknown);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(L_BRACKET);
				setState(298);
				match(DASH);
				setState(299);
				match(DASH);
				setState(300);
				match(DASH);
				setState(301);
				match(R_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(L_BRACKET);
				setState(303);
				match(SPACE);
				setState(304);
				match(DASH);
				setState(305);
				match(SPACE);
				setState(306);
				match(DASH);
				setState(307);
				match(SPACE);
				setState(308);
				match(DASH);
				setState(309);
				match(SPACE);
				setState(310);
				match(R_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(L_BRACKET);
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
		enterRule(_localctx, 44, RULE_illegible);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(PLUS);
				setState(321);
				illegible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
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
		enterRule(_localctx, 46, RULE_lost_lines_unknown);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(DASH);
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
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(DASH);
				setState(332);
				match(SPACE);
				setState(333);
				match(DASH);
				setState(334);
				match(SPACE);
				setState(335);
				match(DASH);
				setState(336);
				match(SPACE);
				setState(337);
				match(DASH);
				setState(338);
				match(SPACE);
				setState(339);
				match(DASH);
				setState(340);
				match(SPACE);
				setState(341);
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
		enterRule(_localctx, 48, RULE_lost_chars_known);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(L_BRACKET);
			setState(345);
			dashes();
			setState(346);
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
		enterRule(_localctx, 50, RULE_lost_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(L_BRACKET);
			setState(349);
			match(DASH);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_lost_lines, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(358);
			lost_line();
			}
			_ctx.stop = _input.LT(-1);
			setState(365);
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
					setState(360);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(361);
					match(NEWLINE);
					setState(362);
					lost_line();
					}
					} 
				}
				setState(367);
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
		enterRule(_localctx, 54, RULE_surplus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(L_CURLY);
			setState(369);
			word(0);
			setState(370);
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
		enterRule(_localctx, 56, RULE_joined);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
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
		enterRule(_localctx, 58, RULE_joined_helper);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				joined_letters();
				setState(375);
				match(CIRCUMFLEX);
				setState(376);
				match(LETTER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
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
		enterRule(_localctx, 60, RULE_joined_letters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(LETTER);
			setState(382);
			match(CIRCUMFLEX);
			setState(383);
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
		enterRule(_localctx, 62, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(L_PAREN);
			setState(386);
			match(L_PAREN);
			setState(387);
			word(0);
			setState(388);
			match(R_PAREN);
			setState(389);
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
		enterRule(_localctx, 64, RULE_lost_chars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(L_BRACKET);
			setState(392);
			match(PLUS);
			setState(393);
			match(NUM);
			setState(394);
			match(QUESTION);
			setState(395);
			match(PLUS);
			setState(396);
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
		enterRule(_localctx, 66, RULE_dashes);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(DASH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(DASH);
				setState(400);
				match(DASH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				match(DASH);
				setState(402);
				match(DASH);
				setState(403);
				match(DASH);
				setState(404);
				match(DASH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				match(DASH);
				setState(406);
				match(DASH);
				setState(407);
				match(DASH);
				setState(408);
				match(DASH);
				setState(409);
				match(DASH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				match(DASH);
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
		enterRule(_localctx, 68, RULE_editorial);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VACAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				vacat();
				}
				break;
			case IANUA:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				ianua();
				}
				break;
			case L_PAREN:
			case L_ANGLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
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
		enterRule(_localctx, 70, RULE_vacat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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
		enterRule(_localctx, 72, RULE_ianua);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
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
		enterRule(_localctx, 74, RULE_subaudible);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(L_ANGLE);
				setState(429);
				match(COLON);
				setState(430);
				normal_chunk();
				setState(431);
				match(R_ANGLE);
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(L_PAREN);
				setState(434);
				normal_chunk();
				setState(435);
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
		enterRule(_localctx, 76, RULE_omitted);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(L_ANGLE);
			setState(440);
			normal_chunk();
			setState(441);
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
		case 10:
			return desc_sempred((DescContext)_localctx, predIndex);
		case 12:
			return word_sempred((WordContext)_localctx, predIndex);
		case 18:
			return dot_helper_sempred((Dot_helperContext)_localctx, predIndex);
		case 26:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u01be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2W\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3b\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4q\n\4\3\5\3\5\3\5\5\5v\n\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0081\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0088\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00ad\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00c9\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00d0\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00da\n\f\f\f\16\f\u00dd\13\f\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00e4\n\r\3\16\3\16\3\16\3\16\3\16\7\16\u00eb\n\16"+
		"\f\16\16\16\u00ee\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00fd\n\17\3\20\3\20\3\20\5\20\u0102\n\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u010b\n\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0116\n\24\f\24\16\24\u0119\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u012a\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0141\n\27\3\30\3\30"+
		"\3\30\5\30\u0146\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0159\n\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\7\34\u016e\n\34\f\34\16\34\u0171\13\34\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u017e\n\37\3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\5#\u01a4\n#\3$\3$\3$\5$\u01a9\n$\3%\3%\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01b8\n\'\3(\3(\3(\3(\3(\2\6\26"+
		"\32&\66)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLN\2\2\2\u01cb\2V\3\2\2\2\4a\3\2\2\2\6p\3\2\2\2\bu\3\2\2\2\n"+
		"w\3\2\2\2\f\u0080\3\2\2\2\16\u0087\3\2\2\2\20\u0089\3\2\2\2\22\u00ac\3"+
		"\2\2\2\24\u00c8\3\2\2\2\26\u00cf\3\2\2\2\30\u00e3\3\2\2\2\32\u00e5\3\2"+
		"\2\2\34\u00fc\3\2\2\2\36\u0101\3\2\2\2 \u0103\3\2\2\2\"\u010a\3\2\2\2"+
		"$\u010c\3\2\2\2&\u010e\3\2\2\2(\u011a\3\2\2\2*\u0129\3\2\2\2,\u0140\3"+
		"\2\2\2.\u0145\3\2\2\2\60\u0158\3\2\2\2\62\u015a\3\2\2\2\64\u015e\3\2\2"+
		"\2\66\u0167\3\2\2\28\u0172\3\2\2\2:\u0176\3\2\2\2<\u017d\3\2\2\2>\u017f"+
		"\3\2\2\2@\u0183\3\2\2\2B\u0189\3\2\2\2D\u01a3\3\2\2\2F\u01a8\3\2\2\2H"+
		"\u01aa\3\2\2\2J\u01ac\3\2\2\2L\u01b7\3\2\2\2N\u01b9\3\2\2\2PQ\5\6\4\2"+
		"QR\7\2\2\3RW\3\2\2\2ST\5\4\3\2TU\7\2\2\3UW\3\2\2\2VP\3\2\2\2VS\3\2\2\2"+
		"W\3\3\2\2\2XY\7\32\2\2YZ\7\22\2\2Zb\5\6\4\2[\\\7\32\2\2\\]\7\22\2\2]^"+
		"\5\6\4\2^_\7\22\2\2_`\5\4\3\2`b\3\2\2\2aX\3\2\2\2a[\3\2\2\2b\5\3\2\2\2"+
		"cd\5\b\5\2de\7\22\2\2ef\5\6\4\2fq\3\2\2\2gq\5\b\5\2hi\5\b\5\2ij\7\22\2"+
		"\2jq\3\2\2\2kl\5\n\6\2lm\7\22\2\2mn\5\6\4\2nq\3\2\2\2oq\5\n\6\2pc\3\2"+
		"\2\2pg\3\2\2\2ph\3\2\2\2pk\3\2\2\2po\3\2\2\2q\7\3\2\2\2rv\5\f\7\2sv\5"+
		"\60\31\2tv\5\66\34\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\t\3\2\2\2wx\7\31\2"+
		"\2xy\7\22\2\2yz\5\f\7\2z\13\3\2\2\2{\u0081\5\16\b\2|}\5\16\b\2}~\7\21"+
		"\2\2~\177\5\f\7\2\177\u0081\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0081"+
		"\r\3\2\2\2\u0082\u0088\5\22\n\2\u0083\u0088\5\20\t\2\u0084\u0088\5\24"+
		"\13\2\u0085\u0088\5\30\r\2\u0086\u0088\5F$\2\u0087\u0082\3\2\2\2\u0087"+
		"\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2"+
		"\2\2\u0088\17\3\2\2\2\u0089\u008a\7\3\2\2\u008a\u008b\7\3\2\2\u008b\u008c"+
		"\7\t\2\2\u008c\u008d\5\26\f\2\u008d\u008e\7\4\2\2\u008e\u008f\7\4\2\2"+
		"\u008f\21\3\2\2\2\u0090\u0091\5\32\16\2\u0091\u0092\7\21\2\2\u0092\u0093"+
		"\7\3\2\2\u0093\u0094\7\t\2\2\u0094\u0095\5\30\r\2\u0095\u0096\7\4\2\2"+
		"\u0096\u00ad\3\2\2\2\u0097\u0098\5\32\16\2\u0098\u0099\7\3\2\2\u0099\u009a"+
		"\7\t\2\2\u009a\u009b\5\30\r\2\u009b\u009c\7\4\2\2\u009c\u00ad\3\2\2\2"+
		"\u009d\u009e\5\32\16\2\u009e\u009f\7\21\2\2\u009f\u00a0\7\3\2\2\u00a0"+
		"\u00a1\7\t\2\2\u00a1\u00a2\5\30\r\2\u00a2\u00a3\7\n\2\2\u00a3\u00a4\7"+
		"\4\2\2\u00a4\u00ad\3\2\2\2\u00a5\u00a6\5\32\16\2\u00a6\u00a7\7\3\2\2\u00a7"+
		"\u00a8\7\t\2\2\u00a8\u00a9\5\30\r\2\u00a9\u00aa\7\n\2\2\u00aa\u00ab\7"+
		"\4\2\2\u00ab\u00ad\3\2\2\2\u00ac\u0090\3\2\2\2\u00ac\u0097\3\2\2\2\u00ac"+
		"\u009d\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ad\23\3\2\2\2\u00ae\u00af\5\32\16"+
		"\2\u00af\u00b0\7\3\2\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\7\4\2\2\u00b2"+
		"\u00c9\3\2\2\2\u00b3\u00b4\5\32\16\2\u00b4\u00b5\7\3\2\2\u00b5\u00b6\5"+
		"\30\r\2\u00b6\u00b7\7\n\2\2\u00b7\u00b8\7\4\2\2\u00b8\u00c9\3\2\2\2\u00b9"+
		"\u00ba\5\32\16\2\u00ba\u00bb\7\3\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00bd"+
		"\7\13\2\2\u00bd\u00be\7\13\2\2\u00be\u00bf\7\4\2\2\u00bf\u00c9\3\2\2\2"+
		"\u00c0\u00c1\5\32\16\2\u00c1\u00c2\7\3\2\2\u00c2\u00c3\7\13\2\2\u00c3"+
		"\u00c4\7\13\2\2\u00c4\u00c5\7\13\2\2\u00c5\u00c6\7\n\2\2\u00c6\u00c7\7"+
		"\4\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00ae\3\2\2\2\u00c8\u00b3\3\2\2\2\u00c8"+
		"\u00b9\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c9\25\3\2\2\2\u00ca\u00cb\b\f\1"+
		"\2\u00cb\u00cc\5\32\16\2\u00cc\u00cd\7\23\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00d0\5\32\16\2\u00cf\u00ca\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00db\3"+
		"\2\2\2\u00d1\u00d2\f\6\2\2\u00d2\u00d3\7\21\2\2\u00d3\u00d4\5\32\16\2"+
		"\u00d4\u00d5\7\23\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d7\f\5\2\2\u00d7\u00d8"+
		"\7\21\2\2\u00d8\u00da\5\32\16\2\u00d9\u00d1\3\2\2\2\u00d9\u00d6\3\2\2"+
		"\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\27"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\5\32\16\2\u00df\u00e0\7\21\2"+
		"\2\u00e0\u00e1\5\30\r\2\u00e1\u00e4\3\2\2\2\u00e2\u00e4\5\32\16\2\u00e3"+
		"\u00de\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\31\3\2\2\2\u00e5\u00e6\b\16\1"+
		"\2\u00e6\u00e7\5\34\17\2\u00e7\u00ec\3\2\2\2\u00e8\u00e9\f\4\2\2\u00e9"+
		"\u00eb\5\34\17\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3"+
		"\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\33\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00fd\5\36\20\2\u00f0\u00fd\5 \21\2\u00f1\u00fd\5$\23\2\u00f2\u00fd\5"+
		"(\25\2\u00f3\u00fd\5*\26\2\u00f4\u00fd\5,\27\2\u00f5\u00fd\5.\30\2\u00f6"+
		"\u00fd\58\35\2\u00f7\u00fd\5:\36\2\u00f8\u00fd\5@!\2\u00f9\u00fd\5B\""+
		"\2\u00fa\u00fd\5\62\32\2\u00fb\u00fd\5N(\2\u00fc\u00ef\3\2\2\2\u00fc\u00f0"+
		"\3\2\2\2\u00fc\u00f1\3\2\2\2\u00fc\u00f2\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fc"+
		"\u00f4\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f7\3\2"+
		"\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\35\3\2\2\2\u00fe\u00ff\7\20\2\2\u00ff\u0102\5\36"+
		"\20\2\u0100\u0102\7\20\2\2\u0101\u00fe\3\2\2\2\u0101\u0100\3\2\2\2\u0102"+
		"\37\3\2\2\2\u0103\u0104\5\"\22\2\u0104!\3\2\2\2\u0105\u0106\7\20\2\2\u0106"+
		"\u0107\7\r\2\2\u0107\u010b\5\"\22\2\u0108\u0109\7\20\2\2\u0109\u010b\7"+
		"\r\2\2\u010a\u0105\3\2\2\2\u010a\u0108\3\2\2\2\u010b#\3\2\2\2\u010c\u010d"+
		"\5&\24\2\u010d%\3\2\2\2\u010e\u010f\b\24\1\2\u010f\u0110\7\20\2\2\u0110"+
		"\u0111\7\17\2\2\u0111\u0117\3\2\2\2\u0112\u0113\f\4\2\2\u0113\u0114\7"+
		"\20\2\2\u0114\u0116\7\17\2\2\u0115\u0112\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\'\3\2\2\2\u0119\u0117\3\2\2\2"+
		"\u011a\u011b\7\5\2\2\u011b\u011c\7\5\2\2\u011c\u011d\5\f\7\2\u011d\u011e"+
		"\7\6\2\2\u011e\u011f\7\6\2\2\u011f)\3\2\2\2\u0120\u0121\7\5\2\2\u0121"+
		"\u0122\5\f\7\2\u0122\u0123\7\6\2\2\u0123\u012a\3\2\2\2\u0124\u0125\7\5"+
		"\2\2\u0125\u0126\5\f\7\2\u0126\u0127\7\n\2\2\u0127\u0128\7\6\2\2\u0128"+
		"\u012a\3\2\2\2\u0129\u0120\3\2\2\2\u0129\u0124\3\2\2\2\u012a+\3\2\2\2"+
		"\u012b\u012c\7\5\2\2\u012c\u012d\7\13\2\2\u012d\u012e\7\13\2\2\u012e\u012f"+
		"\7\13\2\2\u012f\u0141\7\6\2\2\u0130\u0131\7\5\2\2\u0131\u0132\7\21\2\2"+
		"\u0132\u0133\7\13\2\2\u0133\u0134\7\21\2\2\u0134\u0135\7\13\2\2\u0135"+
		"\u0136\7\21\2\2\u0136\u0137\7\13\2\2\u0137\u0138\7\21\2\2\u0138\u0141"+
		"\7\6\2\2\u0139\u013a\7\5\2\2\u013a\u013b\7\13\2\2\u013b\u013c\7\21\2\2"+
		"\u013c\u013d\7\13\2\2\u013d\u013e\7\21\2\2\u013e\u013f\7\13\2\2\u013f"+
		"\u0141\7\6\2\2\u0140\u012b\3\2\2\2\u0140\u0130\3\2\2\2\u0140\u0139\3\2"+
		"\2\2\u0141-\3\2\2\2\u0142\u0143\7\f\2\2\u0143\u0146\5.\30\2\u0144\u0146"+
		"\7\f\2\2\u0145\u0142\3\2\2\2\u0145\u0144\3\2\2\2\u0146/\3\2\2\2\u0147"+
		"\u0148\7\13\2\2\u0148\u0149\7\13\2\2\u0149\u014a\7\13\2\2\u014a\u014b"+
		"\7\13\2\2\u014b\u014c\7\13\2\2\u014c\u0159\7\13\2\2\u014d\u014e\7\13\2"+
		"\2\u014e\u014f\7\21\2\2\u014f\u0150\7\13\2\2\u0150\u0151\7\21\2\2\u0151"+
		"\u0152\7\13\2\2\u0152\u0153\7\21\2\2\u0153\u0154\7\13\2\2\u0154\u0155"+
		"\7\21\2\2\u0155\u0156\7\13\2\2\u0156\u0157\7\21\2\2\u0157\u0159\7\13\2"+
		"\2\u0158\u0147\3\2\2\2\u0158\u014d\3\2\2\2\u0159\61\3\2\2\2\u015a\u015b"+
		"\7\5\2\2\u015b\u015c\5D#\2\u015c\u015d\7\6\2\2\u015d\63\3\2\2\2\u015e"+
		"\u015f\7\5\2\2\u015f\u0160\7\13\2\2\u0160\u0161\7\13\2\2\u0161\u0162\7"+
		"\13\2\2\u0162\u0163\7\13\2\2\u0163\u0164\7\13\2\2\u0164\u0165\7\13\2\2"+
		"\u0165\u0166\7\6\2\2\u0166\65\3\2\2\2\u0167\u0168\b\34\1\2\u0168\u0169"+
		"\5\64\33\2\u0169\u016f\3\2\2\2\u016a\u016b\f\4\2\2\u016b\u016c\7\22\2"+
		"\2\u016c\u016e\5\64\33\2\u016d\u016a\3\2\2\2\u016e\u0171\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\67\3\2\2\2\u0171\u016f\3\2\2"+
		"\2\u0172\u0173\7\7\2\2\u0173\u0174\5\32\16\2\u0174\u0175\7\b\2\2\u0175"+
		"9\3\2\2\2\u0176\u0177\5<\37\2\u0177;\3\2\2\2\u0178\u0179\5> \2\u0179\u017a"+
		"\7\16\2\2\u017a\u017b\7\20\2\2\u017b\u017e\3\2\2\2\u017c\u017e\5> \2\u017d"+
		"\u0178\3\2\2\2\u017d\u017c\3\2\2\2\u017e=\3\2\2\2\u017f\u0180\7\20\2\2"+
		"\u0180\u0181\7\16\2\2\u0181\u0182\7\20\2\2\u0182?\3\2\2\2\u0183\u0184"+
		"\7\3\2\2\u0184\u0185\7\3\2\2\u0185\u0186\5\32\16\2\u0186\u0187\7\4\2\2"+
		"\u0187\u0188\7\4\2\2\u0188A\3\2\2\2\u0189\u018a\7\5\2\2\u018a\u018b\7"+
		"\f\2\2\u018b\u018c\7\24\2\2\u018c\u018d\7\n\2\2\u018d\u018e\7\f\2\2\u018e"+
		"\u018f\7\6\2\2\u018fC\3\2\2\2\u0190\u01a4\7\13\2\2\u0191\u0192\7\13\2"+
		"\2\u0192\u01a4\7\13\2\2\u0193\u0194\7\13\2\2\u0194\u0195\7\13\2\2\u0195"+
		"\u0196\7\13\2\2\u0196\u01a4\7\13\2\2\u0197\u0198\7\13\2\2\u0198\u0199"+
		"\7\13\2\2\u0199\u019a\7\13\2\2\u019a\u019b\7\13\2\2\u019b\u01a4\7\13\2"+
		"\2\u019c\u019d\7\13\2\2\u019d\u019e\7\13\2\2\u019e\u019f\7\13\2\2\u019f"+
		"\u01a0\7\13\2\2\u01a0\u01a1\7\13\2\2\u01a1\u01a2\7\13\2\2\u01a2\u01a4"+
		"\5D#\2\u01a3\u0190\3\2\2\2\u01a3\u0191\3\2\2\2\u01a3\u0193\3\2\2\2\u01a3"+
		"\u0197\3\2\2\2\u01a3\u019c\3\2\2\2\u01a4E\3\2\2\2\u01a5\u01a9\5H%\2\u01a6"+
		"\u01a9\5J&\2\u01a7\u01a9\5L\'\2\u01a8\u01a5\3\2\2\2\u01a8\u01a6\3\2\2"+
		"\2\u01a8\u01a7\3\2\2\2\u01a9G\3\2\2\2\u01aa\u01ab\7\27\2\2\u01abI\3\2"+
		"\2\2\u01ac\u01ad\7\30\2\2\u01adK\3\2\2\2\u01ae\u01af\7\25\2\2\u01af\u01b0"+
		"\7\t\2\2\u01b0\u01b1\5\36\20\2\u01b1\u01b2\7\26\2\2\u01b2\u01b8\3\2\2"+
		"\2\u01b3\u01b4\7\3\2\2\u01b4\u01b5\5\36\20\2\u01b5\u01b6\7\4\2\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b8M\3\2\2\2"+
		"\u01b9\u01ba\7\25\2\2\u01ba\u01bb\5\36\20\2\u01bb\u01bc\7\26\2\2\u01bc"+
		"O\3\2\2\2\34Vapu\u0080\u0087\u00ac\u00c8\u00cf\u00d9\u00db\u00e3\u00ec"+
		"\u00fc\u0101\u010a\u0117\u0129\u0140\u0145\u0158\u016f\u017d\u01a3\u01a8"+
		"\u01b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}