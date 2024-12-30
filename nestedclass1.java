class D1 {
    public void person(String name, int age) {
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }

    class D2 {
        public void emp(String name, int id, double salary) {
            System.out.println("Name is : " + name);
            System.out.println("ID is : " + id);
            System.out.println("Salary is : " + salary);
        }

        public void dep(String name, int id) {
            System.out.println("Name is : " + name);
            System.out.println("ID is : " + id);
        }

        public void hr(String name, String location) {
            System.out.println("Name is : " + name);
            System.out.println("Location is  : " + location);
        }
    }
}

public class nestedclass1 {
    public static void main(String[] args) {
        D1 obj = new D1();
        D1.D2 obj1 = obj.new D2();
        obj.person("Rajib", 22);
        obj1.emp("Rajib", 70, 100000);
        obj1.dep("JAVA Fillstack", 34);
        obj1.hr("Priyanka", "Bengaluru");
    }
}
