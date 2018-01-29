package com.company.lab111.labwork3;

import java.util.ArrayList;
/**Class Composite extends Component
 * for complex objects
 *@author Anna Litvinenko
 * @version 1.0
 *
 */
public  class Composite extends Component {
    /** Collection of objects in Composite*/
    ArrayList<Component> array = new ArrayList<Component>();


    /**
     * Constructor for Composite
     * @param name
     */
    public Composite(String name) {
        this.name = name;
    }

    /**Method add() for adding new Component
     * @see Component#add(Component)
     * @param comp
     */
    @Override
    public void add(Component comp) {
        array.add(comp);
        setSize();
    }

    /**Method remove() for removing Component
     * @see Component#remove(Component)
     * @param comp
     */
    @Override
    public void remove(Component comp) {
        array.remove(comp);
    }

    /**Method display() for displaying nodes and their children
     * @see Component#display()
     */
    @Override
    public void display() {
        System.out.println("Узел " + name+" "+x1+", "+x2+", "+y1+", "+y2);
        System.out.println("{");
        System.out.println("Подузлы "+name+" :");
        for(Component comp : array){
            comp.display();
        }
        System.out.println("}");
    }

    /**
     * Method SetManipulator() for setting manipulator to Component
     * @see Component#SetManipulator()
     */
    @Override
    public void SetManipulator() {

    }

    /**
     * Method for setting coordinates for complex object in Composite
     */
    private void setSize(){
        float maxX1, maxX2, maxY1, maxY2;
        maxX1 = array.get(0).getX1();
        maxX2 = array.get(0).getX2();
        maxY1 = array.get(0).getY1();
        maxY2 = array.get(0).getY2();

        for(int i=0;i<array.size();i++){
                if (maxX1>array.get(i).getX1())
                    maxX1 = array.get(i).getX1();
                if(maxX2<array.get(i).getX2())
                    maxX2 = array.get(i).getX2();
                if(maxY1>array.get(i).getY1())
                    maxY1 = array.get(i).getY1();
                if(maxY2<array.get(i).getY2())
                    maxY2 = array.get(i).getY2();
        }
        this.x1 = maxX1;
        this.x2 = maxX2;
        this.y1 = maxY1;
        this.y2 = maxY2;
    }

}
