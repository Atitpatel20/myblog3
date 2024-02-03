package practice_stream_api_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_example {
    public static void main(String[] args) {
//       Consumer<Integer>val= names-> System.out.println(names);
//       val.accept(100);

        List<String> names = Arrays.asList("mike", "stallin", "adam");
       Consumer<String>data= name-> System.out.println(name);
       names.forEach(data);

//        Consumer<Integer>val1= data1-> System.out.println(data1);
//        val1.accept(10);
//
//        List<Integer>list=Arrays.asList(1,2,3,4,5);
//        list.stream().forEach(val1);
    }
}
