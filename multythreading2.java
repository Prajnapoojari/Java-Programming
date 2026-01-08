class hai1  implements Runnable{
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("Trident College");
            try {
                Thread.sleep(3000);
            } catch (Exception e){

            }

        }
    }
}
class hello1 implements Runnable{
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("PMV ");
            try {
                Thread.sleep(3000);
            } catch (Exception e){

            }
        }
    }
}

public class multythreading2 {
    public static void main(String[] args) {
       Runnable obj1 = new hai1();
       Runnable obj2 = new hello1();

       Thread t1 = new Thread(obj1);
       Thread t2 = new Thread(obj2);

       t1.run();
       t2.run();
    }
}
