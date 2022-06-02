import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaMathDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Double> discounted = list.stream()
                .map(n -> n * 0.9)
                .collect(Collectors.toList());
        discounted.forEach(System.out::println);
    }
}
