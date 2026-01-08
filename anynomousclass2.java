abstract class E2 {
    public abstract void add(int a, int b);
    public abstract void sub(int a, int b);
    public abstract void mul(int a, int b);
    public abstract void div(int a, int b);
}

public class anynomousclass2 {
    public static void main(String[] args) {
        E2 obj = new E2() {
            public void add(int a, int b) {
                System.out.println("Performing addition: " + (a + b));
            }

            public void sub(int a, int b) {
                System.out.println("Performing subtraction: " + (a - b));
            }

            public void mul(int a, int b) {
                System.out.println("Performing multiplication: " + (a * b));
            }

            public void div(int a, int b) {
                System.out.println("Performing division: " + (a / b));
            }
        };

        obj.add(4, 6);
        obj.sub(6, 7);
        obj.mul(2, 8);
        obj.div(9, 45);
    }
}
