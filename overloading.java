class demo2
{
    demo2 (int a,int b){
        System.out.println(a+b);
    }

    demo2 (int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class overloading {
    public static void main(String[] args){
//        demo2 obj=new demo2();
//        obj.add(6,3);
//        obj.add(8,2,6);
        demo2 obj = new demo2(3,4);
        demo2 obj1 = new demo2(3,4,6);
    }
}
