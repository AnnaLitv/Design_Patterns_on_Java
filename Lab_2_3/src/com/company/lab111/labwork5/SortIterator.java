package com.company.lab111.labwork5;

/**
 * Class ConcrIterator extends Iterator
 * realize interface Iterator
 */
public class SortIterator extends Iterator {

    private Aggregate agr;
    private int temp;
    private int max;

    private int cur = 0;

    /**
     * Constructor for ConcrIterator
     *
     * @param concrAggr
     */
    public SortIterator(Aggregate concrAggr) {
        agr = concrAggr;
        cur = 0;
        for (int i = cur; i < agr.count ; i++) {
            if (temp>agr.getItem(i)) {
                temp=agr.getItem(i);
            }
        }
        temp--;
    }

    /**
     * Override method isDone()
     * is the end of structure or not
     *
     * @return
     * @see Iterator#isDone()
     */
    @Override
    public boolean isDone() {
        return cur >= agr.count;
    }

    /**
     * method next()
     * setting cur field to the next element in structure
     *
     * @see Iterator#next()
     */
    @Override
    public void next() {
        cur++;
    }

    /**
     * method first()
     * setting cur field to the first element in structure
     *
     * @see Iterator#first()
     */
    @Override
    public void first() {
        cur = 0;

    }

    /**
     * method getCurrent()
     * returns current element from structure
     *
     * @return
     * @see Iterator#getCurrent()
     */
    @Override
    public int getCurrent() {

        int min=agr.getItem(0);
        for (int i = 0; i < agr.count ; i++) {
            if (min<agr.getItem(i)) {
                min=agr.getItem(i);
            }
        }
        for (int i = 0; i < agr.count ; i++) {
            if ((min>agr.getItem(i))&&(agr.getItem(i)>temp)) {
                min=agr.getItem(i);
            }
        }
        temp=min;
        if (isDone()) {
            System.out.println("Эллемент не существует!");
            return 0;
        } else
            return min;

    }
}
