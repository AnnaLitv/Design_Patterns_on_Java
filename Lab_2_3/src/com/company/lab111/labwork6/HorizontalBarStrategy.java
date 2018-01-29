package com.company.lab111.labwork6;

import java.util.ArrayList;

/**
 * Class HorizontalBarStrategy implements Strategy
 * for displaying table via horizontal bar diagram
 */
public class HorizontalBarStrategy implements Strategy{

    /**
     * Override method show()
     * for displaying diagram
     * @see Strategy#show(ArrayList)
     * @param table
     */
    @Override
    public void show(ArrayList<Table> table) {
        System.out.println("HORIZONTAL DIAGRAM");
        for(int i=0;i<table.size();i++){
            System.out.println(table.get(i).getName()+" ");
            for(int j=0;j<table.get(i).getAge();j++){
                System.out.print("|");
            }
            System.out.println();
        }
    }

}
