// Generated from c:\Users\Trevor Alt\Documents\GitHub\edr_to_epidoc\EDR.g by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EDRLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		L_PAREN=1, R_PAREN=2, L_BRACKET=3, R_BRACKET=4, L_CURLY=5, R_CURLY=6, 
		COLON=7, QUESTION=8, DASH=9, PLUS=10, UNDERLINE=11, CIRCUMFLEX=12, DOT=13, 
		LETTER=14, SPACE=15, NEWLINE=16, PUNCT=17, NUM=18, L_ANGLE=19, R_ANGLE=20, 
		VACAT=21, IANUA=22, PERPENDICULUM=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"L_PAREN", "R_PAREN", "L_BRACKET", "R_BRACKET", "L_CURLY", "R_CURLY", 
			"COLON", "QUESTION", "DASH", "PLUS", "UNDERLINE", "CIRCUMFLEX", "DOT", 
			"LETTER", "SPACE", "NEWLINE", "PUNCT", "NUM", "L_ANGLE", "R_ANGLE", "VACAT", 
			"IANUA", "PERPENDICULUM"
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
			"IANUA", "PERPENDICULUM"
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


	public EDRLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EDR.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u014d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0090\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00c9\n\17\3\17\5\17\u00cc\n\17\3\20\6"+
		"\20\u00cf\n\20\r\20\16\20\u00d0\3\21\7\21\u00d4\n\21\f\21\16\21\u00d7"+
		"\13\21\3\21\6\21\u00da\n\21\r\21\16\21\u00db\3\21\7\21\u00df\n\21\f\21"+
		"\16\21\u00e2\13\21\3\21\7\21\u00e5\n\21\f\21\16\21\u00e8\13\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u00f0\n\21\f\21\16\21\u00f3\13\21\3\21\7"+
		"\21\u00f6\n\21\f\21\16\21\u00f9\13\21\3\21\3\21\3\21\3\21\3\21\3\21\7"+
		"\21\u0101\n\21\f\21\16\21\u0104\13\21\5\21\u0106\n\21\3\22\3\22\3\23\6"+
		"\23\u010b\n\23\r\23\16\23\u010c\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0118\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0123\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\b\4\2C\\c|\4\2"+
		"\13\13\"\"\3\2\"\"\4\2\f\f\17\17\4\2..\60\60\3\2\62;\2\u018a\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2"+
		"\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17"+
		"=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31L\3\2\2\2"+
		"\33S\3\2\2\2\35\u00cb\3\2\2\2\37\u00ce\3\2\2\2!\u0105\3\2\2\2#\u0107\3"+
		"\2\2\2%\u010a\3\2\2\2\'\u0117\3\2\2\2)\u0122\3\2\2\2+\u0124\3\2\2\2-\u012e"+
		"\3\2\2\2/\u0138\3\2\2\2\61\62\7*\2\2\62\4\3\2\2\2\63\64\7+\2\2\64\6\3"+
		"\2\2\2\65\66\7]\2\2\66\b\3\2\2\2\678\7_\2\28\n\3\2\2\29:\7}\2\2:\f\3\2"+
		"\2\2;<\7\177\2\2<\16\3\2\2\2=>\7<\2\2>\20\3\2\2\2?@\7A\2\2@\22\3\2\2\2"+
		"AB\7/\2\2B\24\3\2\2\2CD\7-\2\2D\26\3\2\2\2EF\7(\2\2FG\7%\2\2GH\7:\2\2"+
		"HI\7\63\2\2IJ\7:\2\2JK\7=\2\2K\30\3\2\2\2LM\7(\2\2MN\7%\2\2NO\79\2\2O"+
		"P\79\2\2PQ\7\62\2\2QR\7=\2\2R\32\3\2\2\2ST\7(\2\2TU\7%\2\2UV\7:\2\2VW"+
		"\7\62\2\2WX\7\65\2\2XY\7=\2\2Y\34\3\2\2\2Z\u00cc\t\2\2\2[\\\7(\2\2\\]"+
		"\7%\2\2]^\7;\2\2^\u008f\3\2\2\2_`\7\63\2\2`\u0090\7\65\2\2ab\7\63\2\2"+
		"b\u0090\7\66\2\2cd\7\63\2\2d\u0090\7\67\2\2ef\7\63\2\2f\u0090\78\2\2g"+
		"h\7\63\2\2h\u0090\79\2\2ij\7\63\2\2j\u0090\7:\2\2kl\7\63\2\2l\u0090\7"+
		";\2\2mn\7\64\2\2n\u0090\7\62\2\2op\7\64\2\2p\u0090\7\63\2\2qr\7\64\2\2"+
		"r\u0090\7\64\2\2st\7\64\2\2t\u0090\7\65\2\2uv\7\64\2\2v\u0090\7\66\2\2"+
		"wx\7\64\2\2x\u0090\7\67\2\2yz\7\64\2\2z\u0090\78\2\2{|\7\64\2\2|\u0090"+
		"\79\2\2}~\7\64\2\2~\u0090\7:\2\2\177\u0080\7\64\2\2\u0080\u0090\7;\2\2"+
		"\u0081\u0082\7\65\2\2\u0082\u0090\7\63\2\2\u0083\u0084\7\65\2\2\u0084"+
		"\u0090\7\64\2\2\u0085\u0086\7\65\2\2\u0086\u0090\7\65\2\2\u0087\u0088"+
		"\7\65\2\2\u0088\u0090\7\66\2\2\u0089\u008a\7\65\2\2\u008a\u0090\7\67\2"+
		"\2\u008b\u008c\7\65\2\2\u008c\u0090\78\2\2\u008d\u008e\7\65\2\2\u008e"+
		"\u0090\79\2\2\u008f_\3\2\2\2\u008fa\3\2\2\2\u008fc\3\2\2\2\u008fe\3\2"+
		"\2\2\u008fg\3\2\2\2\u008fi\3\2\2\2\u008fk\3\2\2\2\u008fm\3\2\2\2\u008f"+
		"o\3\2\2\2\u008fq\3\2\2\2\u008fs\3\2\2\2\u008fu\3\2\2\2\u008fw\3\2\2\2"+
		"\u008fy\3\2\2\2\u008f{\3\2\2\2\u008f}\3\2\2\2\u008f\177\3\2\2\2\u008f"+
		"\u0081\3\2\2\2\u008f\u0083\3\2\2\2\u008f\u0085\3\2\2\2\u008f\u0087\3\2"+
		"\2\2\u008f\u0089\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u00cc\7=\2\2\u0092\u0093\7(\2\2\u0093\u0094\7%\2"+
		"\2\u0094\u0095\7;\2\2\u0095\u00c8\3\2\2\2\u0096\u0097\7\66\2\2\u0097\u00c9"+
		"\7\67\2\2\u0098\u0099\7\66\2\2\u0099\u00c9\78\2\2\u009a\u009b\7\66\2\2"+
		"\u009b\u00c9\79\2\2\u009c\u009d\7\66\2\2\u009d\u00c9\7:\2\2\u009e\u009f"+
		"\7\66\2\2\u009f\u00c9\7;\2\2\u00a0\u00a1\7\67\2\2\u00a1\u00c9\7\62\2\2"+
		"\u00a2\u00a3\7\67\2\2\u00a3\u00c9\7\63\2\2\u00a4\u00a5\7\67\2\2\u00a5"+
		"\u00c9\7\64\2\2\u00a6\u00a7\7\67\2\2\u00a7\u00c9\7\65\2\2\u00a8\u00a9"+
		"\7\67\2\2\u00a9\u00c9\7\66\2\2\u00aa\u00ab\7\67\2\2\u00ab\u00c9\7\67\2"+
		"\2\u00ac\u00ad\7\67\2\2\u00ad\u00c9\78\2\2\u00ae\u00af\7\67\2\2\u00af"+
		"\u00c9\79\2\2\u00b0\u00b1\7\67\2\2\u00b1\u00c9\7:\2\2\u00b2\u00b3\7\67"+
		"\2\2\u00b3\u00c9\7;\2\2\u00b4\u00b5\78\2\2\u00b5\u00c9\7\62\2\2\u00b6"+
		"\u00b7\78\2\2\u00b7\u00c9\7\63\2\2\u00b8\u00b9\78\2\2\u00b9\u00c9\7\64"+
		"\2\2\u00ba\u00bb\78\2\2\u00bb\u00c9\7\65\2\2\u00bc\u00bd\78\2\2\u00bd"+
		"\u00c9\7\66\2\2\u00be\u00bf\78\2\2\u00bf\u00c9\7\67\2\2\u00c0\u00c1\7"+
		"8\2\2\u00c1\u00c9\78\2\2\u00c2\u00c3\78\2\2\u00c3\u00c9\79\2\2\u00c4\u00c5"+
		"\78\2\2\u00c5\u00c9\7:\2\2\u00c6\u00c7\78\2\2\u00c7\u00c9\7;\2\2\u00c8"+
		"\u0096\3\2\2\2\u00c8\u0098\3\2\2\2\u00c8\u009a\3\2\2\2\u00c8\u009c\3\2"+
		"\2\2\u00c8\u009e\3\2\2\2\u00c8\u00a0\3\2\2\2\u00c8\u00a2\3\2\2\2\u00c8"+
		"\u00a4\3\2\2\2\u00c8\u00a6\3\2\2\2\u00c8\u00a8\3\2\2\2\u00c8\u00aa\3\2"+
		"\2\2\u00c8\u00ac\3\2\2\2\u00c8\u00ae\3\2\2\2\u00c8\u00b0\3\2\2\2\u00c8"+
		"\u00b2\3\2\2\2\u00c8\u00b4\3\2\2\2\u00c8\u00b6\3\2\2\2\u00c8\u00b8\3\2"+
		"\2\2\u00c8\u00ba\3\2\2\2\u00c8\u00bc\3\2\2\2\u00c8\u00be\3\2\2\2\u00c8"+
		"\u00c0\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\7=\2\2\u00cbZ\3\2\2\2\u00cb[\3\2"+
		"\2\2\u00cb\u0092\3\2\2\2\u00cc\36\3\2\2\2\u00cd\u00cf\t\3\2\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		" \3\2\2\2\u00d2\u00d4\t\4\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2"+
		"\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\u00da\t\5\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00df\t\4"+
		"\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u0106\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\t\4"+
		"\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7>"+
		"\2\2\u00ea\u00eb\7D\2\2\u00eb\u00ec\7T\2\2\u00ec\u00ed\7@\2\2\u00ed\u00f1"+
		"\3\2\2\2\u00ee\u00f0\t\4\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u0106\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f4\u00f6\t\4\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00fb\7>\2\2\u00fb\u00fc\7d\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe"+
		"\7@\2\2\u00fe\u0102\3\2\2\2\u00ff\u0101\t\4\2\2\u0100\u00ff\3\2\2\2\u0101"+
		"\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0105\u00d5\3\2\2\2\u0105\u00e6\3\2\2\2\u0105"+
		"\u00f7\3\2\2\2\u0106\"\3\2\2\2\u0107\u0108\t\6\2\2\u0108$\3\2\2\2\u0109"+
		"\u010b\t\7\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d&\3\2\2\2\u010e\u010f\7(\2\2\u010f\u0110"+
		"\7%\2\2\u0110\u0111\7\63\2\2\u0111\u0112\7\64\2\2\u0112\u0113\7\64\2\2"+
		"\u0113\u0114\7;\2\2\u0114\u0115\78\2\2\u0115\u0118\7=\2\2\u0116\u0118"+
		"\7>\2\2\u0117\u010e\3\2\2\2\u0117\u0116\3\2\2\2\u0118(\3\2\2\2\u0119\u011a"+
		"\7(\2\2\u011a\u011b\7%\2\2\u011b\u011c\7\63\2\2\u011c\u011d\7\64\2\2\u011d"+
		"\u011e\7\64\2\2\u011e\u011f\7;\2\2\u011f\u0120\79\2\2\u0120\u0123\7=\2"+
		"\2\u0121\u0123\7@\2\2\u0122\u0119\3\2\2\2\u0122\u0121\3\2\2\2\u0123*\3"+
		"\2\2\2\u0124\u0125\5\'\24\2\u0125\u0126\7<\2\2\u0126\u0127\7x\2\2\u0127"+
		"\u0128\7c\2\2\u0128\u0129\7e\2\2\u0129\u012a\7c\2\2\u012a\u012b\7v\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012d\5)\25\2\u012d,\3\2\2\2\u012e\u012f\5"+
		"\'\24\2\u012f\u0130\7<\2\2\u0130\u0131\7k\2\2\u0131\u0132\7c\2\2\u0132"+
		"\u0133\7p\2\2\u0133\u0134\7w\2\2\u0134\u0135\7c\2\2\u0135\u0136\3\2\2"+
		"\2\u0136\u0137\5)\25\2\u0137.\3\2\2\2\u0138\u0139\5\'\24\2\u0139\u013a"+
		"\7<\2\2\u013a\u013b\7c\2\2\u013b\u013c\7f\2\2\u013c\u013d\7\"\2\2\u013d"+
		"\u013e\7r\2\2\u013e\u013f\7g\2\2\u013f\u0140\7t\2\2\u0140\u0141\7r\2\2"+
		"\u0141\u0142\7g\2\2\u0142\u0143\7p\2\2\u0143\u0144\7f\2\2\u0144\u0145"+
		"\7k\2\2\u0145\u0146\7e\2\2\u0146\u0147\7w\2\2\u0147\u0148\7n\2\2\u0148"+
		"\u0149\7w\2\2\u0149\u014a\7o\2\2\u014a\u014b\3\2\2\2\u014b\u014c\5)\25"+
		"\2\u014c\60\3\2\2\2\22\2\u008f\u00c8\u00cb\u00d0\u00d5\u00db\u00e0\u00e6"+
		"\u00f1\u00f7\u0102\u0105\u010c\u0117\u0122\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}