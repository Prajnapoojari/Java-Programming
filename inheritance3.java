class car1
{
    //    car(String color)
//    {
//        System.out.println(color);
//    }
//    car(int noofwheels)
//    {
//        System.out.println(noofwheels);
//    }
    public void details1(int price,String fueltype)
    {
        System.out.println("Price :"+price);
        System.out.println("fueltype :"+fueltype);
    }
}
class BMW extends car1
{
    //    BMW(String color)
//    {
//        System.out.println(color);
//    }
//    BMW(int price)
//    {
//        System.out.println(price);
//    }
    public void details2(String model,String color)
    {
        System.out.println("model :"+model);
        System.out.println("color :"+color);
    }
}
public class inheritance3
{
    public static void main(String[] args) {
        BMW obj=new BMW();
        obj.details1(200000,"deisel");
        obj.details2("2series","black");
    }
}