// Generated from P.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, TEXTO=19, REAL=20, INTEIRO=21, PROGRAMA=22, DECLARA=23, DEFINE=24, 
		EXECUTA=25, FIMPROGRAMA=26, RETORNA=27, IMPRIME=28, SE=29, ENTAO=30, SENAO=31, 
		FIMSE=32, REPITA=33, ATE=34, NUMERO_REAL=35, NUMERO_INTEIRO=36, DIGITO=37, 
		ID=38, LETRA=39, STRING=40, WS=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "TEXTO", "REAL", "INTEIRO", "PROGRAMA", "DECLARA", "DEFINE", 
			"EXECUTA", "FIMPROGRAMA", "RETORNA", "IMPRIME", "SE", "ENTAO", "SENAO", 
			"FIMSE", "REPITA", "ATE", "NUMERO_REAL", "NUMERO_INTEIRO", "DIGITO", 
			"ID", "LETRA", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "','", "')'", "'{'", "'}'", "':='", "'*'", "'/'", 
			"'+'", "'-'", "'&'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'texto'", 
			"'real'", "'inteiro'", "'programa'", "'declara'", "'define'", "'executa'", 
			"'fimprograma'", "'retorna'", "'imprime'", "'se'", "'entao'", "'senao'", 
			"'fimse'", "'REPITA'", "'ATE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "TEXTO", "REAL", "INTEIRO", 
			"PROGRAMA", "DECLARA", "DEFINE", "EXECUTA", "FIMPROGRAMA", "RETORNA", 
			"IMPRIME", "SE", "ENTAO", "SENAO", "FIMSE", "REPITA", "ATE", "NUMERO_REAL", 
			"NUMERO_INTEIRO", "DIGITO", "ID", "LETRA", "STRING", "WS"
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


	public PLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "P.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0129\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\6$\u00ef"+
		"\n$\r$\16$\u00f0\3$\3$\7$\u00f5\n$\f$\16$\u00f8\13$\3$\7$\u00fb\n$\f$"+
		"\16$\u00fe\13$\3$\3$\6$\u0102\n$\r$\16$\u0103\5$\u0106\n$\3%\6%\u0109"+
		"\n%\r%\16%\u010a\3&\3&\3\'\3\'\3\'\3\'\7\'\u0113\n\'\f\'\16\'\u0116\13"+
		"\'\3(\3(\3)\3)\7)\u011c\n)\f)\16)\u011f\13)\3)\3)\3*\6*\u0124\n*\r*\16"+
		"*\u0125\3*\3*\3\u011d\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\5\3\2\62;\4\2C\\"+
		"c|\5\2\13\f\17\17\"\"\2\u0133\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t[\3\2\2"+
		"\2\13]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21d\3\2\2\2\23f\3\2\2\2\25h\3\2"+
		"\2\2\27j\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35p\3\2\2\2\37s\3\2\2\2!u\3\2"+
		"\2\2#x\3\2\2\2%{\3\2\2\2\'~\3\2\2\2)\u0084\3\2\2\2+\u0089\3\2\2\2-\u0091"+
		"\3\2\2\2/\u009a\3\2\2\2\61\u00a2\3\2\2\2\63\u00a9\3\2\2\2\65\u00b1\3\2"+
		"\2\2\67\u00bd\3\2\2\29\u00c5\3\2\2\2;\u00cd\3\2\2\2=\u00d0\3\2\2\2?\u00d6"+
		"\3\2\2\2A\u00dc\3\2\2\2C\u00e2\3\2\2\2E\u00e9\3\2\2\2G\u0105\3\2\2\2I"+
		"\u0108\3\2\2\2K\u010c\3\2\2\2M\u010e\3\2\2\2O\u0117\3\2\2\2Q\u0119\3\2"+
		"\2\2S\u0123\3\2\2\2UV\7<\2\2V\4\3\2\2\2WX\7*\2\2X\6\3\2\2\2YZ\7.\2\2Z"+
		"\b\3\2\2\2[\\\7+\2\2\\\n\3\2\2\2]^\7}\2\2^\f\3\2\2\2_`\7\177\2\2`\16\3"+
		"\2\2\2ab\7<\2\2bc\7?\2\2c\20\3\2\2\2de\7,\2\2e\22\3\2\2\2fg\7\61\2\2g"+
		"\24\3\2\2\2hi\7-\2\2i\26\3\2\2\2jk\7/\2\2k\30\3\2\2\2lm\7(\2\2m\32\3\2"+
		"\2\2no\7>\2\2o\34\3\2\2\2pq\7>\2\2qr\7?\2\2r\36\3\2\2\2st\7@\2\2t \3\2"+
		"\2\2uv\7@\2\2vw\7?\2\2w\"\3\2\2\2xy\7?\2\2yz\7?\2\2z$\3\2\2\2{|\7#\2\2"+
		"|}\7?\2\2}&\3\2\2\2~\177\7v\2\2\177\u0080\7g\2\2\u0080\u0081\7z\2\2\u0081"+
		"\u0082\7v\2\2\u0082\u0083\7q\2\2\u0083(\3\2\2\2\u0084\u0085\7t\2\2\u0085"+
		"\u0086\7g\2\2\u0086\u0087\7c\2\2\u0087\u0088\7n\2\2\u0088*\3\2\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c\u008d\7g\2\2"+
		"\u008d\u008e\7k\2\2\u008e\u008f\7t\2\2\u008f\u0090\7q\2\2\u0090,\3\2\2"+
		"\2\u0091\u0092\7r\2\2\u0092\u0093\7t\2\2\u0093\u0094\7q\2\2\u0094\u0095"+
		"\7i\2\2\u0095\u0096\7t\2\2\u0096\u0097\7c\2\2\u0097\u0098\7o\2\2\u0098"+
		"\u0099\7c\2\2\u0099.\3\2\2\2\u009a\u009b\7f\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7e\2\2\u009d\u009e\7n\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7t\2\2"+
		"\u00a0\u00a1\7c\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7f\2\2\u00a3\u00a4\7"+
		"g\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8"+
		"\7g\2\2\u00a8\62\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7z\2\2\u00ab\u00ac"+
		"\7g\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7v\2\2\u00af"+
		"\u00b0\7c\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7o\2\2\u00b4\u00b5\7r\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7q\2\2"+
		"\u00b7\u00b8\7i\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb"+
		"\7o\2\2\u00bb\u00bc\7c\2\2\u00bc\66\3\2\2\2\u00bd\u00be\7t\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7t\2\2\u00c2"+
		"\u00c3\7p\2\2\u00c3\u00c4\7c\2\2\u00c48\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6"+
		"\u00c7\7o\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7k\2\2"+
		"\u00ca\u00cb\7o\2\2\u00cb\u00cc\7g\2\2\u00cc:\3\2\2\2\u00cd\u00ce\7u\2"+
		"\2\u00ce\u00cf\7g\2\2\u00cf<\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7"+
		"p\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7q\2\2\u00d5>"+
		"\3\2\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7p\2\2\u00d9"+
		"\u00da\7c\2\2\u00da\u00db\7q\2\2\u00db@\3\2\2\2\u00dc\u00dd\7h\2\2\u00dd"+
		"\u00de\7k\2\2\u00de\u00df\7o\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7g\2\2"+
		"\u00e1B\3\2\2\2\u00e2\u00e3\7T\2\2\u00e3\u00e4\7G\2\2\u00e4\u00e5\7R\2"+
		"\2\u00e5\u00e6\7K\2\2\u00e6\u00e7\7V\2\2\u00e7\u00e8\7C\2\2\u00e8D\3\2"+
		"\2\2\u00e9\u00ea\7C\2\2\u00ea\u00eb\7V\2\2\u00eb\u00ec\7G\2\2\u00ecF\3"+
		"\2\2\2\u00ed\u00ef\5K&\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6\7\60"+
		"\2\2\u00f3\u00f5\5K&\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u0106\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fb\5K&\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2"+
		"\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101"+
		"\7\60\2\2\u0100\u0102\5K&\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u00ee\3\2"+
		"\2\2\u0105\u00fc\3\2\2\2\u0106H\3\2\2\2\u0107\u0109\5K&\2\u0108\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"J\3\2\2\2\u010c\u010d\t\2\2\2\u010dL\3\2\2\2\u010e\u0114\5O(\2\u010f\u0113"+
		"\7a\2\2\u0110\u0113\5O(\2\u0111\u0113\5K&\2\u0112\u010f\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115N\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118"+
		"\t\3\2\2\u0118P\3\2\2\2\u0119\u011d\7$\2\2\u011a\u011c\13\2\2\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011e\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7$\2\2\u0121"+
		"R\3\2\2\2\u0122\u0124\t\4\2\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2"+
		"\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128"+
		"\b*\2\2\u0128T\3\2\2\2\r\2\u00f0\u00f6\u00fc\u0103\u0105\u010a\u0112\u0114"+
		"\u011d\u0125\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}