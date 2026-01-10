interface abc1{
    int a = 40;
    int b = 23;
    public void add();
    public void sub();
}
class def implements abc1{
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void sub() {
        System.out.println("sub");
    }
}

public class interface2 {
    public static void main(String[] args){
        def obj = new def();
        obj.add();
        obj.sub();
    }

}
