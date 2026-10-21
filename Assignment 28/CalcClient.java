
import java.rmi.registry.*;
import java.util.Scanner;

public class CalcClient {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);

        CalcService service =
            (CalcService) registry.lookup("Calculator");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition: " + service.add(a, b));
        System.out.println("Subtraction: " + service.subtract(a, b));
        System.out.println("Multiplication: " + service.multiply(a, b));

        if (b != 0)
            System.out.println("Division: " + service.divide(a, b));
        else
            System.out.println("Division: Cannot divide by zero");

        sc.close();
    }
}

