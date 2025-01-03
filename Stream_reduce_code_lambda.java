import java.util.Arrays;
import java.util.List;

public class Stream_reduce_code_lambda {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5);
        System.out.println(values.stream().filter(i->i%2==0).map(i->i*2).reduce(0,(i,j)->i+j));
    }
}
