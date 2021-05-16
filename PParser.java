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
		FIMSE=32, NUMERO_REAL=33, NUMERO_INTEIRO=34, DIGITO=35, ID=36, LETRA=37, 
		STRING=38, WS=39;
	public static final int
		RULE_start = 0, RULE_declara = 1, RULE_declar_var = 2, RULE_tipo = 3, 
		RULE_define = 4, RULE_define_func = 5, RULE_executa = 6, RULE_chamada_funcao = 7, 
		RULE_atribuicao = 8, RULE_expr = 9, RULE_comando_retorna = 10, RULE_comando_imprime = 11, 
		RULE_expr_literal = 12, RULE_comando_se = 13, RULE_expr_logica = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declara", "declar_var", "tipo", "define", "define_func", "executa", 
			"chamada_funcao", "atribuicao", "expr", "comando_retorna", "comando_imprime", 
			"expr_literal", "comando_se", "expr_logica"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "','", "')'", "'{'", "'}'", "':='", "'*'", "'/'", 
			"'+'", "'-'", "'&'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'texto'", 
			"'real'", "'inteiro'", "'programa'", "'declara'", "'define'", "'executa'", 
			"'fimprograma'", "'retorna'", "'imprime'", "'se'", "'entao'", "'senao'", 
			"'fimse'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "TEXTO", "REAL", "INTEIRO", 
			"PROGRAMA", "DECLARA", "DEFINE", "EXECUTA", "FIMPROGRAMA", "RETORNA", 
			"IMPRIME", "SE", "ENTAO", "SENAO", "FIMSE", "NUMERO_REAL", "NUMERO_INTEIRO", 
			"DIGITO", "ID", "LETRA", "STRING", "WS"
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
			setState(30);
			match(PROGRAMA);
			setState(31);
			match(DECLARA);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(32);
				declara();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(DEFINE);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(39);
				define();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(EXECUTA);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETORNA) | (1L << IMPRIME) | (1L << SE) | (1L << ID))) != 0)) {
				{
				{
				setState(46);
				executa();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
			setState(54);
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
			setState(56);
			match(ID);
			setState(57);
			match(T__0);
			setState(58);
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
			setState(60);
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
			setState(62);
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
			setState(64);
			match(ID);
			setState(65);
			match(T__1);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO_REAL) | (1L << NUMERO_INTEIRO) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(66);
				expr(0);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(67);
					match(T__2);
					setState(68);
					expr(0);
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(76);
			match(T__3);
			setState(77);
			match(T__4);
			setState(78);
			match(DECLARA);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(79);
				declara();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(EXECUTA);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETORNA) | (1L << IMPRIME) | (1L << SE) | (1L << ID))) != 0)) {
				{
				{
				setState(86);
				executa();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				comando_se();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				atribuicao();
				}
				break;
			case IMPRIME:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				comando_imprime();
				}
				break;
			case RETORNA:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
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
		enterRule(_localctx, 14, RULE_chamada_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ID);
			setState(101);
			match(T__1);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO_REAL) | (1L << NUMERO_INTEIRO) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(102);
				expr(0);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(103);
					match(T__2);
					setState(104);
					expr(0);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(112);
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
		enterRule(_localctx, 16, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			setState(115);
			match(T__6);
			setState(116);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(119);
				match(NUMERO_REAL);
				}
				break;
			case 2:
				{
				setState(120);
				match(NUMERO_INTEIRO);
				}
				break;
			case 3:
				{
				setState(121);
				match(ID);
				}
				break;
			case 4:
				{
				setState(122);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(123);
				chamada_funcao();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(127);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(128);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(130);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(131);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 20, RULE_comando_retorna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(RETORNA);
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(138);
				expr(0);
				}
				break;
			case 2:
				{
				setState(139);
				expr_logica();
				}
				break;
			case 3:
				{
				setState(140);
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
		enterRule(_localctx, 22, RULE_comando_imprime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(IMPRIME);
			setState(144);
			match(T__1);
			setState(145);
			expr_literal();
			setState(146);
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
		enterRule(_localctx, 24, RULE_expr_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			expr(0);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(149);
				match(T__11);
				setState(150);
				expr(0);
				}
				}
				setState(155);
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
		enterRule(_localctx, 26, RULE_comando_se);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(SE);
			setState(157);
			expr_logica();
			setState(158);
			match(ENTAO);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETORNA) | (1L << IMPRIME) | (1L << SE) | (1L << ID))) != 0)) {
				{
				{
				setState(159);
				executa();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(165);
				match(SENAO);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETORNA) | (1L << IMPRIME) | (1L << SE) | (1L << ID))) != 0)) {
					{
					{
					setState(166);
					executa();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(174);
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
		enterRule(_localctx, 28, RULE_expr_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			expr(0);
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
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
		case 9:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\7\2$\n\2"+
		"\f\2\16\2\'\13\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\7\2\62\n\2\f"+
		"\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\7\7H\n\7\f\7\16\7K\13\7\5\7M\n\7\3\7\3\7\3\7\3\7\7\7S\n"+
		"\7\f\7\16\7V\13\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\5\be\n\b\3\t\3\t\3\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\5\tq\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\177\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u0087\n\13\f\13\16\13\u008a\13\13\3\f\3"+
		"\f\3\f\3\f\5\f\u0090\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u009a"+
		"\n\16\f\16\16\16\u009d\13\16\3\17\3\17\3\17\3\17\7\17\u00a3\n\17\f\17"+
		"\16\17\u00a6\13\17\3\17\3\17\7\17\u00aa\n\17\f\17\16\17\u00ad\13\17\5"+
		"\17\u00af\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\2\3\24\21\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36\2\6\3\2\25\27\3\2\n\13\3\2\f\r\3\2\17\24"+
		"\2\u00bf\2 \3\2\2\2\48\3\2\2\2\6:\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2\fB\3\2"+
		"\2\2\16d\3\2\2\2\20f\3\2\2\2\22t\3\2\2\2\24~\3\2\2\2\26\u008b\3\2\2\2"+
		"\30\u0091\3\2\2\2\32\u0096\3\2\2\2\34\u009e\3\2\2\2\36\u00b2\3\2\2\2 "+
		"!\7\30\2\2!%\7\31\2\2\"$\5\4\3\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2"+
		"\2\2&(\3\2\2\2\'%\3\2\2\2(,\7\32\2\2)+\5\n\6\2*)\3\2\2\2+.\3\2\2\2,*\3"+
		"\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\63\7\33\2\2\60\62\5\16\b\2\61\60"+
		"\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63"+
		"\3\2\2\2\66\67\7\34\2\2\67\3\3\2\2\289\5\6\4\29\5\3\2\2\2:;\7&\2\2;<\7"+
		"\3\2\2<=\5\b\5\2=\7\3\2\2\2>?\t\2\2\2?\t\3\2\2\2@A\5\f\7\2A\13\3\2\2\2"+
		"BC\7&\2\2CL\7\4\2\2DI\5\24\13\2EF\7\5\2\2FH\5\24\13\2GE\3\2\2\2HK\3\2"+
		"\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LD\3\2\2\2LM\3\2\2\2MN\3\2"+
		"\2\2NO\7\6\2\2OP\7\7\2\2PT\7\31\2\2QS\5\4\3\2RQ\3\2\2\2SV\3\2\2\2TR\3"+
		"\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2W[\7\33\2\2XZ\5\16\b\2YX\3\2\2\2Z"+
		"]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\b\2\2_\r\3\2\2"+
		"\2`e\5\34\17\2ae\5\22\n\2be\5\30\r\2ce\5\26\f\2d`\3\2\2\2da\3\2\2\2db"+
		"\3\2\2\2dc\3\2\2\2e\17\3\2\2\2fg\7&\2\2gp\7\4\2\2hm\5\24\13\2ij\7\5\2"+
		"\2jl\5\24\13\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nq\3\2\2\2om\3\2"+
		"\2\2ph\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\6\2\2s\21\3\2\2\2tu\7&\2\2uv\7"+
		"\t\2\2vw\5\24\13\2w\23\3\2\2\2xy\b\13\1\2y\177\7#\2\2z\177\7$\2\2{\177"+
		"\7&\2\2|\177\7(\2\2}\177\5\20\t\2~x\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2"+
		"\2\2~}\3\2\2\2\177\u0088\3\2\2\2\u0080\u0081\f\4\2\2\u0081\u0082\t\3\2"+
		"\2\u0082\u0087\5\24\13\5\u0083\u0084\f\3\2\2\u0084\u0085\t\4\2\2\u0085"+
		"\u0087\5\24\13\4\u0086\u0080\3\2\2\2\u0086\u0083\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\25\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008f\7\35\2\2\u008c\u0090\5\24\13\2\u008d\u0090"+
		"\5\36\20\2\u008e\u0090\5\32\16\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\u008f\u008e\3\2\2\2\u0090\27\3\2\2\2\u0091\u0092\7\36\2\2\u0092\u0093"+
		"\7\4\2\2\u0093\u0094\5\32\16\2\u0094\u0095\7\6\2\2\u0095\31\3\2\2\2\u0096"+
		"\u009b\5\24\13\2\u0097\u0098\7\16\2\2\u0098\u009a\5\24\13\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\33\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\37\2\2\u009f\u00a0\5\36"+
		"\20\2\u00a0\u00a4\7 \2\2\u00a1\u00a3\5\16\b\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ae\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ab\7!\2\2\u00a8\u00aa\5\16\b\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00a7\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\"\2\2\u00b1\35\3\2\2"+
		"\2\u00b2\u00b3\5\24\13\2\u00b3\u00b4\t\5\2\2\u00b4\u00b5\5\24\13\2\u00b5"+
		"\37\3\2\2\2\24%,\63ILT[dmp~\u0086\u0088\u008f\u009b\u00a4\u00ab\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}