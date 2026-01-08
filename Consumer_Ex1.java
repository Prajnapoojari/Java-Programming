import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class demo3 implements Consumer<Integer>
{
    public void accept(Integer i)
    {
        System.out.println(i);
    }
}

public class Consumer_Ex1 {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5);
        Consumer<Integer> c=new demo3();
        values.forEach(c);
    }
}
