package examprep.carManagement;

import java.util.Date;
import java.util.HashMap;

public class RentalTransaction<T extends Vehicle> {
    private String transactionId;
    private Date rentalDate;
    private HashMap<T, Integer> rentedVehicles;
    private int customerId;

    public RentalTransaction(String transactionId, Date rentalDate, int customerId) {
        this.transactionId = transactionId;
        this.rentalDate = rentalDate;
        this.customerId = customerId;
        this.rentedVehicles = new HashMap<>();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public HashMap<T, Integer> getRentedVehicles() {
        return rentedVehicles;
    }

    public void setRentedVehicles(HashMap<T, Integer> rentedVehicles) {
        this.rentedVehicles = rentedVehicles;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void addVehicleToRental(T vehicle, int days) {
        int currentDays = rentedVehicles.getOrDefault(vehicle, 0); // Get current days (default 0)
        int newDays = currentDays + days; // Add the new days
        rentedVehicles.put(vehicle, newDays); // Update the map with the new total
    }


    public double calculateTotalAmount() {
        double totalAmount = 0;
        // Loop through all rented vehicles
        for (T vehicle : rentedVehicles.keySet()) {
            // Get the rental rate for each vehicle
            double baseRentalRate = vehicle.getRentalRate();

            if (baseRentalRate > 0) {
                baseRentalRate = vehicle.applyDiscount(baseRentalRate);
            }

            totalAmount += baseRentalRate * rentedVehicles.get(vehicle);

        }
        return totalAmount;
    }
}
