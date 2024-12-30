class animal{
    public void details1(String color,String typeoffood){
        System.out.println("Color"+color);
        System.out.println("Type of Food"+typeoffood);
    }
}
class dog0 extends animal{
    public void details2(String name,String breed,String color){
        System.out.println("Name:"+name);
        System.out.println("Breed: "+breed);
        System.out.println("Color"+color);
    }
}
class babydog1 extends dog0{
    public void details3(String name,String breed,String color,String gender){
        System.out.println("Name:"+name);
        System.out.println("Breed: "+breed);
        System.out.println("Color"+color);
        System.out.println("Gender :"+gender);
    }
}

public class multilevelinheritance2 {
    public static void main(String[] args){
        babydog1 obj = new babydog1();
        obj.details1("White","Solid");
        obj.details2("Rocky","labrador","Grey");
        obj.details3("Lucky","Ger ","black","Male");

    }
}
