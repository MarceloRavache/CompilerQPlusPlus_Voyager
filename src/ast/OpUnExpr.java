package ast;

public class OpUnExpr extends Expression {
    private final OperadorUnarioEnum operator;
    private final Expression rhs;

    public OpUnExpr(OperadorUnarioEnum operator, Expression right) {
        this.operator = operator;
        this.rhs = right;
    }

    public OperadorUnarioEnum getOperator() {
        return operator;
    }

    public Expression getRight() {
        return rhs;
    }

    @Override
    public void printAtDepth(int depth) {
        System.out.print(" ".repeat(depth*2));
        System.out.println("[Unary] " + operator);

        rhs.printAtDepth(depth+1);
    }
}
