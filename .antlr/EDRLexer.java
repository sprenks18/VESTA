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
		LETTER=14, SPACE=15, NEWLINE=16, PUNCT=17;
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
			"LETTER", "SPACE", "NEWLINE", "PUNCT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00f1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0084\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bd\n\17\3\17\5\17\u00c0\n"+
		"\17\3\20\6\20\u00c3\n\20\r\20\16\20\u00c4\3\21\6\21\u00c8\n\21\r\21\16"+
		"\21\u00c9\3\21\7\21\u00cd\n\21\f\21\16\21\u00d0\13\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u00d8\n\21\f\21\16\21\u00db\13\21\3\21\7\21\u00de\n"+
		"\21\f\21\16\21\u00e1\13\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e9\n"+
		"\21\f\21\16\21\u00ec\13\21\5\21\u00ee\n\21\3\22\3\22\2\2\23\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23\3\2\7\4\2C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\3\2\"\"\4\2..\60\60\2"+
		"\u0129\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r"+
		"/\3\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2\23\65\3\2\2\2\25\67\3\2\2\2\279"+
		"\3\2\2\2\31@\3\2\2\2\33G\3\2\2\2\35\u00bf\3\2\2\2\37\u00c2\3\2\2\2!\u00ed"+
		"\3\2\2\2#\u00ef\3\2\2\2%&\7*\2\2&\4\3\2\2\2\'(\7+\2\2(\6\3\2\2\2)*\7]"+
		"\2\2*\b\3\2\2\2+,\7_\2\2,\n\3\2\2\2-.\7}\2\2.\f\3\2\2\2/\60\7\177\2\2"+
		"\60\16\3\2\2\2\61\62\7<\2\2\62\20\3\2\2\2\63\64\7A\2\2\64\22\3\2\2\2\65"+
		"\66\7/\2\2\66\24\3\2\2\2\678\7-\2\28\26\3\2\2\29:\7(\2\2:;\7%\2\2;<\7"+
		":\2\2<=\7\63\2\2=>\7:\2\2>?\7=\2\2?\30\3\2\2\2@A\7(\2\2AB\7%\2\2BC\79"+
		"\2\2CD\79\2\2DE\7\62\2\2EF\7=\2\2F\32\3\2\2\2GH\7(\2\2HI\7%\2\2IJ\7:\2"+
		"\2JK\7\62\2\2KL\7\65\2\2LM\7=\2\2M\34\3\2\2\2N\u00c0\t\2\2\2OP\7(\2\2"+
		"PQ\7%\2\2QR\7;\2\2R\u0083\3\2\2\2ST\7\63\2\2T\u0084\7\65\2\2UV\7\63\2"+
		"\2V\u0084\7\66\2\2WX\7\63\2\2X\u0084\7\67\2\2YZ\7\63\2\2Z\u0084\78\2\2"+
		"[\\\7\63\2\2\\\u0084\79\2\2]^\7\63\2\2^\u0084\7:\2\2_`\7\63\2\2`\u0084"+
		"\7;\2\2ab\7\64\2\2b\u0084\7\62\2\2cd\7\64\2\2d\u0084\7\63\2\2ef\7\64\2"+
		"\2f\u0084\7\64\2\2gh\7\64\2\2h\u0084\7\65\2\2ij\7\64\2\2j\u0084\7\66\2"+
		"\2kl\7\64\2\2l\u0084\7\67\2\2mn\7\64\2\2n\u0084\78\2\2op\7\64\2\2p\u0084"+
		"\79\2\2qr\7\64\2\2r\u0084\7:\2\2st\7\64\2\2t\u0084\7;\2\2uv\7\65\2\2v"+
		"\u0084\7\63\2\2wx\7\65\2\2x\u0084\7\64\2\2yz\7\65\2\2z\u0084\7\65\2\2"+
		"{|\7\65\2\2|\u0084\7\66\2\2}~\7\65\2\2~\u0084\7\67\2\2\177\u0080\7\65"+
		"\2\2\u0080\u0084\78\2\2\u0081\u0082\7\65\2\2\u0082\u0084\79\2\2\u0083"+
		"S\3\2\2\2\u0083U\3\2\2\2\u0083W\3\2\2\2\u0083Y\3\2\2\2\u0083[\3\2\2\2"+
		"\u0083]\3\2\2\2\u0083_\3\2\2\2\u0083a\3\2\2\2\u0083c\3\2\2\2\u0083e\3"+
		"\2\2\2\u0083g\3\2\2\2\u0083i\3\2\2\2\u0083k\3\2\2\2\u0083m\3\2\2\2\u0083"+
		"o\3\2\2\2\u0083q\3\2\2\2\u0083s\3\2\2\2\u0083u\3\2\2\2\u0083w\3\2\2\2"+
		"\u0083y\3\2\2\2\u0083{\3\2\2\2\u0083}\3\2\2\2\u0083\177\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u00c0\7=\2\2\u0086\u0087\7(\2"+
		"\2\u0087\u0088\7%\2\2\u0088\u0089\7;\2\2\u0089\u00bc\3\2\2\2\u008a\u008b"+
		"\7\66\2\2\u008b\u00bd\7\67\2\2\u008c\u008d\7\66\2\2\u008d\u00bd\78\2\2"+
		"\u008e\u008f\7\66\2\2\u008f\u00bd\79\2\2\u0090\u0091\7\66\2\2\u0091\u00bd"+
		"\7:\2\2\u0092\u0093\7\66\2\2\u0093\u00bd\7;\2\2\u0094\u0095\7\67\2\2\u0095"+
		"\u00bd\7\62\2\2\u0096\u0097\7\67\2\2\u0097\u00bd\7\63\2\2\u0098\u0099"+
		"\7\67\2\2\u0099\u00bd\7\64\2\2\u009a\u009b\7\67\2\2\u009b\u00bd\7\65\2"+
		"\2\u009c\u009d\7\67\2\2\u009d\u00bd\7\66\2\2\u009e\u009f\7\67\2\2\u009f"+
		"\u00bd\7\67\2\2\u00a0\u00a1\7\67\2\2\u00a1\u00bd\78\2\2\u00a2\u00a3\7"+
		"\67\2\2\u00a3\u00bd\79\2\2\u00a4\u00a5\7\67\2\2\u00a5\u00bd\7:\2\2\u00a6"+
		"\u00a7\7\67\2\2\u00a7\u00bd\7;\2\2\u00a8\u00a9\78\2\2\u00a9\u00bd\7\62"+
		"\2\2\u00aa\u00ab\78\2\2\u00ab\u00bd\7\63\2\2\u00ac\u00ad\78\2\2\u00ad"+
		"\u00bd\7\64\2\2\u00ae\u00af\78\2\2\u00af\u00bd\7\65\2\2\u00b0\u00b1\7"+
		"8\2\2\u00b1\u00bd\7\66\2\2\u00b2\u00b3\78\2\2\u00b3\u00bd\7\67\2\2\u00b4"+
		"\u00b5\78\2\2\u00b5\u00bd\78\2\2\u00b6\u00b7\78\2\2\u00b7\u00bd\79\2\2"+
		"\u00b8\u00b9\78\2\2\u00b9\u00bd\7:\2\2\u00ba\u00bb\78\2\2\u00bb\u00bd"+
		"\7;\2\2\u00bc\u008a\3\2\2\2\u00bc\u008c\3\2\2\2\u00bc\u008e\3\2\2\2\u00bc"+
		"\u0090\3\2\2\2\u00bc\u0092\3\2\2\2\u00bc\u0094\3\2\2\2\u00bc\u0096\3\2"+
		"\2\2\u00bc\u0098\3\2\2\2\u00bc\u009a\3\2\2\2\u00bc\u009c\3\2\2\2\u00bc"+
		"\u009e\3\2\2\2\u00bc\u00a0\3\2\2\2\u00bc\u00a2\3\2\2\2\u00bc\u00a4\3\2"+
		"\2\2\u00bc\u00a6\3\2\2\2\u00bc\u00a8\3\2\2\2\u00bc\u00aa\3\2\2\2\u00bc"+
		"\u00ac\3\2\2\2\u00bc\u00ae\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b2\3\2"+
		"\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\7=\2\2\u00bfN\3\2\2\2\u00bf"+
		"O\3\2\2\2\u00bf\u0086\3\2\2\2\u00c0\36\3\2\2\2\u00c1\u00c3\t\3\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5 \3\2\2\2\u00c6\u00c8\t\4\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ee\3\2\2\2\u00cb"+
		"\u00cd\t\5\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d2\7>\2\2\u00d2\u00d3\7D\2\2\u00d3\u00d4\7T\2\2\u00d4\u00d5\7@\2\2"+
		"\u00d5\u00d9\3\2\2\2\u00d6\u00d8\t\5\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00ee\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00de\t\5\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3\u00e4\7d\2\2\u00e4\u00e5\7t\2"+
		"\2\u00e5\u00e6\7@\2\2\u00e6\u00ea\3\2\2\2\u00e7\u00e9\t\5\2\2\u00e8\u00e7"+
		"\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00c7\3\2\2\2\u00ed\u00ce\3\2"+
		"\2\2\u00ed\u00df\3\2\2\2\u00ee\"\3\2\2\2\u00ef\u00f0\t\6\2\2\u00f0$\3"+
		"\2\2\2\r\2\u0083\u00bc\u00bf\u00c4\u00c9\u00ce\u00d9\u00df\u00ea\u00ed"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}