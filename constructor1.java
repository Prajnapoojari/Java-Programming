class abc
{
    abc(int a ,int b ){
       System.out.println(a + b);
    }
}

public class constructor1 {
    public static void main(String[] args){
        abc obj = new abc(3,8);
    }
}
