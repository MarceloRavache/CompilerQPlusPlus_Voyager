package ast;

public class ParametrosFormais extends ConstrutorFunc {
    private final ListaParametrosFormais lista;
    public ParametrosFormais(ListaParametrosFormais lista){
        this.lista = lista;
    }
    public ParametrosFormais(){
        this.lista = new ListaParametrosFormais();
    }
}
