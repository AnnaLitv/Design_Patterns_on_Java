package com.company.lab111.labwork2;

/**Класс Cl2 реализовывает If2
 *@author Anna Litvinenko
 * @version 1.0
 *
 */
public class Cl2 extends Cl1 implements If2 {

    public If1 getInt1() {
        return int1;
    }

    public void setInt1(If1 int1) {
        this.int1 = int1;
    }

    /**Ссылка на интерфейс If1*
     * @see If1
     */
    If1 int1;

    /**Реализовывает метод meth2() интерфейса If2
     * @see If2#meth2() */
    @Override
    public void meth2() {
        System.out.println("cl2 meth2");
    }

    /**Реализовывает метод meth3() интерфейса If3
     * @see If3#meth3() */
    @Override
    public void meth3() {
        System.out.println("cl2 meth3");
    }
}
