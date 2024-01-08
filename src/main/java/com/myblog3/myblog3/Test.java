package com.myblog3.myblog3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//      Predicate<Integer> number=y-> y%2==0;
//        boolean result = number.test(10);
//        System.out.println(result);

//        Predicate<String>val=str-> str.equals("mike");
//        boolean result = val.test("stallin");
//        System.out.println(result);

//        List<Integer> numbers = Arrays.asList(10, 25, 37, 20, 64, 63);
//        List<Integer> evenNumbers = numbers.stream().filter(y -> y % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenNumbers);

//        List<Integer> numbers = Arrays.asList(11, 25, 20, 22, 36, 21);
//        List<Integer> oddNumbers = numbers.stream().filter(y -> y % 2 != 0).collect(Collectors.toList());
//        System.out.println(oddNumbers);

//        List<String> names = Arrays.asList("mike","vijay", "stallin", "mike");
//        List<String> data1 = names.stream().filter(str -> str.startsWith("v")).collect(Collectors.toList());
//        List<String> data2 = names.stream().filter(str -> str.equals("mike")).collect(Collectors.toList());
//        List<String> data3 = names.stream().filter(str -> str.endsWith("y")).collect(Collectors.toList());
//
//        System.out.println(data1);
//        System.out.println(data2);
//        System.out.println(data3);
           // find the length of given string
//       Function<String,Integer> data= str->str.length();
//        Integer result = data.apply("keshav");
//        System.out.println(result);

        // add value in +10 to any value and give the output
//       Function<Integer,Integer>val= i->i+10;
//        Integer result = val.apply(26);
//        System.out.println(result);

        // add 20 with all numbers in given list(10,25,39,14,25)
//        List<Integer> numbers = Arrays.asList(10, 25, 39, 14, 25);
//        List<Integer> result = numbers.stream().map(i -> i + 10).collect(Collectors.toList());
//        System.out.println(result);

        // i wnat all the names in upper case& lower case letter("bhavin","mike","statllin","axay")
//        List<String> names = Arrays.asList("bhavin", "mike", "statllin", "axay");
//        List<String> data1 = names.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
//        List<String> data2 = names.stream().map(str -> str.toLowerCase()).collect(Collectors.toList());
//        System.out.println(data1);
//        System.out.println(data2);

        // all the names in sorting in assending order
//        List<String> names = Arrays.asList("akash", "miral", "jainil", "neel");
//        List<String> result = names.stream().sorted().collect(Collectors.toList());
//        System.out.println(result);

        // sort the number in asending order
//        List<Integer> numbers = Arrays.asList(15, 36, 25, 14, 29, 80, 26);
//        List<Integer> data1 = numbers.stream().sorted().collect(Collectors.toList());
//        System.out.println(data1);

        // remove duplicate number & sort the number in asending order
        List<Integer> integers = Arrays.asList(10, 20, 36, 20, 45, 30, 30, 25, 69);
        List<Integer> numbers = integers.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(numbers);
    }

}
