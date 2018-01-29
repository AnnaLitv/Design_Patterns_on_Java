package com.company.lab111.labwork6;

import java.util.ArrayList;

/**
 * Class SimpleStrategy implements Strategy
 * for displaying table via simple diagram
 */
public class SimpleStrategy implements Strategy {

    /**
     * Override method show()
     * for displaying diagram
     * @see Strategy#show(ArrayList)
     * @param table
     */
    @Override
    public void show(ArrayList<Table> table) {
        System.out.println("SIMPLE DIAGRAM");
        for(int i=0;i<table.size();i++){
            System.out.println(table.get(i).getName()+" "+table.get(i).getAge());
        }
    }
}
