interface A1
{
    default void phone()
    {
        System.out.println("phone1");
    }
}
interface  A2
{
    default void phone()
    {
        System.out.println("phone2");
    }
}
class A3
{
    public void phone()
    {
        System.out.println("phone3");
    }
}
public class Interface_ex implements A1{
    public static void main(String[] args) {
        Interface_ex obj=new Interface_ex();
        obj.phone();
    }
}
