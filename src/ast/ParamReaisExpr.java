package ast;

import java.util.ArrayList;

public class ParamReaisExpr extends ParametrosReais{
    private final Expression expression;
    private final ArrayList<Expression> expressions;
    public ParamReaisExpr(Expression expression,ArrayList<Expression> expressions){
        this.expression = expression;
        this.expressions = expressions;
    }
}
