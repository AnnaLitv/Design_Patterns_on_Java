package com.company.lab111.labwork7;

/**
 * Class DivExpression implements AbstractExpression
 */
public class DivExpression implements AbstractExpression{

    /**
     * left variable
     */
    AbstractExpression left;

    /**
     * right variable
     */
    AbstractExpression right;

    /**
     * Constructor for DivExpression
     * @param left
     * @param right
     */
    DivExpression(AbstractExpression left, AbstractExpression right){
        this.left=left;
        this.right=right;
    }

    /**
     * Override method Interpret()
     * for interpretting div operation
     * @see AbstractExpression#Interpret(Context)
     * @param context
     * @return
     */
    @Override
    public float Interpret(Context context) {
        return (float)left.Interpret(context)/(float)right.Interpret(context);
    }
}
