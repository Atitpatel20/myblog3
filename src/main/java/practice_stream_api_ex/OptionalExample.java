package practice_stream_api_ex;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Employee customer= new Employee(1,null,1500,10);



        List<Employee> list = Arrays.asList(
                new Employee(1, "mike", 15000, 25),
                new Employee(2, "stallin", 12000, 24),
                new Employee(3, "adam", 10500, 27),
                new Employee(4, "max", 9500, 21)
        );

        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

//        Optional<String> name = Optional.of(customer.getName());
//        System.out.println(name);

        Optional<String> name1 = Optional.ofNullable(customer.getName());
        System.out.println(name1);

        System.out.println(name1.orElseThrow(()-> new IllegalArgumentException("No name found")));

        System.out.println(name1.map(String::toUpperCase).get());

        System.out.println(name1.orElseGet(()-> "default message"));

    }

}
