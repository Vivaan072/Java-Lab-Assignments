import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n----- TO-DO LIST -----");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task Added Successfully.");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No Tasks Available.");
                    } else {
                        StringBuffer sb = new StringBuffer();
                        sb.append("\nYour Tasks:\n");

                        for (int i = 0; i < tasks.size(); i++) {
                            sb.append((i + 1) + ". " + tasks.get(i) + "\n");
                        }

                        System.out.println(sb);
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
