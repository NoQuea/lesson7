package com.company;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Service {

    public static List<User> getName() {
        return List.of(

        new User("Adid", 22, "Male"),
        new User("Wins", 22, "Male"),
        new User("Bob", 32, "Male"),
        new User("Abil", 12, "Female"),
        new User("Abid", 19, "Female")

       );
    }
        public static List<User> findByName(List<User> users, String name){
            return users.stream().filter(user -> user.getName().equals(name));
        }

        public static void printUsers( List<User> users ) {
            users.forEach(System.out::println);
        }

    }
