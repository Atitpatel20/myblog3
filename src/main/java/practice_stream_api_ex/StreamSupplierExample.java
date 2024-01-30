package practice_stream_api_ex;

import java.util.Random;
import java.util.function.Supplier;

public class StreamSupplierExample {
    public static void main(String[] args) {
        Supplier<Integer>numbers=()-> new Random().nextInt(500);
        Integer y = numbers.get();
        System.out.println(y);
    }
}
