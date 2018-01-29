package com.company.lab111.labwork3;

import java.util.ArrayList;
/**Abstract class Decorator extends Component
 * for decoration simple objects or complex objects
 *@author Anna Litvinenko
 * @version 1.0
 *
 */
public abstract class Decorator extends Component {
    /**
     * Component object
     */
    Component comp;

    /**
     * Constructor for Decorator class
     * @param comp
     */
    Decorator(Component comp) {
        this.comp = comp;
        this.x1 = comp.x1;
        this.x2 = comp.x2;
        this.y2 = comp.y2;
        this.y1 = comp.y1;
        this.name = comp.name;
    }

}
