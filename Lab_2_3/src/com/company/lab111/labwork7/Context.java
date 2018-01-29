package com.company.lab111.labwork7;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

/**
 * Class Context
 * for saving collection of variables
 */
public class Context {
    /**
     * Map for saving variables
     */
    Map<String, Float> var;

    /**
     * Constructor for Context
     */
    Context(){
        var = new HashMap<String, Float>();
    }

    /**
     * method getVar()
     * for getting variable
     * @param name
     * @return
     */
    public float getVar(String name){
        return var.get(name);
    }

    /**
     * method setVar()
     * for setting variable
     * @param name
     * @param val
     */
    public void setVar(String name, float val){
        var.put(name,val);
    }
}
