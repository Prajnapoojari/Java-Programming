abstract class workdetails {

    workdetails(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    abstract void officeWorkDetails(int id, int loginHours);
}

class work1 extends workdetails {

    work1(String name, int age) {
        super(name, age);
    }


    void officeWorkDetails(int id, int loginHours) {
        System.out.println("ID: " + id);
        System.out.println("Log in Hours: " + loginHours);
    }


    void personalworkdetails(int loginhours, int sleepinghours) {
        System.out.println("Log in Hours: " + loginhours);
        System.out.println("Sleeping Hours: " + sleepinghours);
    }
}

public class abstract3 {
    public static void main(String[] args) {

        work1 obj = new work1("Rajib Ranjan Sahoo", 22);


        obj.officeWorkDetails(209, 8);
        obj.personalworkdetails(8, 9);
    }
}
