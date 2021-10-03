package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<User> users = Service.getUser();

        List<User> names = Service.findByName(users, "Adid");
        System.out.println(names);

        List<User> gender = Service.findByGender(users, "Male");
        System.out.println(gender);

        List<User> age = Service.findByAge(users, 23);
        System.out.println(age);


        System.out.println("---------------------------------------");

        int[] array = new int[]{13, 5, 1, 2, 3, 3, 5, 6, 7, 8, 9};
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : array) {
            Integer value = map.get(i);
            if (value == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++value);
            }
        }
        System.out.println(map);
    }
}


