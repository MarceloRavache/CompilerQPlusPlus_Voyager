package comp;
import ast.*;
import java.util.ArrayList;
public class CompilerTranslator extends CompilerBaseVisitor<TreeNode> {

    @Override
    public TreeNode visitStart(CompilerParser.StartContext ctx) {
        if(ctx.definicao().size() > 0) {
            ArrayList<Statement> statements = new ArrayList<>();

            for (CompilerParser.DefinicaoContext def : ctx.definicao()) {
                statements.add((Statement) visit(def));
            }

            return new Start(statements);
        }

        return new Start();
    }

    @Override
    public TreeNode visitFunc(CompilerParser.FuncContext ctx) {
        CompilerParser.FuncaoContext a = ctx.funcao();
        return new Func((FuncaoCabecalho) visit(a.funcao_cabecalho()),(Bloco) visit(a.bloco()));
    }

    @Override
    public TreeNode visitEstru(CompilerParser.EstruContext ctx) {
        if(ctx.estrutura().estrutura_acesso().size() >0){
            ArrayList<EstruturaAcesso> lista = new ArrayList<>();
            for (CompilerParser.Estrutura_acessoContext def : ctx.estrutura().estrutura_acesso()) {
                lista.add((EstruturaAcesso) visit(def));
            }
            return new Estru(lista);

        }
    }

    @Override
    public TreeNode visitEstrutura(CompilerParser.EstruturaContext ctx) {
        return super.visitEstrutura(ctx);

    }

    @Override
    public TreeNode visitPublicEstr(CompilerParser.PublicEstrContext ctx) {
        ArrayList<Membro> lista = new ArrayList<>();
        if(ctx.membro().size() >0){

            for (CompilerParser.MembroContext def : ctx.membro()) {
                lista.add((Membro) visit(def));
            }
            return new PublicEstr(lista);

        }
        return new PublicEstr(lista);
    }

    @Override
    public TreeNode visitProtectedEstr(CompilerParser.ProtectedEstrContext ctx) {
        ArrayList<Membro> lista = new ArrayList<>();
        if(ctx.membro().size() >0){

            for (CompilerParser.MembroContext def : ctx.membro()) {
                lista.add((Membro) visit(def));
            }
            return new ProtectedEstr(lista);

        }
        return new ProtectedEstr(lista);
    }

    @Override
    public TreeNode visitConstrutorFunc(CompilerParser.ConstrutorFuncContext ctx) {
        return new ConstrutorFunc((ParametrosFormais) visit(ctx.construtor().parametros_formais()),(Bloco) visit(ctx.construtor().bloco()));
    }

    @Override
    public TreeNode visitVariavelFunc(CompilerParser.VariavelFuncContext ctx) {

        return new VariavelFunc((Tipo) visit(ctx.variavel().tipo()));
    }

    @Override
    public TreeNode visitMetodoFunc(CompilerParser.MetodoFuncContext ctx) {

        return new MetodoFunc((FuncaoCabecalho) visit(ctx.metodo().funcao_cabecalho()),(Qualificador) visit(ctx.metodo().qualificador()),(Bloco) visit(ctx.metodo().bloco()));
    }

    @Override
    public TreeNode visitVarStatic(CompilerParser.VarStaticContext ctx) {

        return new VarStatic((Variavel) visit(ctx.variavel()));
    }

