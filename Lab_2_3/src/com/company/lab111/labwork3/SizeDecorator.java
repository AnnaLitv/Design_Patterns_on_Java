package com.company.lab111.labwork3;
/**Class SizeDecorator extends Decorator
 * for setting size manipulator
 *@author Anna Litvinenko
 * @version 1.0
 *
 */
public class SizeDecorator extends Decorator {

    /**
     * Constructor for Decorator
     * @param comp
     */
   public SizeDecorator(Component comp) {
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
     * Method SetManipulator() for setting Size manipulator to Component
     * @see Component#SetManipulator()
     */
    @Override
    public void SetManipulator() {
        System.out.println("Манипуляторы size были установлены "+this.name+" в точки ("+this.x1+", "+this.y1+"); ("
                +this.x1+", "+ this.y2+"); ("+this.x2+", "+this.y1+"); ("+this.x2+", "+this.y2+")");
    }
}
