interface Animal
{
    public void eat();
    public void travel();
}
class Mammal implements Animal{
    @Override
    public void eat() {
        System.out.println("Mammal eats");
    }

    @Override
    public void travel() {
        System.out.println("mammal travel");
    }
}


public class interface1 {
    public static void main(String[] args){
        Mammal obj = new Mammal();
        obj.eat();
        obj.travel();
    }
}
