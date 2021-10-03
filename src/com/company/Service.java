package com.company;


import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Service {

    public static List<User> getUser() {
        return List.of(
                new User("Boby", 32, "Male"),
                new User("Adid", 22, "Male"),
                new User("Wins", 22, "Male"),
                new User("Aded", 23, "Male"),
                new User("Abil", 12, "Female"),
                new User("Abid", 19, "Female")

       );
    }
        public static List<User> findByName(List<User> users, String name){
            return users.stream().filter(user -> user.getName().equals(name)).collect(Collectors.toList());
        }

        public static List<User> findByGender(List<User> users, String gender){
            return users.stream().filter(user -> user.getGender().equals(gender)).collect(Collectors.toList());
        }
        public static List<User> findByAge(List<User> users, Integer age){

            return users.stream().filter(user -> user.getAge().equals(age)).sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
        }

        public static void printUsers( List<User> users ) {
            users.forEach(System.out::println);
        }



    }
