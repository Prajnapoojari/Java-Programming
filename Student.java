public class Student {
    String name;
    int age;


     Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void Example3(int id, String name, String branch) {
        System.out.println("Student Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Registered Name: " + this.name);
        System.out.println("Registered Age: " + this.age);
    }


    public static void main(String[] args) {

        Student student = new Student("Rajib", 22);


        student.Example3(101, "Rajib Ranjan", "Computer Science");
    }
}

