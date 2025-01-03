import java.util.TreeSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class queue2 {
    public static void main(String[] args) {
        Set<Integer> num = new TreeSet<>();
        num.add(4);
        num.add(92);
        num.add(14);
        num.add(56);
        num.add(10);


        List<Integer> numList = new ArrayList<>(num);


        for (int i = 0; i < numList.size(); i++) {
            System.out.println("Index " + i + ": " + numList.get(i));
        }
    }
}
