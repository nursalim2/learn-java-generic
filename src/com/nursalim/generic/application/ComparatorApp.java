package com.nursalim.generic.application;

import com.nursalim.generic.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Nursalim", "Jakarta"),
                new Person("Ana", "Bandung"),
                new Person("Nani", "Semarang"),
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

//        Arrays.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return 0;
//            }
//        });

        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
    }
}
