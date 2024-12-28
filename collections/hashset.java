import java.util.Set;
import java.util.TreeSet;

public class hashset {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        //Set<Integer> set1 = new HashSet<>();
        //Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(23);
        set1.add(76);
        set1.add(13);
        // System.out.println(set1);
        for (Integer nm : set1) {
            System.out.println(nm);
        }
    }
}
