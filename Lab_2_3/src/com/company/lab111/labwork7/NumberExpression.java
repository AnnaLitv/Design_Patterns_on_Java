package com.company.lab111.labwork7;

/**
 * Class NumberExpression implements AbstractExpression
 */
public class NumberExpression implements AbstractExpression{

    /**
     * name of variable
     */
    String name;

    /**
     * Constructor for NumberExpression
     * @param name
     */
    NumberExpression(String name){
        this.name=name;
    }

    /**
     * Override method Interpret()
     * for returning variable
     * @param context
     * @return
     */
    @Override
    public float Interpret(Context context) {
        return context.getVar(name);
    }
}
