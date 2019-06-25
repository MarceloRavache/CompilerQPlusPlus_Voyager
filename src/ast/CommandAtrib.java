package ast;

public class CommandAtrib extends Comando{
    private final Expression expression;
    private final Nome nome;
    public CommandAtrib(Expression expression,Nome nome){
        this.nome = nome;
        this.expression = expression;
    }
}
