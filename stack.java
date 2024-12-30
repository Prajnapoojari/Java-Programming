import java.util.Stack;


public class stack {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        num.push(1);
        num.push(2);
        num.push(3);
        num.push(4);
        num.push(5);

        num.clear();

        System.out.println(num);
    }
}