    @Override
    public TreeNode visitFuncStatic(CompilerParser.FuncStaticContext ctx) {

        return new FuncStatic((Func) visit(ctx.funcao()));
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
    public TreeNode visitFormParam(CompilerParser.FormParamContext ctx) {

        return new FormParam((ListaParametrosFormais) visit(ctx.lista_parametros_formais()));
    }

    @Override
    public TreeNode visitFormEmpyParam(CompilerParser.FormEmpyParamContext ctx) {
        return super.visitVoidExpr(ctx);
    }

    @Override
    public TreeNode visitFormParamListId(CompilerParser.FormParamListIdContext ctx) {
        return new FormParamListId((ParametrosFormais) visit(ctx.lista_parametros_formais()), (Tipo) ctx.tipo());
    }

    @Override
    public TreeNode visitFormParamId(CompilerParser.FormParamIdContext ctx) {
        return new FormParamId((Tipo) ctx.tipo());
    }

    @Override
    public TreeNode visitVoidExpr(CompilerParser.VoidExprContext ctx) {
        return super.visitVoidExpr(ctx);
    }

    @Override
    public TreeNode visitIntExpr(CompilerParser.IntExprContext ctx) {
        return new IntExpr((Qualificador) visit(ctx.qualificador()), (Decorador) ctx.decorador());
    }

    @Override
    public TreeNode visitCharExpr(CompilerParser.CharExprContext ctx) {
        return new CharExpr((Qualificador) visit(ctx.qualificador()), (Decorador) ctx.decorador());
    }

    @Override
    public TreeNode visitBoolExpr(CompilerParser.BoolExprContext ctx) {
        return new BoolExpr((Qualificador) visit(ctx.qualificador()), (Decorador) ctx.decorador());
    }

    @Override
    public TreeNode visitObjectExpr(CompilerParser.ObjectExprContext ctx) {
        return new ObjectExpr((Qualificador) visit(ctx.qualificador()), (Decorador) ctx.decorador());
    }

    @Override
    public TreeNode visitChamadaMultID(CompilerParser.ChamadaMultIDContext ctx) {
        return new ChamadaMultID((TipoNome) visit(ctx.tipo_nome()));
    }

    @Override
    public TreeNode visitChamadaID(CompilerParser.ChamadaIDContext ctx) {

        return new ChamadaID(ctx.ID().getText());
    }

    @Override
    public TreeNode visitConstQuali(CompilerParser.ConstQualiContext ctx) {
        return super.visitConstQuali(ctx);
    }

    @Override
    public TreeNode visitEmptyQuali(CompilerParser.EmptyQualiContext ctx) {
        return super.visitEmptyQuali(ctx);
    }

    @Override
    public TreeNode visitAmperDecor(CompilerParser.AmperDecorContext ctx) {
        return super.visitAmperDecor(ctx);
    }

    @Override
    public TreeNode visitEmptyDecor(CompilerParser.EmptyDecorContext ctx) {
        return super.visitEmptyDecor(ctx);
    }

    @Override
    public TreeNode visitBloco(CompilerParser.BlocoContext ctx) {
        return super.visitBloco(ctx);
    }

    @Override
    public TreeNode visitCommandEmpty(CompilerParser.CommandEmptyContext ctx) {
        return super.visitCommandEmpty(ctx);
    }

    @Override
    public TreeNode visitCommand(CompilerParser.CommandContext ctx) {

        return new Command((Comando) visit(ctx.comando()));
    }

    @Override
    public TreeNode visitMultCommand(CompilerParser.MultCommandContext ctx) {

        return new MultCommand((ListaComando) visit(ctx.lista_comandos()),(Comando) visit(ctx.comando()));
    }

    @Override
    public TreeNode visitCommandBloco(CompilerParser.CommandBlocoContext ctx) {
        return new CommandBloco((Bloco) visit(ctx.bloco()));
    }

    @Override
    public TreeNode visitCommandSelecao(CompilerParser.CommandSelecaoContext ctx) {
        return new CommandSelecao((Expression) visit(ctx.selecao().expressao()),(ListaComando) visit(ctx.selecao().));
    }

    @Override
    public TreeNode visitCommandRepeticao(CompilerParser.CommandRepeticaoContext ctx) {
        return new CommandRepeticao((Expression) visit(ctx.repeticao().expressao()),(ListaComando) visit(ctx.repeticao().lista_comandos()));
    }

    @Override
    public TreeNode visitCommandAtrib(CompilerParser.CommandAtribContext ctx) {

        return new CommandAtrib((Expression) visit(ctx.atribuicao().expressao()),(Nome) visit(ctx.atribuicao().nome()));
    }

    @Override
    public TreeNode visitCommandRet(CompilerParser.CommandRetContext ctx) {

        return new CommandRet((Retorno) visit(ctx.retorno()));
    }

    @Override
    public TreeNode visitCommandIn(CompilerParser.CommandInContext ctx) {

        return new CommandIn((Entrada) visit(ctx.entrada()));
    }

    @Override
    public TreeNode visitCommandOut(CompilerParser.CommandOutContext ctx) {

        return new CommandOut((Saida) visit(ctx.saida()));
    }

    @Override
    public TreeNode visitCommandExpr(CompilerParser.CommandExprContext ctx) {

        return new CommandExpr((ExpressaoComando) visit(ctx.expressao_comando()));
    }

    @Override
    public TreeNode visitCommandFim(CompilerParser.CommandFimContext ctx) {
        return super.visitCommandFim(ctx);
    }

    @Override
    public TreeNode visitSelecao(CompilerParser.SelecaoContext ctx) {
        return super.visitSelecao(ctx);
    }

    @Override
    public TreeNode visitSenaoExpr(CompilerParser.SenaoExprContext ctx) {
        return super.visitSenaoExpr(ctx);
    }

    @Override
    public TreeNode visitSenaoVazio(CompilerParser.SenaoVazioContext ctx) {
        return super.visitSenaoVazio(ctx);
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
    public TreeNode visitNomeParamEntrada(CompilerParser.NomeParamEntradaContext ctx) {
        return new NomeParamEntrada((Nome) visit(ctx.nome()));
    }

    @Override
    public TreeNode visitEndlParamEntrada(CompilerParser.EndlParamEntradaContext ctx) {
        return super.visitEndlParamEntrada(ctx);
    }

    @Override
    public TreeNode visitSaida(CompilerParser.SaidaContext ctx) {
        return super.visitSaida(ctx);
    }

    @Override
    public TreeNode visitExprParamSaida(CompilerParser.ExprParamSaidaContext ctx) {
        return new ExprParamSaida((Expression) visit(ctx.expressao()));
    }

    @Override
    public TreeNode visitStringParamSaida(CompilerParser.StringParamSaidaContext ctx) {
        return new StringParamSaida(ctx.STRL().getText());
    }

    @Override
    public TreeNode visitEndlParamSaida(CompilerParser.EndlParamSaidaContext ctx) {
        return super.visitEndlParamSaida(ctx);
    }

    @Override
    public TreeNode visitVariavelDecl(CompilerParser.VariavelDeclContext ctx) {

        return new VariavelDecl((Variavel) visit(ctx.variavel()));
    }

    @Override
    public TreeNode visitVariavelAtribDecl(CompilerParser.VariavelAtribDeclContext ctx) {
        return new VariavelAtribDecl((Variavel_atribuicao) visit(ctx.variavel_atribuicao()));
    }

    @Override
    public TreeNode visitVariavelVazio(CompilerParser.VariavelVazioContext ctx) {
        return super.visitVariavelVazio(ctx);
    }

    @Override
    public TreeNode visitReturnExpr(CompilerParser.ReturnExprContext ctx) {

        return new ReturnExpr((Expression) visit(ctx.expressao()));
    }

    @Override
    public TreeNode visitReturnEmpty(CompilerParser.ReturnEmptyContext ctx) {

        return super.visitReturnEmpty(ctx);
    }

    @Override
    public TreeNode visitCharlExpr(CompilerParser.CharlExprContext ctx) {

        return new CharlExpr((String) visit(ctx.CHARL().getText()));
    }

    @Override
    public TreeNode visitOpBinExpr(CompilerParser.OpBinExprContext ctx) {

        return new OperadorBinario((Expression) visit(ctx.expressao()),(OperadorBinarioEnum) visit(ctx.operador_binario()),(Expression) visit(ctx.expressao()));
    }

    @Override
    public TreeNode visitTrueExpr(CompilerParser.TrueExprContext ctx) {
        return super.visitTrueExpr(ctx);
    }

    @Override
    public TreeNode visitIntlExpr(CompilerParser.IntlExprContext ctx) {

        return new IntlExpr((Integer) visit(ctx.INTL().getText());

    }

    @Override
    public TreeNode visitParemExpr(CompilerParser.ParemExprContext ctx) {

        return new ParemExpr((Expression) visit(ctx.expressao()));
    }

    @Override
    public TreeNode visitOpUnExpr(CompilerParser.OpUnExprContext ctx) {

        return new OpUnExpr((OperadorUnarioEnum) visit(ctx.operador_unario()), (Expression) visit(ctx.expressao()));
    }

    @Override
    public TreeNode visitNomeExpr(CompilerParser.NomeExprContext ctx) {

        return new NomeExpr((Nome) visit(ctx.nome()));
    }

    @Override
    public TreeNode visitFuncCallExpr(CompilerParser.FuncCallExprContext ctx) {

        return new FuncCallExpr((Nome) visit(ctx.nome()), (ParametrosReais) visit(ctx.parametros_reais()));
    }

    @Override
    public TreeNode visitFalseExpr(CompilerParser.FalseExprContext ctx) {
        return super.visitFalseExpr(ctx);
    }

    @Override
    public TreeNode visitPlusExpr(CompilerParser.PlusExprContext ctx) {

        return new PlusExpr(new OperadorBinarioEnum("PLUS"));
    }

    @Override
    public TreeNode visitMinusExprBinario(CompilerParser.MinusExprBinarioContext ctx) {
        return new MinusExprBinario(new OperadorBinarioEnum("MINUS"));
    }

    @Override
    public TreeNode visitTimesExpr(CompilerParser.TimesExprContext ctx) {
        return new TimesExpr(new OperadorBinarioEnum("TIMES"));
    }

    @Override
    public TreeNode visitDivExpr(CompilerParser.DivExprContext ctx) {

        return new DivExpr(new OperadorBinarioEnum("DIV"));
    }

    @Override
    public TreeNode visitModExpr(CompilerParser.ModExprContext ctx) {

        return new ModExpr(new OperadorBinarioEnum("MOD"));

    }

    @Override
    public TreeNode visitLtExpr(CompilerParser.LtExprContext ctx) {

        return new LtExpr(new OperadorBinarioEnum("LT"));

    }

    @Override
    public TreeNode visitLeqExpr(CompilerParser.LeqExprContext ctx) {

        return new LeqExpr(new OperadorBinarioEnum("LEQ"));

    }

    @Override
    public TreeNode visitGtExpr(CompilerParser.GtExprContext ctx) {

        return new GtExpr(new OperadorBinarioEnum("GT"));

    }

    @Override
    public TreeNode visitGeqExpr(CompilerParser.GeqExprContext ctx) {

        return new GeqExpr(new OperadorBinarioEnum("GEQ"));

    }

    @Override
    public TreeNode visitEqExpr(CompilerParser.EqExprContext ctx) {

        return new EqExpr(new OperadorBinarioEnum("EQ"));

    }

    @Override
    public TreeNode visitOrExpr(CompilerParser.OrExprContext ctx) {

        return new OrExpr(new OperadorBinarioEnum("OR"));

    }

    @Override
    public TreeNode visitAndExpr(CompilerParser.AndExprContext ctx) {

        return new AndExpr(new OperadorBinarioEnum("AND"));

    }

    @Override
    public TreeNode visitNeqExpr(CompilerParser.NeqExprContext ctx) {

        return new NeqExpr(new OperadorBinarioEnum("NEQ"));

    }

    @Override
    public TreeNode visitNotExpr(CompilerParser.NotExprContext ctx) {

        return new NotExpr(new OperadorUnarioEnum("NOT"));

    }

    @Override
    public TreeNode visitIncrExpr(CompilerParser.IncrExprContext ctx) {
        return super.visitIncrExpr(ctx);
    }

    @Override
    public TreeNode visitDecrExpr(CompilerParser.DecrExprContext ctx) {
        return super.visitDecrExpr(ctx);
    }

    @Override
    public TreeNode visitMinusExprUnario(CompilerParser.MinusExprUnarioContext ctx) {
        return super.visitMinusExprUnario(ctx);
    }

    @Override
    public TreeNode visitChamadaDeClasse(CompilerParser.ChamadaDeClasseContext ctx) {
        return new ChamadaDeClasse((NomeLista) visit(ctx.nome_lista()));
    }

    @Override
    public TreeNode visitChamadaDePonteiro(CompilerParser.ChamadaDePonteiroContext ctx) {
        return new ChamadaDePonteiro((NomeLista) visit(ctx.nome_lista()));
    }

    @Override
    public TreeNode visitNomeList(CompilerParser.NomeListContext ctx) {

        return new NomeList((NomeLista) visit(ctx.nome_lista()));
    }

    @Override
    public TreeNode visitAcessoVariavel(CompilerParser.AcessoVariavelContext ctx) {
        return new AcessoVariavel((NomeLista) visit(ctx.nome_lista()));
    }

    @Override
    public TreeNode visitAcessoFunc(CompilerParser.AcessoFuncContext ctx) {

        return new AcessoFunc((NomeLista) visit(ctx.nome_lista()),(ParametrosReais) visit(ctx.parametros_reais()));
    }

    @Override
    public TreeNode visitAcessoFinal(CompilerParser.AcessoFinalContext ctx) {

        return new AcessoFinal((String) visit(ctx.ID().getText()));
    }

    @Override
    public TreeNode visitParamReaisExpr(CompilerParser.ParamReaisExprContext ctx) {
        ArrayList<Expression> lista = new ArrayList<>();
        if(ctx.expressao().size() > 0){

            for (CompilerParser.ExpressaoContext def : ctx.expressao()) {
                lista.add((Expression) visit(def));
            }
            return new ProtectedEstr((Expression) visit(ctx.expressao()),lista);

        }
        return new ProtectedEstr((Expression) visit(ctx.expressao()));
    }

    @Override
    public TreeNode visitVazioExpr(CompilerParser.VazioExprContext ctx) {
        return super.visitVazioExpr(ctx);
    }
}
