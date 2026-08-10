import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EmployeeFileHandling {
    public static void main(String[] args) {

        // Writing employee details to the file
        try {
            FileWriter writer = new FileWriter("employee.txt");

            writer.write("Employee ID: 101\n");
            writer.write("Name: Rahul Sharma\n");
            writer.write("Department: Computer Science\n");
            writer.write("Salary: 50000\n");

            writer.close();

            System.out.println("Employee details written to file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }

        // Reading employee details from the file
        try {
            FileReader reader = new FileReader("employee.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            System.out.println("\nEmployee Details:");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}