import java.util.ArrayList;
import java.util.Scanner;

public class CourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n----- COURSE REGISTRATION -----");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Course Name: ");
                    String course = sc.nextLine();
                    courses.add(course);
                    System.out.println("Course Registered Successfully.");
                    break;

                case 2:
                    System.out.print("Enter Course Name to Remove: ");
                    String removeCourse = sc.nextLine();

                    if (courses.remove(removeCourse))
                        System.out.println("Course Removed Successfully.");
                    else
                        System.out.println("Course Not Found.");
                    break;

                case 3:
                    if (courses.isEmpty()) {
                        System.out.println("No Courses Registered.");
                    } else {
                        StringBuffer sb = new StringBuffer();
                        sb.append("\nRegistered Courses:\n");

                        for (int i = 0; i < courses.size(); i++) {
                            sb.append((i + 1) + ". " + courses.get(i) + "\n");
                        }

                        System.out.println(sb);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
