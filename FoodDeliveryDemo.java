interface DeliveryStatus {
    void updateStatus();
}

class FoodDelivery {

    private String customerName;
    private String foodItem;
    private double price;

    FoodDelivery(String customerName, String foodItem, double price) {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.price = price;
    }

    // Inner class
    class OrderDetails {
        void displayOrder() {
            System.out.println("Order Details:");
            System.out.println("Customer: " + customerName);
            System.out.println("Food Item: " + foodItem);
            System.out.println("Price: Rs. " + price);
        }
    }

    void updateDeliveryStatus() {

        // Anonymous class 1
        DeliveryStatus preparing = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Status: Food is being prepared.");
            }
        };

        // Anonymous class 2
        DeliveryStatus outForDelivery = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Status: Order is out for delivery.");
            }
        };

        // Anonymous class 3
        DeliveryStatus delivered = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Status: Order has been delivered.");
            }
        };

        preparing.updateStatus();
        outForDelivery.updateStatus();
        delivered.updateStatus();
    }
}

public class FoodDeliveryDemo {
    public static void main(String[] args) {

        FoodDelivery order =
                new FoodDelivery("Vivaan", "Pizza", 499);

        // Creating object of inner class
        FoodDelivery.OrderDetails details =
                order.new OrderDetails();

        details.displayOrder();

        System.out.println();

        // Handling delivery status
        order.updateDeliveryStatus();
    }
}
