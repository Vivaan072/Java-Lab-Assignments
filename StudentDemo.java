class Student {

    int rollNo;
    String name;
    double marks;

    // Default Constructor
    Student() {
        rollNo = 0;
        name = "Not Assigned";
        marks = 0.0;
    }

    // Parameterized Constructor
    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    // Method
    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student(101, "Vivaan", 92.5);

        System.out.println("Student 1 Details");
        s1.display();

        System.out.println();

        System.out.println("Student 2 Details");
        s2.display();
    }
}