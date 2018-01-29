package com.company.lab111.labwork8;

/**
 * Class ConcrIterator extends Iterator
 * realize interface Iterator
 */
public class ConcrIter extends Iter {

    Creator creator;
    private Aggreg agr;
    Algo alg;

    private int cur =0;

    /**
     * Constructor for ConcrIterator
     * @param concrAggr
     */
    public ConcrIter(Aggreg concrAggr) {
        agr = concrAggr;
        cur = 0;
    }

    /**
     * Override method isDone()
     * is the end of structure or not
     * @see Iter#isDone()
     * @return
     */
    @Override
    public boolean isDone(){
        if(alg instanceof ForwardAlgo)
        return cur>=agr.count;
        else
            return cur<0;
    }

    /**
     * method next()
     * setting cur field to the next element in structure
     * @see Iter#next()
     */
    @Override
    public void next(){
//        if(numb==0){
//            creator = new ForwardCreator();
//            ForwardAlgo falg = (ForwardAlgo) creator.create();
//            cur=falg.next(cur);
//        }else{
//            creator = new BackwardCreator();
//            BackwardAlgo balg = (BackwardAlgo) creator.create();
//            cur=balg.next(cur);
//        }
        //cur++;
        cur = alg.next(cur);
    }

    /**
     * method first()
     * setting cur field to the first element in structure
     * @see Iter#first()
     */
    @Override
    public void first()
    {
        if(alg instanceof ForwardAlgo)
        cur = 0;
        else cur=agr.count-1;
    }

    /**
     * method getCurrent()
     * returns current element from structure
     * @see Iter#getCurrent()
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

    @Override
    public void setStrategy(Creator cret) {
        this.creator = cret;
        this.alg = creator.create();
    }

}
