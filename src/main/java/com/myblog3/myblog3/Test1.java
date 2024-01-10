package com.myblog3.myblog3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        // Q-1find the length of given string is >5
        Predicate<String> data1=str->str.length()>5;
        boolean result1 = data1.test("manthan");
        System.out.println(result1);

        // Q-2 find the string has contain "a" of given string
        Predicate<String >data2=str->str.contains("a");
        boolean result2 = data2.test("keshav");
        System.out.println(result2);

        // Q-3 find the string os emplty or not  of given string
        Predicate<String> data3=str->str.isEmpty();
        boolean result3 = data3.test("testing");
        System.out.println(result3);

        // map example
//
//        // Q-1 find the length of given string
       Function<String,Integer> data4= str->str.length();
        Integer result4 = data4.apply("manan");
        System.out.println(result4);

        //Q-2 add value in +10 to any value and give the output
        Function<Integer,Integer>data5=i->i+10;
        Integer result5 = data5.apply(36);
        System.out.println(result5);
        // Q-3 add 20 with all numbers in given list(10,25,39,14,25)
        List<Integer> data6 = Arrays.asList(10, 25, 39, 14, 25);
        List<Integer> result6 = data6.stream().map(i -> i + 20).collect(Collectors.toList());
        System.out.println(result6);

        // How would you handle potential exceptions in a lambda expression?
    }
}
