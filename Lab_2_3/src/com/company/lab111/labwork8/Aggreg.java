package com.company.lab111.labwork8;

import java.util.List;

/**
 * Abstract class Agregate
 * for describing structure which will calling Iterator
 */
public abstract class Aggreg {
    /**
     * Method createConcrIterator()
     * for creating Iterator for aggregate
     * @return
     */
    public abstract Iter createConcrIterator();


    /**
     * Method getItem()
     * for returning some item from aggregate
     * @param ind
     * @return
     */
    public abstract int getItem(int ind);

    /**
     * setting size of aggregate
     * @param count
     */
    public abstract void setCount(int count);

    /**
     * size field
     */
    public int count;

}
