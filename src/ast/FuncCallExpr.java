package ast;

public class FuncCallExpr extends Expression{
    private final Nome nome;
    private final ParametrosReais param;
    public FuncCallExpr(Nome nome,ParametrosReais param){
        this.nome = nome;
        this.param = param;
    }
}
