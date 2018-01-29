package com.company.lab111.labwork3;
/**Abstract class Component
 *@author Anna Litvinenko
 * @version 1.0
 *
 */
public abstract class Component {
    /**Field for Component name*/
    String name;
    /**Field for x1 coordinate*/
    float x1;
    /**Field for x2 coordinate*/
    float x2;
    /**Field for y1 coordinate*/
    float y1;
    /**Field for y2 coordinate*/
    float y2;

    /**
     * Empty constructor for Component
     */
    Component(){

    }

    /**
     * Abstract method for adding new Component
     * @param comp
     */
    public abstract void add(Component comp);

    /**
     * Abstract method for removing Component
     * @param comp
     */
    public abstract void remove(Component comp);

    /**
     * Abstract method for showing hierarchy of objects
     */
    public abstract void display();

    /**
     * Abstract method for setting manipulators to objects
     */
    public abstract void SetManipulator();

    public float getX1() {
        return x1;
    }

    public float getX2() {
        return x2;
    }

    public float getY1() {
        return y1;
    }

    public float getY2() {
        return y2;
    }


}
