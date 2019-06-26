package ast;

public class Variavel_atribuicao extends TreeNode{
    private final Tipo tipo;
    private final Expression expression;
    public Variavel_atribuicao(Tipo tipo,Expression expression){
        this.expression = expression;
        this.tipo = tipo;
    }
}
