// Generated from /home/overnull/trabalhoSD/Compiler/src/Compiler.g4 by ANTLR 4.7.2
package comp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, RETURN=3, WHILE=4, BREAK=5, INT=6, VOID=7, BOOL=8, CHAR=9, 
		STRUCT=10, CONST=11, PUBLIC=12, PROTECTED=13, STATIC=14, COM=15, PLUS=16, 
		MINUS=17, TIMES=18, DIV=19, MOD=20, INCR=21, DECR=22, ATRIB=23, EQ=24, 
		NEQ=25, LT=26, LEQ=27, GT=28, GEQ=29, NOT=30, AND=31, OR=32, DOT=33, ARROW=34, 
		DBLCOL=35, LPAREN=36, RPAREN=37, LBRACE=38, RBRACE=39, DQUO=40, SQUO=41, 
		STDCIN=42, STDCOUT=43, STDENDL=44, INTL=45, CHARL=46, STRL=47, ID=48, 
		COMMA=49, SEMI=50, LSHIFT=51, RSHIFT=52, AMPER=53, COLON=54, DIR=55, WHITE=56, 
		TRUE=57, FALSE=58, THIS=59;
	public static final int
		RULE_start = 0, RULE_lista_definicoes = 1, RULE_definicao = 2, RULE_estrutura = 3, 
		RULE_lista_estrutura_corpo = 4, RULE_estrutura_acesso = 5, RULE_lista_estrutura_membros = 6, 
		RULE_membro = 7, RULE_variavel = 8, RULE_variavel_atribuicao = 9, RULE_construtor = 10, 
		RULE_metodo = 11, RULE_funcao = 12, RULE_funcao_cabecalho = 13, RULE_parametros_formais = 14, 
		RULE_lista_parametros_formais = 15, RULE_tipo = 16, RULE_tipo_nome = 17, 
		RULE_qualificador = 18, RULE_decorador = 19, RULE_bloco = 20, RULE_lista_comandos = 21, 
		RULE_comando = 22, RULE_selecao = 23, RULE_selecao_senao = 24, RULE_repeticao = 25, 
		RULE_atribuicao = 26, RULE_retorno = 27, RULE_entrada = 28, RULE_lista_entrada_params = 29, 
		RULE_saida = 30, RULE_lista_saida_params = 31, RULE_lista_declaracoes_locais = 32, 
		RULE_expressao_comando = 33, RULE_expressao = 34, RULE_operador_binario = 35, 
		RULE_operador_unario = 36, RULE_nome = 37, RULE_nome_lista = 38, RULE_parametros_reais = 39, 
		RULE_lista_parametros_reais = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "lista_definicoes", "definicao", "estrutura", "lista_estrutura_corpo", 
			"estrutura_acesso", "lista_estrutura_membros", "membro", "variavel", 
			"variavel_atribuicao", "construtor", "metodo", "funcao", "funcao_cabecalho", 
			"parametros_formais", "lista_parametros_formais", "tipo", "tipo_nome", 
			"qualificador", "decorador", "bloco", "lista_comandos", "comando", "selecao", 
			"selecao_senao", "repeticao", "atribuicao", "retorno", "entrada", "lista_entrada_params", 
			"saida", "lista_saida_params", "lista_declaracoes_locais", "expressao_comando", 
			"expressao", "operador_binario", "operador_unario", "nome", "nome_lista", 
			"parametros_reais", "lista_parametros_reais"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'return'", "'while'", "'break'", "'int'", "'void'", 
			"'boolean'", "'char'", "'struct'", "'const'", "'public'", "'protected'", 
			"'static'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", 
			"'='", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'!'", "'&&'", "'||'", 
			"'.'", "'->'", "'::'", "'('", "')'", "'{'", "'}'", "'\"'", "'''", "'std::cin'", 
			"'std::cout'", "'std::endl'", null, null, null, null, "','", "';'", "'<<'", 
			"'>>'", "'&'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "RETURN", "WHILE", "BREAK", "INT", "VOID", "BOOL", 
			"CHAR", "STRUCT", "CONST", "PUBLIC", "PROTECTED", "STATIC", "COM", "PLUS", 
			"MINUS", "TIMES", "DIV", "MOD", "INCR", "DECR", "ATRIB", "EQ", "NEQ", 
			"LT", "LEQ", "GT", "GEQ", "NOT", "AND", "OR", "DOT", "ARROW", "DBLCOL", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "DQUO", "SQUO", "STDCIN", "STDCOUT", 
			"STDENDL", "INTL", "CHARL", "STRL", "ID", "COMMA", "SEMI", "LSHIFT", 
			"RSHIFT", "AMPER", "COLON", "DIR", "WHITE", "TRUE", "FALSE", "THIS"
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
	public String getGrammarFileName() { return "Compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Lista_definicoesContext lista_definicoes() {
			return getRuleContext(Lista_definicoesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CompilerParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			lista_definicoes(0);
			setState(83);
			match(EOF);
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

	public static class Lista_definicoesContext extends ParserRuleContext {
		public DefinicaoContext definicao() {
			return getRuleContext(DefinicaoContext.class,0);
		}
		public Lista_definicoesContext lista_definicoes() {
			return getRuleContext(Lista_definicoesContext.class,0);
		}
		public Lista_definicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_definicoes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitLista_definicoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_definicoesContext lista_definicoes() throws RecognitionException {
		return lista_definicoes(0);
	}

	private Lista_definicoesContext lista_definicoes(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_definicoesContext _localctx = new Lista_definicoesContext(_ctx, _parentState);
		Lista_definicoesContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_lista_definicoes, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(86);
			definicao();
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_definicoesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_definicoes);
					setState(88);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(89);
					definicao();
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class DefinicaoContext extends ParserRuleContext {
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public EstruturaContext estrutura() {
			return getRuleContext(EstruturaContext.class,0);
		}
		public DefinicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitDefinicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicaoContext definicao() throws RecognitionException {
		DefinicaoContext _localctx = new DefinicaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definicao);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case VOID:
			case BOOL:
			case CHAR:
			case CONST:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				funcao();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				estrutura();
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

	public static class EstruturaContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CompilerParser.STRUCT, 0); }
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(CompilerParser.LBRACE, 0); }
		public Lista_estrutura_corpoContext lista_estrutura_corpo() {
			return getRuleContext(Lista_estrutura_corpoContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CompilerParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(CompilerParser.SEMI, 0); }
		public EstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitEstrutura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaContext estrutura() throws RecognitionException {
		EstruturaContext _localctx = new EstruturaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_estrutura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(STRUCT);
			setState(100);
			match(ID);
			setState(101);
			match(LBRACE);
			setState(102);
			lista_estrutura_corpo(0);
			setState(103);
			match(RBRACE);
			setState(104);
			match(SEMI);
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

	public static class Lista_estrutura_corpoContext extends ParserRuleContext {
		public Estrutura_acessoContext estrutura_acesso() {
			return getRuleContext(Estrutura_acessoContext.class,0);
		}
		public Lista_estrutura_corpoContext lista_estrutura_corpo() {
			return getRuleContext(Lista_estrutura_corpoContext.class,0);
		}
		public Lista_estrutura_corpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_estrutura_corpo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitLista_estrutura_corpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_estrutura_corpoContext lista_estrutura_corpo() throws RecognitionException {
		return lista_estrutura_corpo(0);
	}

	private Lista_estrutura_corpoContext lista_estrutura_corpo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_estrutura_corpoContext _localctx = new Lista_estrutura_corpoContext(_ctx, _parentState);
		Lista_estrutura_corpoContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_lista_estrutura_corpo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(107);
			estrutura_acesso();
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_estrutura_corpoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_estrutura_corpo);
					setState(109);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(110);
					estrutura_acesso();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Estrutura_acessoContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(CompilerParser.PUBLIC, 0); }
		public TerminalNode COLON() { return getToken(CompilerParser.COLON, 0); }
		public Lista_estrutura_membrosContext lista_estrutura_membros() {
			return getRuleContext(Lista_estrutura_membrosContext.class,0);
		}
		public TerminalNode PROTECTED() { return getToken(CompilerParser.PROTECTED, 0); }
		public Estrutura_acessoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura_acesso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitEstrutura_acesso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Estrutura_acessoContext estrutura_acesso() throws RecognitionException {
		Estrutura_acessoContext _localctx = new Estrutura_acessoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_estrutura_acesso);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(PUBLIC);
				setState(117);
				match(COLON);
				setState(118);
				lista_estrutura_membros(0);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(PROTECTED);
				setState(120);
				match(COLON);
				setState(121);
				lista_estrutura_membros(0);
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

	public static class Lista_estrutura_membrosContext extends ParserRuleContext {
		public MembroContext membro() {
			return getRuleContext(MembroContext.class,0);
		}
		public Lista_estrutura_membrosContext lista_estrutura_membros() {
			return getRuleContext(Lista_estrutura_membrosContext.class,0);
		}
		public Lista_estrutura_membrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_estrutura_membros; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitLista_estrutura_membros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_estrutura_membrosContext lista_estrutura_membros() throws RecognitionException {
		return lista_estrutura_membros(0);
	}

	private Lista_estrutura_membrosContext lista_estrutura_membros(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_estrutura_membrosContext _localctx = new Lista_estrutura_membrosContext(_ctx, _parentState);
		Lista_estrutura_membrosContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_lista_estrutura_membros, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125);
			membro();
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_estrutura_membrosContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_estrutura_membros);
					setState(127);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(128);
					membro();
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class MembroContext extends ParserRuleContext {
		public ConstrutorContext construtor() {
			return getRuleContext(ConstrutorContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(CompilerParser.STATIC, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public MembroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitMembro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembroContext membro() throws RecognitionException {
		MembroContext _localctx = new MembroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_membro);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				construtor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				variavel();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				metodo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(STATIC);
				setState(138);
				variavel();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(STATIC);
				setState(140);
				funcao();
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

	public static class VariavelContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(CompilerParser.SEMI, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			tipo();
			setState(144);
			match(ID);
			setState(145);
			match(SEMI);
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

	public static class Variavel_atribuicaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(CompilerParser.ATRIB, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CompilerParser.SEMI, 0); }
		public Variavel_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel_atribuicao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVariavel_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variavel_atribuicaoContext variavel_atribuicao() throws RecognitionException {
		Variavel_atribuicaoContext _localctx = new Variavel_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variavel_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			tipo();
			setState(148);
			match(ID);
			setState(149);
			match(ATRIB);
			setState(150);
			expressao(0);
			setState(151);
			match(SEMI);
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

	public static class ConstrutorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CompilerParser.LPAREN, 0); }
		public Parametros_formaisContext parametros_formais() {
			return getRuleContext(Parametros_formaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CompilerParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ConstrutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construtor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitConstrutor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrutorContext construtor() throws RecognitionException {
		ConstrutorContext _localctx = new ConstrutorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_construtor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ID);
			setState(154);
			match(LPAREN);
			setState(155);
			parametros_formais();
			setState(156);
			match(RPAREN);
			setState(157);
			bloco();
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

	public static class MetodoContext extends ParserRuleContext {
		public Funcao_cabecalhoContext funcao_cabecalho() {
			return getRuleContext(Funcao_cabecalhoContext.class,0);
		}
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_metodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			funcao_cabecalho();
			setState(160);
			qualificador();
			setState(161);
			bloco();
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

	public static class FuncaoContext extends ParserRuleContext {
		public Funcao_cabecalhoContext funcao_cabecalho() {
			return getRuleContext(Funcao_cabecalhoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			funcao_cabecalho();
			setState(164);
			bloco();
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

	public static class Funcao_cabecalhoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CompilerParser.LPAREN, 0); }
		public Parametros_formaisContext parametros_formais() {
			return getRuleContext(Parametros_formaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CompilerParser.RPAREN, 0); }
		public Funcao_cabecalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao_cabecalho; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFuncao_cabecalho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcao_cabecalhoContext funcao_cabecalho() throws RecognitionException {
		Funcao_cabecalhoContext _localctx = new Funcao_cabecalhoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcao_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			tipo();
			setState(167);
			match(ID);
			setState(168);
			match(LPAREN);
			setState(169);
			parametros_formais();
			setState(170);
			match(RPAREN);
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

	public static class Parametros_formaisContext extends ParserRuleContext {
		public Lista_parametros_formaisContext lista_parametros_formais() {
			return getRuleContext(Lista_parametros_formaisContext.class,0);
		}
		public Parametros_formaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_formais; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitParametros_formais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_formaisContext parametros_formais() throws RecognitionException {
		Parametros_formaisContext _localctx = new Parametros_formaisContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametros_formais);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case VOID:
			case BOOL:
			case CHAR:
			case CONST:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				lista_parametros_formais(0);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Lista_parametros_formaisContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public Lista_parametros_formaisContext lista_parametros_formais() {
			return getRuleContext(Lista_parametros_formaisContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CompilerParser.COMMA, 0); }
		public Lista_parametros_formaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametros_formais; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitLista_parametros_formais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_parametros_formaisContext lista_parametros_formais() throws RecognitionException {
		return lista_parametros_formais(0);
	}

	private Lista_parametros_formaisContext lista_parametros_formais(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_parametros_formaisContext _localctx = new Lista_parametros_formaisContext(_ctx, _parentState);
		Lista_parametros_formaisContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_lista_parametros_formais, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(177);
			tipo();
			setState(178);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_parametros_formaisContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_parametros_formais);
					setState(180);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(181);
					match(COMMA);
					setState(182);
					tipo();
					setState(183);
					match(ID);
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(CompilerParser.VOID, 0); }
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public TerminalNode INT() { return getToken(CompilerParser.INT, 0); }
		public DecoradorContext decorador() {
			return getRuleContext(DecoradorContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(CompilerParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(CompilerParser.BOOL, 0); }
		public Tipo_nomeContext tipo_nome() {
			return getRuleContext(Tipo_nomeContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipo);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				qualificador();
				setState(192);
				match(INT);
				setState(193);
				decorador();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				qualificador();
				setState(196);
				match(CHAR);
				setState(197);
				decorador();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				qualificador();
				setState(200);
				match(BOOL);
				setState(201);
				decorador();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				qualificador();
				setState(204);
				tipo_nome(0);
				setState(205);
				decorador();
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

	public static class Tipo_nomeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public Tipo_nomeContext tipo_nome() {
			return getRuleContext(Tipo_nomeContext.class,0);
		}
		public TerminalNode DBLCOL() { return getToken(CompilerParser.DBLCOL, 0); }
		public Tipo_nomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_nome; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitTipo_nome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_nomeContext tipo_nome() throws RecognitionException {
		return tipo_nome(0);
	}

	private Tipo_nomeContext tipo_nome(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tipo_nomeContext _localctx = new Tipo_nomeContext(_ctx, _parentState);
		Tipo_nomeContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_tipo_nome, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(210);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tipo_nomeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tipo_nome);
					setState(212);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(213);
					match(DBLCOL);
					setState(214);
					match(ID);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class QualificadorContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CompilerParser.CONST, 0); }
		public QualificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualificador; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitQualificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualificadorContext qualificador() throws RecognitionException {
		QualificadorContext _localctx = new QualificadorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_qualificador);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(CONST);
				}
				break;
			case INT:
			case BOOL:
			case CHAR:
			case LBRACE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DecoradorContext extends ParserRuleContext {
		public TerminalNode AMPER() { return getToken(CompilerParser.AMPER, 0); }
		public DecoradorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorador; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitDecorador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoradorContext decorador() throws RecognitionException {
		DecoradorContext _localctx = new DecoradorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decorador);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AMPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(AMPER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CompilerParser.LBRACE, 0); }
		public Lista_declaracoes_locaisContext lista_declaracoes_locais() {
			return getRuleContext(Lista_declaracoes_locaisContext.class,0);
		}
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CompilerParser.RBRACE, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(LBRACE);
			setState(229);
			lista_declaracoes_locais();
			setState(230);
			lista_comandos(0);
			setState(231);
			match(RBRACE);
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

	public static class Lista_comandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public Lista_comandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_comandos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitLista_comandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_comandosContext lista_comandos() throws RecognitionException {
		return lista_comandos(0);
	}

	private Lista_comandosContext lista_comandos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_comandosContext _localctx = new Lista_comandosContext(_ctx, _parentState);
		Lista_comandosContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_lista_comandos, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(234);
				comando();
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_comandosContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_comandos);
					setState(238);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(239);
					comando();
					}
					} 
				}
				setState(244);
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

	public static class ComandoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public SaidaContext saida() {
			return getRuleContext(SaidaContext.class,0);
		}
		public Expressao_comandoContext expressao_comando() {
			return getRuleContext(Expressao_comandoContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(CompilerParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(CompilerParser.SEMI, 0); }
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comando);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				bloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				selecao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				repeticao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				atribuicao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				retorno();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				entrada();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				saida();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
				expressao_comando();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(253);
				match(BREAK);
				setState(254);
				match(SEMI);
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

	public static class SelecaoContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CompilerParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CompilerParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CompilerParser.RPAREN, 0); }
		public Selecao_senaoContext selecao_senao() {
			return getRuleContext(Selecao_senaoContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(IF);
			setState(258);
			match(LPAREN);
			setState(259);
			expressao(0);
			setState(260);
			match(RPAREN);
			setState(261);
			selecao_senao();
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

	public static class Selecao_senaoContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CompilerParser.ELSE, 0); }
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public Selecao_senaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao_senao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSelecao_senao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selecao_senaoContext selecao_senao() throws RecognitionException {
		Selecao_senaoContext _localctx = new Selecao_senaoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_selecao_senao);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(ELSE);
				setState(264);
				lista_comandos(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CompilerParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CompilerParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CompilerParser.RPAREN, 0); }
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(WHILE);
			setState(269);
			match(LPAREN);
			setState(270);
			expressao(0);
			setState(271);
			match(RPAREN);
			setState(272);
			lista_comandos(0);
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
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public TerminalNode ATRIB() { return getToken(CompilerParser.ATRIB, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CompilerParser.SEMI, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			nome();
			setState(275);
			match(ATRIB);
			setState(276);
			expressao(0);
			setState(277);
			match(SEMI);
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

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CompilerParser.RETURN, 0); }
		public Expressao_comandoContext expressao_comando() {
			return getRuleContext(Expressao_comandoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(RETURN);
			setState(280);
			expressao_comando();
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

	public static class EntradaContext extends ParserRuleContext {
		public TerminalNode STDCIN() { return getToken(CompilerParser.STDCIN, 0); }
		public Lista_entrada_paramsContext lista_entrada_params() {
			return getRuleContext(Lista_entrada_paramsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CompilerParser.SEMI, 0); }
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(STDCIN);
			setState(283);
			lista_entrada_params(0);
			setState(284);
			match(SEMI);
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

	public static class Lista_entrada_paramsContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public TerminalNode STDENDL() { return getToken(CompilerParser.STDENDL, 0); }
		public Lista_entrada_paramsContext lista_entrada_params() {
			return getRuleContext(Lista_entrada_paramsContext.class,0);
		}
		public TerminalNode RSHIFT() { return getToken(CompilerParser.RSHIFT, 0); }
		public Lista_entrada_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_entrada_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitLista_entrada_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_entrada_paramsContext lista_entrada_params() throws RecognitionException {
		return lista_entrada_params(0);
	}

	private Lista_entrada_paramsContext lista_entrada_params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_entrada_paramsContext _localctx = new Lista_entrada_paramsContext(_ctx, _parentState);
		Lista_entrada_paramsContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_lista_entrada_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case THIS:
				{
				setState(287);
				nome();
				}
				break;
			case STDENDL:
				{
				setState(288);
				match(STDENDL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_entrada_paramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_entrada_params);
					setState(291);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(292);
					match(RSHIFT);
					setState(293);
					nome();
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class SaidaContext extends ParserRuleContext {
		public TerminalNode STDCOUT() { return getToken(CompilerParser.STDCOUT, 0); }
		public Lista_saida_paramsContext lista_saida_params() {
			return getRuleContext(Lista_saida_paramsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CompilerParser.SEMI, 0); }
		public SaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSaida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaidaContext saida() throws RecognitionException {
		SaidaContext _localctx = new SaidaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_saida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(STDCOUT);
			setState(300);
			lista_saida_params(0);
			setState(301);
			match(SEMI);
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

	public static class Lista_saida_paramsContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode STRL() { return getToken(CompilerParser.STRL, 0); }
		public TerminalNode STDENDL() { return getToken(CompilerParser.STDENDL, 0); }
		public Lista_saida_paramsContext lista_saida_params() {
			return getRuleContext(Lista_saida_paramsContext.class,0);
		}
		public TerminalNode LSHIFT() { return getToken(CompilerParser.LSHIFT, 0); }
		public Lista_saida_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_saida_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitLista_saida_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_saida_paramsContext lista_saida_params() throws RecognitionException {
		return lista_saida_params(0);
	}

	private Lista_saida_paramsContext lista_saida_params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_saida_paramsContext _localctx = new Lista_saida_paramsContext(_ctx, _parentState);
		Lista_saida_paramsContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_lista_saida_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case INCR:
			case DECR:
			case NOT:
			case LPAREN:
			case INTL:
			case CHARL:
			case ID:
			case TRUE:
			case FALSE:
			case THIS:
				{
				setState(304);
				expressao(0);
				}
				break;
			case STRL:
				{
				setState(305);
				match(STRL);
				}
				break;
			case STDENDL:
				{
				setState(306);
				match(STDENDL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_saida_paramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_saida_params);
					setState(309);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(310);
					match(LSHIFT);
					setState(311);
					expressao(0);
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Lista_declaracoes_locaisContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Variavel_atribuicaoContext variavel_atribuicao() {
			return getRuleContext(Variavel_atribuicaoContext.class,0);
		}
		public Lista_declaracoes_locaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_declaracoes_locais; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitLista_declaracoes_locais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_declaracoes_locaisContext lista_declaracoes_locais() throws RecognitionException {
		Lista_declaracoes_locaisContext _localctx = new Lista_declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lista_declaracoes_locais);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				variavel_atribuicao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Expressao_comandoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CompilerParser.SEMI, 0); }
		public Expressao_comandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_comando; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitExpressao_comando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_comandoContext expressao_comando() throws RecognitionException {
		Expressao_comandoContext _localctx = new Expressao_comandoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressao_comando);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case INCR:
			case DECR:
			case NOT:
			case LPAREN:
			case INTL:
			case CHARL:
			case ID:
			case TRUE:
			case FALSE:
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				expressao(0);
				setState(323);
				match(SEMI);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(SEMI);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CompilerParser.LPAREN, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CompilerParser.RPAREN, 0); }
		public Operador_unarioContext operador_unario() {
			return getRuleContext(Operador_unarioContext.class,0);
		}
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public Parametros_reaisContext parametros_reais() {
			return getRuleContext(Parametros_reaisContext.class,0);
		}
		public TerminalNode INTL() { return getToken(CompilerParser.INTL, 0); }
		public TerminalNode CHARL() { return getToken(CompilerParser.CHARL, 0); }
		public TerminalNode TRUE() { return getToken(CompilerParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CompilerParser.FALSE, 0); }
		public Operador_binarioContext operador_binario() {
			return getRuleContext(Operador_binarioContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(329);
				match(LPAREN);
				setState(330);
				expressao(0);
				setState(331);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(333);
				operador_unario();
				setState(334);
				expressao(7);
				}
				break;
			case 3:
				{
				setState(336);
				nome();
				setState(337);
				match(LPAREN);
				setState(338);
				parametros_reais();
				setState(339);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(341);
				nome();
				}
				break;
			case 5:
				{
				setState(342);
				match(INTL);
				}
				break;
			case 6:
				{
				setState(343);
				match(CHARL);
				}
				break;
			case 7:
				{
				setState(344);
				match(TRUE);
				}
				break;
			case 8:
				{
				setState(345);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressao);
					setState(348);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(349);
					operador_binario();
					setState(350);
					expressao(9);
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Operador_binarioContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CompilerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CompilerParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(CompilerParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(CompilerParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CompilerParser.MOD, 0); }
		public TerminalNode LT() { return getToken(CompilerParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(CompilerParser.LEQ, 0); }
		public TerminalNode GT() { return getToken(CompilerParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(CompilerParser.GEQ, 0); }
		public TerminalNode EQ() { return getToken(CompilerParser.EQ, 0); }
		public TerminalNode OR() { return getToken(CompilerParser.OR, 0); }
		public TerminalNode AND() { return getToken(CompilerParser.AND, 0); }
		public TerminalNode NEQ() { return getToken(CompilerParser.NEQ, 0); }
		public Operador_binarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_binario; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitOperador_binario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_binarioContext operador_binario() throws RecognitionException {
		Operador_binarioContext _localctx = new Operador_binarioContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operador_binario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV) | (1L << MOD) | (1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << LEQ) | (1L << GT) | (1L << GEQ) | (1L << AND) | (1L << OR))) != 0)) ) {
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

	public static class Operador_unarioContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(CompilerParser.NOT, 0); }
		public TerminalNode INCR() { return getToken(CompilerParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(CompilerParser.DECR, 0); }
		public TerminalNode MINUS() { return getToken(CompilerParser.MINUS, 0); }
		public Operador_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_unario; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitOperador_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_unarioContext operador_unario() throws RecognitionException {
		Operador_unarioContext _localctx = new Operador_unarioContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_operador_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << INCR) | (1L << DECR) | (1L << NOT))) != 0)) ) {
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

	public static class NomeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public TerminalNode DBLCOL() { return getToken(CompilerParser.DBLCOL, 0); }
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public TerminalNode THIS() { return getToken(CompilerParser.THIS, 0); }
		public TerminalNode ARROW() { return getToken(CompilerParser.ARROW, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_nome);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(ID);
				setState(362);
				match(DBLCOL);
				setState(363);
				nome_lista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(THIS);
				setState(365);
				match(ARROW);
				setState(366);
				nome_lista();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				nome_lista();
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

	public static class Nome_listaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public TerminalNode DOT() { return getToken(CompilerParser.DOT, 0); }
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CompilerParser.LPAREN, 0); }
		public Parametros_reaisContext parametros_reais() {
			return getRuleContext(Parametros_reaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CompilerParser.RPAREN, 0); }
		public Nome_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_lista; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitNome_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nome_listaContext nome_lista() throws RecognitionException {
		Nome_listaContext _localctx = new Nome_listaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_nome_lista);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(ID);
				setState(371);
				match(DOT);
				setState(372);
				nome_lista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(ID);
				setState(374);
				match(LPAREN);
				setState(375);
				parametros_reais();
				setState(376);
				match(RPAREN);
				setState(377);
				match(DOT);
				setState(378);
				nome_lista();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(ID);
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

	public static class Parametros_reaisContext extends ParserRuleContext {
		public Lista_parametros_reaisContext lista_parametros_reais() {
			return getRuleContext(Lista_parametros_reaisContext.class,0);
		}
		public Parametros_reaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_reais; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitParametros_reais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_reaisContext parametros_reais() throws RecognitionException {
		Parametros_reaisContext _localctx = new Parametros_reaisContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parametros_reais);
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case INCR:
			case DECR:
			case NOT:
			case LPAREN:
			case INTL:
			case CHARL:
			case ID:
			case TRUE:
			case FALSE:
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				lista_parametros_reais(0);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Lista_parametros_reaisContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Lista_parametros_reaisContext lista_parametros_reais() {
			return getRuleContext(Lista_parametros_reaisContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CompilerParser.COMMA, 0); }
		public Lista_parametros_reaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametros_reais; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitLista_parametros_reais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_parametros_reaisContext lista_parametros_reais() throws RecognitionException {
		return lista_parametros_reais(0);
	}

	private Lista_parametros_reaisContext lista_parametros_reais(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_parametros_reaisContext _localctx = new Lista_parametros_reaisContext(_ctx, _parentState);
		Lista_parametros_reaisContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_lista_parametros_reais, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(388);
			expressao(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_parametros_reaisContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_parametros_reais);
					setState(390);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(391);
					match(COMMA);
					setState(392);
					expressao(0);
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return lista_definicoes_sempred((Lista_definicoesContext)_localctx, predIndex);
		case 4:
			return lista_estrutura_corpo_sempred((Lista_estrutura_corpoContext)_localctx, predIndex);
		case 6:
			return lista_estrutura_membros_sempred((Lista_estrutura_membrosContext)_localctx, predIndex);
		case 15:
			return lista_parametros_formais_sempred((Lista_parametros_formaisContext)_localctx, predIndex);
		case 17:
			return tipo_nome_sempred((Tipo_nomeContext)_localctx, predIndex);
		case 21:
			return lista_comandos_sempred((Lista_comandosContext)_localctx, predIndex);
		case 29:
			return lista_entrada_params_sempred((Lista_entrada_paramsContext)_localctx, predIndex);
		case 31:
			return lista_saida_params_sempred((Lista_saida_paramsContext)_localctx, predIndex);
		case 34:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 40:
			return lista_parametros_reais_sempred((Lista_parametros_reaisContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lista_definicoes_sempred(Lista_definicoesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lista_estrutura_corpo_sempred(Lista_estrutura_corpoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lista_estrutura_membros_sempred(Lista_estrutura_membrosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lista_parametros_formais_sempred(Lista_parametros_formaisContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean tipo_nome_sempred(Tipo_nomeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lista_comandos_sempred(Lista_comandosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean lista_entrada_params_sempred(Lista_entrada_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean lista_saida_params_sempred(Lista_saida_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean lista_parametros_reais_sempred(Lista_parametros_reaisContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0191\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\7\3]\n\3\f\3\16\3`\13\3\3\4\3\4\5\4d\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u0084\n\b\f\b"+
		"\16\b\u0087\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u00b1"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00bc\n\21\f\21"+
		"\16\21\u00bf\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d2\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00da\n\23\f\23\16\23\u00dd\13\23\3\24\3\24\5\24\u00e1"+
		"\n\24\3\25\3\25\5\25\u00e5\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\5\27\u00ef\n\27\3\27\3\27\7\27\u00f3\n\27\f\27\16\27\u00f6\13\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0102\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u010d\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\5\37\u0124\n\37\3\37\3\37\3\37\7\37\u0129\n\37\f\37\16"+
		"\37\u012c\13\37\3 \3 \3 \3 \3!\3!\3!\3!\5!\u0136\n!\3!\3!\3!\7!\u013b"+
		"\n!\f!\16!\u013e\13!\3\"\3\"\3\"\5\"\u0143\n\"\3#\3#\3#\3#\5#\u0149\n"+
		"#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u015d\n$\3"+
		"$\3$\3$\3$\7$\u0163\n$\f$\16$\u0166\13$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u0173\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0180\n("+
		"\3)\3)\5)\u0184\n)\3*\3*\3*\3*\3*\3*\7*\u018c\n*\f*\16*\u018f\13*\3*\2"+
		"\f\4\n\16 $,<@FR+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPR\2\4\5\2\22\26\32\37!\"\5\2\23\23\27\30  \2\u019a"+
		"\2T\3\2\2\2\4W\3\2\2\2\6c\3\2\2\2\be\3\2\2\2\nl\3\2\2\2\f|\3\2\2\2\16"+
		"~\3\2\2\2\20\u008f\3\2\2\2\22\u0091\3\2\2\2\24\u0095\3\2\2\2\26\u009b"+
		"\3\2\2\2\30\u00a1\3\2\2\2\32\u00a5\3\2\2\2\34\u00a8\3\2\2\2\36\u00b0\3"+
		"\2\2\2 \u00b2\3\2\2\2\"\u00d1\3\2\2\2$\u00d3\3\2\2\2&\u00e0\3\2\2\2(\u00e4"+
		"\3\2\2\2*\u00e6\3\2\2\2,\u00ee\3\2\2\2.\u0101\3\2\2\2\60\u0103\3\2\2\2"+
		"\62\u010c\3\2\2\2\64\u010e\3\2\2\2\66\u0114\3\2\2\28\u0119\3\2\2\2:\u011c"+
		"\3\2\2\2<\u0123\3\2\2\2>\u012d\3\2\2\2@\u0135\3\2\2\2B\u0142\3\2\2\2D"+
		"\u0148\3\2\2\2F\u015c\3\2\2\2H\u0167\3\2\2\2J\u0169\3\2\2\2L\u0172\3\2"+
		"\2\2N\u017f\3\2\2\2P\u0183\3\2\2\2R\u0185\3\2\2\2TU\5\4\3\2UV\7\2\2\3"+
		"V\3\3\2\2\2WX\b\3\1\2XY\5\6\4\2Y^\3\2\2\2Z[\f\4\2\2[]\5\6\4\2\\Z\3\2\2"+
		"\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\5\3\2\2\2`^\3\2\2\2ad\5\32\16\2bd\5"+
		"\b\5\2ca\3\2\2\2cb\3\2\2\2d\7\3\2\2\2ef\7\f\2\2fg\7\62\2\2gh\7(\2\2hi"+
		"\5\n\6\2ij\7)\2\2jk\7\64\2\2k\t\3\2\2\2lm\b\6\1\2mn\5\f\7\2ns\3\2\2\2"+
		"op\f\4\2\2pr\5\f\7\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\13\3\2\2"+
		"\2us\3\2\2\2vw\7\16\2\2wx\78\2\2x}\5\16\b\2yz\7\17\2\2z{\78\2\2{}\5\16"+
		"\b\2|v\3\2\2\2|y\3\2\2\2}\r\3\2\2\2~\177\b\b\1\2\177\u0080\5\20\t\2\u0080"+
		"\u0085\3\2\2\2\u0081\u0082\f\4\2\2\u0082\u0084\5\20\t\2\u0083\u0081\3"+
		"\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\17\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0090\5\26\f\2\u0089\u0090\5\22"+
		"\n\2\u008a\u0090\5\30\r\2\u008b\u008c\7\20\2\2\u008c\u0090\5\22\n\2\u008d"+
		"\u008e\7\20\2\2\u008e\u0090\5\32\16\2\u008f\u0088\3\2\2\2\u008f\u0089"+
		"\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\21\3\2\2\2\u0091\u0092\5\"\22\2\u0092\u0093\7\62\2\2\u0093\u0094\7\64"+
		"\2\2\u0094\23\3\2\2\2\u0095\u0096\5\"\22\2\u0096\u0097\7\62\2\2\u0097"+
		"\u0098\7\31\2\2\u0098\u0099\5F$\2\u0099\u009a\7\64\2\2\u009a\25\3\2\2"+
		"\2\u009b\u009c\7\62\2\2\u009c\u009d\7&\2\2\u009d\u009e\5\36\20\2\u009e"+
		"\u009f\7\'\2\2\u009f\u00a0\5*\26\2\u00a0\27\3\2\2\2\u00a1\u00a2\5\34\17"+
		"\2\u00a2\u00a3\5&\24\2\u00a3\u00a4\5*\26\2\u00a4\31\3\2\2\2\u00a5\u00a6"+
		"\5\34\17\2\u00a6\u00a7\5*\26\2\u00a7\33\3\2\2\2\u00a8\u00a9\5\"\22\2\u00a9"+
		"\u00aa\7\62\2\2\u00aa\u00ab\7&\2\2\u00ab\u00ac\5\36\20\2\u00ac\u00ad\7"+
		"\'\2\2\u00ad\35\3\2\2\2\u00ae\u00b1\5 \21\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\37\3\2\2\2\u00b2\u00b3\b\21\1"+
		"\2\u00b3\u00b4\5\"\22\2\u00b4\u00b5\7\62\2\2\u00b5\u00bd\3\2\2\2\u00b6"+
		"\u00b7\f\4\2\2\u00b7\u00b8\7\63\2\2\u00b8\u00b9\5\"\22\2\u00b9\u00ba\7"+
		"\62\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be!\3\2\2\2\u00bf\u00bd\3\2\2\2"+
		"\u00c0\u00d2\7\t\2\2\u00c1\u00c2\5&\24\2\u00c2\u00c3\7\b\2\2\u00c3\u00c4"+
		"\5(\25\2\u00c4\u00d2\3\2\2\2\u00c5\u00c6\5&\24\2\u00c6\u00c7\7\13\2\2"+
		"\u00c7\u00c8\5(\25\2\u00c8\u00d2\3\2\2\2\u00c9\u00ca\5&\24\2\u00ca\u00cb"+
		"\7\n\2\2\u00cb\u00cc\5(\25\2\u00cc\u00d2\3\2\2\2\u00cd\u00ce\5&\24\2\u00ce"+
		"\u00cf\5$\23\2\u00cf\u00d0\5(\25\2\u00d0\u00d2\3\2\2\2\u00d1\u00c0\3\2"+
		"\2\2\u00d1\u00c1\3\2\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1"+
		"\u00cd\3\2\2\2\u00d2#\3\2\2\2\u00d3\u00d4\b\23\1\2\u00d4\u00d5\7\62\2"+
		"\2\u00d5\u00db\3\2\2\2\u00d6\u00d7\f\4\2\2\u00d7\u00d8\7%\2\2\u00d8\u00da"+
		"\7\62\2\2\u00d9\u00d6\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc%\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e1\7"+
		"\r\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\'\3\2\2\2\u00e2\u00e5\7\67\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2"+
		"\2\u00e4\u00e3\3\2\2\2\u00e5)\3\2\2\2\u00e6\u00e7\7(\2\2\u00e7\u00e8\5"+
		"B\"\2\u00e8\u00e9\5,\27\2\u00e9\u00ea\7)\2\2\u00ea+\3\2\2\2\u00eb\u00ec"+
		"\b\27\1\2\u00ec\u00ef\5.\30\2\u00ed\u00ef\3\2\2\2\u00ee\u00eb\3\2\2\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef\u00f4\3\2\2\2\u00f0\u00f1\f\5\2\2\u00f1\u00f3"+
		"\5.\30\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5-\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u0102\5*\26\2"+
		"\u00f8\u0102\5\60\31\2\u00f9\u0102\5\64\33\2\u00fa\u0102\5\66\34\2\u00fb"+
		"\u0102\58\35\2\u00fc\u0102\5:\36\2\u00fd\u0102\5> \2\u00fe\u0102\5D#\2"+
		"\u00ff\u0100\7\7\2\2\u0100\u0102\7\64\2\2\u0101\u00f7\3\2\2\2\u0101\u00f8"+
		"\3\2\2\2\u0101\u00f9\3\2\2\2\u0101\u00fa\3\2\2\2\u0101\u00fb\3\2\2\2\u0101"+
		"\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102/\3\2\2\2\u0103\u0104\7\3\2\2\u0104\u0105\7&\2\2\u0105\u0106"+
		"\5F$\2\u0106\u0107\7\'\2\2\u0107\u0108\5\62\32\2\u0108\61\3\2\2\2\u0109"+
		"\u010a\7\4\2\2\u010a\u010d\5,\27\2\u010b\u010d\3\2\2\2\u010c\u0109\3\2"+
		"\2\2\u010c\u010b\3\2\2\2\u010d\63\3\2\2\2\u010e\u010f\7\6\2\2\u010f\u0110"+
		"\7&\2\2\u0110\u0111\5F$\2\u0111\u0112\7\'\2\2\u0112\u0113\5,\27\2\u0113"+
		"\65\3\2\2\2\u0114\u0115\5L\'\2\u0115\u0116\7\31\2\2\u0116\u0117\5F$\2"+
		"\u0117\u0118\7\64\2\2\u0118\67\3\2\2\2\u0119\u011a\7\5\2\2\u011a\u011b"+
		"\5D#\2\u011b9\3\2\2\2\u011c\u011d\7,\2\2\u011d\u011e\5<\37\2\u011e\u011f"+
		"\7\64\2\2\u011f;\3\2\2\2\u0120\u0121\b\37\1\2\u0121\u0124\5L\'\2\u0122"+
		"\u0124\7.\2\2\u0123\u0120\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u012a\3\2"+
		"\2\2\u0125\u0126\f\5\2\2\u0126\u0127\7\66\2\2\u0127\u0129\5L\'\2\u0128"+
		"\u0125\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b=\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7-\2\2\u012e\u012f"+
		"\5@!\2\u012f\u0130\7\64\2\2\u0130?\3\2\2\2\u0131\u0132\b!\1\2\u0132\u0136"+
		"\5F$\2\u0133\u0136\7\61\2\2\u0134\u0136\7.\2\2\u0135\u0131\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u013c\3\2\2\2\u0137\u0138\f\6"+
		"\2\2\u0138\u0139\7\65\2\2\u0139\u013b\5F$\2\u013a\u0137\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013dA\3\2\2\2"+
		"\u013e\u013c\3\2\2\2\u013f\u0143\5\22\n\2\u0140\u0143\5\24\13\2\u0141"+
		"\u0143\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2"+
		"\2\2\u0143C\3\2\2\2\u0144\u0145\5F$\2\u0145\u0146\7\64\2\2\u0146\u0149"+
		"\3\2\2\2\u0147\u0149\7\64\2\2\u0148\u0144\3\2\2\2\u0148\u0147\3\2\2\2"+
		"\u0149E\3\2\2\2\u014a\u014b\b$\1\2\u014b\u014c\7&\2\2\u014c\u014d\5F$"+
		"\2\u014d\u014e\7\'\2\2\u014e\u015d\3\2\2\2\u014f\u0150\5J&\2\u0150\u0151"+
		"\5F$\t\u0151\u015d\3\2\2\2\u0152\u0153\5L\'\2\u0153\u0154\7&\2\2\u0154"+
		"\u0155\5P)\2\u0155\u0156\7\'\2\2\u0156\u015d\3\2\2\2\u0157\u015d\5L\'"+
		"\2\u0158\u015d\7/\2\2\u0159\u015d\7\60\2\2\u015a\u015d\7;\2\2\u015b\u015d"+
		"\7<\2\2\u015c\u014a\3\2\2\2\u015c\u014f\3\2\2\2\u015c\u0152\3\2\2\2\u015c"+
		"\u0157\3\2\2\2\u015c\u0158\3\2\2\2\u015c\u0159\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015b\3\2\2\2\u015d\u0164\3\2\2\2\u015e\u015f\f\n\2\2\u015f"+
		"\u0160\5H%\2\u0160\u0161\5F$\13\u0161\u0163\3\2\2\2\u0162\u015e\3\2\2"+
		"\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165G"+
		"\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\t\2\2\2\u0168I\3\2\2\2\u0169"+
		"\u016a\t\3\2\2\u016aK\3\2\2\2\u016b\u016c\7\62\2\2\u016c\u016d\7%\2\2"+
		"\u016d\u0173\5N(\2\u016e\u016f\7=\2\2\u016f\u0170\7$\2\2\u0170\u0173\5"+
		"N(\2\u0171\u0173\5N(\2\u0172\u016b\3\2\2\2\u0172\u016e\3\2\2\2\u0172\u0171"+
		"\3\2\2\2\u0173M\3\2\2\2\u0174\u0175\7\62\2\2\u0175\u0176\7#\2\2\u0176"+
		"\u0180\5N(\2\u0177\u0178\7\62\2\2\u0178\u0179\7&\2\2\u0179\u017a\5P)\2"+
		"\u017a\u017b\7\'\2\2\u017b\u017c\7#\2\2\u017c\u017d\5N(\2\u017d\u0180"+
		"\3\2\2\2\u017e\u0180\7\62\2\2\u017f\u0174\3\2\2\2\u017f\u0177\3\2\2\2"+
		"\u017f\u017e\3\2\2\2\u0180O\3\2\2\2\u0181\u0184\5R*\2\u0182\u0184\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184Q\3\2\2\2\u0185\u0186"+
		"\b*\1\2\u0186\u0187\5F$\2\u0187\u018d\3\2\2\2\u0188\u0189\f\4\2\2\u0189"+
		"\u018a\7\63\2\2\u018a\u018c\5F$\2\u018b\u0188\3\2\2\2\u018c\u018f\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018eS\3\2\2\2\u018f\u018d"+
		"\3\2\2\2\36^cs|\u0085\u008f\u00b0\u00bd\u00d1\u00db\u00e0\u00e4\u00ee"+
		"\u00f4\u0101\u010c\u0123\u012a\u0135\u013c\u0142\u0148\u015c\u0164\u0172"+
		"\u017f\u0183\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}