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


    }
}


