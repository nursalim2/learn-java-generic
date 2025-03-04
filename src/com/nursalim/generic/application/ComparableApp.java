package com.nursalim.generic.application;

import com.nursalim.generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Nursalim", "Jakarta"),
                new Person("Ana", "Bandung"),
                new Person("Nani", "Semarang"),
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
