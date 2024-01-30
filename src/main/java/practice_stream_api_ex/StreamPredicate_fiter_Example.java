package practice_stream_api_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPredicate_fiter_Example {
    public static void main(String[] args) {
        // Q-1 Given a list of strings, filter out strings with a length less than 5.
        List<String> data1 = Arrays.asList("apple", "banana", "mango", "orange");
        List<String> result1 = data1.stream().filter(str -> str.length() > 5).collect(Collectors.toList());
        System.out.println(result1);

        //  Q-2 Given a list of Person objects, filter out persons older than 30.
        List<Stream_Sorting_Example.Person> data2 = Arrays.asList(
                new Stream_Sorting_Example.Person("kevin", 25, "Male"),
                new Stream_Sorting_Example.Person("pravin", 55, "Male"),
                new Stream_Sorting_Example.Person("Bhavna", 49, "Female"),
                new Stream_Sorting_Example.Person("priya", 23, "Female")
        );
        List<Stream_Sorting_Example.Person> result2 = data2.stream().filter(str -> str.getAge() < 30).collect(Collectors.toList());
        System.out.println(result2);



        // Q-3 Given a list of strings, filter out strings starting with the letter 'a'.
      List<String>data3=  Arrays.asList("apple", "banana", "mango", "orange","mango");
        List<String> result3 = data3.stream().filter(str -> str.startsWith("a")).collect(Collectors.toList());
        List<String> result4 = data3.stream().filter(str -> str.equals("mango")).collect(Collectors.toList());
        List<String> result5 = data3.stream().filter(str -> str.endsWith("e")).collect(Collectors.toList());

        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        // Q-4 Given a list of Person objects, filter out females.
        List<Stream_Sorting_Example.Person> people= Arrays.asList(
                new Stream_Sorting_Example.Person("kevin", 25, "Male"),
                new Stream_Sorting_Example.Person("pravin", 55, "Male"),
                new Stream_Sorting_Example.Person("Bhavna", 49, "Female"),
                new Stream_Sorting_Example.Person("priya", 23, "Female")
        );
        List<Stream_Sorting_Example.Person> result6 = people.stream().filter(str -> str.getGender().equals("Male")).collect(Collectors.toList());
        System.out.println(result6);


        // Q-5 Scenario: Filter a list of integers to include only those between 20 and 50.
        List<Integer> integers = Arrays.asList(10, 20, 25, 30, 35, 40, 50, 60, 70, 80);
        List<Integer> result7 = integers.stream().filter(i -> i > 20 && i < 50).collect(Collectors.toList());
        System.out.println(result7);


        // Q-6 Combine two conditions to filter out strings starting with "A" and having a length greater than 3.
        List<String> data6 = Arrays.asList("atit", "chirag", "jainil", "priyank", "jay");
        List<String> result8 = data6.stream().filter(str -> str.startsWith("a") && str.length() > 3).collect(Collectors.toList());
        List<String> daata8 = data6.stream().filter(str -> str.equals("chirag")).collect(Collectors.toList());
        List<String> data9 = data6.stream().filter(str -> str.endsWith("k")).collect(Collectors.toList());
        System.out.println(result8);
        System.out.println(daata8);
        System.out.println(data9);


        // Q-7 Given a list of integers, filter out the even numbers.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result9 = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(result9);

        // Q-8 Given a list of integers, filter out the odd numbers.
        List<Integer> data8 = Arrays.asList(11, 25, 20, 22, 36, 21);
        List<Integer> oddNumbers = data8.stream().filter(y -> y % 2 != 0).collect(Collectors.toList());
        System.out.println(oddNumbers);


        // Q-1find the length of given string is >5
        Predicate<String> val= str->str.length()>5;
        boolean val1 = val.test("manthan");
        System.out.println(val1);


        // Q-2 find the string has contain "a" of given string
        Predicate<String >val2=str->str.contains("a");
        boolean val3 = val2.test("keshav");
        System.out.println(val3);


        // Q-3 find the string os emplty or not  of given string
        Predicate<String> val4=str->str.isEmpty();
        boolean val5 = val4.test("testing");
        System.out.println(val5);

    }
}
