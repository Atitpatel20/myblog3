package practice_stream_api_ex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrupByExample {
    public static void main(String[] args) {
//        List<Food> foods = Arrays.asList(
//                new Food("veg", "panneer", 150),
//                new Food("nonVeg", "cheekan", 180),
//                new Food("veg", "dalfry", 100),
//                new Food("nonVeg", "fish", 125),
//                new Food("veg", "manchurian", 80),
//                new Food("nonveg", "chickenRice", 80)
//        );
//        Map<String, List<Food>> collect = foods.stream().collect(Collectors.groupingBy(str -> str.getFood()));
//
//        for (Map.Entry<String,List<Food>> entry : collect.entrySet()){
//            String food = entry.getKey();
//            List<Food> menu = entry.getValue();
//            System.out.println("food: "+food+"---");
//            for (Food m :menu ) {
//                System.out.println(m.getFoodName());
//                System.out.println(m.getPrice());
//            }
//        }
//
        List<String> names = Arrays.asList("mike", "adam", "stallin", "sam");
        Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(str -> str.length()));


    }
}
