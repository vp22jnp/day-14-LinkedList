package com.day14;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(56);
        numberList.add(30);
        numberList.add(70);
       // numberList.show();
        LinkedList<Integer> numberList1 = new LinkedList<>();
        numberList1.add(70);
        numberList1.add(30);
        numberList1.add(56);
        //numberList1.show();
        System.out.println("after adding"+numberList1);
    }
}

