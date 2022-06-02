import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IterateOverListsManyWays {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Robson", "Isabela", "Valeria");

//        for (int i = 0; i < list.size(); i++) { // Old way
//            System.out.println(list.get(i));
//        }
//
//        for (String eachName : list) { // Somewhat a better way, an implicit for loop, doen't need to take care o variables
//            System.out.println(eachName);
//        }

//        list.forEach(new Consumer<String>() { // With anonymous class
//            @Override
//            public void accept(String s) {
//                System.out.println("Oi " + s);
//            }
//        });

//        list.forEach((final String name) -> System.out.println(name)); // way better, but uses parameter type and name

//        list.forEach((name) -> System.out.println(name)); // The compiler can infer the type
//        list.forEach(name -> System.out.println(name)); // If there is only one parameter, we can omit the parenthesis

        list.forEach(System.out::println); // Method Reference ::

    }

}
