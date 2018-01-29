package com.company.lab111.labwork6;

import java.util.ArrayList;

/**
 * Class Table Context
 * for describing what will call algorithm in Strategy
 */
public class TableContext {
    /**
     * strategy field
     */
    private Strategy strategy;
    /**
     * table which will displaying via diagram
     */
    private ArrayList<Table> table;

    /**
     * Constructor for TableContext
     * @param table
     */
    TableContext(ArrayList<Table> table){
        this.table=table;
    }

    /**
     * Setting strategy field
     * @param strategy
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Getting table field
     * @return
     */
    public ArrayList<Table> getTable() {
        return table;
    }

    /**
     * Setting table field
     * @param table
     */
    public void setTable(ArrayList<Table> table) {
        this.table = table;
    }

    /**
     * Calling Strategy.show()
     * for displaying diagram for table
     */
    public void showDiagram(){
        if(this.strategy==null)
        {
            System.out.println("Не выбран алгоритм(тип диаграммы)!");
        }else
        strategy.show(table);
    }
}
