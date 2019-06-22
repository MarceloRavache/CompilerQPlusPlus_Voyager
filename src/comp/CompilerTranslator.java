package comp;

import ast.*;

public class CompilerTranslator extends CompilerBaseVisitor<TreeNode> {

    @Override
    public TreeNode visitStart(CompilerParser.StartContext ctx) {
        return super.visitStart(ctx);
    }

    @Override
    public TreeNode visitLista_definicoes(CompilerParser.Lista_definicoesContext ctx) {
        return super.visitLista_definicoes(ctx);
    }

    @Override
    public TreeNode visitDefinicao(CompilerParser.DefinicaoContext ctx) {
        return super.visitDefinicao(ctx);
    }

    @Override
    public TreeNode visitEstrutura(CompilerParser.EstruturaContext ctx) {
        return super.visitEstrutura(ctx);
    }

    @Override
    public TreeNode visitLista_estrutura_corpo(CompilerParser.Lista_estrutura_corpoContext ctx) {
        return super.visitLista_estrutura_corpo(ctx);
    }

    @Override
    public TreeNode visitEstrutura_acesso(CompilerParser.Estrutura_acessoContext ctx) {
        return super.visitEstrutura_acesso(ctx);
    }

    @Override
    public TreeNode visitLista_estrutura_membros(CompilerParser.Lista_estrutura_membrosContext ctx) {
        return super.visitLista_estrutura_membros(ctx);
    }

    @Override
    public TreeNode visitMembro(CompilerParser.MembroContext ctx) {
        return super.visitMembro(ctx);
    }

    @Override
    public TreeNode visitVariavel(CompilerParser.VariavelContext ctx) {
        return super.visitVariavel(ctx);
    }

    @Override
    public TreeNode visitVariavel_atribuicao(CompilerParser.Variavel_atribuicaoContext ctx) {
        return super.visitVariavel_atribuicao(ctx);
    }

    @Override
    public TreeNode visitConstrutor(CompilerParser.ConstrutorContext ctx) {
        return super.visitConstrutor(ctx);
    }

    @Override
    public TreeNode visitMetodo(CompilerParser.MetodoContext ctx) {
        return super.visitMetodo(ctx);
    }

    @Override
    public TreeNode visitFuncao(CompilerParser.FuncaoContext ctx) {
        return super.visitFuncao(ctx);
    }

    @Override
    public TreeNode visitFuncao_cabecalho(CompilerParser.Funcao_cabecalhoContext ctx) {
        return super.visitFuncao_cabecalho(ctx);
    }

    @Override
    public TreeNode visitParametros_formais(CompilerParser.Parametros_formaisContext ctx) {
        return super.visitParametros_formais(ctx);
    }

    @Override
    public TreeNode visitLista_parametros_formais(CompilerParser.Lista_parametros_formaisContext ctx) {
        return super.visitLista_parametros_formais(ctx);
    }

    @Override
    public TreeNode visitTipo(CompilerParser.TipoContext ctx) {
        return super.visitTipo(ctx);
    }

    @Override
    public TreeNode visitTipo_nome(CompilerParser.Tipo_nomeContext ctx) {
        return super.visitTipo_nome(ctx);
    }

    @Override
    public TreeNode visitQualificador(CompilerParser.QualificadorContext ctx) {
        return super.visitQualificador(ctx);
    }

    @Override
    public TreeNode visitDecorador(CompilerParser.DecoradorContext ctx) {
        return super.visitDecorador(ctx);
    }

    @Override
    public TreeNode visitBloco(CompilerParser.BlocoContext ctx) {
        return super.visitBloco(ctx);
    }

    @Override
    public TreeNode visitLista_comandos(CompilerParser.Lista_comandosContext ctx) {
        return super.visitLista_comandos(ctx);
    }

    @Override
    public TreeNode visitComando(CompilerParser.ComandoContext ctx) {
        return super.visitComando(ctx);
    }

    @Override
    public TreeNode visitSelecao(CompilerParser.SelecaoContext ctx) {
        return super.visitSelecao(ctx);
    }

    @Override
    public TreeNode visitSelecao_senao(CompilerParser.Selecao_senaoContext ctx) {
        return super.visitSelecao_senao(ctx);
    }

    @Override
    public TreeNode visitRepeticao(CompilerParser.RepeticaoContext ctx) {
        return super.visitRepeticao(ctx);
    }

    @Override
    public TreeNode visitAtribuicao(CompilerParser.AtribuicaoContext ctx) {
        return super.visitAtribuicao(ctx);
    }

    @Override
    public TreeNode visitRetorno(CompilerParser.RetornoContext ctx) {
        return super.visitRetorno(ctx);
    }

    @Override
    public TreeNode visitEntrada(CompilerParser.EntradaContext ctx) {
        return super.visitEntrada(ctx);
    }

    @Override
    public TreeNode visitLista_entrada_params(CompilerParser.Lista_entrada_paramsContext ctx) {
        return super.visitLista_entrada_params(ctx);
    }

    @Override
    public TreeNode visitSaida(CompilerParser.SaidaContext ctx) {
        return super.visitSaida(ctx);
    }

    @Override
    public TreeNode visitLista_saida_params(CompilerParser.Lista_saida_paramsContext ctx) {
        return super.visitLista_saida_params(ctx);
    }

    @Override
    public TreeNode visitLista_declaracoes_locais(CompilerParser.Lista_declaracoes_locaisContext ctx) {
        return super.visitLista_declaracoes_locais(ctx);
    }

    @Override
    public TreeNode visitExpressao_comando(CompilerParser.Expressao_comandoContext ctx) {
        return super.visitExpressao_comando(ctx);
    }

    @Override
    public TreeNode visitExpressao(CompilerParser.ExpressaoContext ctx) {
        return super.visitExpressao(ctx);
    }

    @Override
    public TreeNode visitOperador_binario(CompilerParser.Operador_binarioContext ctx) {
        return super.visitOperador_binario(ctx);
    }

    @Override
    public TreeNode visitOperador_unario(CompilerParser.Operador_unarioContext ctx) {
        return super.visitOperador_unario(ctx);
    }

    @Override
    public TreeNode visitNome(CompilerParser.NomeContext ctx) {
        return super.visitNome(ctx);
    }

    @Override
    public TreeNode visitNome_lista(CompilerParser.Nome_listaContext ctx) {
        return super.visitNome_lista(ctx);
    }

    @Override
    public TreeNode visitParametros_reais(CompilerParser.Parametros_reaisContext ctx) {
        return super.visitParametros_reais(ctx);
    }

    @Override
    public TreeNode visitLista_parametros_reais(CompilerParser.Lista_parametros_reaisContext ctx) {
        return super.visitLista_parametros_reais(ctx);
    }
}
