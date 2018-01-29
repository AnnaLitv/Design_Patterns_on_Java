package com.company.lab111.labwork2;

/**Класс Cl3 реализовывает If3
 *@author Anna Litvinenko
 * @version 1.0
 *
 */
public class Cl3 implements If3 {

    /**Ссылка на класс Cl1*/
    Cl1 clas1 = new Cl1();

    /**Реализовывает метод meth1() интерфейса If1
     * @see If1#meth1() */
    @Override
    public void meth1() {
        System.out.println("cl3 meth1");
    }

    /**Реализовывает метод meth3() интерфейса If3
     * @see If3#meth3() */
    @Override
    public void meth3() {
        System.out.println("cl3 meth3");
    }
}
