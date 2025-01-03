abstract class Operation {
    abstract void add(int a, int b);
    abstract void multiply(int a, int b);
    abstract void sub(int a, int b);
    abstract void div(int a, int b);
}

class Operation1 extends Operation {


    void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }


    void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }


    void div(int a, int b) {
       System.out.println("Division: "+(a/b));
    }

}

public class abstract2 {
    public static void main(String[] args) {
        Operation1 obj = new Operation1();


        obj.add(4, 10);
        obj.div(10, 2);
        obj.multiply(30, 2);
        obj.sub(30, 5);
    }
}
//{
//        System.out.println("ID: "+id);
//        System.out.println("Log in Hours: "+loginHours);
//    }