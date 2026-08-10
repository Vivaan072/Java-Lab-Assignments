interface Printable {

    void printDetails();
}

class PrintableStudent implements Printable {

    String name;
    int rollNumber;
    String course;

    PrintableStudent(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    public void printDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

class PrintableEmployee implements Printable {

    String name;
    int employeeId;
    String department;

    PrintableEmployee(String name, int employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class PrintableDemo {

    public static void main(String[] args) {

        Printable student = new PrintableStudent(
                "Rahul",
                101,
                "Computer Science"
        );

        Printable employee = new PrintableEmployee(
                "Amit",
                501,
                "IT"
        );

        student.printDetails();

        System.out.println();

        employee.printDetails();
    }
}
