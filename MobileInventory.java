class Mobile {

    String brand;
    String model;
    double price;

    // Default Constructor
    Mobile() {
        brand = "Unknown";
        model = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Mobile(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    // Copy Constructor
    Mobile(Mobile m) {
        brand = m.brand;
        model = m.model;
        price = m.price;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}

public class MobileInventory {
    public static void main(String[] args) {

        Mobile m1 = new Mobile("Samsung", "Galaxy S24", 74999);

        // Duplicate object using Copy Constructor
        Mobile m2 = new Mobile(m1);

        System.out.println("Original Mobile");
        m1.display();

        System.out.println();

        System.out.println("Duplicate Mobile Record");
        m2.display();
    }
}