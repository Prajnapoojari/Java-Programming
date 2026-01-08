
class dog1
{
    public void details1 (String name,String color,String brwd)
    {
        System.out.println("Name :"+name);
        System.out.println("color :"+color);
        System.out.println("brwd :"+brwd);

    }
}
class babydog extends dog1
{
    public void details2(String name,String color,String brwd,String gender)
    {
        System.out.println("Name :"+name);
        System.out.println("color :"+color);
        System.out.println("brwd :"+brwd);
        System.out.println("gender :"+gender);
    }
}
public class inheritance2 {
    public static void main(String[] args) {
        babydog obj=new babydog();
        obj.details1("tommy","white","jarmen");
        obj.details2("tommy","white","jarmen","male");
    }
}
