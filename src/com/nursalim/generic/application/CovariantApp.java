package com.nursalim.generic.application;

import com.nursalim.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Nursalim");
        process(stringMyData);
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());
//        myData.setData("asdas"); ERROR cannot set data
    }
}
