package com.myblog3.myblog3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_Distinct_Example {
    public static void main(String[] args) {
        // Q-1 give only distinct record from this list
        // give distinct & sort the record by ascending order
        List<Integer> data1 = Arrays.asList(15, 25, 35, 85, 45, 25, 69, 75, 85);
        List<Integer> result1 = data1.stream().distinct().collect(Collectors.toList());
        List<Integer> result2 = result1.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(result1);
        System.out.println(result2);

        // Q- 2 remove duplicate people & print also duplicate people
        List<Person> data2 = Arrays.asList(
                new Person("kevin", 25, "Male"),
                new Person("priya", 23, "Female"),
                new Person("pravin", 55, "Male"),
                new Person("Bhavna", 49, "Female"),
                new Person("pravin", 55, "Male"),
                new Person("priya", 23, "Female")

        );
        List<Person> result3 = data2.stream().distinct().collect(Collectors.toList());
        System.out.println(result3);
        System.out.println(data2);
    }
}
