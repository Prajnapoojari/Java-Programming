class X {
    public void m1(){
        System.out.println(("Parent class"));
    }
}
class Y extends X {
    public void m2(){
        System.out.println(("Chuild1 class"));
    }
}
class Z extends X{
    public void m3(){
        System.out.println(("Child2 class"));
    }
}
public class hierarchicalinheritance {
    public static void main(String[] args){
        Y obj = new Y();
        Z obj1 = new Z();
        obj.m2();
        obj.m1();
        obj1.m3();
        obj1.m1();

    }
}
