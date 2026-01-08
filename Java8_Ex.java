import java.util.Arrays;
import java.util.List;

public class Java8_Ex {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(11,12,13,14);
        values.forEach(i -> System.out.println(i));

    }
}
