package com.company.lab111.labwork6;

import java.util.ArrayList;

public class main6 {
    public static void main(String[] args){
        ArrayList<Table> tab = new ArrayList<Table>();
        tab.add(new Table("Andrew",14));
        tab.add(new Table("Mathew",60));
        tab.add(new Table("Ann",10));
        tab.add(new Table("Victor",25));
        tab.add(new Table("Julia",98));
        tab.add(new Table("Evgeniya",36));
        tab.add(new Table("Oleg",5));
        tab.add(new Table("Vasya",7));
        TableContext tb1 = new TableContext(tab);
        tb1.showDiagram();
        tb1.setStrategy(new HorizontalBarStrategy());
        tb1.showDiagram();
        tb1.setStrategy(new SimpleStrategy());
        tb1.showDiagram();
    }
}
