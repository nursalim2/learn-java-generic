package com.nursalim.generic.application;

import com.nursalim.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> dataString = new MyData<>("Nursalim");
//        doIt(dataString); ERROR
//        MyData<Object> objectMyData = dataString; ERROR

    }

    public static void doIt(MyData<Object> objectMyData) {
        // do nothing
    }
}
