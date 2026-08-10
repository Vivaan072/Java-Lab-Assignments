package student;

public class Student {
    String name;
    int rollNo;
    String course;

    public Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public void displayStudent() {
        System.out.println("Student Details");
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Course  : " + course);
    }
}