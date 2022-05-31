import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Oi", "meu", "chapa");

        List<Integer> collect = words.stream().map(String::length).collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
