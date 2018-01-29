package com.company.lab111.labwork8;

/**
 * class ForwardCreator implements Creator
 */
public class ForwardCreator implements Creator{

    /**
     * Override method create()
     * factory method for create startegy for forward algorithm
     * @see Creator#create()
     * @return
     */
    @Override
    public Algo create() {
        return new ForwardAlgo();
    }
}
