package com.company.lab111.labwork7;

public class main7 {
    public static void main(String[] args){
        Context cont = new Context();
        float a = 25.6f;
        float b = 2.5f;
        float c = 9f;
        float t = 4f;
        float v = 1.5f;

        cont.setVar("a",a);
        cont.setVar("b",b);
        cont.setVar("c",c);
        cont.setVar("t",t);
        cont.setVar("v",v);

        AbstractExpression exp = new DivExpression(new MultExpression(new AddExpression(new NumberExpression("a"),
                new NumberExpression("b")),new NumberExpression("v")),
                new DivExpression(new NumberExpression("t"),new NumberExpression("c")));

        float res = exp.Interpret(cont);

        System.out.println("result "+res);
    }
}
