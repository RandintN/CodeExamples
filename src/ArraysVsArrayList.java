import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysVsArrayList {
    public static void main(String[] args) {

        // Arrays: Fixed Size, No Generics, can be primitives
        String[] friendsArrayDeclared = new String[4];
        String[] friendsArrayInitialized = {"Fulano", "Beltrano", "Siclano"};
        friendsArrayInitialized[0] = "Carl";

        for (String s : friendsArrayInitialized) {
            System.out.println(s);
        }

        System.out.println(friendsArrayInitialized[0]); // Returns first element
        System.out.println(friendsArrayDeclared[0]); // return null
        System.out.println(friendsArrayDeclared.length); // return null

        // ArrayList: Dynamic Size(Grows and Shrinks automatically), can use Generics<>, only objects, primitives not allowed
        List<String> friendsArrayListDeclared = new ArrayList<>();
        List<String> friendsArrayListInitialized = new ArrayList<>(Arrays.asList("Fulano", "Siclano", "Beltrano"));
        friendsArrayListInitialized.add("John");

        //
        System.out.println(friendsArrayListInitialized.get(0));
        System.out.println(friendsArrayListInitialized.size());

        System.out.println(friendsArrayListInitialized.get(friendsArrayListInitialized.size() - 1));
        friendsArrayListInitialized.set(1, "Richard");


        friendsArrayListInitialized.remove(friendsArrayListInitialized.size() - 1);
        friendsArrayListInitialized.remove("Beltrano");
        friendsArrayListInitialized.forEach(System.out::println);

        System.out.println(friendsArrayListInitialized);
    }
}
