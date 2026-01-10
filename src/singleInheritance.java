class A
{
    public void hai()
    {
        System.out.println("Hai");
    }

}
class B extends A{
    public void hello(){
        System.out.println("Hello");
    }

}

public class singleInheritance {
    public static void main (String [] args){
        A obj = new A();
        obj.hai();
        B obj1 = new B();
        obj1.hello();

    }
}
