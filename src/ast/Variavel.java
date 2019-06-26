package ast;

public class Variavel extends TreeNode{
    private final Tipo tipo;
    public Variavel(Tipo tipo){
        this.tipo = tipo;
    }
}
