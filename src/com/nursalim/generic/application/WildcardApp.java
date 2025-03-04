package com.nursalim.generic.application;

import com.nursalim.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<>("Nursalim"));
        print(new MyData<>(100));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
