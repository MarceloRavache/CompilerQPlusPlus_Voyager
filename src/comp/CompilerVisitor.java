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
	 * Visit a parse tree produced by the {@code Func}
	 * labeled alternative in {@link CompilerParser#definicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(CompilerParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Estru}
	 * labeled alternative in {@link CompilerParser#definicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstru(CompilerParser.EstruContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#estrutura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstrutura(CompilerParser.EstruturaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PublicEstr}
	 * labeled alternative in {@link CompilerParser#estrutura_acesso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicEstr(CompilerParser.PublicEstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProtectedEstr}
	 * labeled alternative in {@link CompilerParser#estrutura_acesso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtectedEstr(CompilerParser.ProtectedEstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstrutorFunc}
	 * labeled alternative in {@link CompilerParser#membro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrutorFunc(CompilerParser.ConstrutorFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariavelFunc}
	 * labeled alternative in {@link CompilerParser#membro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelFunc(CompilerParser.VariavelFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MetodoFunc}
	 * labeled alternative in {@link CompilerParser#membro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoFunc(CompilerParser.MetodoFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarStatic}
	 * labeled alternative in {@link CompilerParser#membro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarStatic(CompilerParser.VarStaticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncStatic}
	 * labeled alternative in {@link CompilerParser#membro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncStatic(CompilerParser.FuncStaticContext ctx);
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
	 * Visit a parse tree produced by the {@code FormParam}
	 * labeled alternative in {@link CompilerParser#parametros_formais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormParam(CompilerParser.FormParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormEmpyParam}
	 * labeled alternative in {@link CompilerParser#parametros_formais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormEmpyParam(CompilerParser.FormEmpyParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormParamListId}
	 * labeled alternative in {@link CompilerParser#lista_parametros_formais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormParamListId(CompilerParser.FormParamListIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormParamId}
	 * labeled alternative in {@link CompilerParser#lista_parametros_formais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormParamId(CompilerParser.FormParamIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidExpr}
	 * labeled alternative in {@link CompilerParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidExpr(CompilerParser.VoidExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link CompilerParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(CompilerParser.IntExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharExpr}
	 * labeled alternative in {@link CompilerParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharExpr(CompilerParser.CharExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link CompilerParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(CompilerParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectExpr}
	 * labeled alternative in {@link CompilerParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpr(CompilerParser.ObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChamadaMultID}
	 * labeled alternative in {@link CompilerParser#tipo_nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaMultID(CompilerParser.ChamadaMultIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChamadaID}
	 * labeled alternative in {@link CompilerParser#tipo_nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaID(CompilerParser.ChamadaIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstQuali}
	 * labeled alternative in {@link CompilerParser#qualificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstQuali(CompilerParser.ConstQualiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyQuali}
	 * labeled alternative in {@link CompilerParser#qualificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyQuali(CompilerParser.EmptyQualiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AmperDecor}
	 * labeled alternative in {@link CompilerParser#decorador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmperDecor(CompilerParser.AmperDecorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyDecor}
	 * labeled alternative in {@link CompilerParser#decorador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyDecor(CompilerParser.EmptyDecorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(CompilerParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandEmpty}
	 * labeled alternative in {@link CompilerParser#lista_comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandEmpty(CompilerParser.CommandEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Command}
	 * labeled alternative in {@link CompilerParser#lista_comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(CompilerParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultCommand}
	 * labeled alternative in {@link CompilerParser#lista_comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultCommand(CompilerParser.MultCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandBloco}
	 * labeled alternative in {@link CompilerParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandBloco(CompilerParser.CommandBlocoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandSelecao}
	 * labeled alternative in {@link CompilerParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandSelecao(CompilerParser.CommandSelecaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandRepeticao}
	 * labeled alternative in {@link CompilerParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandRepeticao(CompilerParser.CommandRepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandAtrib}
	 * labeled alternative in {@link CompilerParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandAtrib(CompilerParser.CommandAtribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandRet}
	 * labeled alternative in {@link CompilerParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandRet(CompilerParser.CommandRetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandIn}
	 * labeled alternative in {@link CompilerParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandIn(CompilerParser.CommandInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandOut}
	 * labeled alternative in {@link CompilerParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandOut(CompilerParser.CommandOutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandExpr}
	 * labeled alternative in {@link CompilerParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandExpr(CompilerParser.CommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommandFim}
	 * labeled alternative in {@link CompilerParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandFim(CompilerParser.CommandFimContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(CompilerParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SenaoExpr}
	 * labeled alternative in {@link CompilerParser#selecao_senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenaoExpr(CompilerParser.SenaoExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SenaoVazio}
	 * labeled alternative in {@link CompilerParser#selecao_senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenaoVazio(CompilerParser.SenaoVazioContext ctx);
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
	 * Visit a parse tree produced by the {@code NomeParamEntrada}
	 * labeled alternative in {@link CompilerParser#parametro_entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeParamEntrada(CompilerParser.NomeParamEntradaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EndlParamEntrada}
	 * labeled alternative in {@link CompilerParser#parametro_entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndlParamEntrada(CompilerParser.EndlParamEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#saida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaida(CompilerParser.SaidaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParamSaida}
	 * labeled alternative in {@link CompilerParser#parametro_saida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParamSaida(CompilerParser.ExprParamSaidaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringParamSaida}
	 * labeled alternative in {@link CompilerParser#parametro_saida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringParamSaida(CompilerParser.StringParamSaidaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EndlParamSaida}
	 * labeled alternative in {@link CompilerParser#parametro_saida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndlParamSaida(CompilerParser.EndlParamSaidaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariavelDecl}
	 * labeled alternative in {@link CompilerParser#lista_declaracoes_locais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelDecl(CompilerParser.VariavelDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariavelAtribDecl}
	 * labeled alternative in {@link CompilerParser#lista_declaracoes_locais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelAtribDecl(CompilerParser.VariavelAtribDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariavelVazio}
	 * labeled alternative in {@link CompilerParser#lista_declaracoes_locais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelVazio(CompilerParser.VariavelVazioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnExpr}
	 * labeled alternative in {@link CompilerParser#expressao_comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpr(CompilerParser.ReturnExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnEmpty}
	 * labeled alternative in {@link CompilerParser#expressao_comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnEmpty(CompilerParser.ReturnEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharlExpr}
	 * labeled alternative in {@link CompilerParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharlExpr(CompilerParser.CharlExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpBinExpr}
	 * labeled alternative in {@link CompilerParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpBinExpr(CompilerParser.OpBinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link CompilerParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(CompilerParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntlExpr}
	 * labeled alternative in {@link CompilerParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntlExpr(CompilerParser.IntlExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParemExpr}
	 * labeled alternative in {@link CompilerParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParemExpr(CompilerParser.ParemExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpUnExpr}
	 * labeled alternative in {@link CompilerParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpUnExpr(CompilerParser.OpUnExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NomeExpr}
	 * labeled alternative in {@link CompilerParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeExpr(CompilerParser.NomeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link CompilerParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpr(CompilerParser.FuncCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link CompilerParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(CompilerParser.FalseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusExpr}
	 * labeled alternative in {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpr(CompilerParser.PlusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusExprBinario}
	 * labeled alternative in {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExprBinario(CompilerParser.MinusExprBinarioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TimesExpr}
	 * labeled alternative in {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesExpr(CompilerParser.TimesExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(CompilerParser.DivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModExpr}
	 * labeled alternative in {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpr(CompilerParser.ModExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LtExpr}
	 * labeled alternative in {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpr(CompilerParser.LtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeqExpr}
	 * labeled alternative in {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeqExpr(CompilerParser.LeqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GtExpr}
	 * labeled alternative in {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpr(CompilerParser.GtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GeqExpr}
	 * labeled alternative in {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeqExpr(CompilerParser.GeqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(CompilerParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(CompilerParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(CompilerParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NeqExpr}
	 * labeled alternative in {@link CompilerParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqExpr(CompilerParser.NeqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link CompilerParser#operador_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(CompilerParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrExpr}
	 * labeled alternative in {@link CompilerParser#operador_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrExpr(CompilerParser.IncrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecrExpr}
	 * labeled alternative in {@link CompilerParser#operador_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrExpr(CompilerParser.DecrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusExprUnario}
	 * labeled alternative in {@link CompilerParser#operador_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExprUnario(CompilerParser.MinusExprUnarioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChamadaDeClasse}
	 * labeled alternative in {@link CompilerParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaDeClasse(CompilerParser.ChamadaDeClasseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChamadaDePonteiro}
	 * labeled alternative in {@link CompilerParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaDePonteiro(CompilerParser.ChamadaDePonteiroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NomeList}
	 * labeled alternative in {@link CompilerParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeList(CompilerParser.NomeListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcessoVariavel}
	 * labeled alternative in {@link CompilerParser#nome_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcessoVariavel(CompilerParser.AcessoVariavelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcessoFunc}
	 * labeled alternative in {@link CompilerParser#nome_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcessoFunc(CompilerParser.AcessoFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AcessoFinal}
	 * labeled alternative in {@link CompilerParser#nome_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcessoFinal(CompilerParser.AcessoFinalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamReaisExpr}
	 * labeled alternative in {@link CompilerParser#parametros_reais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamReaisExpr(CompilerParser.ParamReaisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VazioExpr}
	 * labeled alternative in {@link CompilerParser#parametros_reais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVazioExpr(CompilerParser.VazioExprContext ctx);
}