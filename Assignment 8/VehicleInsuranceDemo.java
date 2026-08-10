class InsuranceVehicle {

    String vehicleNumber;
    String vehicleType;
    String ownerName;

    InsuranceVehicle(String vehicleNumber, String vehicleType, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
    }

    void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Owner Name: " + ownerName);
    }
}

class CarInsurance extends InsuranceVehicle {

    double premium;

    CarInsurance(String vehicleNumber, String vehicleType,
                 String ownerName, double premium) {

        super(vehicleNumber, vehicleType, ownerName);
        this.premium = premium;
    }

    void displayInsuranceDetails() {

        System.out.println("Car Insurance Details:");
        System.out.println("Vehicle Number: " + super.vehicleNumber);
        System.out.println("Vehicle Type: " + super.vehicleType);
        System.out.println("Owner Name: " + super.ownerName);
        System.out.println("Insurance Premium: Rs. " + premium);

        System.out.println("\nVehicle Information:");
        super.displayVehicleDetails();
    }
}

class BikeInsurance extends InsuranceVehicle {

    double premium;

    BikeInsurance(String vehicleNumber, String vehicleType,
                  String ownerName, double premium) {

        super(vehicleNumber, vehicleType, ownerName);
        this.premium = premium;
    }

    void displayInsuranceDetails() {

        System.out.println("Bike Insurance Details:");
        System.out.println("Vehicle Number: " + super.vehicleNumber);
        System.out.println("Vehicle Type: " + super.vehicleType);
        System.out.println("Owner Name: " + super.ownerName);
        System.out.println("Insurance Premium: Rs. " + premium);

        System.out.println("\nVehicle Information:");
        super.displayVehicleDetails();
    }
}

public class VehicleInsuranceDemo {

    public static void main(String[] args) {

        CarInsurance car = new CarInsurance(
                "MH15AB1234",
                "Car",
                "Amit",
                15000
        );

        BikeInsurance bike = new BikeInsurance(
                "MH15XY5678",
                "Bike",
                "Rohit",
                8000
        );

        car.displayInsuranceDetails();

        System.out.println("\n----------------------\n");

        bike.displayInsuranceDetails();
    }
}