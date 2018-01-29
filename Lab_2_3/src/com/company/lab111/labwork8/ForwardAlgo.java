package com.company.lab111.labwork8;

/**
 * class ForwardAlgo implements Algo
 */
public class ForwardAlgo implements Algo{

    /**
     * method next()
     * for searching next element in aggregate
     * search forward
     * @param cur
     * @return
     * @see Algo#next(int)
     */
    @Override
    public int next(int cur) {
        return ++cur;
    }
}
