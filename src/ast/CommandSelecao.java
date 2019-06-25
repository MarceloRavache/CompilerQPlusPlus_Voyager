package ast;

public class CommandSelecao extends Comando{
    private final Expression expression;
    private final ListaComando lista;
    private final SelecaoSenao sele;
    public CommandSelecao(Expression expression, ListaComando lista, SelecaoSenao sele){
        this.expression = expression;
        this.lista = lista;
        this.sele = sele;
    }
}
