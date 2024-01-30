package practice_stream_api_ex;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

//        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 40, 50, 60, 70, 70, 80, 90, 90, 100);
//
//        Set<Integer> uniqueNumbers = new HashSet<>();
//        List<Integer> collect = numbers.stream()
//                .filter(n -> !uniqueNumbers.add(n))
//                .collect(Collectors.toList());
//
//        System.out.println("Duplicate numbers: " + collect);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10, 11, 11);
//        Set<Integer>val=new HashSet<>();
//        List<Integer> collect = numbers.stream().filter(x -> !val.add(x)).collect(Collectors.toList());
//        System.out.println(collect);

//        List<Integer> numbrs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        int sum = numbrs.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum);
//
//
//        String inputString = "programming";
//
//        // Using a Set to store repeated characters
//        Set<Character>nonRepaetedCharectors= new HashSet<>();
//        Set<Character>repaetedCharectors= new HashSet<>();
//        for (Character  ch:inputString.toCharArray() ) {
//            if (!nonRepaetedCharectors.add(ch)) {
//                repaetedCharectors.add(ch);
//            }
//        }
//            System.out.println("Repeated characters");
//            for ( Character x: repaetedCharectors) {
//                System.out.println(x);
//            }
//
//        List<Integer> integers = Arrays.asList(10, 20, 30, 40, 50, 60);
//        Optional<Integer> max = integers.stream().max(Integer::compareTo);
//        System.out.println(max);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
//        System.out.println(average);

//        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        OptionalDouble average1 = num.stream().mapToDouble(Integer::doubleValue).average();
//        System.out.println(average1);

        Map<Integer, Double> employeeSalaries = new HashMap<>();
        employeeSalaries.put(101, 50000.0);
        employeeSalaries.put(102, 60000.0);
        employeeSalaries.put(103, 75000.0);
        employeeSalaries.put(104, 80000.0);
        employeeSalaries.put(105, 55000.0);

        // Displaying salaries of employees
        System.out.println("Salaries of Employees:");
        for (Map.Entry<Integer, Double> entry : employeeSalaries.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Salary: $" + entry.getValue());
        }
    }
}




