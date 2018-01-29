package com.company.lab111.labwork8;

public class main8 {
    public static void main(String[] args){
        int[] newr = {2,5,3,8,6,9,12,345, 67,23,-19,18,0,-14};
        ConcrAggr aggr = new ConcrAggr(newr);
        ConcrIter iter1 = (ConcrIter) aggr.createConcrIterator();

        iter1.setStrategy(new ForwardCreator());
        for(iter1.first();!iter1.isDone();iter1.next()){
            System.out.print(iter1.getCurrent()+" ");
        }
        System.out.println();
        iter1.setStrategy(new BackwardCreator());
        for(iter1.first();!iter1.isDone();iter1.next()){
            System.out.print(iter1.getCurrent()+" ");
        }


        System.out.println();

        int[] arr = new int[10];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = i;
        }

         aggr = new ConcrAggr(arr);
         iter1 = (ConcrIter) aggr.createConcrIterator();

        iter1.setStrategy(new ForwardCreator());
        for(iter1.first();!iter1.isDone();iter1.next()){
            if (Math.random() > 0.5) {
                iter1.setStrategy(new ForwardCreator());
            }else {
                iter1.setStrategy(new BackwardCreator());
            }
            System.out.print(iter1.getCurrent()+" ");
        }


    }

}
