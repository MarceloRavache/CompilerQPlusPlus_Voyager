package ast;

public class CommandRepeticao extends Comando{
    private final Expression expression;
    private final ListaComando comando;
    public CommandRepeticao(Expression expression,ListaComando comando){
        this.comando = comando;
        this.expression = expression;
    }
}
