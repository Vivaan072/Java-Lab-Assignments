interface Product {

    void displayProduct();
    double calculatePrice();
}

// Parent class containing common properties
abstract class ProductDetails {

    protected String name;
    protected double price;

    ProductDetails(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// Electronic product
class Electronic extends ProductDetails implements Product {

    private int warranty;

    Electronic(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    public void displayProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: Rs. " + price);
        System.out.println("Warranty: " + warranty + " years");
    }

    public double calculatePrice() {
        return price;
    }
}

// Clothing product
class Clothing extends ProductDetails implements Product {

    private String size;

    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public void displayProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: Rs. " + price);
        System.out.println("Size: " + size);
    }

    public double calculatePrice() {
        return price;
    }
}

// Grocery product
class Grocery extends ProductDetails implements Product {

    private double weight;

    Grocery(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public void displayProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: Rs. " + price);
        System.out.println("Weight: " + weight + " kg");
    }

    public double calculatePrice() {
        return price;
    }
}

public class EcommerceDemo {

    public static void main(String[] args) {

        Product electronic =
                new Electronic("Laptop", 55000, 2);

        Product clothing =
                new Clothing("T-Shirt", 999, "L");

        Product grocery =
                new Grocery("Rice", 1200, 10);

        electronic.displayProduct();
        System.out.println("Final Price: Rs. " +
                electronic.calculatePrice());

        System.out.println();

        clothing.displayProduct();
        System.out.println("Final Price: Rs. " +
                clothing.calculatePrice());

        System.out.println();

        grocery.displayProduct();
        System.out.println("Final Price: Rs. " +
                grocery.calculatePrice());
    }
}
