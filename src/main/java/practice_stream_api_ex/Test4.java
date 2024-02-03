package practice_stream_api_ex;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees(1, "mike", 21, "Store", 12500),
                new Employees(2, "adam", 23, "production", 10500),
                new Employees(3, "stallin", 27, "Store", 13500),
                new Employees(4, "mac", 26, "office", 11000),
                new Employees(5, "jack", 20, "production", 14500)
        );
// print the employee list using stream
//        employees.stream()
//                .forEach(emp-> System.out.println(emp));

        // find the employees whose salary is >13000
//        employees.stream().filter(str->str.getSalary()>13000).forEach(System.out::print);

        // print the name of employee in store depatment
//        employees.stream().filter(str->str.getDeprtment()
//                .equalsIgnoreCase("Store"))
//                .map(str->str.getName()).
//                forEach(System.out::println);

        // print the name of emp who has highest salary
//        String maxSalary = employees.stream()
//                .max(Comparator.comparing(emp -> emp.getSalary()))
//                .map(str -> str.getName())
//                .get();
//        System.out.println(maxSalary);
//
//        // print the name of emp who got min salary
//        String minSalary = employees.stream().min(Comparator.comparing(str -> str.getSalary())).map(str -> str.getName()).get();
//        System.out.println(minSalary);

        // Remove the duplicate department print the unique departmwt
//          employees.stream().map(emp->emp.getDeprtment()).distinct().forEach(emp-> System.out.println(emp));

        //sort the employees based on name
//        employees.stream().map(emp->emp.getName()).sorted().forEach(str-> System.out.println(str));

        //sort the employees based on name descending
//        employees.stream().map(emp->emp.getName()).sorted(Comparator.reverseOrder()).forEach(str-> System.out.println(str));

        // sort the employees based on department and name
//        List<Employees> collect = employees.stream()
//                .sorted(Comparator.comparing(Employees::getDeprtment)
//                        .thenComparing(Employees::getName))
//                .collect(Collectors.toList());
//        System.out.println(collect);

        // print the number of employee in each departmet
//        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(str -> str.getDeprtment(), Collectors.counting()));
//        for (Map.Entry<String, Long> entry : collect.entrySet()) {
//            System.out.println(entry.getKey() + entry.getValue());
//        }

        // print the duplicate department
//        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(emp -> emp.getDeprtment(), Collectors.counting()));
//        collect.entrySet().stream().filter(emp->emp.getValue()>1).map(emp->emp.getKey()).forEach(System.out::println);


        // write a program to print employee working in each department
//        Map<String, List<Employees>> collect = employees.stream().collect(Collectors.groupingBy(Employees::getDeprtment));
//        System.out.println(collect);

        // write a program to print employee count working in ecah department
       //employees.stream().collect(Collectors.groupingBy(Employees::getDeprtment),Collectors.counting());

      //  System.out.println(count);

//        // write a program to print in store dept & roduction department
//        List<Employees> store = employees.stream().filter(str -> str.getDeprtment().equals("Store")).collect(Collectors.toList());
//        System.out.println(store);

        // write a program to print in production dept & roduction department
//        employees.stream().filter(str->str.getDeprtment().equals("production")).forEach(System.out::println);

//         write a program to print max salary of an employee from each dept
        Map<String, Optional<Employees>> collect = employees.stream().
                collect(Collectors.groupingBy(str -> str.getDeprtment(), Collectors.maxBy(Comparator.comparing(str -> str.getSalary()))));
        collect.entrySet().forEach(entry-> System.out.println(entry.getKey()+" "+entry .getValue() .get(). getSalary()));
        System.out.println(collect);

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        passwordEncoder.encode("testing");

    }
}
