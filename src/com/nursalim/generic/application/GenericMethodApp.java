package com.nursalim.generic.application;

import com.nursalim.generic.util.ArrayHelper;

public class GenericMethodApp {
    public static void main(String[] args) {
        String[] names = {"Nursalim", "Milasrun", "Al Losari"};
        Double[] saray = {1000000.0, 3000000.0, 9000000.0};

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(saray));

    }
}
