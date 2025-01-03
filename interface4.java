//interface a{
////    public void add();
////    public void sub();
////}
////interface b extends a{
////    public void multiply();
////    public void div();
////}
////class c implements b{
////    public void add(){
////        System.out.println("ADDITION");
////    }
////    public void sub(){
////        System.out.println("SUBSTRACTION");
////    }
////    public void multiply(){
////        System.out.println("MULTYplication");
////    }
////    public void div(){
////        System.out.println("DIVISION");
////    }
////}
////public class interface4 {
////    public static void main(String [] args){
////        c obj = new c();
////        obj.add();
////        obj.div();
////        obj.sub();
////        obj.multiply();
////    }
////}

interface a {
    public void add();
    public void sub();
}
class b implements a{
    @Override
    public void add() {
        System.out.println("ADDITION");
    }

    @Override
    public void sub() {
        System.out.println("SUBSTRACTION");
    }
}
class c implements a{
    @Override
    public void add(){
        System.out.println("addition");
    }
    public void sub() {
        System.out.println("substraction");
    }
}

public class interface4 {
  public static void main(String [] args) {
      b obj = new b();
      c obj1 = new c();
      obj.add();
      obj.sub();
      obj1.add();
      obj1.sub();

  }
  }
