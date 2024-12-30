import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class linkedHashSet {
    public static void main(String[] args) {

//        Set<Integer> num = new TreeSet<>();
//        num.add(4);
//        num.add(92);
//        num.add(14);
//        num.add(56);
//        num.add(10);
//        System.out.println(num);
        Set<String>fruits = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        System.out.println(fruits);
    }
}