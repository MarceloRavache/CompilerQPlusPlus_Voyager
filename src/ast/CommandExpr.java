package ast;

public class CommandExpr extends Comando{
    private final ExpressaoComando expressaoComando;
    public CommandExpr(ExpressaoComando expressaoComando){
        this.expressaoComando = expressaoComando;
    }
}
