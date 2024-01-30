package practice_stream_api_ex;

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
        List<Stream_Sorting_Example.Person> data2 = Arrays.asList(
                new Stream_Sorting_Example.Person("kevin", 25, "Male"),
                new Stream_Sorting_Example.Person("priya", 23, "Female"),
                new Stream_Sorting_Example.Person("pravin", 55, "Male"),
                new Stream_Sorting_Example.Person("Bhavna", 49, "Female"),
                new Stream_Sorting_Example.Person("pravin", 55, "Male"),
                new Stream_Sorting_Example.Person("priya", 23, "Female")

        );
        List<Stream_Sorting_Example.Person> result3 = data2.stream().distinct().collect(Collectors.toList());
        System.out.println(result3);
        System.out.println(data2);
    }
}
