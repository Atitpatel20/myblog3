package com.myblog3.myblog3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFunction_map_Example {
    public static void main(String[] args) {
        // Q-1 Scenario: Given a list of numbers, map each number to its square.
        List<Integer> data1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result1 = data1.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(result1);

        // Q-2 Given a list of strings, map each string to its length.
        List<String> data2 = Arrays.asList("apple", "banana", "mango", "orange");
        List<Integer> result2 = data2.stream().map(str -> str.length()).collect(Collectors.toList());
        System.out.println(result2);

        // Q-3 Given a list of Person objects, map each person to their age.
        List<Person> data3 = Arrays.asList(
                new Person("kevin", 25, "Male"),
                new Person("pravin", 55, "Male"),
                new Person("Bhavna", 49, "Female"),
                new Person("priya", 2, "Female")
        );

        List<Integer> result4 = data3.stream().map(str -> str.getAge()).collect(Collectors.toList());
        System.out.println(result4);

        // Q-4 Scenario: Given a list of strings, filter out strings that contain the letter 'a'
        // and map the remaining strings to uppercase.
        List<String> data4 = Arrays.asList("apple", "banana", "alu", "mango", "orange");
        List<String> result5 = data4.stream().filter(str -> str.startsWith("a")).map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(result5);

        // Q-5 Given a list of numbers, map each number to a string by concatenating it with a prefix.
        List<Integer> data5 = Arrays.asList(1, 2, 3, 4, 5);
        List<String> result6 = data5.stream().map(str -> "Numbers:" + str).collect(Collectors.toList());
        System.out.println(result6);
        // Q- 6 add value in +10 to any value and give the output
       Function<Integer,Integer> val= i->i+10;
        Integer result = val.apply(26);
        System.out.println(result);

        // Q-7 add 20 with all numbers in given list(10,25,39,14,25)
        List<Integer> numbers = Arrays.asList(10, 25, 39, 14, 25);
        List<Integer> result7 = numbers.stream().map(i -> i + 10).collect(Collectors.toList());
        System.out.println(result7);

        //Q-8 i wnat all the names in upper case& lower case letter("bhavin","mike","statllin","axay")
        List<String> names = Arrays.asList("bhavin", "mike", "statllin", "axay");
        List<String> names8 = names.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        List<String> names9 = names.stream().map(str -> str.toLowerCase()).collect(Collectors.toList());
        System.out.println(names8);
        System.out.println(names9);

        // map example

//        // Q-1 find the length of given string
        Function<String,Integer> val9= str->str.length();
        Integer val10 = val9.apply("manan");
        System.out.println(val10);

        //Q-2 add value in +10 to any value and give the output
        Function<Integer,Integer>val11=i->i+10;
        Integer val12 = val11.apply(36);
        System.out.println(val12);

        // Q-3 add 20 with all numbers in given list(10,25,39,14,25)
        List<Integer> data6 = Arrays.asList(10, 25, 39, 14, 25);
        List<Integer> data7 = data6.stream().map(i -> i + 20).collect(Collectors.toList());
        System.out.println(data7);

    }
}
