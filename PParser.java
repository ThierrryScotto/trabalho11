// Generated from P.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_declara = 1, RULE_declar_var = 2, RULE_tipo = 3, 
		RULE_define = 4, RULE_define_func = 5, RULE_executa = 6, RULE_comando_repita = 7, 
		RULE_chamada_funcao = 8, RULE_atribuicao = 9, RULE_expr = 10, RULE_comando_retorna = 11, 
		RULE_comando_imprime = 12, RULE_expr_literal = 13, RULE_comando_se = 14, 
		RULE_expr_logica = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declara", "declar_var", "tipo", "define", "define_func", "executa", 
			"comando_repita", "chamada_funcao", "atribuicao", "expr", "comando_retorna", 
			"comando_imprime", "expr_literal", "comando_se", "expr_logica"
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

	@Override
	public String getGrammarFileName() { return "P.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(PParser.PROGRAMA, 0); }
		public TerminalNode DECLARA() { return getToken(PParser.DECLARA, 0); }
		public TerminalNode DEFINE() { return getToken(PParser.DEFINE, 0); }
		public TerminalNode EXECUTA() { return getToken(PParser.EXECUTA, 0); }
		public TerminalNode FIMPROGRAMA() { return getToken(PParser.FIMPROGRAMA, 0); }
		public List<DeclaraContext> declara() {
			return getRuleContexts(DeclaraContext.class);
		}
		public DeclaraContext declara(int i) {
			return getRuleContext(DeclaraContext.class,i);
		}
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public List<ExecutaContext> executa() {
			return getRuleContexts(ExecutaContext.class);
		}
		public ExecutaContext executa(int i) {
			return getRuleContext(ExecutaContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(PROGRAMA);
			setState(33);
			match(DECLARA);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(34);
				declara();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(DEFINE);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(41);
				define();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(EXECUTA);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETORNA) | (1L << IMPRIME) | (1L << SE) | (1L << REPITA) | (1L << ID))) != 0)) {
				{
				{
				setState(48);
				executa();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(FIMPROGRAMA);
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

	public static class DeclaraContext extends ParserRuleContext {
		public Declar_varContext declar_var() {
			return getRuleContext(Declar_varContext.class,0);
		}
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitDeclara(this);
		}
	}

	public final DeclaraContext declara() throws RecognitionException {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			declar_var();
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

	public static class Declar_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declar_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declar_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterDeclar_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitDeclar_var(this);
		}
	}

	public final Declar_varContext declar_var() throws RecognitionException {
		Declar_varContext _localctx = new Declar_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declar_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			setState(59);
			match(T__0);
			setState(60);
			tipo();
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(PParser.TEXTO, 0); }
		public TerminalNode REAL() { return getToken(PParser.REAL, 0); }
		public TerminalNode INTEIRO() { return getToken(PParser.INTEIRO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXTO) | (1L << REAL) | (1L << INTEIRO))) != 0)) ) {
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

	public static class DefineContext extends ParserRuleContext {
		public Define_funcContext define_func() {
			return getRuleContext(Define_funcContext.class,0);
		}
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitDefine(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			define_func();
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

	public static class Define_funcContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public TerminalNode DECLARA() { return getToken(PParser.DECLARA, 0); }
		public TerminalNode EXECUTA() { return getToken(PParser.EXECUTA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<DeclaraContext> declara() {
			return getRuleContexts(DeclaraContext.class);
		}
		public DeclaraContext declara(int i) {
			return getRuleContext(DeclaraContext.class,i);
		}
		public List<ExecutaContext> executa() {
			return getRuleContexts(ExecutaContext.class);
		}
		public ExecutaContext executa(int i) {
			return getRuleContext(ExecutaContext.class,i);
		}
		public Define_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterDefine_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitDefine_func(this);
		}
	}

	public final Define_funcContext define_func() throws RecognitionException {
		Define_funcContext _localctx = new Define_funcContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_define_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
			setState(67);
			match(T__1);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO_REAL) | (1L << NUMERO_INTEIRO) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(68);
				expr(0);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(69);
					match(T__2);
					setState(70);
					expr(0);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(78);
			match(T__3);
			setState(79);
			match(T__4);
			setState(80);
			match(DECLARA);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(81);
				declara();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(EXECUTA);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETORNA) | (1L << IMPRIME) | (1L << SE) | (1L << REPITA) | (1L << ID))) != 0)) {
				{
				{
				setState(88);
				executa();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(T__5);
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

	public static class ExecutaContext extends ParserRuleContext {
		public Comando_seContext comando_se() {
			return getRuleContext(Comando_seContext.class,0);
		}
		public Comando_repitaContext comando_repita() {
			return getRuleContext(Comando_repitaContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public Comando_imprimeContext comando_imprime() {
			return getRuleContext(Comando_imprimeContext.class,0);
		}
		public Comando_retornaContext comando_retorna() {
			return getRuleContext(Comando_retornaContext.class,0);
		}
		public ExecutaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterExecuta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitExecuta(this);
		}
	}

	public final ExecutaContext executa() throws RecognitionException {
		ExecutaContext _localctx = new ExecutaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_executa);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				comando_se();
				}
				break;
			case REPITA:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				comando_repita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				atribuicao();
				}
				break;
			case IMPRIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				comando_imprime();
				}
				break;
			case RETORNA:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				comando_retorna();
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

	public static class Comando_repitaContext extends ParserRuleContext {
		public TerminalNode REPITA() { return getToken(PParser.REPITA, 0); }
		public TerminalNode ATE() { return getToken(PParser.ATE, 0); }
		public Expr_logicaContext expr_logica() {
			return getRuleContext(Expr_logicaContext.class,0);
		}
		public List<ExecutaContext> executa() {
			return getRuleContexts(ExecutaContext.class);
		}
		public ExecutaContext executa(int i) {
			return getRuleContext(ExecutaContext.class,i);
		}
		public Comando_repitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_repita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterComando_repita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitComando_repita(this);
		}
	}

	public final Comando_repitaContext comando_repita() throws RecognitionException {
		Comando_repitaContext _localctx = new Comando_repitaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comando_repita);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(REPITA);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETORNA) | (1L << IMPRIME) | (1L << SE) | (1L << REPITA) | (1L << ID))) != 0)) {
				{
				{
				setState(104);
				executa();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(ATE);
			setState(111);
			expr_logica();
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

	public static class Chamada_funcaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Chamada_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterChamada_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitChamada_funcao(this);
		}
	}

	public final Chamada_funcaoContext chamada_funcao() throws RecognitionException {
		Chamada_funcaoContext _localctx = new Chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chamada_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ID);
			setState(114);
			match(T__1);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO_REAL) | (1L << NUMERO_INTEIRO) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(115);
				expr(0);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(116);
					match(T__2);
					setState(117);
					expr(0);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(125);
			match(T__3);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ID);
			setState(128);
			match(T__6);
			setState(129);
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
		public TerminalNode NUMERO_REAL() { return getToken(PParser.NUMERO_REAL, 0); }
		public TerminalNode NUMERO_INTEIRO() { return getToken(PParser.NUMERO_INTEIRO, 0); }
		public TerminalNode ID() { return getToken(PParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PParser.STRING, 0); }
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitExpr(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(132);
				match(NUMERO_REAL);
				}
				break;
			case 2:
				{
				setState(133);
				match(NUMERO_INTEIRO);
				}
				break;
			case 3:
				{
				setState(134);
				match(ID);
				}
				break;
			case 4:
				{
				setState(135);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(136);
				chamada_funcao();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(140);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(141);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(143);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(144);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Comando_retornaContext extends ParserRuleContext {
		public TerminalNode RETORNA() { return getToken(PParser.RETORNA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_logicaContext expr_logica() {
			return getRuleContext(Expr_logicaContext.class,0);
		}
		public Expr_literalContext expr_literal() {
			return getRuleContext(Expr_literalContext.class,0);
		}
		public Comando_retornaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_retorna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterComando_retorna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitComando_retorna(this);
		}
	}

	public final Comando_retornaContext comando_retorna() throws RecognitionException {
		Comando_retornaContext _localctx = new Comando_retornaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comando_retorna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(RETORNA);
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(151);
				expr(0);
				}
				break;
			case 2:
				{
				setState(152);
				expr_logica();
				}
				break;
			case 3:
				{
				setState(153);
				expr_literal();
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

	public static class Comando_imprimeContext extends ParserRuleContext {
		public TerminalNode IMPRIME() { return getToken(PParser.IMPRIME, 0); }
		public Expr_literalContext expr_literal() {
			return getRuleContext(Expr_literalContext.class,0);
		}
		public Comando_imprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_imprime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterComando_imprime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitComando_imprime(this);
		}
	}

	public final Comando_imprimeContext comando_imprime() throws RecognitionException {
		Comando_imprimeContext _localctx = new Comando_imprimeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comando_imprime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IMPRIME);
			setState(157);
			match(T__1);
			setState(158);
			expr_literal();
			setState(159);
			match(T__3);
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

	public static class Expr_literalContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterExpr_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitExpr_literal(this);
		}
	}

	public final Expr_literalContext expr_literal() throws RecognitionException {
		Expr_literalContext _localctx = new Expr_literalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			expr(0);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(162);
				match(T__11);
				setState(163);
				expr(0);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Comando_seContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(PParser.SE, 0); }
		public Expr_logicaContext expr_logica() {
			return getRuleContext(Expr_logicaContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(PParser.ENTAO, 0); }
		public TerminalNode FIMSE() { return getToken(PParser.FIMSE, 0); }
		public List<ExecutaContext> executa() {
			return getRuleContexts(ExecutaContext.class);
		}
		public ExecutaContext executa(int i) {
			return getRuleContext(ExecutaContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(PParser.SENAO, 0); }
		public Comando_seContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterComando_se(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitComando_se(this);
		}
	}

	public final Comando_seContext comando_se() throws RecognitionException {
		Comando_seContext _localctx = new Comando_seContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comando_se);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(SE);
			setState(170);
			expr_logica();
			setState(171);
			match(ENTAO);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETORNA) | (1L << IMPRIME) | (1L << SE) | (1L << REPITA) | (1L << ID))) != 0)) {
				{
				{
				setState(172);
				executa();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(178);
				match(SENAO);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETORNA) | (1L << IMPRIME) | (1L << SE) | (1L << REPITA) | (1L << ID))) != 0)) {
					{
					{
					setState(179);
					executa();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(187);
			match(FIMSE);
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

	public static class Expr_logicaContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).enterExpr_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PListener ) ((PListener)listener).exitExpr_logica(this);
		}
	}

	public final Expr_logicaContext expr_logica() throws RecognitionException {
		Expr_logicaContext _localctx = new Expr_logicaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			expr(0);
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(191);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00c4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3\2\7"+
		"\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\5\7O\n\7\3\7\3\7\3\7"+
		"\3\7\7\7U\n\7\f\7\16\7X\13\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\5\bh\n\b\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\5\n~\n\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u0094\n\f\f\f\16\f\u0097\13\f\3\r\3\r\3\r\3\r\5\r\u009d\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00a7\n\17\f\17\16\17"+
		"\u00aa\13\17\3\20\3\20\3\20\3\20\7\20\u00b0\n\20\f\20\16\20\u00b3\13\20"+
		"\3\20\3\20\7\20\u00b7\n\20\f\20\16\20\u00ba\13\20\5\20\u00bc\n\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\2\3\26\22\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \2\6\3\2\25\27\3\2\n\13\3\2\f\r\3\2\17\24\2\u00cd\2\"\3\2\2"+
		"\2\4:\3\2\2\2\6<\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16g\3\2\2\2"+
		"\20i\3\2\2\2\22s\3\2\2\2\24\u0081\3\2\2\2\26\u008b\3\2\2\2\30\u0098\3"+
		"\2\2\2\32\u009e\3\2\2\2\34\u00a3\3\2\2\2\36\u00ab\3\2\2\2 \u00bf\3\2\2"+
		"\2\"#\7\30\2\2#\'\7\31\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'"+
		"(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*.\7\32\2\2+-\5\n\6\2,+\3\2\2\2-\60\3\2"+
		"\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\65\7\33\2\2\62\64"+
		"\5\16\b\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668"+
		"\3\2\2\2\67\65\3\2\2\289\7\34\2\29\3\3\2\2\2:;\5\6\4\2;\5\3\2\2\2<=\7"+
		"(\2\2=>\7\3\2\2>?\5\b\5\2?\7\3\2\2\2@A\t\2\2\2A\t\3\2\2\2BC\5\f\7\2C\13"+
		"\3\2\2\2DE\7(\2\2EN\7\4\2\2FK\5\26\f\2GH\7\5\2\2HJ\5\26\f\2IG\3\2\2\2"+
		"JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2NF\3\2\2\2NO\3\2\2\2"+
		"OP\3\2\2\2PQ\7\6\2\2QR\7\7\2\2RV\7\31\2\2SU\5\4\3\2TS\3\2\2\2UX\3\2\2"+
		"\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2Y]\7\33\2\2Z\\\5\16\b\2[Z\3"+
		"\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\b\2\2a\r"+
		"\3\2\2\2bh\5\36\20\2ch\5\20\t\2dh\5\24\13\2eh\5\32\16\2fh\5\30\r\2gb\3"+
		"\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\17\3\2\2\2im\7#\2\2jl"+
		"\5\16\b\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2"+
		"pq\7$\2\2qr\5 \21\2r\21\3\2\2\2st\7(\2\2t}\7\4\2\2uz\5\26\f\2vw\7\5\2"+
		"\2wy\5\26\f\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2"+
		"\2\2}u\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\6\2\2\u0080\23\3\2\2"+
		"\2\u0081\u0082\7(\2\2\u0082\u0083\7\t\2\2\u0083\u0084\5\26\f\2\u0084\25"+
		"\3\2\2\2\u0085\u0086\b\f\1\2\u0086\u008c\7%\2\2\u0087\u008c\7&\2\2\u0088"+
		"\u008c\7(\2\2\u0089\u008c\7*\2\2\u008a\u008c\5\22\n\2\u008b\u0085\3\2"+
		"\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u0095\3\2\2\2\u008d\u008e\f\4\2\2\u008e\u008f\t\3"+
		"\2\2\u008f\u0094\5\26\f\5\u0090\u0091\f\3\2\2\u0091\u0092\t\4\2\2\u0092"+
		"\u0094\5\26\f\4\u0093\u008d\3\2\2\2\u0093\u0090\3\2\2\2\u0094\u0097\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\27\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009c\7\35\2\2\u0099\u009d\5\26\f\2\u009a\u009d\5"+
		" \21\2\u009b\u009d\5\34\17\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\31\3\2\2\2\u009e\u009f\7\36\2\2\u009f\u00a0\7\4\2"+
		"\2\u00a0\u00a1\5\34\17\2\u00a1\u00a2\7\6\2\2\u00a2\33\3\2\2\2\u00a3\u00a8"+
		"\5\26\f\2\u00a4\u00a5\7\16\2\2\u00a5\u00a7\5\26\f\2\u00a6\u00a4\3\2\2"+
		"\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\35"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\37\2\2\u00ac\u00ad\5 \21\2"+
		"\u00ad\u00b1\7 \2\2\u00ae\u00b0\5\16\b\2\u00af\u00ae\3\2\2\2\u00b0\u00b3"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00bb\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b8\7!\2\2\u00b5\u00b7\5\16\b\2\u00b6\u00b5\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\"\2\2\u00be\37\3\2\2\2\u00bf\u00c0"+
		"\5\26\f\2\u00c0\u00c1\t\5\2\2\u00c1\u00c2\5\26\f\2\u00c2!\3\2\2\2\25\'"+
		".\65KNV]gmz}\u008b\u0093\u0095\u009c\u00a8\u00b1\u00b8\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}