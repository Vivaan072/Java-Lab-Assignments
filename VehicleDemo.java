interface VehicleAction {
    void performAction();
}

class Vehicle {
    private String brand;
    private String model;
    private int speed;

    Vehicle(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    // Inner class
    class VehicleDetails {
        void displayDetails() {
            System.out.println("Vehicle Details:");
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Speed: " + speed + " km/h");
        }
    }

    void performVehicleAction() {
        // Anonymous class
        VehicleAction action = new VehicleAction() {
            public void performAction() {
                System.out.println("The vehicle is starting.");
            }
        };

        action.performAction();
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Toyota", "Fortuner", 180);

        // Creating object of inner class
        Vehicle.VehicleDetails details = vehicle.new VehicleDetails();
        details.displayDetails();

        // Calling anonymous class action
        vehicle.performVehicleAction();
    }
}