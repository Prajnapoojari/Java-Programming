
import java.util.LinkedList;
import java.util.Queue;


public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(8);
        queue.add(4);
        queue.add(1);
        queue.add(12);
        System.out.println("Removed element: "+queue.poll());
        System.out.println("Front element: "+queue.peek());

    }
}
