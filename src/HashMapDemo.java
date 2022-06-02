import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapDemo {
    public static void main(String[] args) {
        // HashMap doesn't care about order
        // if order is important for the useCase, use LinkedHashMap instead
        var dictionary = new HashMap<String, String>();
        dictionary.put("Brave","Acts with intelligent regardless of fear");
        dictionary.put("Brilliant","Acts with intelligent regardless of fear");
        dictionary.put("Joy","Acts with intelligent regardless of fear");
        dictionary.put("Confidence","Acts with intelligent regardless of fear");

//        dictionary.forEach((k, v) -> System.out.println( k + v));

//        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

        // TreeMap maintains natural order
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Brave","Acts with intelligent regardless of fear");
        treeMap.put("Brilliant","Acts with intelligent regardless of fear");
        treeMap.put("Joy","Acts with intelligent regardless of fear");
        treeMap.put("Confidence","Acts with intelligent regardless of fear");
        treeMap.put("Attitude","Starts action at the right time");

        treeMap.forEach((k, v) -> System.out.println(k + v));
    }

}
