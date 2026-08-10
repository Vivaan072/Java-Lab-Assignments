import student.Student;
import faculty.Faculty;

public class CollegeManagement {
    public static void main(String[] args) {

        Student s = new Student("Vivaan", 101, "Computer Science");
        Faculty f = new Faculty("Dr. Sharma", 501, "Java Programming");

        s.displayStudent();

        System.out.println();

        f.displayFaculty();
    }
}