// Generated from grammar/KoKoslan.g4 by ANTLR 4.7
package kokoslan.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KoKoslanLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUMBER=2, STRING=3, DOT=4, BACK_SLASH=5, COMMA=6, COLON=7, QUESTION_MARK=8, 
		LEFT_PAR=9, RIGHT_PAR=10, LEFT_CURLY=11, RIGHT_CURLY=12, LEFT_BRACKET=13, 
		RIGHT_BRACKET=14, LET=15, NOT=16, EQ=17, NEQ=18, LEQ=19, OR=20, AND=21, 
		TRUE=22, FALSE=23, MUL=24, DIV=25, ADD=26, SUB=27, ID=28, MAYOR_QUE=29, 
		MENOR_QUE=30, EQUALS=31, PRINT=32, FIRST=33, REST=34, CONS=35, FAIL=36, 
		ARROW=37, SLC=38, MLC=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "NUMBER", "INTEGER", "STRING", "DOT", "BACK_SLASH", "COMMA", "COLON", 
		"QUESTION_MARK", "LEFT_PAR", "RIGHT_PAR", "LEFT_CURLY", "RIGHT_CURLY", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "LET", "NOT", "EQ", "NEQ", "LEQ", "OR", 
		"AND", "TRUE", "FALSE", "MUL", "DIV", "ADD", "SUB", "ID", "MAYOR_QUE", 
		"MENOR_QUE", "EQUALS", "PRINT", "FIRST", "REST", "CONS", "FAIL", "ARROW", 
		"SLC", "MLC", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'|'", null, null, "'.'", "'\\'", "','", "':'", "'?'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "'let'", "'!'", "'='", "'!='", "'<='", "'||'", 
		"'&&'", "'true'", "'false'", "'*'", "'/'", "'+'", "'-'", null, "'>'", 
		"'<'", "'=='", "'print'", "'first'", "'rest'", "'cons'", "'fail'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "NUMBER", "STRING", "DOT", "BACK_SLASH", "COMMA", "COLON", 
		"QUESTION_MARK", "LEFT_PAR", "RIGHT_PAR", "LEFT_CURLY", "RIGHT_CURLY", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "LET", "NOT", "EQ", "NEQ", "LEQ", "OR", 
		"AND", "TRUE", "FALSE", "MUL", "DIV", "ADD", "SUB", "ID", "MAYOR_QUE", 
		"MENOR_QUE", "EQUALS", "PRINT", "FIRST", "REST", "CONS", "FAIL", "ARROW", 
		"SLC", "MLC", "WS"
	};
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


	public KoKoslanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KoKoslan.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00fb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\5\3Y\n\3\3\3\3\3\3\3\5\3^\n\3\3\4\6\4a\n\4\r\4\16\4b\3\5\3\5\7\5"+
		"g\n\5\f\5\16\5j\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\7\36\u00ad\n\36\f\36"+
		"\16\36\u00b0\13\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\7(\u00db\n(\f(\16(\u00de\13(\3(\3(\3(\3(\3(\3)\3)\3)"+
		"\3)\7)\u00e9\n)\f)\16)\u00ec\13)\3)\5)\u00ef\n)\3)\3)\3)\3)\3*\6*\u00f6"+
		"\n*\r*\16*\u00f7\3*\3*\4\u00dc\u00ea\2+\3\3\5\4\7\2\t\5\13\6\r\7\17\b"+
		"\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26"+
		"-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*\3"+
		"\2\7\3\2\62;\3\2$$\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0102"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5X"+
		"\3\2\2\2\7`\3\2\2\2\td\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21s"+
		"\3\2\2\2\23u\3\2\2\2\25w\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35"+
		"\177\3\2\2\2\37\u0081\3\2\2\2!\u0083\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2"+
		"\2\2\'\u008b\3\2\2\2)\u008e\3\2\2\2+\u0091\3\2\2\2-\u0094\3\2\2\2/\u0097"+
		"\3\2\2\2\61\u009c\3\2\2\2\63\u00a2\3\2\2\2\65\u00a4\3\2\2\2\67\u00a6\3"+
		"\2\2\29\u00a8\3\2\2\2;\u00aa\3\2\2\2=\u00b1\3\2\2\2?\u00b3\3\2\2\2A\u00b5"+
		"\3\2\2\2C\u00b8\3\2\2\2E\u00be\3\2\2\2G\u00c4\3\2\2\2I\u00c9\3\2\2\2K"+
		"\u00ce\3\2\2\2M\u00d3\3\2\2\2O\u00d6\3\2\2\2Q\u00e4\3\2\2\2S\u00f5\3\2"+
		"\2\2UV\7~\2\2V\4\3\2\2\2WY\7/\2\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z]\5\7"+
		"\4\2[\\\7\60\2\2\\^\5\7\4\2][\3\2\2\2]^\3\2\2\2^\6\3\2\2\2_a\t\2\2\2`"+
		"_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\b\3\2\2\2dh\7$\2\2eg\n\3\2\2"+
		"fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7$\2\2"+
		"l\n\3\2\2\2mn\7\60\2\2n\f\3\2\2\2op\7^\2\2p\16\3\2\2\2qr\7.\2\2r\20\3"+
		"\2\2\2st\7<\2\2t\22\3\2\2\2uv\7A\2\2v\24\3\2\2\2wx\7*\2\2x\26\3\2\2\2"+
		"yz\7+\2\2z\30\3\2\2\2{|\7}\2\2|\32\3\2\2\2}~\7\177\2\2~\34\3\2\2\2\177"+
		"\u0080\7]\2\2\u0080\36\3\2\2\2\u0081\u0082\7_\2\2\u0082 \3\2\2\2\u0083"+
		"\u0084\7n\2\2\u0084\u0085\7g\2\2\u0085\u0086\7v\2\2\u0086\"\3\2\2\2\u0087"+
		"\u0088\7#\2\2\u0088$\3\2\2\2\u0089\u008a\7?\2\2\u008a&\3\2\2\2\u008b\u008c"+
		"\7#\2\2\u008c\u008d\7?\2\2\u008d(\3\2\2\2\u008e\u008f\7>\2\2\u008f\u0090"+
		"\7?\2\2\u0090*\3\2\2\2\u0091\u0092\7~\2\2\u0092\u0093\7~\2\2\u0093,\3"+
		"\2\2\2\u0094\u0095\7(\2\2\u0095\u0096\7(\2\2\u0096.\3\2\2\2\u0097\u0098"+
		"\7v\2\2\u0098\u0099\7t\2\2\u0099\u009a\7w\2\2\u009a\u009b\7g\2\2\u009b"+
		"\60\3\2\2\2\u009c\u009d\7h\2\2\u009d\u009e\7c\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\62\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3"+
		"\64\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\66\3\2\2\2\u00a6\u00a7\7-\2\2\u00a7"+
		"8\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9:\3\2\2\2\u00aa\u00ae\t\4\2\2\u00ab"+
		"\u00ad\t\5\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af<\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2"+
		"\7@\2\2\u00b2>\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4@\3\2\2\2\u00b5\u00b6\7"+
		"?\2\2\u00b6\u00b7\7?\2\2\u00b7B\3\2\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba"+
		"\7t\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7v\2\2\u00bd"+
		"D\3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7t\2\2\u00c1"+
		"\u00c2\7u\2\2\u00c2\u00c3\7v\2\2\u00c3F\3\2\2\2\u00c4\u00c5\7t\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7v\2\2\u00c8H\3\2\2\2\u00c9"+
		"\u00ca\7e\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7u\2\2"+
		"\u00cdJ\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7k\2"+
		"\2\u00d1\u00d2\7n\2\2\u00d2L\3\2\2\2\u00d3\u00d4\7/\2\2\u00d4\u00d5\7"+
		"@\2\2\u00d5N\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7\u00d8\7,\2\2\u00d8\u00dc"+
		"\3\2\2\2\u00d9\u00db\13\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e0\7,\2\2\u00e0\u00e1\7\61\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\b(\2\2\u00e3P\3\2\2\2\u00e4\u00e5\7\61\2\2\u00e5\u00e6\7\61\2\2"+
		"\u00e6\u00ea\3\2\2\2\u00e7\u00e9\13\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ef\7\17\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\f\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\b)\2\2\u00f3R\3\2\2\2\u00f4\u00f6\t\6\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fa\b*\2\2\u00faT\3\2\2\2\f\2X]bh\u00ae\u00dc\u00ea\u00ee"+
		"\u00f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}