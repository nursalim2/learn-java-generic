package com.nursalim.generic.application;

import com.nursalim.generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> myDataString = new MyData<>("Nursalim Milasrun");
        MyData<Integer> myDataInteger = new MyData<>(100);
        MyData<Boolean> myDataBoolean = new MyData<>(true);

        System.out.println(myDataString.getData());
        System.out.println(myDataInteger.getData());
        System.out.println(myDataBoolean.getData());
    }
}
