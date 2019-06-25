package ast;

public class Bloco extends TreeNode {
    private final ListaDeclaracoesLocais lista;
    private final ListaComando listac;
    public Bloco(ListaDeclaracoesLocais lista,ListaComando listac){
        this.lista = lista;
        this.listac = listac;
    }
}
