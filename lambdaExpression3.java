interface Y1
{
    int mul(int a,int b,int c);
}
public class lambdaExpression3 {
    public static void main(String[] args) {
        Y1 obj =(a,b,c) -> (a*b*c);
        int r=obj.mul(6,2,7);
        System.out.println(r);
    }
}