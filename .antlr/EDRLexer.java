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
		VACAT=21, IANUA=22;
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
			"IANUA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u012a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u008e\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00c7\n\17\3\17\5\17\u00ca\n\17\3\20\6\20\u00cd\n"+
		"\20\r\20\16\20\u00ce\3\21\6\21\u00d2\n\21\r\21\16\21\u00d3\3\21\7\21\u00d7"+
		"\n\21\f\21\16\21\u00da\13\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e2"+
		"\n\21\f\21\16\21\u00e5\13\21\3\21\7\21\u00e8\n\21\f\21\16\21\u00eb\13"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f3\n\21\f\21\16\21\u00f6\13"+
		"\21\5\21\u00f8\n\21\3\22\3\22\3\23\6\23\u00fd\n\23\r\23\16\23\u00fe\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010a\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0115\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\b\4\2C\\c|\4\2"+
		"\13\13\"\"\4\2\f\f\17\17\3\2\"\"\4\2..\60\60\3\2\62;\2\u0165\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2"+
		"\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21"+
		"=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2\31J\3\2\2\2\33Q\3\2\2\2"+
		"\35\u00c9\3\2\2\2\37\u00cc\3\2\2\2!\u00f7\3\2\2\2#\u00f9\3\2\2\2%\u00fc"+
		"\3\2\2\2\'\u0109\3\2\2\2)\u0114\3\2\2\2+\u0116\3\2\2\2-\u0120\3\2\2\2"+
		"/\60\7*\2\2\60\4\3\2\2\2\61\62\7+\2\2\62\6\3\2\2\2\63\64\7]\2\2\64\b\3"+
		"\2\2\2\65\66\7_\2\2\66\n\3\2\2\2\678\7}\2\28\f\3\2\2\29:\7\177\2\2:\16"+
		"\3\2\2\2;<\7<\2\2<\20\3\2\2\2=>\7A\2\2>\22\3\2\2\2?@\7/\2\2@\24\3\2\2"+
		"\2AB\7-\2\2B\26\3\2\2\2CD\7(\2\2DE\7%\2\2EF\7:\2\2FG\7\63\2\2GH\7:\2\2"+
		"HI\7=\2\2I\30\3\2\2\2JK\7(\2\2KL\7%\2\2LM\79\2\2MN\79\2\2NO\7\62\2\2O"+
		"P\7=\2\2P\32\3\2\2\2QR\7(\2\2RS\7%\2\2ST\7:\2\2TU\7\62\2\2UV\7\65\2\2"+
		"VW\7=\2\2W\34\3\2\2\2X\u00ca\t\2\2\2YZ\7(\2\2Z[\7%\2\2[\\\7;\2\2\\\u008d"+
		"\3\2\2\2]^\7\63\2\2^\u008e\7\65\2\2_`\7\63\2\2`\u008e\7\66\2\2ab\7\63"+
		"\2\2b\u008e\7\67\2\2cd\7\63\2\2d\u008e\78\2\2ef\7\63\2\2f\u008e\79\2\2"+
		"gh\7\63\2\2h\u008e\7:\2\2ij\7\63\2\2j\u008e\7;\2\2kl\7\64\2\2l\u008e\7"+
		"\62\2\2mn\7\64\2\2n\u008e\7\63\2\2op\7\64\2\2p\u008e\7\64\2\2qr\7\64\2"+
		"\2r\u008e\7\65\2\2st\7\64\2\2t\u008e\7\66\2\2uv\7\64\2\2v\u008e\7\67\2"+
		"\2wx\7\64\2\2x\u008e\78\2\2yz\7\64\2\2z\u008e\79\2\2{|\7\64\2\2|\u008e"+
		"\7:\2\2}~\7\64\2\2~\u008e\7;\2\2\177\u0080\7\65\2\2\u0080\u008e\7\63\2"+
		"\2\u0081\u0082\7\65\2\2\u0082\u008e\7\64\2\2\u0083\u0084\7\65\2\2\u0084"+
		"\u008e\7\65\2\2\u0085\u0086\7\65\2\2\u0086\u008e\7\66\2\2\u0087\u0088"+
		"\7\65\2\2\u0088\u008e\7\67\2\2\u0089\u008a\7\65\2\2\u008a\u008e\78\2\2"+
		"\u008b\u008c\7\65\2\2\u008c\u008e\79\2\2\u008d]\3\2\2\2\u008d_\3\2\2\2"+
		"\u008da\3\2\2\2\u008dc\3\2\2\2\u008de\3\2\2\2\u008dg\3\2\2\2\u008di\3"+
		"\2\2\2\u008dk\3\2\2\2\u008dm\3\2\2\2\u008do\3\2\2\2\u008dq\3\2\2\2\u008d"+
		"s\3\2\2\2\u008du\3\2\2\2\u008dw\3\2\2\2\u008dy\3\2\2\2\u008d{\3\2\2\2"+
		"\u008d}\3\2\2\2\u008d\177\3\2\2\2\u008d\u0081\3\2\2\2\u008d\u0083\3\2"+
		"\2\2\u008d\u0085\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u0089\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u00ca\7=\2\2\u0090\u0091\7(\2"+
		"\2\u0091\u0092\7%\2\2\u0092\u0093\7;\2\2\u0093\u00c6\3\2\2\2\u0094\u0095"+
		"\7\66\2\2\u0095\u00c7\7\67\2\2\u0096\u0097\7\66\2\2\u0097\u00c7\78\2\2"+
		"\u0098\u0099\7\66\2\2\u0099\u00c7\79\2\2\u009a\u009b\7\66\2\2\u009b\u00c7"+
		"\7:\2\2\u009c\u009d\7\66\2\2\u009d\u00c7\7;\2\2\u009e\u009f\7\67\2\2\u009f"+
		"\u00c7\7\62\2\2\u00a0\u00a1\7\67\2\2\u00a1\u00c7\7\63\2\2\u00a2\u00a3"+
		"\7\67\2\2\u00a3\u00c7\7\64\2\2\u00a4\u00a5\7\67\2\2\u00a5\u00c7\7\65\2"+
		"\2\u00a6\u00a7\7\67\2\2\u00a7\u00c7\7\66\2\2\u00a8\u00a9\7\67\2\2\u00a9"+
		"\u00c7\7\67\2\2\u00aa\u00ab\7\67\2\2\u00ab\u00c7\78\2\2\u00ac\u00ad\7"+
		"\67\2\2\u00ad\u00c7\79\2\2\u00ae\u00af\7\67\2\2\u00af\u00c7\7:\2\2\u00b0"+
		"\u00b1\7\67\2\2\u00b1\u00c7\7;\2\2\u00b2\u00b3\78\2\2\u00b3\u00c7\7\62"+
		"\2\2\u00b4\u00b5\78\2\2\u00b5\u00c7\7\63\2\2\u00b6\u00b7\78\2\2\u00b7"+
		"\u00c7\7\64\2\2\u00b8\u00b9\78\2\2\u00b9\u00c7\7\65\2\2\u00ba\u00bb\7"+
		"8\2\2\u00bb\u00c7\7\66\2\2\u00bc\u00bd\78\2\2\u00bd\u00c7\7\67\2\2\u00be"+
		"\u00bf\78\2\2\u00bf\u00c7\78\2\2\u00c0\u00c1\78\2\2\u00c1\u00c7\79\2\2"+
		"\u00c2\u00c3\78\2\2\u00c3\u00c7\7:\2\2\u00c4\u00c5\78\2\2\u00c5\u00c7"+
		"\7;\2\2\u00c6\u0094\3\2\2\2\u00c6\u0096\3\2\2\2\u00c6\u0098\3\2\2\2\u00c6"+
		"\u009a\3\2\2\2\u00c6\u009c\3\2\2\2\u00c6\u009e\3\2\2\2\u00c6\u00a0\3\2"+
		"\2\2\u00c6\u00a2\3\2\2\2\u00c6\u00a4\3\2\2\2\u00c6\u00a6\3\2\2\2\u00c6"+
		"\u00a8\3\2\2\2\u00c6\u00aa\3\2\2\2\u00c6\u00ac\3\2\2\2\u00c6\u00ae\3\2"+
		"\2\2\u00c6\u00b0\3\2\2\2\u00c6\u00b2\3\2\2\2\u00c6\u00b4\3\2\2\2\u00c6"+
		"\u00b6\3\2\2\2\u00c6\u00b8\3\2\2\2\u00c6\u00ba\3\2\2\2\u00c6\u00bc\3\2"+
		"\2\2\u00c6\u00be\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\7=\2\2\u00c9X\3\2\2\2\u00c9"+
		"Y\3\2\2\2\u00c9\u0090\3\2\2\2\u00ca\36\3\2\2\2\u00cb\u00cd\t\3\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf \3\2\2\2\u00d0\u00d2\t\4\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00f8\3\2\2\2\u00d5"+
		"\u00d7\t\5\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dc\7>\2\2\u00dc\u00dd\7D\2\2\u00dd\u00de\7T\2\2\u00de\u00df\7@\2\2"+
		"\u00df\u00e3\3\2\2\2\u00e0\u00e2\t\5\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00f8\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e8\t\5\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00ed\7>\2\2\u00ed\u00ee\7d\2\2\u00ee\u00ef\7t\2"+
		"\2\u00ef\u00f0\7@\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f3\t\5\2\2\u00f2\u00f1"+
		"\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00d1\3\2\2\2\u00f7\u00d8\3\2"+
		"\2\2\u00f7\u00e9\3\2\2\2\u00f8\"\3\2\2\2\u00f9\u00fa\t\6\2\2\u00fa$\3"+
		"\2\2\2\u00fb\u00fd\t\7\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff&\3\2\2\2\u0100\u0101\7(\2\2\u0101"+
		"\u0102\7%\2\2\u0102\u0103\7\63\2\2\u0103\u0104\7\64\2\2\u0104\u0105\7"+
		"\64\2\2\u0105\u0106\7;\2\2\u0106\u0107\78\2\2\u0107\u010a\7=\2\2\u0108"+
		"\u010a\7>\2\2\u0109\u0100\3\2\2\2\u0109\u0108\3\2\2\2\u010a(\3\2\2\2\u010b"+
		"\u010c\7(\2\2\u010c\u010d\7%\2\2\u010d\u010e\7\63\2\2\u010e\u010f\7\64"+
		"\2\2\u010f\u0110\7\64\2\2\u0110\u0111\7;\2\2\u0111\u0112\79\2\2\u0112"+
		"\u0115\7=\2\2\u0113\u0115\7@\2\2\u0114\u010b\3\2\2\2\u0114\u0113\3\2\2"+
		"\2\u0115*\3\2\2\2\u0116\u0117\5\'\24\2\u0117\u0118\7<\2\2\u0118\u0119"+
		"\7x\2\2\u0119\u011a\7c\2\2\u011a\u011b\7e\2\2\u011b\u011c\7c\2\2\u011c"+
		"\u011d\7v\2\2\u011d\u011e\3\2\2\2\u011e\u011f\5)\25\2\u011f,\3\2\2\2\u0120"+
		"\u0121\5\'\24\2\u0121\u0122\7<\2\2\u0122\u0123\7k\2\2\u0123\u0124\7c\2"+
		"\2\u0124\u0125\7p\2\2\u0125\u0126\7w\2\2\u0126\u0127\7c\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\5)\25\2\u0129.\3\2\2\2\20\2\u008d\u00c6\u00c9\u00ce"+
		"\u00d3\u00d8\u00e3\u00e9\u00f4\u00f7\u00fe\u0109\u0114\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}