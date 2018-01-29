package com.company.lab111.labwork3;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**Class Leaf extends Component
 * for simple objects
 *@author Anna Litvinenko
 * @version 1.0
 *
 */
public class Leaf extends Component {

    /**
     * Constructor for Leaf
     * @param name
     * @param x1
     * @param x2
     * @param y1
     * @param y2
     */
    public Leaf(String name, float x1, float x2, float y1, float y2) {
        this.name = name;
        if(x1==x2||y1==y2){
            return;
        }else {
            if (x1 < x2) {
                this.x1 = x1;
                this.x2 = x2;
            } else {
                this.x1 = x2;
                this.x2 = x1;
            }
            if (y1 < y2) {
                this.y1 = y1;
                this.y2 = y2;
            } else {
                this.y1 = y2;
                this.y2 = y1;
            }
        }
    }

    /**Method add() for adding new Component
     * @see Component#add(Component)
     * @param comp
     */
    @Override
    public void add(Component comp) {
        System.out.println("Невозможно добавить узел "+comp.name+" в узел "+name);
    }

    /**Method remove() for removing Component
     * @see Component#remove(Component)
     * @param comp
     */
    @Override
    public void remove(Component comp) {
        System.out.println("Невозможно удалить узел "+comp.name+" из узла "+name);
    }

    /**Method display() for displaying nodes and their children
     * @see Component#display()
     */
    @Override
    public void display() {
        System.out.println(name+" "+x1+", "+x2+", "+y1+", "+y2);
    }

    /**
     * Method SetManipulator() for setting manipulator to Component
     * @see Component#SetManipulator()
     */
    @Override
    public void SetManipulator() {

    }

}
