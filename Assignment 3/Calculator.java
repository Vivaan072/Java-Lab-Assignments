import java.util.Scanner;

class Calculator {
    static int count = 0;

    int add(int a, int b) {
        count++;
        return a + b;
    }

    double add(double a, double b) {
        count++;
        return a + b;
    }

    static void displayCount() {
        System.out.println("Total Calculations: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Integer Sum = " + c.add(a, b));

        System.out.print("Enter two decimal numbers: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("Decimal Sum = " + c.add(x, y));

        Calculator.displayCount();
    }
}
