// Generated from macro10\Macro10Parser.g4 by ANTLR 4.9.1
package macro10;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Macro10Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADC=1, AND=2, ASL=3, BCC=4, BCS=5, BEQ=6, BIT=7, BMI=8, BNE=9, BPL=10, 
		BRK=11, BVC=12, BVS=13, CLC=14, CLD=15, CLI=16, CLV=17, CMP=18, CPX=19, 
		CPY=20, DEC=21, DEX=22, DEY=23, EOR=24, INC=25, INX=26, INY=27, JMP=28, 
		JSR=29, LDA=30, LDX=31, LDY=32, LSR=33, NOP=34, ORA=35, PHA=36, PHP=37, 
		PLA=38, PLP=39, ROL=40, ROR=41, RTI=42, RTS=43, SBC=44, SEC=45, SED=46, 
		SEI=47, STA=48, STX=49, STY=50, TAX=51, TAY=52, TSX=53, TXA=54, TXS=55, 
		TYA=56, LDAI=57, LDYI=58, DEFINE=59, FNS=60, IFN=61, IFE=62, DOUBLESTAR=63, 
		ASSIGN=64, LE=65, GE=66, ARROW=67, NEQ=68, VARASGN=69, BOX=70, DBLQUOTE=71, 
		SEMI=72, COMMA=73, AMPERSAND=74, LPAREN=75, RPAREN=76, LBRACKET=77, RBRACKET=78, 
		COLON=79, MUL=80, DIV=81, PLUS=82, MINUS=83, LOWERTHAN=84, GREATERTHAN=85, 
		EQ=86, BAR=87, DOT=88, BACKSLASH=89, CARET=90, LETTER=91, IDENTIFIER=92, 
		INTEGER=93, DIGIT=94, COMMENT=95, WS=96;
	public static final int
		RULE_asm_file = 0, RULE_assembler_instruction_line = 1, RULE_assembler_instruction = 2, 
		RULE_macro_definition = 3, RULE_macro_params = 4, RULE_macro_param_list = 5, 
		RULE_macro_param = 6, RULE_comma_list = 7, RULE_comma_list_element = 8, 
		RULE_mnemonic_line = 9, RULE_mnemonic = 10, RULE_label = 11, RULE_block = 12, 
		RULE_variable_definition = 13, RULE_variable_equality_definition = 14, 
		RULE_param_list = 15, RULE_param = 16, RULE_expr = 17, RULE_macro_call_line = 18, 
		RULE_identifier_list = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"asm_file", "assembler_instruction_line", "assembler_instruction", "macro_definition", 
			"macro_params", "macro_param_list", "macro_param", "comma_list", "comma_list_element", 
			"mnemonic_line", "mnemonic", "label", "block", "variable_definition", 
			"variable_equality_definition", "param_list", "param", "expr", "macro_call_line", 
			"identifier_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'**'", "'=='", "'<='", "'>='", "'=>'", "'/='", "':='", 
			"'<>'", "'\"'", "';'", "','", "'&'", "'('", "')'", "'['", "']'", "':'", 
			"'*'", "'/'", "'+'", "'-'", "'<'", "'>'", "'='", "'|'", "'.'", "'\\'", 
			"'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADC", "AND", "ASL", "BCC", "BCS", "BEQ", "BIT", "BMI", "BNE", 
			"BPL", "BRK", "BVC", "BVS", "CLC", "CLD", "CLI", "CLV", "CMP", "CPX", 
			"CPY", "DEC", "DEX", "DEY", "EOR", "INC", "INX", "INY", "JMP", "JSR", 
			"LDA", "LDX", "LDY", "LSR", "NOP", "ORA", "PHA", "PHP", "PLA", "PLP", 
			"ROL", "ROR", "RTI", "RTS", "SBC", "SEC", "SED", "SEI", "STA", "STX", 
			"STY", "TAX", "TAY", "TSX", "TXA", "TXS", "TYA", "LDAI", "LDYI", "DEFINE", 
			"FNS", "IFN", "IFE", "DOUBLESTAR", "ASSIGN", "LE", "GE", "ARROW", "NEQ", 
			"VARASGN", "BOX", "DBLQUOTE", "SEMI", "COMMA", "AMPERSAND", "LPAREN", 
			"RPAREN", "LBRACKET", "RBRACKET", "COLON", "MUL", "DIV", "PLUS", "MINUS", 
			"LOWERTHAN", "GREATERTHAN", "EQ", "BAR", "DOT", "BACKSLASH", "CARET", 
			"LETTER", "IDENTIFIER", "INTEGER", "DIGIT", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Macro10Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Macro10Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Asm_fileContext extends ParserRuleContext {
		public Variable_definitionContext variable_definition() {
			return getRuleContext(Variable_definitionContext.class,0);
		}
		public Variable_equality_definitionContext variable_equality_definition() {
			return getRuleContext(Variable_equality_definitionContext.class,0);
		}
		public Mnemonic_lineContext mnemonic_line() {
			return getRuleContext(Mnemonic_lineContext.class,0);
		}
		public Assembler_instruction_lineContext assembler_instruction_line() {
			return getRuleContext(Assembler_instruction_lineContext.class,0);
		}
		public Macro_call_lineContext macro_call_line() {
			return getRuleContext(Macro_call_lineContext.class,0);
		}
		public Asm_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asm_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterAsm_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitAsm_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitAsm_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asm_fileContext asm_file() throws RecognitionException {
		Asm_fileContext _localctx = new Asm_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_asm_file);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				variable_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				variable_equality_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				mnemonic_line();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				assembler_instruction_line();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				macro_call_line();
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

	public static class Assembler_instruction_lineContext extends ParserRuleContext {
		public Assembler_instructionContext assembler_instruction() {
			return getRuleContext(Assembler_instructionContext.class,0);
		}
		public Assembler_instruction_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembler_instruction_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterAssembler_instruction_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitAssembler_instruction_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitAssembler_instruction_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assembler_instruction_lineContext assembler_instruction_line() throws RecognitionException {
		Assembler_instruction_lineContext _localctx = new Assembler_instruction_lineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assembler_instruction_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			assembler_instruction();
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

	public static class Assembler_instructionContext extends ParserRuleContext {
		public Macro_definitionContext macro_definition() {
			return getRuleContext(Macro_definitionContext.class,0);
		}
		public TerminalNode IFE() { return getToken(Macro10Parser.IFE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Macro10Parser.COMMA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IFN() { return getToken(Macro10Parser.IFN, 0); }
		public TerminalNode FNS() { return getToken(Macro10Parser.FNS, 0); }
		public Assembler_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembler_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterAssembler_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitAssembler_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitAssembler_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assembler_instructionContext assembler_instruction() throws RecognitionException {
		Assembler_instructionContext _localctx = new Assembler_instructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assembler_instruction);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				macro_definition();
				}
				break;
			case IFE:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(IFE);
				setState(51);
				expr(0);
				setState(52);
				match(COMMA);
				setState(53);
				block();
				}
				break;
			case IFN:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(IFN);
				setState(56);
				expr(0);
				setState(57);
				match(COMMA);
				setState(58);
				block();
				}
				break;
			case FNS:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				match(FNS);
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

	public static class Macro_definitionContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(Macro10Parser.DEFINE, 0); }
		public TerminalNode COMMA() { return getToken(Macro10Parser.COMMA, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Macro10Parser.IDENTIFIER, 0); }
		public MnemonicContext mnemonic() {
			return getRuleContext(MnemonicContext.class,0);
		}
		public Macro_paramsContext macro_params() {
			return getRuleContext(Macro_paramsContext.class,0);
		}
		public Macro_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterMacro_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitMacro_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitMacro_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_definitionContext macro_definition() throws RecognitionException {
		Macro_definitionContext _localctx = new Macro_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_macro_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(DEFINE);
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(64);
				match(IDENTIFIER);
				}
				break;
			case ADC:
			case AND:
			case ASL:
			case BCC:
			case BCS:
			case BEQ:
			case BIT:
			case BMI:
			case BNE:
			case BPL:
			case BRK:
			case BVC:
			case BVS:
			case CLC:
			case CLD:
			case CLI:
			case CLV:
			case CMP:
			case CPX:
			case CPY:
			case DEC:
			case DEX:
			case DEY:
			case EOR:
			case INC:
			case INX:
			case INY:
			case JMP:
			case JSR:
			case LDA:
			case LDX:
			case LDY:
			case LSR:
			case NOP:
			case ORA:
			case PHA:
			case PHP:
			case PLA:
			case PLP:
			case ROL:
			case ROR:
			case RTI:
			case RTS:
			case SBC:
			case SEC:
			case SED:
			case SEI:
			case STA:
			case STX:
			case STY:
			case TAX:
			case TAY:
			case TSX:
			case TXA:
			case TXS:
			case TYA:
			case LDAI:
			case LDYI:
				{
				setState(65);
				mnemonic();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==IDENTIFIER) {
				{
				setState(68);
				macro_params();
				}
			}

			setState(71);
			match(COMMA);
			setState(72);
			block();
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

	public static class Macro_paramsContext extends ParserRuleContext {
		public Macro_param_listContext macro_param_list() {
			return getRuleContext(Macro_param_listContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Macro10Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Macro10Parser.RPAREN, 0); }
		public Macro_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterMacro_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitMacro_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitMacro_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_paramsContext macro_params() throws RecognitionException {
		Macro_paramsContext _localctx = new Macro_paramsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_macro_params);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				macro_param_list();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(LPAREN);
				setState(76);
				macro_param_list();
				setState(77);
				match(RPAREN);
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

	public static class Macro_param_listContext extends ParserRuleContext {
		public Macro_paramContext macro_param() {
			return getRuleContext(Macro_paramContext.class,0);
		}
		public Macro_param_listContext macro_param_list() {
			return getRuleContext(Macro_param_listContext.class,0);
		}
		public Macro_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterMacro_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitMacro_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitMacro_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_param_listContext macro_param_list() throws RecognitionException {
		Macro_param_listContext _localctx = new Macro_param_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_macro_param_list);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				macro_param();
				setState(82);
				macro_param_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				macro_param();
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

	public static class Macro_paramContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Macro10Parser.IDENTIFIER, 0); }
		public Macro_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterMacro_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitMacro_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitMacro_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_paramContext macro_param() throws RecognitionException {
		Macro_paramContext _localctx = new Macro_paramContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_macro_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IDENTIFIER);
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

	public static class Comma_listContext extends ParserRuleContext {
		public Comma_list_elementContext comma_list_element() {
			return getRuleContext(Comma_list_elementContext.class,0);
		}
		public Comma_listContext comma_list() {
			return getRuleContext(Comma_listContext.class,0);
		}
		public Comma_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterComma_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitComma_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitComma_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_listContext comma_list() throws RecognitionException {
		Comma_listContext _localctx = new Comma_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comma_list);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				comma_list_element();
				setState(90);
				comma_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				comma_list_element();
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

	public static class Comma_list_elementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Comma_list_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_list_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterComma_list_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitComma_list_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitComma_list_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_list_elementContext comma_list_element() throws RecognitionException {
		Comma_list_elementContext _localctx = new Comma_list_elementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comma_list_element);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				block();
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

	public static class Mnemonic_lineContext extends ParserRuleContext {
		public MnemonicContext mnemonic() {
			return getRuleContext(MnemonicContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Mnemonic_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mnemonic_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterMnemonic_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitMnemonic_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitMnemonic_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mnemonic_lineContext mnemonic_line() throws RecognitionException {
		Mnemonic_lineContext _localctx = new Mnemonic_lineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mnemonic_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(99);
				label();
				}
			}

			setState(102);
			mnemonic();
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(103);
				block();
				}
				break;
			case 2:
				{
				setState(104);
				param_list();
				}
				break;
			}
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

	public static class MnemonicContext extends ParserRuleContext {
		public TerminalNode LDA() { return getToken(Macro10Parser.LDA, 0); }
		public TerminalNode LDAI() { return getToken(Macro10Parser.LDAI, 0); }
		public TerminalNode LDYI() { return getToken(Macro10Parser.LDYI, 0); }
		public TerminalNode ADC() { return getToken(Macro10Parser.ADC, 0); }
		public TerminalNode AND() { return getToken(Macro10Parser.AND, 0); }
		public TerminalNode ASL() { return getToken(Macro10Parser.ASL, 0); }
		public TerminalNode BCC() { return getToken(Macro10Parser.BCC, 0); }
		public TerminalNode BCS() { return getToken(Macro10Parser.BCS, 0); }
		public TerminalNode BEQ() { return getToken(Macro10Parser.BEQ, 0); }
		public TerminalNode BIT() { return getToken(Macro10Parser.BIT, 0); }
		public TerminalNode BMI() { return getToken(Macro10Parser.BMI, 0); }
		public TerminalNode BNE() { return getToken(Macro10Parser.BNE, 0); }
		public TerminalNode BPL() { return getToken(Macro10Parser.BPL, 0); }
		public TerminalNode BRK() { return getToken(Macro10Parser.BRK, 0); }
		public TerminalNode BVC() { return getToken(Macro10Parser.BVC, 0); }
		public TerminalNode BVS() { return getToken(Macro10Parser.BVS, 0); }
		public TerminalNode CLC() { return getToken(Macro10Parser.CLC, 0); }
		public TerminalNode CLD() { return getToken(Macro10Parser.CLD, 0); }
		public TerminalNode CLI() { return getToken(Macro10Parser.CLI, 0); }
		public TerminalNode CLV() { return getToken(Macro10Parser.CLV, 0); }
		public TerminalNode CMP() { return getToken(Macro10Parser.CMP, 0); }
		public TerminalNode CPX() { return getToken(Macro10Parser.CPX, 0); }
		public TerminalNode CPY() { return getToken(Macro10Parser.CPY, 0); }
		public TerminalNode DEC() { return getToken(Macro10Parser.DEC, 0); }
		public TerminalNode DEX() { return getToken(Macro10Parser.DEX, 0); }
		public TerminalNode DEY() { return getToken(Macro10Parser.DEY, 0); }
		public TerminalNode EOR() { return getToken(Macro10Parser.EOR, 0); }
		public TerminalNode INC() { return getToken(Macro10Parser.INC, 0); }
		public TerminalNode INX() { return getToken(Macro10Parser.INX, 0); }
		public TerminalNode INY() { return getToken(Macro10Parser.INY, 0); }
		public TerminalNode JMP() { return getToken(Macro10Parser.JMP, 0); }
		public TerminalNode JSR() { return getToken(Macro10Parser.JSR, 0); }
		public TerminalNode LDX() { return getToken(Macro10Parser.LDX, 0); }
		public TerminalNode LDY() { return getToken(Macro10Parser.LDY, 0); }
		public TerminalNode LSR() { return getToken(Macro10Parser.LSR, 0); }
		public TerminalNode NOP() { return getToken(Macro10Parser.NOP, 0); }
		public TerminalNode ORA() { return getToken(Macro10Parser.ORA, 0); }
		public TerminalNode PHA() { return getToken(Macro10Parser.PHA, 0); }
		public TerminalNode PHP() { return getToken(Macro10Parser.PHP, 0); }
		public TerminalNode PLA() { return getToken(Macro10Parser.PLA, 0); }
		public TerminalNode PLP() { return getToken(Macro10Parser.PLP, 0); }
		public TerminalNode ROL() { return getToken(Macro10Parser.ROL, 0); }
		public TerminalNode ROR() { return getToken(Macro10Parser.ROR, 0); }
		public TerminalNode RTI() { return getToken(Macro10Parser.RTI, 0); }
		public TerminalNode RTS() { return getToken(Macro10Parser.RTS, 0); }
		public TerminalNode SBC() { return getToken(Macro10Parser.SBC, 0); }
		public TerminalNode SEC() { return getToken(Macro10Parser.SEC, 0); }
		public TerminalNode SED() { return getToken(Macro10Parser.SED, 0); }
		public TerminalNode SEI() { return getToken(Macro10Parser.SEI, 0); }
		public TerminalNode STA() { return getToken(Macro10Parser.STA, 0); }
		public TerminalNode STX() { return getToken(Macro10Parser.STX, 0); }
		public TerminalNode STY() { return getToken(Macro10Parser.STY, 0); }
		public TerminalNode TAX() { return getToken(Macro10Parser.TAX, 0); }
		public TerminalNode TAY() { return getToken(Macro10Parser.TAY, 0); }
		public TerminalNode TSX() { return getToken(Macro10Parser.TSX, 0); }
		public TerminalNode TXA() { return getToken(Macro10Parser.TXA, 0); }
		public TerminalNode TXS() { return getToken(Macro10Parser.TXS, 0); }
		public TerminalNode TYA() { return getToken(Macro10Parser.TYA, 0); }
		public MnemonicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mnemonic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterMnemonic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitMnemonic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitMnemonic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MnemonicContext mnemonic() throws RecognitionException {
		MnemonicContext _localctx = new MnemonicContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mnemonic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADC) | (1L << AND) | (1L << ASL) | (1L << BCC) | (1L << BCS) | (1L << BEQ) | (1L << BIT) | (1L << BMI) | (1L << BNE) | (1L << BPL) | (1L << BRK) | (1L << BVC) | (1L << BVS) | (1L << CLC) | (1L << CLD) | (1L << CLI) | (1L << CLV) | (1L << CMP) | (1L << CPX) | (1L << CPY) | (1L << DEC) | (1L << DEX) | (1L << DEY) | (1L << EOR) | (1L << INC) | (1L << INX) | (1L << INY) | (1L << JMP) | (1L << JSR) | (1L << LDA) | (1L << LDX) | (1L << LDY) | (1L << LSR) | (1L << NOP) | (1L << ORA) | (1L << PHA) | (1L << PHP) | (1L << PLA) | (1L << PLP) | (1L << ROL) | (1L << ROR) | (1L << RTI) | (1L << RTS) | (1L << SBC) | (1L << SEC) | (1L << SED) | (1L << SEI) | (1L << STA) | (1L << STX) | (1L << STY) | (1L << TAX) | (1L << TAY) | (1L << TSX) | (1L << TXA) | (1L << TXS) | (1L << TYA) | (1L << LDAI) | (1L << LDYI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Macro10Parser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(Macro10Parser.COLON, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(IDENTIFIER);
			setState(110);
			match(COLON);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LOWERTHAN() { return getToken(Macro10Parser.LOWERTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(Macro10Parser.GREATERTHAN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Macro10Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Macro10Parser.IDENTIFIER, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Mnemonic_lineContext> mnemonic_line() {
			return getRuleContexts(Mnemonic_lineContext.class);
		}
		public Mnemonic_lineContext mnemonic_line(int i) {
			return getRuleContext(Mnemonic_lineContext.class,i);
		}
		public List<Assembler_instruction_lineContext> assembler_instruction_line() {
			return getRuleContexts(Assembler_instruction_lineContext.class);
		}
		public Assembler_instruction_lineContext assembler_instruction_line(int i) {
			return getRuleContext(Assembler_instruction_lineContext.class,i);
		}
		public List<Macro_call_lineContext> macro_call_line() {
			return getRuleContexts(Macro_call_lineContext.class);
		}
		public Macro_call_lineContext macro_call_line(int i) {
			return getRuleContext(Macro_call_lineContext.class,i);
		}
		public List<Variable_definitionContext> variable_definition() {
			return getRuleContexts(Variable_definitionContext.class);
		}
		public Variable_definitionContext variable_definition(int i) {
			return getRuleContext(Variable_definitionContext.class,i);
		}
		public List<Variable_equality_definitionContext> variable_equality_definition() {
			return getRuleContexts(Variable_equality_definitionContext.class);
		}
		public Variable_equality_definitionContext variable_equality_definition(int i) {
			return getRuleContext(Variable_equality_definitionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(LOWERTHAN);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(113);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(114);
					expr(0);
					}
					break;
				case 3:
					{
					setState(115);
					mnemonic_line();
					}
					break;
				case 4:
					{
					setState(116);
					assembler_instruction_line();
					}
					break;
				case 5:
					{
					setState(117);
					macro_call_line();
					}
					break;
				case 6:
					{
					setState(118);
					variable_definition();
					}
					break;
				case 7:
					{
					setState(119);
					variable_equality_definition();
					}
					break;
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADC) | (1L << AND) | (1L << ASL) | (1L << BCC) | (1L << BCS) | (1L << BEQ) | (1L << BIT) | (1L << BMI) | (1L << BNE) | (1L << BPL) | (1L << BRK) | (1L << BVC) | (1L << BVS) | (1L << CLC) | (1L << CLD) | (1L << CLI) | (1L << CLV) | (1L << CMP) | (1L << CPX) | (1L << CPY) | (1L << DEC) | (1L << DEX) | (1L << DEY) | (1L << EOR) | (1L << INC) | (1L << INX) | (1L << INY) | (1L << JMP) | (1L << JSR) | (1L << LDA) | (1L << LDX) | (1L << LDY) | (1L << LSR) | (1L << NOP) | (1L << ORA) | (1L << PHA) | (1L << PHP) | (1L << PLA) | (1L << PLP) | (1L << ROL) | (1L << ROR) | (1L << RTI) | (1L << RTS) | (1L << SBC) | (1L << SEC) | (1L << SED) | (1L << SEI) | (1L << STA) | (1L << STX) | (1L << STY) | (1L << TAX) | (1L << TAY) | (1L << TSX) | (1L << TXA) | (1L << TXS) | (1L << TYA) | (1L << LDAI) | (1L << LDYI) | (1L << DEFINE) | (1L << FNS) | (1L << IFN) | (1L << IFE))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (LOWERTHAN - 84)) | (1L << (DOT - 84)) | (1L << (CARET - 84)) | (1L << (IDENTIFIER - 84)) | (1L << (INTEGER - 84)))) != 0) );
			setState(124);
			match(GREATERTHAN);
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

	public static class Variable_definitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Macro10Parser.IDENTIFIER, 0); }
		public TerminalNode EQ() { return getToken(Macro10Parser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterVariable_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitVariable_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitVariable_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IDENTIFIER);
			setState(127);
			match(EQ);
			setState(128);
			expr(0);
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

	public static class Variable_equality_definitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Macro10Parser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(Macro10Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Variable_equality_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_equality_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterVariable_equality_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitVariable_equality_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitVariable_equality_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_equality_definitionContext variable_equality_definition() throws RecognitionException {
		Variable_equality_definitionContext _localctx = new Variable_equality_definitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable_equality_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IDENTIFIER);
			setState(131);
			match(ASSIGN);
			setState(132);
			expr(0);
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

	public static class Param_listContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param_list);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				param();
				setState(135);
				param_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				param();
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

	public static class ParamContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode CARET() { return getToken(Macro10Parser.CARET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Macro10Parser.IDENTIFIER, 0); }
		public TerminalNode INTEGER() { return getToken(Macro10Parser.INTEGER, 0); }
		public TerminalNode DOT() { return getToken(Macro10Parser.DOT, 0); }
		public TerminalNode AMPERSAND() { return getToken(Macro10Parser.AMPERSAND, 0); }
		public TerminalNode PLUS() { return getToken(Macro10Parser.PLUS, 0); }
		public TerminalNode MUL() { return getToken(Macro10Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Macro10Parser.DIV, 0); }
		public TerminalNode MINUS() { return getToken(Macro10Parser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARET:
				{
				setState(143);
				match(CARET);
				setState(144);
				expr(10);
				}
				break;
			case LOWERTHAN:
				{
				setState(145);
				block();
				}
				break;
			case IDENTIFIER:
				{
				setState(146);
				match(IDENTIFIER);
				}
				break;
			case INTEGER:
				{
				setState(147);
				match(INTEGER);
				}
				break;
			case DOT:
				{
				setState(148);
				match(DOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(166);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(152);
						match(AMPERSAND);
						setState(153);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(155);
						match(PLUS);
						setState(156);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(158);
						match(MUL);
						setState(159);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(161);
						match(DIV);
						setState(162);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(164);
						match(MINUS);
						setState(165);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Macro_call_lineContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Macro10Parser.IDENTIFIER, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Macro_call_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_call_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterMacro_call_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitMacro_call_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitMacro_call_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Macro_call_lineContext macro_call_line() throws RecognitionException {
		Macro_call_lineContext _localctx = new Macro_call_lineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_macro_call_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IDENTIFIER);
			setState(172);
			identifier_list();
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

	public static class Identifier_listContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Macro10Parser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(Macro10Parser.COMMA, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Macro10ParserListener ) ((Macro10ParserListener)listener).exitIdentifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Macro10ParserVisitor ) return ((Macro10ParserVisitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identifier_list);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(IDENTIFIER);
				setState(175);
				match(COMMA);
				setState(176);
				identifier_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(IDENTIFIER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3b\u00b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\5\2\60\n\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5"+
		"\5\5E\n\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\7\3"+
		"\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\t\3\t\3\t\3\t\5\t`\n\t\3\n\3\n\5\nd\n\n"+
		"\3\13\5\13g\n\13\3\13\3\13\3\13\5\13l\n\13\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16{\n\16\r\16\16\16|\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u008d\n\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0098\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u00a9\n\23\f\23\16\23\u00ac\13\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\5\25\u00b5\n\25\3\25\2\3$\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(\2\3\3\2\3<\2\u00c3\2/\3\2\2\2\4\61\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2"+
		"\nQ\3\2\2\2\fW\3\2\2\2\16Y\3\2\2\2\20_\3\2\2\2\22c\3\2\2\2\24f\3\2\2\2"+
		"\26m\3\2\2\2\30o\3\2\2\2\32r\3\2\2\2\34\u0080\3\2\2\2\36\u0084\3\2\2\2"+
		" \u008c\3\2\2\2\"\u008e\3\2\2\2$\u0097\3\2\2\2&\u00ad\3\2\2\2(\u00b4\3"+
		"\2\2\2*\60\5\34\17\2+\60\5\36\20\2,\60\5\24\13\2-\60\5\4\3\2.\60\5&\24"+
		"\2/*\3\2\2\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\3\3\2\2\2\61\62"+
		"\5\6\4\2\62\5\3\2\2\2\63@\5\b\5\2\64\65\7@\2\2\65\66\5$\23\2\66\67\7K"+
		"\2\2\678\5\32\16\28@\3\2\2\29:\7?\2\2:;\5$\23\2;<\7K\2\2<=\5\32\16\2="+
		"@\3\2\2\2>@\7>\2\2?\63\3\2\2\2?\64\3\2\2\2?9\3\2\2\2?>\3\2\2\2@\7\3\2"+
		"\2\2AD\7=\2\2BE\7^\2\2CE\5\26\f\2DB\3\2\2\2DC\3\2\2\2EG\3\2\2\2FH\5\n"+
		"\6\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7K\2\2JK\5\32\16\2K\t\3\2\2\2LR\5"+
		"\f\7\2MN\7M\2\2NO\5\f\7\2OP\7N\2\2PR\3\2\2\2QL\3\2\2\2QM\3\2\2\2R\13\3"+
		"\2\2\2ST\5\16\b\2TU\5\f\7\2UX\3\2\2\2VX\5\16\b\2WS\3\2\2\2WV\3\2\2\2X"+
		"\r\3\2\2\2YZ\7^\2\2Z\17\3\2\2\2[\\\5\22\n\2\\]\5\20\t\2]`\3\2\2\2^`\5"+
		"\22\n\2_[\3\2\2\2_^\3\2\2\2`\21\3\2\2\2ad\5$\23\2bd\5\32\16\2ca\3\2\2"+
		"\2cb\3\2\2\2d\23\3\2\2\2eg\5\30\r\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hk\5"+
		"\26\f\2il\5\32\16\2jl\5 \21\2ki\3\2\2\2kj\3\2\2\2l\25\3\2\2\2mn\t\2\2"+
		"\2n\27\3\2\2\2op\7^\2\2pq\7Q\2\2q\31\3\2\2\2rz\7V\2\2s{\7^\2\2t{\5$\23"+
		"\2u{\5\24\13\2v{\5\4\3\2w{\5&\24\2x{\5\34\17\2y{\5\36\20\2zs\3\2\2\2z"+
		"t\3\2\2\2zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{|\3\2\2\2"+
		"|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7W\2\2\177\33\3\2\2\2\u0080\u0081"+
		"\7^\2\2\u0081\u0082\7X\2\2\u0082\u0083\5$\23\2\u0083\35\3\2\2\2\u0084"+
		"\u0085\7^\2\2\u0085\u0086\7B\2\2\u0086\u0087\5$\23\2\u0087\37\3\2\2\2"+
		"\u0088\u0089\5\"\22\2\u0089\u008a\5 \21\2\u008a\u008d\3\2\2\2\u008b\u008d"+
		"\5\"\22\2\u008c\u0088\3\2\2\2\u008c\u008b\3\2\2\2\u008d!\3\2\2\2\u008e"+
		"\u008f\5$\23\2\u008f#\3\2\2\2\u0090\u0091\b\23\1\2\u0091\u0092\7\\\2\2"+
		"\u0092\u0098\5$\23\f\u0093\u0098\5\32\16\2\u0094\u0098\7^\2\2\u0095\u0098"+
		"\7_\2\2\u0096\u0098\7Z\2\2\u0097\u0090\3\2\2\2\u0097\u0093\3\2\2\2\u0097"+
		"\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u00aa\3\2"+
		"\2\2\u0099\u009a\f\13\2\2\u009a\u009b\7L\2\2\u009b\u00a9\5$\23\f\u009c"+
		"\u009d\f\n\2\2\u009d\u009e\7T\2\2\u009e\u00a9\5$\23\13\u009f\u00a0\f\t"+
		"\2\2\u00a0\u00a1\7R\2\2\u00a1\u00a9\5$\23\n\u00a2\u00a3\f\b\2\2\u00a3"+
		"\u00a4\7S\2\2\u00a4\u00a9\5$\23\t\u00a5\u00a6\f\7\2\2\u00a6\u00a7\7U\2"+
		"\2\u00a7\u00a9\5$\23\b\u00a8\u0099\3\2\2\2\u00a8\u009c\3\2\2\2\u00a8\u009f"+
		"\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab%\3\2\2\2\u00ac\u00aa\3\2\2\2"+
		"\u00ad\u00ae\7^\2\2\u00ae\u00af\5(\25\2\u00af\'\3\2\2\2\u00b0\u00b1\7"+
		"^\2\2\u00b1\u00b2\7K\2\2\u00b2\u00b5\5(\25\2\u00b3\u00b5\7^\2\2\u00b4"+
		"\u00b0\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5)\3\2\2\2\23/?DGQW_cfkz|\u008c"+
		"\u0097\u00a8\u00aa\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}