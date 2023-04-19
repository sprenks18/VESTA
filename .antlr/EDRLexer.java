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
		COLON=7, QUESTION=8, DASH=9, PLUS=10, UNDERLINE=11, CIRUMFLEX=12, DOT=13, 
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
			"COLON", "QUESTION", "DASH", "PLUS", "UNDERLINE", "CIRUMFLEX", "DOT", 
			"LETTER", "SPACE", "NEWLINE", "PUNCT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00d2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\177\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00b8\n\17\3\17\5\17\u00bb\n\17\3\20\6\20\u00be\n"+
		"\20\r\20\16\20\u00bf\3\21\6\21\u00c3\n\21\r\21\16\21\u00c4\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u00cf\n\21\3\22\3\22\2\2\23\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23\3\2\6\4\2C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\4\2..\60\60\2\u0106\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2"+
		"\17\61\3\2\2\2\21\63\3\2\2\2\23\65\3\2\2\2\25\67\3\2\2\2\279\3\2\2\2\31"+
		"@\3\2\2\2\33B\3\2\2\2\35\u00ba\3\2\2\2\37\u00bd\3\2\2\2!\u00ce\3\2\2\2"+
		"#\u00d0\3\2\2\2%&\7*\2\2&\4\3\2\2\2\'(\7+\2\2(\6\3\2\2\2)*\7]\2\2*\b\3"+
		"\2\2\2+,\7_\2\2,\n\3\2\2\2-.\7}\2\2.\f\3\2\2\2/\60\7\177\2\2\60\16\3\2"+
		"\2\2\61\62\7<\2\2\62\20\3\2\2\2\63\64\7A\2\2\64\22\3\2\2\2\65\66\7/\2"+
		"\2\66\24\3\2\2\2\678\7-\2\28\26\3\2\2\29:\7(\2\2:;\7%\2\2;<\7:\2\2<=\7"+
		"\63\2\2=>\7:\2\2>?\7=\2\2?\30\3\2\2\2@A\7\u0304\2\2A\32\3\2\2\2BC\7(\2"+
		"\2CD\7%\2\2DE\7:\2\2EF\7\62\2\2FG\7\65\2\2GH\7=\2\2H\34\3\2\2\2I\u00bb"+
		"\t\2\2\2JK\7(\2\2KL\7%\2\2LM\7;\2\2M~\3\2\2\2NO\7\63\2\2O\177\7\65\2\2"+
		"PQ\7\63\2\2Q\177\7\66\2\2RS\7\63\2\2S\177\7\67\2\2TU\7\63\2\2U\177\78"+
		"\2\2VW\7\63\2\2W\177\79\2\2XY\7\63\2\2Y\177\7:\2\2Z[\7\63\2\2[\177\7;"+
		"\2\2\\]\7\64\2\2]\177\7\62\2\2^_\7\64\2\2_\177\7\63\2\2`a\7\64\2\2a\177"+
		"\7\64\2\2bc\7\64\2\2c\177\7\65\2\2de\7\64\2\2e\177\7\66\2\2fg\7\64\2\2"+
		"g\177\7\67\2\2hi\7\64\2\2i\177\78\2\2jk\7\64\2\2k\177\79\2\2lm\7\64\2"+
		"\2m\177\7:\2\2no\7\64\2\2o\177\7;\2\2pq\7\65\2\2q\177\7\63\2\2rs\7\65"+
		"\2\2s\177\7\64\2\2tu\7\65\2\2u\177\7\65\2\2vw\7\65\2\2w\177\7\66\2\2x"+
		"y\7\65\2\2y\177\7\67\2\2z{\7\65\2\2{\177\78\2\2|}\7\65\2\2}\177\79\2\2"+
		"~N\3\2\2\2~P\3\2\2\2~R\3\2\2\2~T\3\2\2\2~V\3\2\2\2~X\3\2\2\2~Z\3\2\2\2"+
		"~\\\3\2\2\2~^\3\2\2\2~`\3\2\2\2~b\3\2\2\2~d\3\2\2\2~f\3\2\2\2~h\3\2\2"+
		"\2~j\3\2\2\2~l\3\2\2\2~n\3\2\2\2~p\3\2\2\2~r\3\2\2\2~t\3\2\2\2~v\3\2\2"+
		"\2~x\3\2\2\2~z\3\2\2\2~|\3\2\2\2\177\u0080\3\2\2\2\u0080\u00bb\7=\2\2"+
		"\u0081\u0082\7(\2\2\u0082\u0083\7%\2\2\u0083\u0084\7;\2\2\u0084\u00b7"+
		"\3\2\2\2\u0085\u0086\7\66\2\2\u0086\u00b8\7\67\2\2\u0087\u0088\7\66\2"+
		"\2\u0088\u00b8\78\2\2\u0089\u008a\7\66\2\2\u008a\u00b8\79\2\2\u008b\u008c"+
		"\7\66\2\2\u008c\u00b8\7:\2\2\u008d\u008e\7\66\2\2\u008e\u00b8\7;\2\2\u008f"+
		"\u0090\7\67\2\2\u0090\u00b8\7\62\2\2\u0091\u0092\7\67\2\2\u0092\u00b8"+
		"\7\63\2\2\u0093\u0094\7\67\2\2\u0094\u00b8\7\64\2\2\u0095\u0096\7\67\2"+
		"\2\u0096\u00b8\7\65\2\2\u0097\u0098\7\67\2\2\u0098\u00b8\7\66\2\2\u0099"+
		"\u009a\7\67\2\2\u009a\u00b8\7\67\2\2\u009b\u009c\7\67\2\2\u009c\u00b8"+
		"\78\2\2\u009d\u009e\7\67\2\2\u009e\u00b8\79\2\2\u009f\u00a0\7\67\2\2\u00a0"+
		"\u00b8\7:\2\2\u00a1\u00a2\7\67\2\2\u00a2\u00b8\7;\2\2\u00a3\u00a4\78\2"+
		"\2\u00a4\u00b8\7\62\2\2\u00a5\u00a6\78\2\2\u00a6\u00b8\7\63\2\2\u00a7"+
		"\u00a8\78\2\2\u00a8\u00b8\7\64\2\2\u00a9\u00aa\78\2\2\u00aa\u00b8\7\65"+
		"\2\2\u00ab\u00ac\78\2\2\u00ac\u00b8\7\66\2\2\u00ad\u00ae\78\2\2\u00ae"+
		"\u00b8\7\67\2\2\u00af\u00b0\78\2\2\u00b0\u00b8\78\2\2\u00b1\u00b2\78\2"+
		"\2\u00b2\u00b8\79\2\2\u00b3\u00b4\78\2\2\u00b4\u00b8\7:\2\2\u00b5\u00b6"+
		"\78\2\2\u00b6\u00b8\7;\2\2\u00b7\u0085\3\2\2\2\u00b7\u0087\3\2\2\2\u00b7"+
		"\u0089\3\2\2\2\u00b7\u008b\3\2\2\2\u00b7\u008d\3\2\2\2\u00b7\u008f\3\2"+
		"\2\2\u00b7\u0091\3\2\2\2\u00b7\u0093\3\2\2\2\u00b7\u0095\3\2\2\2\u00b7"+
		"\u0097\3\2\2\2\u00b7\u0099\3\2\2\2\u00b7\u009b\3\2\2\2\u00b7\u009d\3\2"+
		"\2\2\u00b7\u009f\3\2\2\2\u00b7\u00a1\3\2\2\2\u00b7\u00a3\3\2\2\2\u00b7"+
		"\u00a5\3\2\2\2\u00b7\u00a7\3\2\2\2\u00b7\u00a9\3\2\2\2\u00b7\u00ab\3\2"+
		"\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7"+
		"\u00b3\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\7="+
		"\2\2\u00baI\3\2\2\2\u00baJ\3\2\2\2\u00ba\u0081\3\2\2\2\u00bb\36\3\2\2"+
		"\2\u00bc\u00be\t\3\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0 \3\2\2\2\u00c1\u00c3\t\4\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00cf\3\2\2\2\u00c6\u00c7\7>\2\2\u00c7\u00c8\7D\2\2\u00c8\u00c9"+
		"\7T\2\2\u00c9\u00cf\7@\2\2\u00ca\u00cb\7>\2\2\u00cb\u00cc\7d\2\2\u00cc"+
		"\u00cd\7t\2\2\u00cd\u00cf\7@\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00c6\3\2\2"+
		"\2\u00ce\u00ca\3\2\2\2\u00cf\"\3\2\2\2\u00d0\u00d1\t\5\2\2\u00d1$\3\2"+
		"\2\2\t\2~\u00b7\u00ba\u00bf\u00c4\u00ce\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}