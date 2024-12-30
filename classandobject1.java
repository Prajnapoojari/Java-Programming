 class dog {
    String name = "munna";
    int age = 1;
    String color = "white";
}
class cat {
    String name = "munni";
    int age = 2;
    String color = "Brown";
}

public class classandobject1 {
    public static void main ( String [] args){
        dog obj1=new dog();
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.color);
        cat obj2=new cat();
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.color);
    }
}
