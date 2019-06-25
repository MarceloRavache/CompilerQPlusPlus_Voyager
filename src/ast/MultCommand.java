package ast;

public class MultCommand extends ListaComando{
    private final ListaComando lista;
    private final Comando comando;
    public MultCommand(ListaComando lista, Comando comando){
        this.comando = comando;
        this.lista = lista;
    }
}
