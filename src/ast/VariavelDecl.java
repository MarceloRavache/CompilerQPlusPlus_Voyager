package ast;

public class VariavelDecl extends ListaDeclaracoesLocais,TreeNode{
    private final Variavel variavel;
    public VariavelDecl(Variavel variavel){
        this.variavel = variavel;
    }
}
