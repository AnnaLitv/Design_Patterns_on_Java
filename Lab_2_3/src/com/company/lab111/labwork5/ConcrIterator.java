package com.company.lab111.labwork5;

import com.company.lab111.labwork8.Algo;

/**
 * Class ConcrIterator extends Iterator
 * realize interface Iterator
 */
public class ConcrIterator extends Iterator {

    private Algo algo;
    private Aggregate agr;

    private int cur =0;

    /**
     * Constructor for ConcrIterator
     * @param concrAggr
     */
    public ConcrIterator(Aggregate concrAggr) {
        agr = concrAggr;
        cur = 0;
    }

    /**
     * Override method isDone()
     * is the end of structure or not
     * @see Iterator#isDone()
     * @return
     */
    @Override
    public boolean isDone(){
        return cur>=agr.count;
    }

    /**
     * method next()
     * setting cur field to the next element in structure
     * @see Iterator#next()
     */
    @Override
    public void next(){
        cur++;
    }

    /**
     * method first()
     * setting cur field to the first element in structure
     * @see Iterator#first()
     */
    @Override
    public void first() {
        cur = 0;
    }

    /**
     * method getCurrent()
     * returns current element from structure
     * @see Iterator#getCurrent()
     * @return
     */
    @Override
    public int getCurrent() {
        if(isDone()){
            System.out.println("Эллемент не существует!");
            return 0;
        }
        else
            return agr.getItem(cur);
    }

}
