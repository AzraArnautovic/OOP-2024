package labs.week5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the vehicle: ");
        int choice = scanner.nextInt();
        if (choice > 0 && choice <= vehicleArrayList.size()) {
            // Get the selected vehicle
            Vehicle selectedVehicle = vehicleArrayList.get(choice - 1);

            // Perform maintenance on the selected vehicle
            selectedVehicle.performMaintenance(selectedVehicle);
        } else {
            System.out.println("Invalid choice. Please select a valid vehicle.");
        }
        Vehicle car = new Car("Generic Car Model");
        Vehicle truck = new Truck("Generic Truck Model");
        Vehicle motorcycle = new Motorcycle("Generic Motorcycle Model");

        vehicleArrayList.add(car);
        vehicleArrayList.add(truck);
        vehicleArrayList.add(motorcycle);

        for (Vehicle v : vehicleArrayList){
            System.out.println(v.service());
            v.simulateYear();

            if (v instanceof Car) {
                ((Car) v).drive(100);
        }
            if (v instanceof Truck) {
                ((Truck) v).haul(1000);
            }

            if (v instanceof Motorcycle) {
                ((Motorcycle) v).race(200);
            }
    }

}
}

