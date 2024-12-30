// Multiple inheritance using interface
interface Swimmer{
    void swim();
}
interface flyer{
    void fly();
}
class bird implements Swimmer,flyer{
    @Override
    public void swim() {
        System.out.println("Bird Swimming");
    }

    public void fly() {
        System.out.println("Bird flying");
    }
}
public class interface3 {
    public static void main(String[]args){
        bird obj = new bird();
        obj.fly();
        obj.swim();
    }
}
