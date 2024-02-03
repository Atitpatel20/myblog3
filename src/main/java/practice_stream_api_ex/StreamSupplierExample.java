package practice_stream_api_ex;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class StreamSupplierExample {
    public static void main(String[] args) {
//        Supplier<Integer>numbers=()-> new Random().nextInt(500);
//        Integer y = numbers.get();
//        System.out.println(y);

//        Supplier<String>val=()-> {
//            return "Hello";
//        };
//        System.out.println(val.get());

        // we can also write this as per below without returning statement

        Supplier<String>val=()-> "Hello";
      //  System.out.println(val.get());
        List<String> list = Arrays.asList("a","b");
        System.out.println(list.stream().findAny().orElseGet(val));
    }
}
