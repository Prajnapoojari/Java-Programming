class Lorry{

    Lorry(String name,int price,int size){

        System.out.println("Name :"+name);
        System.out.println("Price :"+price);
        System.out.println("Size :"+size);
    }
    Lorry(String fuel,String capacity){

        System.out.println("Fuel type:"+fuel);
        System.out.println("Capacity:"+capacity);
    }

    public void car(String name,String color,int price){

        System.out.println("Name:"+name);
        System.out.println("Color:"+color);
        System.out.println("Price:"+price);
    }
    public void bike(String name,String color){
        System.out.println("Name:"+name);
        System.out.println("Color:"+color);

    }
}


public class const2 {

    public static void main(String[] args) {

        Lorry ob=new Lorry("blue",3000,30);
        System.out.println();

        Lorry ob1=new Lorry("Disel","30L");
        System.out.println();

        ob.bike("TVS XL","Black");
        System.out.println();

        ob.car("Maruti Suzuki","White",300000);
    }
}