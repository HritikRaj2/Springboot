import java.util.Map;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        // elements are in sorted form
        // operations are same as hashmap
        // syntax
        Map<String, Integer> num = new TreeMap<>();
        num.put("hello", 78);
        num.put("Hello",1);
        System.out.println(num);
    }
}
