abstract class E5 {
    abstract void add(int a, int b);
    abstract void sub(int a, int b);
}

public class lambdaExpression1 {
    public static void main(String[] args) {
        E5 obj = new E5() {
            void add(int a, int b) {
                System.out.println("Performing addition: " + (a + b));
            }

            void sub(int a, int b) {
                System.out.println("Performing subtraction: " + (a - b));
            }
        };

        obj.add(4, 6);
        obj.sub(6, 7);
    }
}
