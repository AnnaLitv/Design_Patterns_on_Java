package com.company.lab111.labwork8;

import java.util.ArrayList;

/**
 * Class SimpleAggregate extends Aggregate
 * for describing simple aggregate structure
 */
public class ConcrAggr extends Aggreg{

    /**
     * Array List field
     */
    private ArrayList lst ;

    /**
     * Constructor for SimpleAggregate
     * @param mas
     */
    ConcrAggr(int[] mas){
        lst = new ArrayList();
        for(int m:mas){
            lst.add(m);
        }
        setCount(mas.length);
    }

    /**
     * Override method createConcrIterator()
     * for creating Iterator for aggregate
     * @see Aggreg#createConcrIterator()
     * @return Iterator
     */
    @Override
    public Iter createConcrIterator() {
        return new ConcrIter(this);
    }


    /**
     * Override method getItem()
     * for returning some item from aggregate
     * @see Aggreg#getItem(int)
     * @param ind
     * @return
     *
     */
    @Override
    public int getItem(int ind) {
        return (int) lst.get(ind);
    }

    /**
     * Override
     * setting size of aggregate
     * @see Aggreg#setCount(int)
     * @param count
     */
    @Override
    public void setCount(int count) {
        this.count = count;
    }

}
