// lambda interface will work only for functional interface, that means ointerface include only single line
@FunctionalInterface
interface E4 {
    int add(int a, int b);

}

//public class lambdaExpression{
//    public static void main(String[] args) {
//        E4 obj = (a, b) -> System.out.println("Performing addition: " + (a + b));
//        obj.add(4, 6);
//
//
//    }
//}
public class lambdaExpression{
    public static void main(String[] args) {
        E4 obj = (a,b) -> (a+b);
        int r = obj.add(4, 6);
        System.out.println(r);
    }
}
