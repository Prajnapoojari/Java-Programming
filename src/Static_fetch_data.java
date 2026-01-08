interface P1
{
    static void Phone()
    {
        System.out.println("phone");
    }
}

public class Static_fetch_data {
    public static void main(String[] args) {
        P1.Phone();
    }
}
