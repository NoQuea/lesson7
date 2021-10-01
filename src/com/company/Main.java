package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Adid",22, "Male"));
        users.add(new User("Wins",22, "Male"));
        users.add(new User("Bob",32, "Male"));
        users.add(new User("Abil",12, "Female"));
        users.add(new User("Abid",19, "Female"));



        Collections.sort(users, Comparator.comparing(User::getName).thenComparing(User::getAge));
        System.out.println("A"+users);


        HashSet<User> users1 = new HashSet<>();
        users1.add(new User("Adid",22, "Male"));
        users1.add(new User("Wins",22, "Male"));
        users1.add(new User("Bob",32, "Male"));
        users1.add(new User("Abil",12, "Female"));
        users1.add(new User("Abid",19, "Female"));

        System.out.println(users1);




    }
}


