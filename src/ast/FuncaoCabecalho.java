package ast;

public class FuncaoCabecalho extends Func {
    private final Tipo tipo;
    private final ListaParametrosFormais lista;
    public FuncaoCabecalho(Tipo tipo,ListaParametrosFormais lista){
        this.tipo = tipo;
        this.lista = lista;
    }
}
