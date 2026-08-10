class StudentDetails {

    String name;
    int rollNo;

    // Default Constructor
    StudentDetails() {
        name = "Not Assigned";
        rollNo = 0;
    }

    // Parameterized Constructor
    StudentDetails(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
    }

    public static void main(String[] args) {

        StudentDetails s1 = new StudentDetails();
        StudentDetails s2 = new StudentDetails("Vivaan", 101);

        System.out.println("Default Constructor");
        s1.display();

        System.out.println();

        System.out.println("Parameterized Constructor");
        s2.display();
    }
}