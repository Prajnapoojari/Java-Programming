class StudentDetails {
    int studentId;
    String studentName;
    int marks1, marks2, marks3;

    // Constructor
    StudentDetails(int studentId, String studentName, int m1, int m2, int m3) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    String calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 80)
            return "A";
        else if (avg >= 60)
            return "B";
        else if (avg >= 40)
            return "C";
        else
            return "Fail";
    }

    void displayStudentResult() {
        System.out.println("\nStudent ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
    }
}

class StudentResultApp {
    public static void main(String[] args) {
        StudentDetails student1 = new StudentDetails(101, "Anu", 78, 85, 69);
        StudentDetails student2 = new StudentDetails(102, "Ravi", 55, 62, 48);

        student1.displayStudentResult();
        student2.displayStudentResult();
    }
}
