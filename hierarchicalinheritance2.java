 class Food{
    public void D1(String typeoffood,String name, String rating){
        System.out.println("Type of Food:"+typeoffood);
        System.out.println("Name: "+name);
        System.out.println("Rating: "+rating);
    }
}
class F1 extends Food{
    public void D2(String name,int price, String quantity){
        System.out.println("Name:"+name);
        System.out.println("price: "+price);
        System.out.println("Quantity : "+quantity);
    }
}
class F2 extends Food{
    public void D3(String name,int price, String quantity){
        System.out.println("Name:"+name);
        System.out.println("price: "+price);
        System.out.println("Quantity : "+quantity);
    }
}

public class hierarchicalinheritance2 {
    public static void main(String[] args){
        F1 obj = new F1();
        F2 obj1 = new F2();
        obj.D1("Lunch","Biriyani","9");
        obj.D2("Butter Chicken",300,"2KG");
        obj1.D1("Dinner","Matar Paneer","8");
        obj1.D3("Dosa",100,"3 Plate");
    }
}
