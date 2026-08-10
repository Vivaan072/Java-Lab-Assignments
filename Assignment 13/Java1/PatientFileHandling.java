import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class PatientFileHandling {
    public static void main(String[] args) {

        // Writing patient details to the file
        try {
            FileWriter writer = new FileWriter("patient.txt");

            writer.write("Patient ID: 201\n");
            writer.write("Name: Amit Patil\n");
            writer.write("Age: 35\n");
            writer.write("Diagnosis: Fever\n");

            writer.close();

            System.out.println("Patient details written to file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }

        // Reading patient details from the file
        try {
            FileReader reader = new FileReader("patient.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            System.out.println("\nPatient Details:");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}