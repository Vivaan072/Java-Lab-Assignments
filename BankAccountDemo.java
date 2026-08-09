class BankAccount {

    // Final variable
    final long accountNumber;

    String accountHolder;
    double balance;

    BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Final method
    final void displayAccountDetails() {
        System.out.println("Bank Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs. " + balance);
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                1234567890L,
                "Rahul",
                25000
        );

        account.displayAccountDetails();

        // account.accountNumber = 9876543210L;
        // Error: cannot assign a value to final variable
    }
}
