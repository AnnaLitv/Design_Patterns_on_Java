package com.company.lab111.labwork3;
/**Class PositionDecorator extends Decorator
 * for setting positionn manipulator
 *@author Anna Litvinenko
 * @version 1.0
 *
 */
public class PositionDecorator extends Decorator {

    /**
     * Constructor for PositionDecorator
     * @param comp
     */
    public PositionDecorator(Component comp) {
        super(comp);

    }

    //*****************************************************
    /**Method add() for adding new Component
     * @see Component#add(Component)
     * @param comp
     */
    @Override
    public void add(Component comp) {
        super.comp.add(comp);
    }

    //*****************************************************
    /**Method remove() for removing Component
     * @see Component#remove(Component)
     * @param comp
     */
    @Override
    public void remove(Component comp) {
        super.comp.remove(comp);

    }

    //*****************************************************
    /**Method display() for displaying nodes and their children
     * @see Component#display()
     */
    @Override
    public void display() {
        super.comp.display();
    }

    //****************************************************
    /**
     * Method SetManipulator() for setting Position manipulator to Component
     * @see Component#SetManipulator()
     */
    @Override
    public void SetManipulator() {
        float centrX = (this.x1+this.x2)/2;
        float centrY= (this.y1+this.y2)/2;
        System.out.println("Манипулятор position установлен на "+this.name+" в точку ("+centrX+", "+centrY+")");
    }


}
