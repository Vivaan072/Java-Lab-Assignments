import java.util.Scanner;

class UnderAgeException extends Exception {
    UnderAgeException(String message) {
        super(message);
    }
}

public class VotingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new UnderAgeException("You are not eligible to vote.");
            } else {
                System.out.println("You are eligible to vote.");
            }
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}