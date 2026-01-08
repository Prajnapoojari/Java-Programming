@FunctionalInterface
interface E10 {
    void name(String firstname, String lastname);
}

public class lambdaExpression2 {
    public static void main(String[] args) {
        E10 obj = (firstname, lastname) -> System.out.println("Full Name: " + firstname + " " + lastname);
        obj.name("Rajib", "Sahoo");
    }
}
