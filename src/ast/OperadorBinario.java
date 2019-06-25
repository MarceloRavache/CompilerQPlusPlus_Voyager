package ast;


public class OperadorBinario extends Expression {
    private final Expression lhs;
    private final OperadorBinarioEnum operator;
    private final Expression rhs;

    public OperadorBinario(Expression left, OperadorBinarioEnum operator, Expression right) {
        this.lhs = left;
        this.operator = operator;
        this.rhs = right;
    }

    public Expression getLeft() {
        return lhs;
    }

    public OperadorBinarioEnum getOperator() {
        return this.operator;
    }

    public Expression getRight() {
        return rhs;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[Binary] " + operator);

        lhs.printAtDepth(depth+1);
        rhs.printAtDepth(depth+1);
    }
}
