package com.company.lab111.labwork7;

/**
 * Class MultExpression implements AbstractExpression
 */
public class MultExpression implements AbstractExpression {

    /**
     * left variable
     */
    AbstractExpression left;

    /**
     * right variable
     */
    AbstractExpression right;

    /**
     * Constructor for MultExpression
     * @param left
     * @param right
     */
    MultExpression(AbstractExpression left, AbstractExpression right){
        this.left=left;
        this.right=right;
    }

    /**
     * Override method Interpret()
     * for interpretting mult operation
     * @see AbstractExpression#Interpret(Context)
     * @param context
     * @return
     */
    @Override
    public float Interpret(Context context) {
        return left.Interpret(context)*right.Interpret(context);
    }
}
