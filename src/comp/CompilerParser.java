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
		RULE_start = 0, RULE_definicao = 1, RULE_estrutura = 2, RULE_estrutura_acesso = 3, 
		RULE_membro = 4, RULE_variavel = 5, RULE_variavel_atribuicao = 6, RULE_construtor = 7, 
		RULE_metodo = 8, RULE_funcao = 9, RULE_funcao_cabecalho = 10, RULE_parametros_formais = 11, 
		RULE_lista_parametros_formais = 12, RULE_tipo = 13, RULE_tipo_nome = 14, 
		RULE_qualificador = 15, RULE_decorador = 16, RULE_bloco = 17, RULE_lista_comandos = 18, 
		RULE_comando = 19, RULE_selecao = 20, RULE_selecao_senao = 21, RULE_repeticao = 22, 
		RULE_atribuicao = 23, RULE_retorno = 24, RULE_entrada = 25, RULE_parametro_entrada = 26, 
		RULE_saida = 27, RULE_parametro_saida = 28, RULE_lista_declaracoes_locais = 29, 
		RULE_expressao_comando = 30, RULE_expressao = 31, RULE_operador_binario = 32, 
		RULE_operador_unario = 33, RULE_nome = 34, RULE_nome_lista = 35, RULE_parametros_reais = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definicao", "estrutura", "estrutura_acesso", "membro", "variavel", 
			"variavel_atribuicao", "construtor", "metodo", "funcao", "funcao_cabecalho", 
			"parametros_formais", "lista_parametros_formais", "tipo", "tipo_nome", 
			"qualificador", "decorador", "bloco", "lista_comandos", "comando", "selecao", 
			"selecao_senao", "repeticao", "atribuicao", "retorno", "entrada", "parametro_entrada", 
			"saida", "parametro_saida", "lista_declaracoes_locais", "expressao_comando", 
			"expressao", "operador_binario", "operador_unario", "nome", "nome_lista", 
			"parametros_reais"
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
		public TerminalNode EOF() { return getToken(CompilerParser.EOF, 0); }
		public List<DefinicaoContext> definicao() {
			return getRuleContexts(DefinicaoContext.class);
		}
		public DefinicaoContext definicao(int i) {
			return getRuleContext(DefinicaoContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << CHAR) | (1L << STRUCT) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				{
				setState(74);
				definicao();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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

	public static class DefinicaoContext extends ParserRuleContext {
		public DefinicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao; }
	 
		public DefinicaoContext() { }
		public void copyFrom(DefinicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncContext extends DefinicaoContext {
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public FuncContext(DefinicaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EstruContext extends DefinicaoContext {
		public EstruturaContext estrutura() {
			return getRuleContext(EstruturaContext.class,0);
		}
		public EstruContext(DefinicaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitEstru(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicaoContext definicao() throws RecognitionException {
		DefinicaoContext _localctx = new DefinicaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definicao);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case VOID:
			case BOOL:
			case CHAR:
			case CONST:
			case ID:
				_localctx = new FuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				funcao();
				}
				break;
			case STRUCT:
				_localctx = new EstruContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
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
		public TerminalNode RBRACE() { return getToken(CompilerParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(CompilerParser.SEMI, 0); }
		public List<Estrutura_acessoContext> estrutura_acesso() {
			return getRuleContexts(Estrutura_acessoContext.class);
		}
		public Estrutura_acessoContext estrutura_acesso(int i) {
			return getRuleContext(Estrutura_acessoContext.class,i);
		}
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
		enterRule(_localctx, 4, RULE_estrutura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(STRUCT);
			setState(87);
			match(ID);
			setState(88);
			match(LBRACE);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC || _la==PROTECTED) {
				{
				{
				setState(89);
				estrutura_acesso();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(RBRACE);
			setState(96);
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

	public static class Estrutura_acessoContext extends ParserRuleContext {
		public Estrutura_acessoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura_acesso; }
	 
		public Estrutura_acessoContext() { }
		public void copyFrom(Estrutura_acessoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PublicEstrContext extends Estrutura_acessoContext {
		public TerminalNode PUBLIC() { return getToken(CompilerParser.PUBLIC, 0); }
		public TerminalNode COLON() { return getToken(CompilerParser.COLON, 0); }
		public List<MembroContext> membro() {
			return getRuleContexts(MembroContext.class);
		}
		public MembroContext membro(int i) {
			return getRuleContext(MembroContext.class,i);
		}
		public PublicEstrContext(Estrutura_acessoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitPublicEstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProtectedEstrContext extends Estrutura_acessoContext {
		public TerminalNode PROTECTED() { return getToken(CompilerParser.PROTECTED, 0); }
		public TerminalNode COLON() { return getToken(CompilerParser.COLON, 0); }
		public List<MembroContext> membro() {
			return getRuleContexts(MembroContext.class);
		}
		public MembroContext membro(int i) {
			return getRuleContext(MembroContext.class,i);
		}
		public ProtectedEstrContext(Estrutura_acessoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitProtectedEstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Estrutura_acessoContext estrutura_acesso() throws RecognitionException {
		Estrutura_acessoContext _localctx = new Estrutura_acessoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_estrutura_acesso);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				_localctx = new PublicEstrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(PUBLIC);
				setState(99);
				match(COLON);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << CHAR) | (1L << CONST) | (1L << STATIC) | (1L << ID))) != 0)) {
					{
					{
					setState(100);
					membro();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PROTECTED:
				_localctx = new ProtectedEstrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(PROTECTED);
				setState(107);
				match(COLON);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VOID) | (1L << BOOL) | (1L << CHAR) | (1L << CONST) | (1L << STATIC) | (1L << ID))) != 0)) {
					{
					{
					setState(108);
					membro();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class MembroContext extends ParserRuleContext {
		public MembroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membro; }
	 
		public MembroContext() { }
		public void copyFrom(MembroContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MetodoFuncContext extends MembroContext {
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public MetodoFuncContext(MembroContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitMetodoFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncStaticContext extends MembroContext {
		public TerminalNode STATIC() { return getToken(CompilerParser.STATIC, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public FuncStaticContext(MembroContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFuncStatic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariavelFuncContext extends MembroContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public VariavelFuncContext(MembroContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVariavelFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarStaticContext extends MembroContext {
		public TerminalNode STATIC() { return getToken(CompilerParser.STATIC, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public VarStaticContext(MembroContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVarStatic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstrutorFuncContext extends MembroContext {
		public ConstrutorContext construtor() {
			return getRuleContext(ConstrutorContext.class,0);
		}
		public ConstrutorFuncContext(MembroContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitConstrutorFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembroContext membro() throws RecognitionException {
		MembroContext _localctx = new MembroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_membro);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ConstrutorFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				construtor();
				}
				break;
			case 2:
				_localctx = new VariavelFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				variavel();
				}
				break;
			case 3:
				_localctx = new MetodoFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				metodo();
				}
				break;
			case 4:
				_localctx = new VarStaticContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(STATIC);
				setState(120);
				variavel();
				}
				break;
			case 5:
				_localctx = new FuncStaticContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				match(STATIC);
				setState(122);
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
		enterRule(_localctx, 10, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			tipo();
			setState(126);
			match(ID);
			setState(127);
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
		enterRule(_localctx, 12, RULE_variavel_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			tipo();
			setState(130);
			match(ID);
			setState(131);
			match(ATRIB);
			setState(132);
			expressao(0);
			setState(133);
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
		enterRule(_localctx, 14, RULE_construtor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ID);
			setState(136);
			match(LPAREN);
			setState(137);
			parametros_formais();
			setState(138);
			match(RPAREN);
			setState(139);
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
		enterRule(_localctx, 16, RULE_metodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			funcao_cabecalho();
			setState(142);
			qualificador();
			setState(143);
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
		enterRule(_localctx, 18, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			funcao_cabecalho();
			setState(146);
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
		public Lista_parametros_formaisContext lista_parametros_formais() {
			return getRuleContext(Lista_parametros_formaisContext.class,0);
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
		enterRule(_localctx, 20, RULE_funcao_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			tipo();
			setState(149);
			match(ID);
			setState(150);
			match(LPAREN);
			setState(151);
			lista_parametros_formais(0);
			setState(152);
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
		public Parametros_formaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_formais; }
	 
		public Parametros_formaisContext() { }
		public void copyFrom(Parametros_formaisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormEmpyParamContext extends Parametros_formaisContext {
		public FormEmpyParamContext(Parametros_formaisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFormEmpyParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormParamContext extends Parametros_formaisContext {
		public Lista_parametros_formaisContext lista_parametros_formais() {
			return getRuleContext(Lista_parametros_formaisContext.class,0);
		}
		public FormParamContext(Parametros_formaisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFormParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_formaisContext parametros_formais() throws RecognitionException {
		Parametros_formaisContext _localctx = new Parametros_formaisContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametros_formais);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case VOID:
			case BOOL:
			case CHAR:
			case CONST:
			case ID:
				_localctx = new FormParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				lista_parametros_formais(0);
				}
				break;
			case RPAREN:
				_localctx = new FormEmpyParamContext(_localctx);
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
		public Lista_parametros_formaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametros_formais; }
	 
		public Lista_parametros_formaisContext() { }
		public void copyFrom(Lista_parametros_formaisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormParamListIdContext extends Lista_parametros_formaisContext {
		public Lista_parametros_formaisContext lista_parametros_formais() {
			return getRuleContext(Lista_parametros_formaisContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CompilerParser.COMMA, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public FormParamListIdContext(Lista_parametros_formaisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFormParamListId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormParamIdContext extends Lista_parametros_formaisContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public FormParamIdContext(Lista_parametros_formaisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFormParamId(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_lista_parametros_formais, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FormParamIdContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(159);
			tipo();
			setState(160);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FormParamListIdContext(new Lista_parametros_formaisContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lista_parametros_formais);
					setState(162);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(163);
					match(COMMA);
					setState(164);
					tipo();
					setState(165);
					match(ID);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	 
		public TipoContext() { }
		public void copyFrom(TipoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolExprContext extends TipoContext {
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(CompilerParser.BOOL, 0); }
		public DecoradorContext decorador() {
			return getRuleContext(DecoradorContext.class,0);
		}
		public BoolExprContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectExprContext extends TipoContext {
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public Tipo_nomeContext tipo_nome() {
			return getRuleContext(Tipo_nomeContext.class,0);
		}
		public DecoradorContext decorador() {
			return getRuleContext(DecoradorContext.class,0);
		}
		public ObjectExprContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExprContext extends TipoContext {
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public TerminalNode INT() { return getToken(CompilerParser.INT, 0); }
		public DecoradorContext decorador() {
			return getRuleContext(DecoradorContext.class,0);
		}
		public IntExprContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidExprContext extends TipoContext {
		public TerminalNode VOID() { return getToken(CompilerParser.VOID, 0); }
		public VoidExprContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVoidExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharExprContext extends TipoContext {
		public QualificadorContext qualificador() {
			return getRuleContext(QualificadorContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(CompilerParser.CHAR, 0); }
		public DecoradorContext decorador() {
			return getRuleContext(DecoradorContext.class,0);
		}
		public CharExprContext(TipoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCharExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new VoidExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(VOID);
				}
				break;
			case 2:
				_localctx = new IntExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				qualificador();
				setState(174);
				match(INT);
				setState(175);
				decorador();
				}
				break;
			case 3:
				_localctx = new CharExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				qualificador();
				setState(178);
				match(CHAR);
				setState(179);
				decorador();
				}
				break;
			case 4:
				_localctx = new BoolExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				qualificador();
				setState(182);
				match(BOOL);
				setState(183);
				decorador();
				}
				break;
			case 5:
				_localctx = new ObjectExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				qualificador();
				setState(186);
				tipo_nome(0);
				setState(187);
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
		public Tipo_nomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_nome; }
	 
		public Tipo_nomeContext() { }
		public void copyFrom(Tipo_nomeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChamadaMultIDContext extends Tipo_nomeContext {
		public Tipo_nomeContext tipo_nome() {
			return getRuleContext(Tipo_nomeContext.class,0);
		}
		public TerminalNode DBLCOL() { return getToken(CompilerParser.DBLCOL, 0); }
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public ChamadaMultIDContext(Tipo_nomeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitChamadaMultID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChamadaIDContext extends Tipo_nomeContext {
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public ChamadaIDContext(Tipo_nomeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitChamadaID(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_tipo_nome, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ChamadaIDContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(192);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ChamadaMultIDContext(new Tipo_nomeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tipo_nome);
					setState(194);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(195);
					match(DBLCOL);
					setState(196);
					match(ID);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public QualificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualificador; }
	 
		public QualificadorContext() { }
		public void copyFrom(QualificadorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyQualiContext extends QualificadorContext {
		public EmptyQualiContext(QualificadorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitEmptyQuali(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstQualiContext extends QualificadorContext {
		public TerminalNode CONST() { return getToken(CompilerParser.CONST, 0); }
		public ConstQualiContext(QualificadorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitConstQuali(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualificadorContext qualificador() throws RecognitionException {
		QualificadorContext _localctx = new QualificadorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_qualificador);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new ConstQualiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(CONST);
				}
				break;
			case INT:
			case BOOL:
			case CHAR:
			case LBRACE:
			case ID:
				_localctx = new EmptyQualiContext(_localctx);
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
		public DecoradorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorador; }
	 
		public DecoradorContext() { }
		public void copyFrom(DecoradorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyDecorContext extends DecoradorContext {
		public EmptyDecorContext(DecoradorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitEmptyDecor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AmperDecorContext extends DecoradorContext {
		public TerminalNode AMPER() { return getToken(CompilerParser.AMPER, 0); }
		public AmperDecorContext(DecoradorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitAmperDecor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoradorContext decorador() throws RecognitionException {
		DecoradorContext _localctx = new DecoradorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_decorador);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AMPER:
				_localctx = new AmperDecorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(AMPER);
				}
				break;
			case ID:
				_localctx = new EmptyDecorContext(_localctx);
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
		enterRule(_localctx, 34, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LBRACE);
			setState(211);
			lista_declaracoes_locais();
			setState(212);
			lista_comandos(0);
			setState(213);
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
		public Lista_comandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_comandos; }
	 
		public Lista_comandosContext() { }
		public void copyFrom(Lista_comandosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommandEmptyContext extends Lista_comandosContext {
		public CommandEmptyContext(Lista_comandosContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCommandEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommandContext extends Lista_comandosContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public CommandContext(Lista_comandosContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultCommandContext extends Lista_comandosContext {
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public MultCommandContext(Lista_comandosContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitMultCommand(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_lista_comandos, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new CommandContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(216);
				comando();
				}
				break;
			case 2:
				{
				_localctx = new CommandEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultCommandContext(new Lista_comandosContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lista_comandos);
					setState(220);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(221);
					comando();
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommandFimContext extends ComandoContext {
		public TerminalNode BREAK() { return getToken(CompilerParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(CompilerParser.SEMI, 0); }
		public CommandFimContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCommandFim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommandAtribContext extends ComandoContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public CommandAtribContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCommandAtrib(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommandRetContext extends ComandoContext {
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public CommandRetContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCommandRet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommandExprContext extends ComandoContext {
		public Expressao_comandoContext expressao_comando() {
			return getRuleContext(Expressao_comandoContext.class,0);
		}
		public CommandExprContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommandSelecaoContext extends ComandoContext {
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public CommandSelecaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCommandSelecao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommandInContext extends ComandoContext {
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public CommandInContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCommandIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommandOutContext extends ComandoContext {
		public SaidaContext saida() {
			return getRuleContext(SaidaContext.class,0);
		}
		public CommandOutContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCommandOut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommandBlocoContext extends ComandoContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CommandBlocoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCommandBloco(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommandRepeticaoContext extends ComandoContext {
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public CommandRepeticaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCommandRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comando);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new CommandBlocoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				bloco();
				}
				break;
			case 2:
				_localctx = new CommandSelecaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				selecao();
				}
				break;
			case 3:
				_localctx = new CommandRepeticaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				repeticao();
				}
				break;
			case 4:
				_localctx = new CommandAtribContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				atribuicao();
				}
				break;
			case 5:
				_localctx = new CommandRetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				retorno();
				}
				break;
			case 6:
				_localctx = new CommandInContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				entrada();
				}
				break;
			case 7:
				_localctx = new CommandOutContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				saida();
				}
				break;
			case 8:
				_localctx = new CommandExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				expressao_comando();
				}
				break;
			case 9:
				_localctx = new CommandFimContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(235);
				match(BREAK);
				setState(236);
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
		enterRule(_localctx, 40, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(IF);
			setState(240);
			match(LPAREN);
			setState(241);
			expressao(0);
			setState(242);
			match(RPAREN);
			setState(243);
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
		public Selecao_senaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao_senao; }
	 
		public Selecao_senaoContext() { }
		public void copyFrom(Selecao_senaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SenaoExprContext extends Selecao_senaoContext {
		public TerminalNode ELSE() { return getToken(CompilerParser.ELSE, 0); }
		public Lista_comandosContext lista_comandos() {
			return getRuleContext(Lista_comandosContext.class,0);
		}
		public SenaoExprContext(Selecao_senaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSenaoExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SenaoVazioContext extends Selecao_senaoContext {
		public SenaoVazioContext(Selecao_senaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSenaoVazio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selecao_senaoContext selecao_senao() throws RecognitionException {
		Selecao_senaoContext _localctx = new Selecao_senaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_selecao_senao);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new SenaoExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(ELSE);
				setState(246);
				lista_comandos(0);
				}
				break;
			case 2:
				_localctx = new SenaoVazioContext(_localctx);
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
		enterRule(_localctx, 44, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(WHILE);
			setState(251);
			match(LPAREN);
			setState(252);
			expressao(0);
			setState(253);
			match(RPAREN);
			setState(254);
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
		enterRule(_localctx, 46, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			nome();
			setState(257);
			match(ATRIB);
			setState(258);
			expressao(0);
			setState(259);
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
		enterRule(_localctx, 48, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(RETURN);
			setState(262);
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
		public TerminalNode SEMI() { return getToken(CompilerParser.SEMI, 0); }
		public List<TerminalNode> RSHIFT() { return getTokens(CompilerParser.RSHIFT); }
		public TerminalNode RSHIFT(int i) {
			return getToken(CompilerParser.RSHIFT, i);
		}
		public List<Parametro_entradaContext> parametro_entrada() {
			return getRuleContexts(Parametro_entradaContext.class);
		}
		public Parametro_entradaContext parametro_entrada(int i) {
			return getRuleContext(Parametro_entradaContext.class,i);
		}
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
		enterRule(_localctx, 50, RULE_entrada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(STDCIN);
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(265);
				match(RSHIFT);
				setState(266);
				parametro_entrada();
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RSHIFT );
			setState(271);
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

	public static class Parametro_entradaContext extends ParserRuleContext {
		public Parametro_entradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro_entrada; }
	 
		public Parametro_entradaContext() { }
		public void copyFrom(Parametro_entradaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EndlParamEntradaContext extends Parametro_entradaContext {
		public TerminalNode STDENDL() { return getToken(CompilerParser.STDENDL, 0); }
		public EndlParamEntradaContext(Parametro_entradaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitEndlParamEntrada(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NomeParamEntradaContext extends Parametro_entradaContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public NomeParamEntradaContext(Parametro_entradaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitNomeParamEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametro_entradaContext parametro_entrada() throws RecognitionException {
		Parametro_entradaContext _localctx = new Parametro_entradaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parametro_entrada);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case THIS:
				_localctx = new NomeParamEntradaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				nome();
				}
				break;
			case STDENDL:
				_localctx = new EndlParamEntradaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(STDENDL);
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

	public static class SaidaContext extends ParserRuleContext {
		public TerminalNode STDCOUT() { return getToken(CompilerParser.STDCOUT, 0); }
		public TerminalNode SEMI() { return getToken(CompilerParser.SEMI, 0); }
		public List<TerminalNode> LSHIFT() { return getTokens(CompilerParser.LSHIFT); }
		public TerminalNode LSHIFT(int i) {
			return getToken(CompilerParser.LSHIFT, i);
		}
		public List<Parametro_saidaContext> parametro_saida() {
			return getRuleContexts(Parametro_saidaContext.class);
		}
		public Parametro_saidaContext parametro_saida(int i) {
			return getRuleContext(Parametro_saidaContext.class,i);
		}
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
		enterRule(_localctx, 54, RULE_saida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(STDCOUT);
			setState(280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(278);
				match(LSHIFT);
				setState(279);
				parametro_saida();
				}
				}
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LSHIFT );
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

	public static class Parametro_saidaContext extends ParserRuleContext {
		public Parametro_saidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro_saida; }
	 
		public Parametro_saidaContext() { }
		public void copyFrom(Parametro_saidaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprParamSaidaContext extends Parametro_saidaContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExprParamSaidaContext(Parametro_saidaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitExprParamSaida(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringParamSaidaContext extends Parametro_saidaContext {
		public TerminalNode STRL() { return getToken(CompilerParser.STRL, 0); }
		public StringParamSaidaContext(Parametro_saidaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitStringParamSaida(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EndlParamSaidaContext extends Parametro_saidaContext {
		public TerminalNode STDENDL() { return getToken(CompilerParser.STDENDL, 0); }
		public EndlParamSaidaContext(Parametro_saidaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitEndlParamSaida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametro_saidaContext parametro_saida() throws RecognitionException {
		Parametro_saidaContext _localctx = new Parametro_saidaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parametro_saida);
		try {
			setState(289);
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
				_localctx = new ExprParamSaidaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				expressao(0);
				}
				break;
			case STRL:
				_localctx = new StringParamSaidaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(STRL);
				}
				break;
			case STDENDL:
				_localctx = new EndlParamSaidaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(STDENDL);
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

	public static class Lista_declaracoes_locaisContext extends ParserRuleContext {
		public Lista_declaracoes_locaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_declaracoes_locais; }
	 
		public Lista_declaracoes_locaisContext() { }
		public void copyFrom(Lista_declaracoes_locaisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariavelDeclContext extends Lista_declaracoes_locaisContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public VariavelDeclContext(Lista_declaracoes_locaisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVariavelDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariavelAtribDeclContext extends Lista_declaracoes_locaisContext {
		public Variavel_atribuicaoContext variavel_atribuicao() {
			return getRuleContext(Variavel_atribuicaoContext.class,0);
		}
		public VariavelAtribDeclContext(Lista_declaracoes_locaisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVariavelAtribDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariavelVazioContext extends Lista_declaracoes_locaisContext {
		public VariavelVazioContext(Lista_declaracoes_locaisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVariavelVazio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_declaracoes_locaisContext lista_declaracoes_locais() throws RecognitionException {
		Lista_declaracoes_locaisContext _localctx = new Lista_declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lista_declaracoes_locais);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new VariavelDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				variavel();
				}
				break;
			case 2:
				_localctx = new VariavelAtribDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				variavel_atribuicao();
				}
				break;
			case 3:
				_localctx = new VariavelVazioContext(_localctx);
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
		public Expressao_comandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_comando; }
	 
		public Expressao_comandoContext() { }
		public void copyFrom(Expressao_comandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnExprContext extends Expressao_comandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CompilerParser.SEMI, 0); }
		public ReturnExprContext(Expressao_comandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitReturnExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnEmptyContext extends Expressao_comandoContext {
		public TerminalNode SEMI() { return getToken(CompilerParser.SEMI, 0); }
		public ReturnEmptyContext(Expressao_comandoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitReturnEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_comandoContext expressao_comando() throws RecognitionException {
		Expressao_comandoContext _localctx = new Expressao_comandoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressao_comando);
		try {
			setState(300);
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
				_localctx = new ReturnExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				expressao(0);
				setState(297);
				match(SEMI);
				}
				break;
			case SEMI:
				_localctx = new ReturnEmptyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
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
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CharlExprContext extends ExpressaoContext {
		public TerminalNode CHARL() { return getToken(CompilerParser.CHARL, 0); }
		public CharlExprContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCharlExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpBinExprContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public Operador_binarioContext operador_binario() {
			return getRuleContext(Operador_binarioContext.class,0);
		}
		public OpBinExprContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitOpBinExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueExprContext extends ExpressaoContext {
		public TerminalNode TRUE() { return getToken(CompilerParser.TRUE, 0); }
		public TrueExprContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitTrueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntlExprContext extends ExpressaoContext {
		public TerminalNode INTL() { return getToken(CompilerParser.INTL, 0); }
		public IntlExprContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitIntlExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParemExprContext extends ExpressaoContext {
		public TerminalNode LPAREN() { return getToken(CompilerParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CompilerParser.RPAREN, 0); }
		public ParemExprContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitParemExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpUnExprContext extends ExpressaoContext {
		public Operador_unarioContext operador_unario() {
			return getRuleContext(Operador_unarioContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public OpUnExprContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitOpUnExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NomeExprContext extends ExpressaoContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public NomeExprContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitNomeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallExprContext extends ExpressaoContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CompilerParser.LPAREN, 0); }
		public Parametros_reaisContext parametros_reais() {
			return getRuleContext(Parametros_reaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CompilerParser.RPAREN, 0); }
		public FuncCallExprContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFuncCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExprContext extends ExpressaoContext {
		public TerminalNode FALSE() { return getToken(CompilerParser.FALSE, 0); }
		public FalseExprContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitFalseExpr(this);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new ParemExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(303);
				match(LPAREN);
				setState(304);
				expressao(0);
				setState(305);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new OpUnExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(307);
				operador_unario();
				setState(308);
				expressao(7);
				}
				break;
			case 3:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				nome();
				setState(311);
				match(LPAREN);
				setState(312);
				parametros_reais();
				setState(313);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new NomeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				nome();
				}
				break;
			case 5:
				{
				_localctx = new IntlExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				match(INTL);
				}
				break;
			case 6:
				{
				_localctx = new CharlExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(CHARL);
				}
				break;
			case 7:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318);
				match(TRUE);
				}
				break;
			case 8:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpBinExprContext(new ExpressaoContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expressao);
					setState(322);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(323);
					operador_binario();
					setState(324);
					expressao(9);
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public Operador_binarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_binario; }
	 
		public Operador_binarioContext() { }
		public void copyFrom(Operador_binarioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExprContext extends Operador_binarioContext {
		public TerminalNode AND() { return getToken(CompilerParser.AND, 0); }
		public AndExprContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeqExprContext extends Operador_binarioContext {
		public TerminalNode LEQ() { return getToken(CompilerParser.LEQ, 0); }
		public LeqExprContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitLeqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GeqExprContext extends Operador_binarioContext {
		public TerminalNode GEQ() { return getToken(CompilerParser.GEQ, 0); }
		public GeqExprContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitGeqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtExprContext extends Operador_binarioContext {
		public TerminalNode LT() { return getToken(CompilerParser.LT, 0); }
		public LtExprContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitLtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtExprContext extends Operador_binarioContext {
		public TerminalNode GT() { return getToken(CompilerParser.GT, 0); }
		public GtExprContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitGtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends Operador_binarioContext {
		public TerminalNode OR() { return getToken(CompilerParser.OR, 0); }
		public OrExprContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExprContext extends Operador_binarioContext {
		public TerminalNode DIV() { return getToken(CompilerParser.DIV, 0); }
		public DivExprContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusExprContext extends Operador_binarioContext {
		public TerminalNode PLUS() { return getToken(CompilerParser.PLUS, 0); }
		public PlusExprContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends Operador_binarioContext {
		public TerminalNode EQ() { return getToken(CompilerParser.EQ, 0); }
		public EqExprContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NeqExprContext extends Operador_binarioContext {
		public TerminalNode NEQ() { return getToken(CompilerParser.NEQ, 0); }
		public NeqExprContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitNeqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExprContext extends Operador_binarioContext {
		public TerminalNode MOD() { return getToken(CompilerParser.MOD, 0); }
		public ModExprContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitModExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimesExprContext extends Operador_binarioContext {
		public TerminalNode TIMES() { return getToken(CompilerParser.TIMES, 0); }
		public TimesExprContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitTimesExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExprBinarioContext extends Operador_binarioContext {
		public TerminalNode MINUS() { return getToken(CompilerParser.MINUS, 0); }
		public MinusExprBinarioContext(Operador_binarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitMinusExprBinario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_binarioContext operador_binario() throws RecognitionException {
		Operador_binarioContext _localctx = new Operador_binarioContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operador_binario);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new PlusExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new MinusExprBinarioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(MINUS);
				}
				break;
			case TIMES:
				_localctx = new TimesExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				match(TIMES);
				}
				break;
			case DIV:
				_localctx = new DivExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				match(DIV);
				}
				break;
			case MOD:
				_localctx = new ModExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				match(MOD);
				}
				break;
			case LT:
				_localctx = new LtExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(336);
				match(LT);
				}
				break;
			case LEQ:
				_localctx = new LeqExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(337);
				match(LEQ);
				}
				break;
			case GT:
				_localctx = new GtExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(338);
				match(GT);
				}
				break;
			case GEQ:
				_localctx = new GeqExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(339);
				match(GEQ);
				}
				break;
			case EQ:
				_localctx = new EqExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(340);
				match(EQ);
				}
				break;
			case OR:
				_localctx = new OrExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(341);
				match(OR);
				}
				break;
			case AND:
				_localctx = new AndExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(342);
				match(AND);
				}
				break;
			case NEQ:
				_localctx = new NeqExprContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(343);
				match(NEQ);
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

	public static class Operador_unarioContext extends ParserRuleContext {
		public Operador_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_unario; }
	 
		public Operador_unarioContext() { }
		public void copyFrom(Operador_unarioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncrExprContext extends Operador_unarioContext {
		public TerminalNode INCR() { return getToken(CompilerParser.INCR, 0); }
		public IncrExprContext(Operador_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitIncrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExprUnarioContext extends Operador_unarioContext {
		public TerminalNode MINUS() { return getToken(CompilerParser.MINUS, 0); }
		public MinusExprUnarioContext(Operador_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitMinusExprUnario(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrExprContext extends Operador_unarioContext {
		public TerminalNode DECR() { return getToken(CompilerParser.DECR, 0); }
		public DecrExprContext(Operador_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitDecrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends Operador_unarioContext {
		public TerminalNode NOT() { return getToken(CompilerParser.NOT, 0); }
		public NotExprContext(Operador_unarioContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_unarioContext operador_unario() throws RecognitionException {
		Operador_unarioContext _localctx = new Operador_unarioContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operador_unario);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(NOT);
				}
				break;
			case INCR:
				_localctx = new IncrExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(INCR);
				}
				break;
			case DECR:
				_localctx = new DecrExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				match(DECR);
				}
				break;
			case MINUS:
				_localctx = new MinusExprUnarioContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				match(MINUS);
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

	public static class NomeContext extends ParserRuleContext {
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
	 
		public NomeContext() { }
		public void copyFrom(NomeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChamadaDePonteiroContext extends NomeContext {
		public TerminalNode THIS() { return getToken(CompilerParser.THIS, 0); }
		public TerminalNode ARROW() { return getToken(CompilerParser.ARROW, 0); }
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public ChamadaDePonteiroContext(NomeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitChamadaDePonteiro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChamadaDeClasseContext extends NomeContext {
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public TerminalNode DBLCOL() { return getToken(CompilerParser.DBLCOL, 0); }
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public ChamadaDeClasseContext(NomeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitChamadaDeClasse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NomeListContext extends NomeContext {
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public NomeListContext(NomeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitNomeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_nome);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ChamadaDeClasseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(ID);
				setState(353);
				match(DBLCOL);
				setState(354);
				nome_lista();
				}
				break;
			case 2:
				_localctx = new ChamadaDePonteiroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(THIS);
				setState(356);
				match(ARROW);
				setState(357);
				nome_lista();
				}
				break;
			case 3:
				_localctx = new NomeListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
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
		public Nome_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_lista; }
	 
		public Nome_listaContext() { }
		public void copyFrom(Nome_listaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AcessoFuncContext extends Nome_listaContext {
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CompilerParser.LPAREN, 0); }
		public Parametros_reaisContext parametros_reais() {
			return getRuleContext(Parametros_reaisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CompilerParser.RPAREN, 0); }
		public TerminalNode DOT() { return getToken(CompilerParser.DOT, 0); }
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public AcessoFuncContext(Nome_listaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitAcessoFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AcessoFinalContext extends Nome_listaContext {
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public AcessoFinalContext(Nome_listaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitAcessoFinal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AcessoVariavelContext extends Nome_listaContext {
		public TerminalNode ID() { return getToken(CompilerParser.ID, 0); }
		public TerminalNode DOT() { return getToken(CompilerParser.DOT, 0); }
		public Nome_listaContext nome_lista() {
			return getRuleContext(Nome_listaContext.class,0);
		}
		public AcessoVariavelContext(Nome_listaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitAcessoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nome_listaContext nome_lista() throws RecognitionException {
		Nome_listaContext _localctx = new Nome_listaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_nome_lista);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new AcessoVariavelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(ID);
				setState(362);
				match(DOT);
				setState(363);
				nome_lista();
				}
				break;
			case 2:
				_localctx = new AcessoFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(ID);
				setState(365);
				match(LPAREN);
				setState(366);
				parametros_reais();
				setState(367);
				match(RPAREN);
				setState(368);
				match(DOT);
				setState(369);
				nome_lista();
				}
				break;
			case 3:
				_localctx = new AcessoFinalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
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
		public Parametros_reaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_reais; }
	 
		public Parametros_reaisContext() { }
		public void copyFrom(Parametros_reaisContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VazioExprContext extends Parametros_reaisContext {
		public VazioExprContext(Parametros_reaisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitVazioExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamReaisExprContext extends Parametros_reaisContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CompilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CompilerParser.COMMA, i);
		}
		public ParamReaisExprContext(Parametros_reaisContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitParamReaisExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_reaisContext parametros_reais() throws RecognitionException {
		Parametros_reaisContext _localctx = new Parametros_reaisContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parametros_reais);
		int _la;
		try {
			setState(383);
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
				_localctx = new ParamReaisExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				expressao(0);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(375);
					match(COMMA);
					setState(376);
					expressao(0);
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				_localctx = new VazioExprContext(_localctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return lista_parametros_formais_sempred((Lista_parametros_formaisContext)_localctx, predIndex);
		case 14:
			return tipo_nome_sempred((Tipo_nomeContext)_localctx, predIndex);
		case 18:
			return lista_comandos_sempred((Lista_comandosContext)_localctx, predIndex);
		case 31:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lista_parametros_formais_sempred(Lista_parametros_formaisContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean tipo_nome_sempred(Tipo_nomeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lista_comandos_sempred(Lista_comandosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\2\3"+
		"\2\3\3\3\3\5\3W\n\3\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\7\5h\n\5\f\5\16\5k\13\5\3\5\3\5\3\5\7\5p\n\5\f\5\16\5s"+
		"\13\5\5\5u\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6~\n\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u009f\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00aa\n\16\f\16\16\16\u00ad\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00c0\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c8"+
		"\n\20\f\20\16\20\u00cb\13\20\3\21\3\21\5\21\u00cf\n\21\3\22\3\22\5\22"+
		"\u00d3\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00dd\n\24\3"+
		"\24\3\24\7\24\u00e1\n\24\f\24\16\24\u00e4\13\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f0\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\5\27\u00fb\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\6\33\u010e\n\33\r\33"+
		"\16\33\u010f\3\33\3\33\3\34\3\34\5\34\u0116\n\34\3\35\3\35\3\35\6\35\u011b"+
		"\n\35\r\35\16\35\u011c\3\35\3\35\3\36\3\36\3\36\5\36\u0124\n\36\3\37\3"+
		"\37\3\37\5\37\u0129\n\37\3 \3 \3 \3 \5 \u012f\n \3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0143\n!\3!\3!\3!\3!\7!\u0149\n!"+
		"\f!\16!\u014c\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u015b\n\"\3#\3#\3#\3#\5#\u0161\n#\3$\3$\3$\3$\3$\3$\3$\5$\u016a\n"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0177\n%\3&\3&\3&\7&\u017c\n&\f"+
		"&\16&\u017f\13&\3&\5&\u0182\n&\3&\2\6\32\36&@\'\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\2\2\u01a1\2O\3\2\2\2"+
		"\4V\3\2\2\2\6X\3\2\2\2\bt\3\2\2\2\n}\3\2\2\2\f\177\3\2\2\2\16\u0083\3"+
		"\2\2\2\20\u0089\3\2\2\2\22\u008f\3\2\2\2\24\u0093\3\2\2\2\26\u0096\3\2"+
		"\2\2\30\u009e\3\2\2\2\32\u00a0\3\2\2\2\34\u00bf\3\2\2\2\36\u00c1\3\2\2"+
		"\2 \u00ce\3\2\2\2\"\u00d2\3\2\2\2$\u00d4\3\2\2\2&\u00dc\3\2\2\2(\u00ef"+
		"\3\2\2\2*\u00f1\3\2\2\2,\u00fa\3\2\2\2.\u00fc\3\2\2\2\60\u0102\3\2\2\2"+
		"\62\u0107\3\2\2\2\64\u010a\3\2\2\2\66\u0115\3\2\2\28\u0117\3\2\2\2:\u0123"+
		"\3\2\2\2<\u0128\3\2\2\2>\u012e\3\2\2\2@\u0142\3\2\2\2B\u015a\3\2\2\2D"+
		"\u0160\3\2\2\2F\u0169\3\2\2\2H\u0176\3\2\2\2J\u0181\3\2\2\2LN\5\4\3\2"+
		"ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\2\2\3"+
		"S\3\3\2\2\2TW\5\24\13\2UW\5\6\4\2VT\3\2\2\2VU\3\2\2\2W\5\3\2\2\2XY\7\f"+
		"\2\2YZ\7\62\2\2Z^\7(\2\2[]\5\b\5\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3"+
		"\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7)\2\2bc\7\64\2\2c\7\3\2\2\2de\7\16\2\2e"+
		"i\78\2\2fh\5\n\6\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2ju\3\2\2\2k"+
		"i\3\2\2\2lm\7\17\2\2mq\78\2\2np\5\n\6\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2td\3\2\2\2tl\3\2\2\2u\t\3\2\2\2v~\5\20\t"+
		"\2w~\5\f\7\2x~\5\22\n\2yz\7\20\2\2z~\5\f\7\2{|\7\20\2\2|~\5\24\13\2}v"+
		"\3\2\2\2}w\3\2\2\2}x\3\2\2\2}y\3\2\2\2}{\3\2\2\2~\13\3\2\2\2\177\u0080"+
		"\5\34\17\2\u0080\u0081\7\62\2\2\u0081\u0082\7\64\2\2\u0082\r\3\2\2\2\u0083"+
		"\u0084\5\34\17\2\u0084\u0085\7\62\2\2\u0085\u0086\7\31\2\2\u0086\u0087"+
		"\5@!\2\u0087\u0088\7\64\2\2\u0088\17\3\2\2\2\u0089\u008a\7\62\2\2\u008a"+
		"\u008b\7&\2\2\u008b\u008c\5\30\r\2\u008c\u008d\7\'\2\2\u008d\u008e\5$"+
		"\23\2\u008e\21\3\2\2\2\u008f\u0090\5\26\f\2\u0090\u0091\5 \21\2\u0091"+
		"\u0092\5$\23\2\u0092\23\3\2\2\2\u0093\u0094\5\26\f\2\u0094\u0095\5$\23"+
		"\2\u0095\25\3\2\2\2\u0096\u0097\5\34\17\2\u0097\u0098\7\62\2\2\u0098\u0099"+
		"\7&\2\2\u0099\u009a\5\32\16\2\u009a\u009b\7\'\2\2\u009b\27\3\2\2\2\u009c"+
		"\u009f\5\32\16\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3"+
		"\2\2\2\u009f\31\3\2\2\2\u00a0\u00a1\b\16\1\2\u00a1\u00a2\5\34\17\2\u00a2"+
		"\u00a3\7\62\2\2\u00a3\u00ab\3\2\2\2\u00a4\u00a5\f\4\2\2\u00a5\u00a6\7"+
		"\63\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\7\62\2\2\u00a8\u00aa\3\2\2\2"+
		"\u00a9\u00a4\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\33\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00c0\7\t\2\2\u00af"+
		"\u00b0\5 \21\2\u00b0\u00b1\7\b\2\2\u00b1\u00b2\5\"\22\2\u00b2\u00c0\3"+
		"\2\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\7\13\2\2\u00b5\u00b6\5\"\22\2\u00b6"+
		"\u00c0\3\2\2\2\u00b7\u00b8\5 \21\2\u00b8\u00b9\7\n\2\2\u00b9\u00ba\5\""+
		"\22\2\u00ba\u00c0\3\2\2\2\u00bb\u00bc\5 \21\2\u00bc\u00bd\5\36\20\2\u00bd"+
		"\u00be\5\"\22\2\u00be\u00c0\3\2\2\2\u00bf\u00ae\3\2\2\2\u00bf\u00af\3"+
		"\2\2\2\u00bf\u00b3\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0"+
		"\35\3\2\2\2\u00c1\u00c2\b\20\1\2\u00c2\u00c3\7\62\2\2\u00c3\u00c9\3\2"+
		"\2\2\u00c4\u00c5\f\4\2\2\u00c5\u00c6\7%\2\2\u00c6\u00c8\7\62\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\37\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\7\r\2\2\u00cd\u00cf"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf!\3\2\2\2\u00d0"+
		"\u00d3\7\67\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3"+
		"\2\2\2\u00d3#\3\2\2\2\u00d4\u00d5\7(\2\2\u00d5\u00d6\5<\37\2\u00d6\u00d7"+
		"\5&\24\2\u00d7\u00d8\7)\2\2\u00d8%\3\2\2\2\u00d9\u00da\b\24\1\2\u00da"+
		"\u00dd\5(\25\2\u00db\u00dd\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00db\3\2"+
		"\2\2\u00dd\u00e2\3\2\2\2\u00de\u00df\f\5\2\2\u00df\u00e1\5(\25\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\'\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00f0\5$\23\2\u00e6\u00f0"+
		"\5*\26\2\u00e7\u00f0\5.\30\2\u00e8\u00f0\5\60\31\2\u00e9\u00f0\5\62\32"+
		"\2\u00ea\u00f0\5\64\33\2\u00eb\u00f0\58\35\2\u00ec\u00f0\5> \2\u00ed\u00ee"+
		"\7\7\2\2\u00ee\u00f0\7\64\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00e6\3\2\2\2"+
		"\u00ef\u00e7\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea"+
		"\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		")\3\2\2\2\u00f1\u00f2\7\3\2\2\u00f2\u00f3\7&\2\2\u00f3\u00f4\5@!\2\u00f4"+
		"\u00f5\7\'\2\2\u00f5\u00f6\5,\27\2\u00f6+\3\2\2\2\u00f7\u00f8\7\4\2\2"+
		"\u00f8\u00fb\5&\24\2\u00f9\u00fb\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb-\3\2\2\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\7&\2\2\u00fe\u00ff"+
		"\5@!\2\u00ff\u0100\7\'\2\2\u0100\u0101\5&\24\2\u0101/\3\2\2\2\u0102\u0103"+
		"\5F$\2\u0103\u0104\7\31\2\2\u0104\u0105\5@!\2\u0105\u0106\7\64\2\2\u0106"+
		"\61\3\2\2\2\u0107\u0108\7\5\2\2\u0108\u0109\5> \2\u0109\63\3\2\2\2\u010a"+
		"\u010d\7,\2\2\u010b\u010c\7\66\2\2\u010c\u010e\5\66\34\2\u010d\u010b\3"+
		"\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\7\64\2\2\u0112\65\3\2\2\2\u0113\u0116\5F$\2"+
		"\u0114\u0116\7.\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\67\3"+
		"\2\2\2\u0117\u011a\7-\2\2\u0118\u0119\7\65\2\2\u0119\u011b\5:\36\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\64\2\2\u011f9\3\2\2\2\u0120\u0124"+
		"\5@!\2\u0121\u0124\7\61\2\2\u0122\u0124\7.\2\2\u0123\u0120\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124;\3\2\2\2\u0125\u0129\5\f\7\2"+
		"\u0126\u0129\5\16\b\2\u0127\u0129\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0127\3\2\2\2\u0129=\3\2\2\2\u012a\u012b\5@!\2\u012b\u012c"+
		"\7\64\2\2\u012c\u012f\3\2\2\2\u012d\u012f\7\64\2\2\u012e\u012a\3\2\2\2"+
		"\u012e\u012d\3\2\2\2\u012f?\3\2\2\2\u0130\u0131\b!\1\2\u0131\u0132\7&"+
		"\2\2\u0132\u0133\5@!\2\u0133\u0134\7\'\2\2\u0134\u0143\3\2\2\2\u0135\u0136"+
		"\5D#\2\u0136\u0137\5@!\t\u0137\u0143\3\2\2\2\u0138\u0139\5F$\2\u0139\u013a"+
		"\7&\2\2\u013a\u013b\5J&\2\u013b\u013c\7\'\2\2\u013c\u0143\3\2\2\2\u013d"+
		"\u0143\5F$\2\u013e\u0143\7/\2\2\u013f\u0143\7\60\2\2\u0140\u0143\7;\2"+
		"\2\u0141\u0143\7<\2\2\u0142\u0130\3\2\2\2\u0142\u0135\3\2\2\2\u0142\u0138"+
		"\3\2\2\2\u0142\u013d\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u013f\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u014a\3\2\2\2\u0144\u0145\f\n"+
		"\2\2\u0145\u0146\5B\"\2\u0146\u0147\5@!\13\u0147\u0149\3\2\2\2\u0148\u0144"+
		"\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"A\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u015b\7\22\2\2\u014e\u015b\7\23\2"+
		"\2\u014f\u015b\7\24\2\2\u0150\u015b\7\25\2\2\u0151\u015b\7\26\2\2\u0152"+
		"\u015b\7\34\2\2\u0153\u015b\7\35\2\2\u0154\u015b\7\36\2\2\u0155\u015b"+
		"\7\37\2\2\u0156\u015b\7\32\2\2\u0157\u015b\7\"\2\2\u0158\u015b\7!\2\2"+
		"\u0159\u015b\7\33\2\2\u015a\u014d\3\2\2\2\u015a\u014e\3\2\2\2\u015a\u014f"+
		"\3\2\2\2\u015a\u0150\3\2\2\2\u015a\u0151\3\2\2\2\u015a\u0152\3\2\2\2\u015a"+
		"\u0153\3\2\2\2\u015a\u0154\3\2\2\2\u015a\u0155\3\2\2\2\u015a\u0156\3\2"+
		"\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b"+
		"C\3\2\2\2\u015c\u0161\7 \2\2\u015d\u0161\7\27\2\2\u015e\u0161\7\30\2\2"+
		"\u015f\u0161\7\23\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u015f\3\2\2\2\u0161E\3\2\2\2\u0162\u0163\7\62\2\2\u0163"+
		"\u0164\7%\2\2\u0164\u016a\5H%\2\u0165\u0166\7=\2\2\u0166\u0167\7$\2\2"+
		"\u0167\u016a\5H%\2\u0168\u016a\5H%\2\u0169\u0162\3\2\2\2\u0169\u0165\3"+
		"\2\2\2\u0169\u0168\3\2\2\2\u016aG\3\2\2\2\u016b\u016c\7\62\2\2\u016c\u016d"+
		"\7#\2\2\u016d\u0177\5H%\2\u016e\u016f\7\62\2\2\u016f\u0170\7&\2\2\u0170"+
		"\u0171\5J&\2\u0171\u0172\7\'\2\2\u0172\u0173\7#\2\2\u0173\u0174\5H%\2"+
		"\u0174\u0177\3\2\2\2\u0175\u0177\7\62\2\2\u0176\u016b\3\2\2\2\u0176\u016e"+
		"\3\2\2\2\u0176\u0175\3\2\2\2\u0177I\3\2\2\2\u0178\u017d\5@!\2\u0179\u017a"+
		"\7\63\2\2\u017a\u017c\5@!\2\u017b\u0179\3\2\2\2\u017c\u017f\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0182\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u0180\u0182\3\2\2\2\u0181\u0178\3\2\2\2\u0181\u0180\3\2\2\2\u0182"+
		"K\3\2\2\2!OV^iqt}\u009e\u00ab\u00bf\u00c9\u00ce\u00d2\u00dc\u00e2\u00ef"+
		"\u00fa\u010f\u0115\u011c\u0123\u0128\u012e\u0142\u014a\u015a\u0160\u0169"+
		"\u0176\u017d\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}