import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                throw new Exception("Invalid withdrawal amount");
            }

            if (amount > balance) {
                throw new Exception("Insufficient balance");
            }

            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + (balance - amount));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}