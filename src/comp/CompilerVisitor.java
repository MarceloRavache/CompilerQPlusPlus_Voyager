// Generated from /home/overnull/trabalhoSD/Compiler/src/Compiler.g4 by ANTLR 4.7.2
package comp;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CompilerParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CompilerParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#lista_definicoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_definicoes(CompilerParser.Lista_definicoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#definicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicao(CompilerParser.DefinicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#estrutura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstrutura(CompilerParser.EstruturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#lista_estrutura_corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_estrutura_corpo(CompilerParser.Lista_estrutura_corpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#estrutura_acesso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstrutura_acesso(CompilerParser.Estrutura_acessoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#lista_estrutura_membros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_estrutura_membros(CompilerParser.Lista_estrutura_membrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#membro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembro(CompilerParser.MembroContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(CompilerParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#variavel_atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel_atribuicao(CompilerParser.Variavel_atribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#construtor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrutor(CompilerParser.ConstrutorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo(CompilerParser.MetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(CompilerParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#funcao_cabecalho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao_cabecalho(CompilerParser.Funcao_cabecalhoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#parametros_formais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_formais(CompilerParser.Parametros_formaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#lista_parametros_formais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametros_formais(CompilerParser.Lista_parametros_formaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(CompilerParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#tipo_nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_nome(CompilerParser.Tipo_nomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#qualificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualificador(CompilerParser.QualificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#decorador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorador(CompilerParser.DecoradorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(CompilerParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#lista_comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_comandos(CompilerParser.Lista_comandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(CompilerParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(CompilerParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#selecao_senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao_senao(CompilerParser.Selecao_senaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#repeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticao(CompilerParser.RepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(CompilerParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(CompilerParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrada(CompilerParser.EntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#lista_entrada_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_entrada_params(CompilerParser.Lista_entrada_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#saida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaida(CompilerParser.SaidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#lista_saida_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_saida_params(CompilerParser.Lista_saida_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#lista_declaracoes_locais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_declaracoes_locais(CompilerParser.Lista_declaracoes_locaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#expressao_comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_comando(CompilerParser.Expressao_comandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(CompilerParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_binario(CompilerParser.Operador_binarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#operador_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_unario(CompilerParser.Operador_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(CompilerParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#nome_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome_lista(CompilerParser.Nome_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#parametros_reais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_reais(CompilerParser.Parametros_reaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#lista_parametros_reais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametros_reais(CompilerParser.Lista_parametros_reaisContext ctx);
}