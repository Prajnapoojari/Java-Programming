import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Annoymous_consumer_Ex1 {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5);
        Consumer<Integer> c=new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);

            }
        };
        values.forEach(c);
    }
}
