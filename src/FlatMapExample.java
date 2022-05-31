import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("JavaDevJournal", "Java");

        List<String> collect = words.stream().map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }

}
