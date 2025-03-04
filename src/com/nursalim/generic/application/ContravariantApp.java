package com.nursalim.generic.application;

import com.nursalim.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Nursalim");
        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        String value = (String) myData.getData();
        System.out.println("Process parameter : " + value);
        myData.setData("Nursalim Milasrun");
    }
}
