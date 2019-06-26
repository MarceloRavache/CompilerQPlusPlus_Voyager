package ast;

public class VariavelAtribDecl extends ListaDeclaracoesLocais, TreeNode{
    private final Variavel_atribuicao variavel;
    public VariavelAtribDecl(Variavel_atribuicao variavel){
        this.variavel = variavel;
    }
}
