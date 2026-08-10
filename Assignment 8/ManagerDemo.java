class Employee {

    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: Rs. " + salary);
    }
}

class Manager extends Employee {

    String department;

    Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    void displayManagerDetails() {
        System.out.println("Manager Details:");
        
        // Accessing parent class variables using super
        System.out.println("Name: " + super.name);
        System.out.println("Employee ID: " + super.employeeId);
        System.out.println("Salary: Rs. " + super.salary);
        System.out.println("Department: " + department);

        // Calling parent class method using super
        System.out.println("\nEmployee Details:");
        super.displayDetails();
    }
}

public class ManagerDemo {

    public static void main(String[] args) {

        Manager manager = new Manager(
                "Rahul", 101, 75000, "IT"
        );

        manager.displayManagerDetails();
    }
}