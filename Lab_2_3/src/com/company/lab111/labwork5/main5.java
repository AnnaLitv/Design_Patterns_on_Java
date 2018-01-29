package com.company.lab111.labwork5;

public class main5 {
    public static void main(String[] args){
        int[] newr = {2,5,3,8,6,9,12,345, 67,23,-19,18,0,-14};
        SimpleAggregate aggr = new SimpleAggregate(newr);
        ConcrIterator iter1 = (ConcrIterator) aggr.createConcrIterator();
        System.out.println("Прохід ітератором по невпорядкованій структурі");
        for(iter1.first();!iter1.isDone();iter1.next()){
            System.out.print(iter1.getCurrent()+" ");
        }
        System.out.println();
        System.out.println("Прохід ітератором по впорядкованій структурі");
        SortIterator iter2 = (SortIterator) aggr.createSortIterator();
        for(iter2.first();!iter2.isDone();iter2.next()){
            System.out.print(iter2.getCurrent()+" ");
        }
    }

}
