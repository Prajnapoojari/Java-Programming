class car {
    String name = "Defender";
    String color = "Black";
    int price = 20000000;
    String fuelType = "Petrol";
}
class Bike {
    String name = "Meteor 650";
    String color = "Black";
    int price = 400000;
    String fuelType = "Petrol";
}

class mobile {
    String name = "galexy S24";
    String color = "Black";
    int price = 200000;
    int RAM = 16;
    int ROM = 2;
}

public class Example {
    public static void main(String[] args) {
        car obj1 = new car();
        System.out.println(obj1.name);
        System.out.println(obj1.color);
        System.out.println(obj1.price);
        System.out.println(obj1.fuelType);
        Bike obj2 = new Bike();
        System.out.println(obj2.name);
        System.out.println(obj2.color);
        System.out.println(obj2.price);
        System.out.println(obj2.fuelType);
        mobile obj3 = new mobile();
        System.out.println(obj3.name);
        System.out.println(obj3.color);
        System.out.println(obj3.price);
        System.out.println(obj3.RAM);
        System.out.println(obj3.ROM);
    }
}
