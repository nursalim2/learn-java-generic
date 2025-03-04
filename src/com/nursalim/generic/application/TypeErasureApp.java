package com.nursalim.generic.application;

import com.nursalim.generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        MyData myData = new MyData("Nursalim");
        MyData<Integer> integerMyData = (MyData<Integer>) myData;

        Integer integer = integerMyData.getData();
    }
}
