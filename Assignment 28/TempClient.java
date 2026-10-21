
import java.rmi.registry.*;
import java.util.Scanner;

public class TempClient {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);

        TempService service =
            (TempService) registry.lookup("Temperature");

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (choice == 1) {
            System.out.println("Fahrenheit: "
                + service.celsiusToFahrenheit(temp));
        } else if (choice == 2) {
            System.out.println("Celsius: "
                + service.fahrenheitToCelsius(temp));
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
