package practice_stream_api_ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        // 1
        String str = "BananaB";
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        collect.entrySet().forEach(entry -> System.out.println(entry));

        // 2
        Map<Character, Long> collect1 = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        collect1.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> System.out.println(entry));

        //3
        Map<Character, Long> collect2 = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        collect2.entrySet().stream().filter(entry->entry.getValue()==1).forEach(entry-> System.out.println(entry.getKey()));

//        Map<Character, Long> collect3 = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//        Character c = collect3.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).findFirst().get();
//        System.out.println(c);
         int[]numbers={5, 9, 11,11, 2, 8, 21, 1};
        Integer secondHighest = Arrays.stream(numbers).boxed().sorted((a, b) -> Integer.compare(b, a)).distinct().skip(1).findFirst().orElse(Integer.MIN_VALUE);
        System.out.println(secondHighest);

        Integer secondLowest = Arrays.stream(numbers).boxed().sorted((a, b) -> Integer.compare(a, b)).distinct().skip(1).findFirst().orElse(Integer.MIN_VALUE);
        System.out.println(secondLowest);

        String[]names={"pune","banglore","chennai","goa"};
        String max = Arrays.stream(names).collect(Collectors.maxBy(Comparator.comparing(String::length))).get();
        String min = Arrays.stream(names).collect(Collectors.minBy(Comparator.comparing(String::length))).get();
        System.out.println(max);
        System.out.println(min);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4);
        String result = numbers1.stream()
                .map(Object::toString)
                .collect(Collectors.joining("-"));
        System.out.println(result);

        List<String> num = Arrays.asList("1","2","3","4");
        String join = String.join("-", num);
        System.out.println(join);
    }
}
