package practice_stream_api_ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        // method 1
//        List<Employee> arrayList =  Arrays.asList(
//                new Employee(1, "manju"),
//                new Employee(2, "anand"));
//
//
//        Map<Integer, String> y = arrayList.stream()
//                .collect(Collectors.toMap(Employee::getId, Employee::getName));
//        System.out.println(y);
//
//        // Displaying the result
//        y.forEach((id, name) -> System.out.println("Employee ID: " + id + ", Employee Name: " + name));

        // method 2
//        List<Employee> x = new ArrayList<>();
//        x.add(new Employee(1,"manju"));
//        x.add(new Employee(2,"ananda"));

//        Map<Integer,String> y =x.stream()
//                .collect(Collectors.toMap(Employee::getId,Employee::getName));
//        List<Employee> numbers = Arrays.asList(
//                new Employee(1, "kamal", 15000.0),
//                new Employee(2, "manan", 25000.0)
//        );
//        Map<Double, List<Employee>> collect = numbers.stream().collect(Collectors.groupingBy(Employee :: getSalary));
//        System.out.println(collect);

//        List<Employee> x = new ArrayList<>();
//        x.add(new Employee(1, "manju", 1000.0));
//        x.add(new Employee(2, "ananda", 2000.0));
//
//        Map<Double, List<Employee>> y = x.stream()
//                .collect(Collectors.groupingBy(Employee::getSalary));
//
//        double val = x.stream().mapToDouble(str -> str.getSalary()).average().orElse(0.0);
//        System.out.println(val);
//        for (Map.Entry<Double, List<Employee>> sal : y.entrySet()) {
//            System.out.println(sal);
//        }
//        List<Employee> x = new ArrayList<>();
//
//        x.add(new Employee(1,"manju",10000.0));
//        x.add(new Employee(2,"ashish",12000.0));
//        x.add(new Employee(3,"sanju",9500.00));
//        x.add(new Employee(4,"anand",15500.0));
//        x.add(new Employee(5,"karan",8500.0));
//        List<String> z=x.stream()
//                .filter(a->a.getSalary()>10000)
//                .map(b->b.getName())
//                .collect(Collectors.toList());
//
//        System.out.println(z);
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 50000, 30));
        employees.add(new Employee(2, "Alice", 60000, 25));
        employees.add(new Employee(3, "Bob", 55000, 35));
        employees.add(new Employee(4, "Charlie", 70000, 28));

        employees.sort(
                Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getSalary)
                        .thenComparing(Employee::getAge)
                        .thenComparing(Employee::getId)
        );
        employees.forEach(System.out::println);

    }
}
