package com.company.lab111.labwork8;

/**
 * Class BackwardCreator implements Creator
 */
public class BackwardCreator implements Creator {
    /**
     * Override method create()
     * factory method for create startegy for backward algorithm
     * @see Creator#create()
     * @return
     */
    @Override
    public Algo create() {
        return new BackwardAlgo();
    }
}
