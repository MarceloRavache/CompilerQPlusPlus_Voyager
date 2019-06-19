// Generated from /home/overnull/trabalhoSD/Compiler/src/Compiler.g4 by ANTLR 4.7.2
package comp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompilerParser}.
 */
public interface CompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompilerParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CompilerParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CompilerParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#lista_definicoes}.
	 * @param ctx the parse tree
	 */
	void enterLista_definicoes(CompilerParser.Lista_definicoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#lista_definicoes}.
	 * @param ctx the parse tree
	 */
	void exitLista_definicoes(CompilerParser.Lista_definicoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#definicao}.
	 * @param ctx the parse tree
	 */
	void enterDefinicao(CompilerParser.DefinicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#definicao}.
	 * @param ctx the parse tree
	 */
	void exitDefinicao(CompilerParser.DefinicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void enterEstrutura(CompilerParser.EstruturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void exitEstrutura(CompilerParser.EstruturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#lista_estrutura_corpo}.
	 * @param ctx the parse tree
	 */
	void enterLista_estrutura_corpo(CompilerParser.Lista_estrutura_corpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#lista_estrutura_corpo}.
	 * @param ctx the parse tree
	 */
	void exitLista_estrutura_corpo(CompilerParser.Lista_estrutura_corpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#estrutura_acesso}.
	 * @param ctx the parse tree
	 */
	void enterEstrutura_acesso(CompilerParser.Estrutura_acessoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#estrutura_acesso}.
	 * @param ctx the parse tree
	 */
	void exitEstrutura_acesso(CompilerParser.Estrutura_acessoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#lista_estrutura_membros}.
	 * @param ctx the parse tree
	 */
	void enterLista_estrutura_membros(CompilerParser.Lista_estrutura_membrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#lista_estrutura_membros}.
	 * @param ctx the parse tree
	 */
	void exitLista_estrutura_membros(CompilerParser.Lista_estrutura_membrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#membro}.
	 * @param ctx the parse tree
	 */
	void enterMembro(CompilerParser.MembroContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#membro}.
	 * @param ctx the parse tree
	 */
	void exitMembro(CompilerParser.MembroContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(CompilerParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(CompilerParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#variavel_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterVariavel_atribuicao(CompilerParser.Variavel_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#variavel_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitVariavel_atribuicao(CompilerParser.Variavel_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#construtor}.
	 * @param ctx the parse tree
	 */
	void enterConstrutor(CompilerParser.ConstrutorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#construtor}.
	 * @param ctx the parse tree
	 */
	void exitConstrutor(CompilerParser.ConstrutorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(CompilerParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(CompilerParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(CompilerParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(CompilerParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#funcao_cabecalho}.
	 * @param ctx the parse tree
	 */
	void enterFuncao_cabecalho(CompilerParser.Funcao_cabecalhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#funcao_cabecalho}.
	 * @param ctx the parse tree
	 */
	void exitFuncao_cabecalho(CompilerParser.Funcao_cabecalhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#parametros_formais}.
	 * @param ctx the parse tree
	 */
	void enterParametros_formais(CompilerParser.Parametros_formaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#parametros_formais}.
	 * @param ctx the parse tree
	 */
	void exitParametros_formais(CompilerParser.Parametros_formaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#lista_parametros_formais}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametros_formais(CompilerParser.Lista_parametros_formaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#lista_parametros_formais}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametros_formais(CompilerParser.Lista_parametros_formaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(CompilerParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(CompilerParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#tipo_nome}.
	 * @param ctx the parse tree
	 */
	void enterTipo_nome(CompilerParser.Tipo_nomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#tipo_nome}.
	 * @param ctx the parse tree
	 */
	void exitTipo_nome(CompilerParser.Tipo_nomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#qualificador}.
	 * @param ctx the parse tree
	 */
	void enterQualificador(CompilerParser.QualificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#qualificador}.
	 * @param ctx the parse tree
	 */
	void exitQualificador(CompilerParser.QualificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#decorador}.
	 * @param ctx the parse tree
	 */
	void enterDecorador(CompilerParser.DecoradorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#decorador}.
	 * @param ctx the parse tree
	 */
	void exitDecorador(CompilerParser.DecoradorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(CompilerParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(CompilerParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#lista_comandos}.
	 * @param ctx the parse tree
	 */
	void enterLista_comandos(CompilerParser.Lista_comandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#lista_comandos}.
	 * @param ctx the parse tree
	 */
	void exitLista_comandos(CompilerParser.Lista_comandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(CompilerParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(CompilerParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(CompilerParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(CompilerParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#selecao_senao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao_senao(CompilerParser.Selecao_senaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#selecao_senao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao_senao(CompilerParser.Selecao_senaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(CompilerParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(CompilerParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(CompilerParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(CompilerParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(CompilerParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(CompilerParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(CompilerParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(CompilerParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#lista_entrada_params}.
	 * @param ctx the parse tree
	 */
	void enterLista_entrada_params(CompilerParser.Lista_entrada_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#lista_entrada_params}.
	 * @param ctx the parse tree
	 */
	void exitLista_entrada_params(CompilerParser.Lista_entrada_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#saida}.
	 * @param ctx the parse tree
	 */
	void enterSaida(CompilerParser.SaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#saida}.
	 * @param ctx the parse tree
	 */
	void exitSaida(CompilerParser.SaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#lista_saida_params}.
	 * @param ctx the parse tree
	 */
	void enterLista_saida_params(CompilerParser.Lista_saida_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#lista_saida_params}.
	 * @param ctx the parse tree
	 */
	void exitLista_saida_params(CompilerParser.Lista_saida_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#lista_declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void enterLista_declaracoes_locais(CompilerParser.Lista_declaracoes_locaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#lista_declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void exitLista_declaracoes_locais(CompilerParser.Lista_declaracoes_locaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#expressao_comando}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_comando(CompilerParser.Expressao_comandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#expressao_comando}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_comando(CompilerParser.Expressao_comandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(CompilerParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(CompilerParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 */
	void enterOperador_binario(CompilerParser.Operador_binarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 */
	void exitOperador_binario(CompilerParser.Operador_binarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#operador_unario}.
	 * @param ctx the parse tree
	 */
	void enterOperador_unario(CompilerParser.Operador_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#operador_unario}.
	 * @param ctx the parse tree
	 */
	void exitOperador_unario(CompilerParser.Operador_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(CompilerParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(CompilerParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#nome_lista}.
	 * @param ctx the parse tree
	 */
	void enterNome_lista(CompilerParser.Nome_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#nome_lista}.
	 * @param ctx the parse tree
	 */
	void exitNome_lista(CompilerParser.Nome_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#parametros_reais}.
	 * @param ctx the parse tree
	 */
	void enterParametros_reais(CompilerParser.Parametros_reaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#parametros_reais}.
	 * @param ctx the parse tree
	 */
	void exitParametros_reais(CompilerParser.Parametros_reaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#lista_parametros_reais}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametros_reais(CompilerParser.Lista_parametros_reaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#lista_parametros_reais}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametros_reais(CompilerParser.Lista_parametros_reaisContext ctx);
}