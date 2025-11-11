// Generated from macro10\Macro10Lexer.g4 by ANTLR 4.9.1
package macro10;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Macro10Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADC=1, DEFINE=2, FNS=3, IFN=4, IFE=5, LDA=6, LDAI=7, LDYI=8, DOUBLESTAR=9, 
		ASSIGN=10, LE=11, GE=12, ARROW=13, NEQ=14, VARASGN=15, BOX=16, DBLQUOTE=17, 
		SEMI=18, COMMA=19, AMPERSAND=20, LPAREN=21, RPAREN=22, LBRACKET=23, RBRACKET=24, 
		COLON=25, MUL=26, DIV=27, PLUS=28, MINUS=29, LOWERTHAN=30, GREATERTHAN=31, 
		EQ=32, BAR=33, DOT=34, BACKSLASH=35, CARET=36, LETTER=37, IDENTIFIER=38, 
		INTEGER=39, DIGIT=40, COMMENT=41, WS=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ADC", "DEFINE", 
			"FNS", "IFN", "IFE", "LDA", "LDAI", "LDYI", "DOUBLESTAR", "ASSIGN", "LE", 
			"GE", "ARROW", "NEQ", "VARASGN", "BOX", "DBLQUOTE", "SEMI", "COMMA", 
			"AMPERSAND", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COLON", "MUL", 
			"DIV", "PLUS", "MINUS", "LOWERTHAN", "GREATERTHAN", "EQ", "BAR", "DOT", 
			"BACKSLASH", "CARET", "LETTER", "IDENTIFIER", "INTEGER", "DIGIT", "COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'**'", "'=='", 
			"'<='", "'>='", "'=>'", "'/='", "':='", "'<>'", "'\"'", "';'", "','", 
			"'&'", "'('", "')'", "'['", "']'", "':'", "'*'", "'/'", "'+'", "'-'", 
			"'<'", "'>'", "'='", "'|'", "'.'", "'\\'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADC", "DEFINE", "FNS", "IFN", "IFE", "LDA", "LDAI", "LDYI", "DOUBLESTAR", 
			"ASSIGN", "LE", "GE", "ARROW", "NEQ", "VARASGN", "BOX", "DBLQUOTE", "SEMI", 
			"COMMA", "AMPERSAND", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COLON", 
			"MUL", "DIV", "PLUS", "MINUS", "LOWERTHAN", "GREATERTHAN", "EQ", "BAR", 
			"DOT", "BACKSLASH", "CARET", "LETTER", "IDENTIFIER", "INTEGER", "DIGIT", 
			"COMMENT", "WS"
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


	public Macro10Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Macro10Lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u014d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3"+
		")\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A\5A\u012b\nA"+
		"\3A\3A\7A\u012f\nA\fA\16A\u0132\13A\3B\3B\3B\7B\u0137\nB\fB\16B\u013a"+
		"\13B\3C\3C\3D\3D\7D\u0140\nD\fD\16D\u0143\13D\3D\3D\3E\6E\u0148\nE\rE"+
		"\16E\u0149\3E\3E\2\2F\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27"+
		"\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\39\4"+
		";\5=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a"+
		"\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085"+
		"*\u0087+\u0089,\3\2\37\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHh"+
		"h\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2"+
		"QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4"+
		"\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\3\2\f\f\5\2\13\f\17\17\"\"\2\u013a\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\3\u008b\3\2\2\2\5\u008d\3\2\2\2\7\u008f\3\2\2\2\t\u0091\3\2\2\2\13"+
		"\u0093\3\2\2\2\r\u0095\3\2\2\2\17\u0097\3\2\2\2\21\u0099\3\2\2\2\23\u009b"+
		"\3\2\2\2\25\u009d\3\2\2\2\27\u009f\3\2\2\2\31\u00a1\3\2\2\2\33\u00a3\3"+
		"\2\2\2\35\u00a5\3\2\2\2\37\u00a7\3\2\2\2!\u00a9\3\2\2\2#\u00ab\3\2\2\2"+
		"%\u00ad\3\2\2\2\'\u00af\3\2\2\2)\u00b1\3\2\2\2+\u00b3\3\2\2\2-\u00b5\3"+
		"\2\2\2/\u00b7\3\2\2\2\61\u00b9\3\2\2\2\63\u00bb\3\2\2\2\65\u00bd\3\2\2"+
		"\2\67\u00bf\3\2\2\29\u00c3\3\2\2\2;\u00ca\3\2\2\2=\u00ce\3\2\2\2?\u00d2"+
		"\3\2\2\2A\u00d6\3\2\2\2C\u00da\3\2\2\2E\u00df\3\2\2\2G\u00e4\3\2\2\2I"+
		"\u00e7\3\2\2\2K\u00ea\3\2\2\2M\u00ed\3\2\2\2O\u00f0\3\2\2\2Q\u00f3\3\2"+
		"\2\2S\u00f6\3\2\2\2U\u00f9\3\2\2\2W\u00fc\3\2\2\2Y\u00fe\3\2\2\2[\u0100"+
		"\3\2\2\2]\u0102\3\2\2\2_\u0104\3\2\2\2a\u0106\3\2\2\2c\u0108\3\2\2\2e"+
		"\u010a\3\2\2\2g\u010c\3\2\2\2i\u010e\3\2\2\2k\u0110\3\2\2\2m\u0112\3\2"+
		"\2\2o\u0114\3\2\2\2q\u0116\3\2\2\2s\u0118\3\2\2\2u\u011a\3\2\2\2w\u011c"+
		"\3\2\2\2y\u011e\3\2\2\2{\u0120\3\2\2\2}\u0122\3\2\2\2\177\u0124\3\2\2"+
		"\2\u0081\u0126\3\2\2\2\u0083\u0133\3\2\2\2\u0085\u013b\3\2\2\2\u0087\u013d"+
		"\3\2\2\2\u0089\u0147\3\2\2\2\u008b\u008c\t\2\2\2\u008c\4\3\2\2\2\u008d"+
		"\u008e\t\3\2\2\u008e\6\3\2\2\2\u008f\u0090\t\4\2\2\u0090\b\3\2\2\2\u0091"+
		"\u0092\t\5\2\2\u0092\n\3\2\2\2\u0093\u0094\t\6\2\2\u0094\f\3\2\2\2\u0095"+
		"\u0096\t\7\2\2\u0096\16\3\2\2\2\u0097\u0098\t\b\2\2\u0098\20\3\2\2\2\u0099"+
		"\u009a\t\t\2\2\u009a\22\3\2\2\2\u009b\u009c\t\n\2\2\u009c\24\3\2\2\2\u009d"+
		"\u009e\t\13\2\2\u009e\26\3\2\2\2\u009f\u00a0\t\f\2\2\u00a0\30\3\2\2\2"+
		"\u00a1\u00a2\t\r\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\t\16\2\2\u00a4\34\3"+
		"\2\2\2\u00a5\u00a6\t\17\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\t\20\2\2\u00a8"+
		" \3\2\2\2\u00a9\u00aa\t\21\2\2\u00aa\"\3\2\2\2\u00ab\u00ac\t\22\2\2\u00ac"+
		"$\3\2\2\2\u00ad\u00ae\t\23\2\2\u00ae&\3\2\2\2\u00af\u00b0\t\24\2\2\u00b0"+
		"(\3\2\2\2\u00b1\u00b2\t\25\2\2\u00b2*\3\2\2\2\u00b3\u00b4\t\26\2\2\u00b4"+
		",\3\2\2\2\u00b5\u00b6\t\27\2\2\u00b6.\3\2\2\2\u00b7\u00b8\t\30\2\2\u00b8"+
		"\60\3\2\2\2\u00b9\u00ba\t\31\2\2\u00ba\62\3\2\2\2\u00bb\u00bc\t\32\2\2"+
		"\u00bc\64\3\2\2\2\u00bd\u00be\t\33\2\2\u00be\66\3\2\2\2\u00bf\u00c0\5"+
		"\3\2\2\u00c0\u00c1\5\t\5\2\u00c1\u00c2\5\7\4\2\u00c28\3\2\2\2\u00c3\u00c4"+
		"\5\t\5\2\u00c4\u00c5\5\13\6\2\u00c5\u00c6\5\r\7\2\u00c6\u00c7\5\23\n\2"+
		"\u00c7\u00c8\5\35\17\2\u00c8\u00c9\5\13\6\2\u00c9:\3\2\2\2\u00ca\u00cb"+
		"\5\r\7\2\u00cb\u00cc\5\35\17\2\u00cc\u00cd\5\'\24\2\u00cd<\3\2\2\2\u00ce"+
		"\u00cf\5\23\n\2\u00cf\u00d0\5\r\7\2\u00d0\u00d1\5\35\17\2\u00d1>\3\2\2"+
		"\2\u00d2\u00d3\5\23\n\2\u00d3\u00d4\5\r\7\2\u00d4\u00d5\5\13\6\2\u00d5"+
		"@\3\2\2\2\u00d6\u00d7\5\31\r\2\u00d7\u00d8\5\t\5\2\u00d8\u00d9\5\3\2\2"+
		"\u00d9B\3\2\2\2\u00da\u00db\5\31\r\2\u00db\u00dc\5\t\5\2\u00dc\u00dd\5"+
		"\3\2\2\u00dd\u00de\5\23\n\2\u00deD\3\2\2\2\u00df\u00e0\5\31\r\2\u00e0"+
		"\u00e1\5\t\5\2\u00e1\u00e2\5\63\32\2\u00e2\u00e3\5\23\n\2\u00e3F\3\2\2"+
		"\2\u00e4\u00e5\7,\2\2\u00e5\u00e6\7,\2\2\u00e6H\3\2\2\2\u00e7\u00e8\7"+
		"?\2\2\u00e8\u00e9\7?\2\2\u00e9J\3\2\2\2\u00ea\u00eb\7>\2\2\u00eb\u00ec"+
		"\7?\2\2\u00ecL\3\2\2\2\u00ed\u00ee\7@\2\2\u00ee\u00ef\7?\2\2\u00efN\3"+
		"\2\2\2\u00f0\u00f1\7?\2\2\u00f1\u00f2\7@\2\2\u00f2P\3\2\2\2\u00f3\u00f4"+
		"\7\61\2\2\u00f4\u00f5\7?\2\2\u00f5R\3\2\2\2\u00f6\u00f7\7<\2\2\u00f7\u00f8"+
		"\7?\2\2\u00f8T\3\2\2\2\u00f9\u00fa\7>\2\2\u00fa\u00fb\7@\2\2\u00fbV\3"+
		"\2\2\2\u00fc\u00fd\7$\2\2\u00fdX\3\2\2\2\u00fe\u00ff\7=\2\2\u00ffZ\3\2"+
		"\2\2\u0100\u0101\7.\2\2\u0101\\\3\2\2\2\u0102\u0103\7(\2\2\u0103^\3\2"+
		"\2\2\u0104\u0105\7*\2\2\u0105`\3\2\2\2\u0106\u0107\7+\2\2\u0107b\3\2\2"+
		"\2\u0108\u0109\7]\2\2\u0109d\3\2\2\2\u010a\u010b\7_\2\2\u010bf\3\2\2\2"+
		"\u010c\u010d\7<\2\2\u010dh\3\2\2\2\u010e\u010f\7,\2\2\u010fj\3\2\2\2\u0110"+
		"\u0111\7\61\2\2\u0111l\3\2\2\2\u0112\u0113\7-\2\2\u0113n\3\2\2\2\u0114"+
		"\u0115\7/\2\2\u0115p\3\2\2\2\u0116\u0117\7>\2\2\u0117r\3\2\2\2\u0118\u0119"+
		"\7@\2\2\u0119t\3\2\2\2\u011a\u011b\7?\2\2\u011bv\3\2\2\2\u011c\u011d\7"+
		"~\2\2\u011dx\3\2\2\2\u011e\u011f\7\60\2\2\u011fz\3\2\2\2\u0120\u0121\7"+
		"^\2\2\u0121|\3\2\2\2\u0122\u0123\7`\2\2\u0123~\3\2\2\2\u0124\u0125\t\34"+
		"\2\2\u0125\u0080\3\2\2\2\u0126\u0130\5\177@\2\u0127\u012a\7a\2\2\u0128"+
		"\u012b\5\177@\2\u0129\u012b\5\u0085C\2\u012a\u0128\3\2\2\2\u012a\u0129"+
		"\3\2\2\2\u012b\u012f\3\2\2\2\u012c\u012f\5\177@\2\u012d\u012f\5\u0085"+
		"C\2\u012e\u0127\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f"+
		"\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0082\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0133\u0138\5\u0085C\2\u0134\u0137\7a\2\2\u0135"+
		"\u0137\5\u0085C\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u013a"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0084\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013c\4\62;\2\u013c\u0086\3\2\2\2\u013d\u0141\7="+
		"\2\2\u013e\u0140\n\35\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0144\u0145\bD\2\2\u0145\u0088\3\2\2\2\u0146\u0148\t\36\2\2\u0147"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014c\bE\2\2\u014c\u008a\3\2\2\2\n\2\u012a"+
		"\u012e\u0130\u0136\u0138\u0141\u0149\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}