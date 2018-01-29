package com.company.lab111.labwork7;

/**
 * Class AddExpression implements AbstractExpression
 * for add operation
 */
public class AddExpression implements AbstractExpression {

    /**
     * left variable
     */
    AbstractExpression left;
    /**
     * right variable
     */
    AbstractExpression right;

    /**
     * Constructor for AddExpression
     * @param left
     * @param right
     */
    AddExpression(AbstractExpression left, AbstractExpression right){
        this.left=left;
        this.right=right;
    }

    /**
     * Override method Interpret()
     * for interpretting add operation
     * @see AbstractExpression#Interpret(Context)
     * @param context
     * @return
     */
    @Override
    public float Interpret(Context context) {
        return left.Interpret(context)+right.Interpret(context);
    }
}
