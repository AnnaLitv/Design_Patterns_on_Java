package com.company.lab111.labwork8;

/**
 * class BackwardAlgo implements Algo
 */
public class BackwardAlgo implements Algo{

    /**
     * method next()
     * for searching next element in aggregate
     * search backward
     * @param cur
     * @return
     * @see Algo#next(int)
     */
    @Override
    public int next(int cur) {
//        if(cur==0)
//            return cur;
//        else return --cur;
        return --cur;
    }
}
