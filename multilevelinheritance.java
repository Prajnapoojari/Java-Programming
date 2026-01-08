class P
{
    public void hai()
    {
        System.out.println("hai");
    }
}
class Q extends P
{
    public void hello() {
        System.out.println("hello");
    }
}
class R extends Q
{
    public void how(){
        System.out.println("how");
    }
}
public class multilevelinheritance {
    public static void main(String[] args)
    {
        R obj = new R();
        obj.how();
        obj.hello();
        obj.hai();
    }
}
