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
		LETTER=14, CAPITAL_GREEK=15, LOWER_GREEK=16, SPACE=17, NEWLINE=18, LINE_BREAK=19, 
		PUNCT=20, NUM=21, L_ANGLE=22, R_ANGLE=23, VACAT=24, IANUA=25, PERPENDICULUM=26, 
		COLUMN=27;
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
			"LETTER", "CAPITAL_GREEK", "LOWER_GREEK", "SPACE", "NEWLINE", "LINE_BREAK", 
			"PUNCT", "NUM", "L_ANGLE", "R_ANGLE", "VACAT", "IANUA", "PERPENDICULUM", 
			"COLUMN"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0152\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\5\17f\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u009c\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00d6\n\21\3\21\3\21\3\22\6\22\u00db\n\22\r"+
		"\22\16\22\u00dc\3\23\7\23\u00e0\n\23\f\23\16\23\u00e3\13\23\3\23\6\23"+
		"\u00e6\n\23\r\23\16\23\u00e7\3\23\7\23\u00eb\n\23\f\23\16\23\u00ee\13"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f9\n\24\3\25"+
		"\3\25\3\26\6\26\u00fe\n\26\r\26\16\26\u00ff\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u010b\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0116\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\6\34\u014d\n\34\r\34\16\34\u014e\3\34\3\34\2\2\35\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\t\4\2C\\c|\4"+
		"\2\13\13\"\"\3\2\"\"\4\2\f\f\17\17\4\2..\60\60\3\2\62;\5\2KKXXZZ\2\u018c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3"+
		"\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21G\3"+
		"\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27M\3\2\2\2\31T\3\2\2\2\33[\3\2\2\2\35"+
		"e\3\2\2\2\37g\3\2\2\2!\u009f\3\2\2\2#\u00da\3\2\2\2%\u00e1\3\2\2\2\'\u00f8"+
		"\3\2\2\2)\u00fa\3\2\2\2+\u00fd\3\2\2\2-\u010a\3\2\2\2/\u0115\3\2\2\2\61"+
		"\u0117\3\2\2\2\63\u0121\3\2\2\2\65\u012b\3\2\2\2\67\u0140\3\2\2\29:\7"+
		"*\2\2:\4\3\2\2\2;<\7+\2\2<\6\3\2\2\2=>\7]\2\2>\b\3\2\2\2?@\7_\2\2@\n\3"+
		"\2\2\2AB\7}\2\2B\f\3\2\2\2CD\7\177\2\2D\16\3\2\2\2EF\7<\2\2F\20\3\2\2"+
		"\2GH\7A\2\2H\22\3\2\2\2IJ\7/\2\2J\24\3\2\2\2KL\7-\2\2L\26\3\2\2\2MN\7"+
		"(\2\2NO\7%\2\2OP\7:\2\2PQ\7\63\2\2QR\7:\2\2RS\7=\2\2S\30\3\2\2\2TU\7("+
		"\2\2UV\7%\2\2VW\79\2\2WX\79\2\2XY\7\62\2\2YZ\7=\2\2Z\32\3\2\2\2[\\\7("+
		"\2\2\\]\7%\2\2]^\7:\2\2^_\7\62\2\2_`\7\65\2\2`a\7=\2\2a\34\3\2\2\2bf\t"+
		"\2\2\2cf\5\37\20\2df\5!\21\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\36\3\2\2\2"+
		"gh\7(\2\2hi\7%\2\2ij\7;\2\2j\u009b\3\2\2\2kl\7\63\2\2l\u009c\7\65\2\2"+
		"mn\7\63\2\2n\u009c\7\66\2\2op\7\63\2\2p\u009c\7\67\2\2qr\7\63\2\2r\u009c"+
		"\78\2\2st\7\63\2\2t\u009c\79\2\2uv\7\63\2\2v\u009c\7:\2\2wx\7\63\2\2x"+
		"\u009c\7;\2\2yz\7\64\2\2z\u009c\7\62\2\2{|\7\64\2\2|\u009c\7\63\2\2}~"+
		"\7\64\2\2~\u009c\7\64\2\2\177\u0080\7\64\2\2\u0080\u009c\7\65\2\2\u0081"+
		"\u0082\7\64\2\2\u0082\u009c\7\66\2\2\u0083\u0084\7\64\2\2\u0084\u009c"+
		"\7\67\2\2\u0085\u0086\7\64\2\2\u0086\u009c\78\2\2\u0087\u0088\7\64\2\2"+
		"\u0088\u009c\79\2\2\u0089\u008a\7\64\2\2\u008a\u009c\7:\2\2\u008b\u008c"+
		"\7\64\2\2\u008c\u009c\7;\2\2\u008d\u008e\7\65\2\2\u008e\u009c\7\63\2\2"+
		"\u008f\u0090\7\65\2\2\u0090\u009c\7\64\2\2\u0091\u0092\7\65\2\2\u0092"+
		"\u009c\7\65\2\2\u0093\u0094\7\65\2\2\u0094\u009c\7\66\2\2\u0095\u0096"+
		"\7\65\2\2\u0096\u009c\7\67\2\2\u0097\u0098\7\65\2\2\u0098\u009c\78\2\2"+
		"\u0099\u009a\7\65\2\2\u009a\u009c\79\2\2\u009bk\3\2\2\2\u009bm\3\2\2\2"+
		"\u009bo\3\2\2\2\u009bq\3\2\2\2\u009bs\3\2\2\2\u009bu\3\2\2\2\u009bw\3"+
		"\2\2\2\u009by\3\2\2\2\u009b{\3\2\2\2\u009b}\3\2\2\2\u009b\177\3\2\2\2"+
		"\u009b\u0081\3\2\2\2\u009b\u0083\3\2\2\2\u009b\u0085\3\2\2\2\u009b\u0087"+
		"\3\2\2\2\u009b\u0089\3\2\2\2\u009b\u008b\3\2\2\2\u009b\u008d\3\2\2\2\u009b"+
		"\u008f\3\2\2\2\u009b\u0091\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u0095\3\2"+
		"\2\2\u009b\u0097\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\7=\2\2\u009e \3\2\2\2\u009f\u00a0\7(\2\2\u00a0\u00a1\7%\2\2\u00a1"+
		"\u00a2\7;\2\2\u00a2\u00d5\3\2\2\2\u00a3\u00a4\7\66\2\2\u00a4\u00d6\7\67"+
		"\2\2\u00a5\u00a6\7\66\2\2\u00a6\u00d6\78\2\2\u00a7\u00a8\7\66\2\2\u00a8"+
		"\u00d6\79\2\2\u00a9\u00aa\7\66\2\2\u00aa\u00d6\7:\2\2\u00ab\u00ac\7\66"+
		"\2\2\u00ac\u00d6\7;\2\2\u00ad\u00ae\7\67\2\2\u00ae\u00d6\7\62\2\2\u00af"+
		"\u00b0\7\67\2\2\u00b0\u00d6\7\63\2\2\u00b1\u00b2\7\67\2\2\u00b2\u00d6"+
		"\7\64\2\2\u00b3\u00b4\7\67\2\2\u00b4\u00d6\7\65\2\2\u00b5\u00b6\7\67\2"+
		"\2\u00b6\u00d6\7\66\2\2\u00b7\u00b8\7\67\2\2\u00b8\u00d6\7\67\2\2\u00b9"+
		"\u00ba\7\67\2\2\u00ba\u00d6\78\2\2\u00bb\u00bc\7\67\2\2\u00bc\u00d6\7"+
		"9\2\2\u00bd\u00be\7\67\2\2\u00be\u00d6\7:\2\2\u00bf\u00c0\7\67\2\2\u00c0"+
		"\u00d6\7;\2\2\u00c1\u00c2\78\2\2\u00c2\u00d6\7\62\2\2\u00c3\u00c4\78\2"+
		"\2\u00c4\u00d6\7\63\2\2\u00c5\u00c6\78\2\2\u00c6\u00d6\7\64\2\2\u00c7"+
		"\u00c8\78\2\2\u00c8\u00d6\7\65\2\2\u00c9\u00ca\78\2\2\u00ca\u00d6\7\66"+
		"\2\2\u00cb\u00cc\78\2\2\u00cc\u00d6\7\67\2\2\u00cd\u00ce\78\2\2\u00ce"+
		"\u00d6\78\2\2\u00cf\u00d0\78\2\2\u00d0\u00d6\79\2\2\u00d1\u00d2\78\2\2"+
		"\u00d2\u00d6\7:\2\2\u00d3\u00d4\78\2\2\u00d4\u00d6\7;\2\2\u00d5\u00a3"+
		"\3\2\2\2\u00d5\u00a5\3\2\2\2\u00d5\u00a7\3\2\2\2\u00d5\u00a9\3\2\2\2\u00d5"+
		"\u00ab\3\2\2\2\u00d5\u00ad\3\2\2\2\u00d5\u00af\3\2\2\2\u00d5\u00b1\3\2"+
		"\2\2\u00d5\u00b3\3\2\2\2\u00d5\u00b5\3\2\2\2\u00d5\u00b7\3\2\2\2\u00d5"+
		"\u00b9\3\2\2\2\u00d5\u00bb\3\2\2\2\u00d5\u00bd\3\2\2\2\u00d5\u00bf\3\2"+
		"\2\2\u00d5\u00c1\3\2\2\2\u00d5\u00c3\3\2\2\2\u00d5\u00c5\3\2\2\2\u00d5"+
		"\u00c7\3\2\2\2\u00d5\u00c9\3\2\2\2\u00d5\u00cb\3\2\2\2\u00d5\u00cd\3\2"+
		"\2\2\u00d5\u00cf\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\7=\2\2\u00d8\"\3\2\2\2\u00d9\u00db\t\3\2\2"+
		"\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd$\3\2\2\2\u00de\u00e0\t\4\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\5\'\24\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ec\3\2"+
		"\2\2\u00e9\u00eb\t\4\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed&\3\2\2\2\u00ee\u00ec\3\2\2\2"+
		"\u00ef\u00f9\t\5\2\2\u00f0\u00f1\7>\2\2\u00f1\u00f2\7D\2\2\u00f2\u00f3"+
		"\7T\2\2\u00f3\u00f9\7@\2\2\u00f4\u00f5\7>\2\2\u00f5\u00f6\7d\2\2\u00f6"+
		"\u00f7\7t\2\2\u00f7\u00f9\7@\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f0\3\2\2"+
		"\2\u00f8\u00f4\3\2\2\2\u00f9(\3\2\2\2\u00fa\u00fb\t\6\2\2\u00fb*\3\2\2"+
		"\2\u00fc\u00fe\t\7\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100,\3\2\2\2\u0101\u0102\7(\2\2\u0102\u0103"+
		"\7%\2\2\u0103\u0104\7\63\2\2\u0104\u0105\7\64\2\2\u0105\u0106\7\64\2\2"+
		"\u0106\u0107\7;\2\2\u0107\u0108\78\2\2\u0108\u010b\7=\2\2\u0109\u010b"+
		"\7>\2\2\u010a\u0101\3\2\2\2\u010a\u0109\3\2\2\2\u010b.\3\2\2\2\u010c\u010d"+
		"\7(\2\2\u010d\u010e\7%\2\2\u010e\u010f\7\63\2\2\u010f\u0110\7\64\2\2\u0110"+
		"\u0111\7\64\2\2\u0111\u0112\7;\2\2\u0112\u0113\79\2\2\u0113\u0116\7=\2"+
		"\2\u0114\u0116\7@\2\2\u0115\u010c\3\2\2\2\u0115\u0114\3\2\2\2\u0116\60"+
		"\3\2\2\2\u0117\u0118\5-\27\2\u0118\u0119\7<\2\2\u0119\u011a\7x\2\2\u011a"+
		"\u011b\7c\2\2\u011b\u011c\7e\2\2\u011c\u011d\7c\2\2\u011d\u011e\7v\2\2"+
		"\u011e\u011f\3\2\2\2\u011f\u0120\5/\30\2\u0120\62\3\2\2\2\u0121\u0122"+
		"\5-\27\2\u0122\u0123\7<\2\2\u0123\u0124\7k\2\2\u0124\u0125\7c\2\2\u0125"+
		"\u0126\7p\2\2\u0126\u0127\7w\2\2\u0127\u0128\7c\2\2\u0128\u0129\3\2\2"+
		"\2\u0129\u012a\5/\30\2\u012a\64\3\2\2\2\u012b\u012c\5-\27\2\u012c\u012d"+
		"\7<\2\2\u012d\u012e\7c\2\2\u012e\u012f\7f\2\2\u012f\u0130\7\"\2\2\u0130"+
		"\u0131\7r\2\2\u0131\u0132\7g\2\2\u0132\u0133\7t\2\2\u0133\u0134\7r\2\2"+
		"\u0134\u0135\7g\2\2\u0135\u0136\7p\2\2\u0136\u0137\7f\2\2\u0137\u0138"+
		"\7k\2\2\u0138\u0139\7e\2\2\u0139\u013a\7w\2\2\u013a\u013b\7n\2\2\u013b"+
		"\u013c\7w\2\2\u013c\u013d\7o\2\2\u013d\u013e\3\2\2\2\u013e\u013f\5/\30"+
		"\2\u013f\66\3\2\2\2\u0140\u0141\5-\27\2\u0141\u0142\7<\2\2\u0142\u0143"+
		"\7e\2\2\u0143\u0144\7q\2\2\u0144\u0145\7n\2\2\u0145\u0146\7w\2\2\u0146"+
		"\u0147\7o\2\2\u0147\u0148\7p\2\2\u0148\u0149\7c\2\2\u0149\u014a\3\2\2"+
		"\2\u014a\u014c\5#\22\2\u014b\u014d\t\b\2\2\u014c\u014b\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\5/\30\2\u01518\3\2\2\2\17\2e\u009b\u00d5\u00dc\u00e1\u00e7\u00ec"+
		"\u00f8\u00ff\u010a\u0115\u014e\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}