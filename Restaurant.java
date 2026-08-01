import java.util.Scanner;

public class Restaurant {

    static int totalOrders = 0;

    double bill(double amount) {
        totalOrders++;
        return amount;
    }

    double bill(double amount, double packingCharge) {
        totalOrders++;
        return amount + packingCharge;
    }

    double bill(double amount, double packingCharge, double deliveryCharge) {
        totalOrders++;
        return amount + packingCharge + deliveryCharge;
    }

    static void displayOrders() {
        System.out.println("Total Orders: " + totalOrders);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant r = new Restaurant();

        System.out.print("Enter Dine-in Amount: ");
        double dine = sc.nextDouble();
        System.out.println("Dine-in Bill = " + r.bill(dine));

        System.out.print("Enter Takeaway Amount and Packing Charge: ");
        double take = sc.nextDouble();
        double pack = sc.nextDouble();
        System.out.println("Takeaway Bill = " + r.bill(take, pack));

        System.out.print("Enter Delivery Amount, Packing Charge and Delivery Charge: ");
        double del = sc.nextDouble();
        double pack2 = sc.nextDouble();
        double delivery = sc.nextDouble();
        System.out.println("Delivery Bill = " + r.bill(del, pack2, delivery));

        Restaurant.displayOrders();

        sc.close();
    }
}