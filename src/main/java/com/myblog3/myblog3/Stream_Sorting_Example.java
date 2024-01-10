package com.myblog3.myblog3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Sorting_Example {
    public static void main(String[] args) {
        //Q-1 sort the elements numbers of a stream in ascending order first & then descending order
        List<Integer> data1 = Arrays.asList(5, 8, 3, 9, 2, 7, 1, 4, 6);
        List<Integer> sortedNumber = data1.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedNumber:"+sortedNumber);

        List<Integer> reverseNumber = data1.stream().sorted((s1, s2) -> Integer.compare(s2, s1)).collect(Collectors.toList());
        System.out.println("reverseNumber:"+reverseNumber);

        // Q-2 sort the elements numbers of a stream in ascending order first & then descending order
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "mango", "chiku");
        List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedFruits"+sortedFruits);

        List<String> reverseFruits = fruits.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println("reverseFruits;"+reverseFruits);
        // Q-3 sort by first age ascending order
        // sort by second age descending order
        // sort by third name descending order
        List<Person> data3 = Arrays.asList(
                new Person("kevin", 25, "Male"),
                new Person("pravin", 55, "Male"),
                new Person("Bhavna", 49, "Female"),
                new Person("priya", 23, "Female")
        );
        List<Person> sortedAge = data3.stream().sorted((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge())).collect(Collectors.toList());
        System.out.println(sortedAge);

        List<Person> reverseAge = data3.stream().sorted((s1, s2) -> Integer.compare(s2.getAge(), s1.getAge())).collect(Collectors.toList());
        System.out.println(reverseAge);

        List<Person> sortedByName = data3.stream().sorted((s1, s2) -> s2.getName().compareTo(s1.getName())).collect(Collectors.toList());
        System.out.println(sortedByName);
    }
}
