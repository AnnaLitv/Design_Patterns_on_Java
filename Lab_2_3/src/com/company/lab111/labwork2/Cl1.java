package com.company.lab111.labwork2;

/**Класс Cl1 реализовывает If1
 *@author Anna Litvinenko
 * @version 1.0
 *
 */
public class Cl1 implements If1 {
    public Cl1 getClas1() {
        return clas1;
    }

    public void setClas1(Cl1 clas1) {
        this.clas1 = clas1;
    }

    /**Ссылка на класс Cl1*/
    Cl1 clas1 ;
    /**Реализовывает метод meth1() интерфейса If1
     * @see If1#meth1() */

    @Override
    public void meth1() {
        System.out.println("cl1 meth1");
    }
}
