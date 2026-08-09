abstract class FoodOrder {

    protected double foodPrice;

    FoodOrder(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    // Abstract method
    abstract void calculateBill();

    // Concrete method
    void displayFoodPrice() {
        System.out.println("Food Price: Rs. " + foodPrice);
    }
}

// Dine-in order
class DineInOrder extends FoodOrder {

    private double serviceCharge;

    DineInOrder(double foodPrice, double serviceCharge) {
        super(foodPrice);
        this.serviceCharge = serviceCharge;
    }

    void calculateBill() {
        double total = foodPrice + serviceCharge;

        System.out.println("Order Type: Dine-In");
        System.out.println("Food Price: Rs. " + foodPrice);
        System.out.println("Service Charge: Rs. " + serviceCharge);
        System.out.println("Total Bill: Rs. " + total);
    }
}

// Take-away order
class TakeAwayOrder extends FoodOrder {

    private double packagingCharge;

    TakeAwayOrder(double foodPrice, double packagingCharge) {
        super(foodPrice);
        this.packagingCharge = packagingCharge;
    }

    void calculateBill() {
        double total = foodPrice + packagingCharge;

        System.out.println("Order Type: Take-Away");
        System.out.println("Food Price: Rs. " + foodPrice);
        System.out.println("Packaging Charge: Rs. " + packagingCharge);
        System.out.println("Total Bill: Rs. " + total);
    }
}

public class FoodOrderDemo {

    public static void main(String[] args) {

        FoodOrder dineIn = new DineInOrder(
                800,
                80
        );

        FoodOrder takeAway = new TakeAwayOrder(
                600,
                30
        );

        dineIn.calculateBill();

        System.out.println();

        takeAway.calculateBill();
    }
}
