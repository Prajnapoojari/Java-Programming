public class exception2 {
    public static void main(String[] args) {
        int [] array = new int[4];
        int a = 8;
        int b = 0;
        try{
            System.out.println(a/b);
            for (int i =0;i<=4; i++){
                System.out.println(array[i+1]);
            }
        }
        catch(ArithmeticException e){
            System.out.println("devide by zero is not acceptable");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array size is exceeding"+e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
