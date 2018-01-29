package com.company.lab111.labwork5;

import java.util.ArrayList;

/**
 * Class SimpleAggregate extends Aggregate
 * for describing simple aggregate structure
 */
public class SimpleAggregate extends Aggregate{

    /**
     * Array List field
     */
    private ArrayList lst ;

    /**
     * Constructor for SimpleAggregate
     * @param mas
     */
    SimpleAggregate(int[] mas){
        lst = new ArrayList();
        for(int m:mas){
            lst.add(m);
        }
        setCount(mas.length);
    }

    /**
     * Override method createConcrIterator()
     * for creating Iterator for aggregate
     * @see Aggregate#createConcrIterator()
     * @return Iterator
     */
    @Override
    public Iterator createConcrIterator() {
        return new ConcrIterator(this);
    }

    @Override
    public Iterator createSortIterator() {
        return new SortIterator(this);
    }


    /**
     * Override method getItem()
     * for returning some item from aggregate
     * @see Aggregate#getItem(int)
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
     * @see Aggregate#setCount(int)
     * @param count
     */
    @Override
    public void setCount(int count) {
        this.count = count;
    }

}
