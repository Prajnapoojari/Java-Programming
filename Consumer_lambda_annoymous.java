import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Consumer_lambda_annoymous
{
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5);
        Consumer<Integer> c= i ->System.out.println(i);
        values.forEach(c);
    }
}


