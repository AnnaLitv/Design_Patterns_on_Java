package com.company.lab111.labwork8;

/**
 * Abstract class Iterator
 * for describing iterator structure
 */
public abstract class Iter {
    /**
     * method isDone()
     * is the end of structure or not
     * @return
     */
    public abstract boolean isDone();

    /**
     * method next()
     * setting cur field to the next element in structure
     */
    public abstract void next();

    /**
     * method first()
     * setting cur field to the first element in structure
     */
    public abstract void first();

    /**
     * method getCurrent()
     * returns current element from structure
     * @return
     */
    public abstract int getCurrent();
    public abstract void setStrategy(Creator cret);
}
