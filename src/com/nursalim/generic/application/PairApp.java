package com.nursalim.generic.application;

import com.nursalim.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> finalValue = new Pair<>("Nursalim", 89);
        Pair<String, Boolean> isSuccess = new Pair<>("Nursalim", true);

        System.out.println(finalValue.getFirst());
        System.out.println(finalValue.getLast());
    }
}
