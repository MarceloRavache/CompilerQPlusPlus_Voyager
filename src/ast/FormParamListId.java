package ast;

public class FormParamListId extends FormParam{
    private final ListaParametrosFormais lista;
    private final Tipo tipo;
    public FormParamListId(ListaParametrosFormais lista, Tipo tipo){
        this.lista = lista;
        this.tipo = tipo;
    }

}
