package practice_stream_api_ex;

import java.util.*;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
//        List<Integer> integers = Arrays.asList(1, 3, 5, 7, 9, 13, 15);
//
//        // without using stream api
//        int sum = 0;
//        for (int no : integers) {
//            sum = no + sum;
//        }
//        System.out.println(sum);
//
//        // by using mapTOInt method
//        int sum1 = integers.stream().mapToInt(i -> i).sum();
//        System.out.println(sum1);
//
//        // by using reduce method sum of all value
//        Integer reduce = integers.stream().reduce(0, (a, b) -> (a + b));
//        System.out.println(reduce);
//
//        // by using reduce method reference sum of all value
//        Optional<Integer> reduceSum = integers.stream().reduce(Integer::sum);
//        System.out.println(reduceSum);
//
//        // by using reduce method multiply of all value
//        Integer reduceMultiply = integers.stream().reduce(1, (a, b) -> (a * b));
//        System.out.println(reduceMultiply);
//
//        // by using reduce method find max value
//        Integer maxVal = integers.stream().reduce(0, (a, b) -> a > b ? a : b);
//        System.out.println(maxVal);
//
//        // by using reduce method find min value
//        Integer minVal = integers.stream().reduce(0, (a, b) -> a < b ? a : b);
//        System.out.println(minVal);

//        List<String> word = Arrays.asList("coreJava", "spring", "hibernet");
//        String s = word.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
//        System.out.println(s);

//        List<String> words = Arrays.asList("adam", "neel", "kav", "tith");
//        String s = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
//        System.out.println(s);

        //get employeee whose age is 15
        //get employeee salary average

        List<Employee> employees = Arrays.asList(
                new Employee(1, "mike", 12500, 15),
                new Employee(2, "stallin", 8500, 10),
                new Employee(3, "adam", 10500, 15),
                new Employee(4, "max", 9500, 10),
                new Employee(5, "jack", 7500, 15)
        );

//        double result = employees.stream()
//                .filter(emp-> emp.getAge()==(15&10))
//                .map(emp-> emp.getSalary())
//                .mapToDouble(i -> i)
//                .average().getAsDouble();
//        System.out.println(result);

//        double sum = employees.stream().filter(emp -> emp.getAge() == 10)
//                .map(emp -> emp.getSalary())
//                .mapToDouble(i -> i)
//                .sum();
//        System.out.println(sum);

        Map<Integer, Optional<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.getAge(), Collectors.maxBy(Comparator.comparing(e -> e.getSalary()))));
        for (Map.Entry<Integer, Optional<Employee>> entry : collect.entrySet()) {
            Integer age = entry.getKey();
            System.out.println("age: " + age + " " +"max salary: "+ entry.getValue().get().getSalary());
        }

    }
}
