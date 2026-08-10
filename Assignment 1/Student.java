class Student {

    int rollNo;
    String name;
    double marks;

    Student() {
        rollNo = 0;
        name = "Unknown";
        marks = 0.0;
    }

    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
    }

    void checkResult() {
        if (marks >= 40)
            System.out.println("Result : Pass");
        else
            System.out.println("Result : Fail");
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("Student 1 Details");
        s1.display();
        s1.checkResult();

        System.out.println();

        Student s2 = new Student(101, "Rahul", 85.5);

        System.out.println("Student 2 Details");
        s2.display();
        s2.checkResult();
    }
}
