import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println(id + "  " + name + "  " + salary);
    }
}

class EmployeeManagementApp {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();it status


            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    empList.add(new Employee(id, name, salary));
                    System.out.println("Employee added successfully");
                    break;

                case 2:
                    System.out.println("\nID   Name   Salary");
                    for (Employee e : empList) {
                        e.displayEmployee();
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);

        sc.close();
    }
}
