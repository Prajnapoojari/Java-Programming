class E {
    public void add(){
        System.out.println("Addition");
    }
    class F{
        public void sub(){
            System.out.println("Substraction");
        }
    }
}
public class nestedclass {
    public static void main(String[] args) {
        E obj = new E();
        E.F obj1 = obj.new F();
        obj.add();
        obj1.sub();
    }
}
