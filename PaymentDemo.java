abstract class Payment {

    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method
    abstract void makePayment();

    // Concrete method
    void displayAmount() {
        System.out.println("Payment Amount: Rs. " + amount);
    }
}

// Credit Card payment
class CreditCard extends Payment {

    String cardNumber;

    CreditCard(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    void makePayment() {
        System.out.println("Payment made using Credit Card.");
        System.out.println("Card Number: " + cardNumber);
    }
}

// UPI payment
class UPI extends Payment {

    String upiId;

    UPI(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    void makePayment() {
        System.out.println("Payment made using UPI.");
        System.out.println("UPI ID: " + upiId);
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        Payment creditCard = new CreditCard(
                2500,
                "XXXX-XXXX-1234"
        );

        Payment upi = new UPI(
                1500,
                "rahul@upi"
        );

        System.out.println("Credit Card Payment:");
        creditCard.displayAmount();
        creditCard.makePayment();

        System.out.println();

        System.out.println("UPI Payment:");
        upi.displayAmount();
        upi.makePayment();
    }
}
