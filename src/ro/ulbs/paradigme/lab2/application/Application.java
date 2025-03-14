package ro.ulbs.paradigme.lab2.application;

import ro.ulbs.paradigme.lab2.simplechained.SimpleChainedList;
import ro.ulbs.paradigme.lab2.doublechained.DoubleChainedList;
import ro.ulbs.paradigme.lab2.api.MyList;

public class Application {
    public static void main(String[] args) {
        MyList simpleList = new SimpleChainedList();
        MyList doubleList = new DoubleChainedList();

        for (int i = 1; i <= 10; i++) {
            simpleList.addValue(i);
            doubleList.addValue(i);
        }

        simpleList.removeNodeByValue(4);
        simpleList.removeNodeByValue(6);
        simpleList.removeNodeByValue(8);
        simpleList.removeNodeByValue(10);

        doubleList.removeNodeByValue(1);
        doubleList.removeNodeByValue(2);
        doubleList.removeNodeByValue(3);

        simpleList.listNodes();
        doubleList.listNodes();

        System.out.println("Lista simplu înlănțuită este sortată? " + simpleList.isSorted());
        System.out.println("Lista dublu înlănțuită este sortată? " + doubleList.isSorted());
    }
}
