//class parent{
//    public void mobile(){
//        System.out.println("Samsung");
//    }
//}
//class  child extends parent{
//    public void mobile(){
//        System.out.println("Iphone");
//    }
//}
//public class overriding {
//    public static void main(String[] args){
//        child obj = new child();
//        obj.mobile();
//
//    }
//}

class Parent {
    public Parent() {
        System.out.println("Samsung");
    }
}

class Child extends Parent {
    public Child() {
        super();
        System.out.println("iPhone");
    }
}

public class overriding {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}


