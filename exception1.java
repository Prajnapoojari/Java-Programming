public class exception1 {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;
        try{
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Rajib");
        }
    }
}
