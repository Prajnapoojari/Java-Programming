class hai  extends Thread{
    public void masters() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("Trident College");
            try {
                Thread.sleep(3000);
            } catch (Exception e){

            }

        }
    }
}
class hello extends Thread{
    public void Bachelors() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("PMV ");
            try {
                Thread.sleep(3000);
            } catch (Exception e){

            }
        }
    }
}
class hay extends Thread{
    public void inter() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("Excelsior H S");
            try {
                Thread.sleep(3000);
            } catch (Exception e){

            }
        }
    }
}
public class multythreding {
    public static void main(String[] args) {
        hai obj1 = new hai();
        hello obj2 = new hello();
        hay obj3 = new hay();
        obj3.inter();
        obj2.Bachelors();
        obj1.masters();
    }
}
