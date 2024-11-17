package examprep.restaurantManagement;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String customerId;
    String name;
    String phoneNumber;
    List<TableReservation<? extends MenuItem>> reservations;

    public Customer(String customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.reservations = new ArrayList<>();
    }
    public void addReservation(TableReservation<? extends MenuItem> reservation) {
        reservations.add(reservation);
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getCustomerId(){
        return customerId;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void settReservations(List<TableReservation<? extends MenuItem>> reservations) {
        this.reservations = reservations;
    }
    public List<TableReservation<? extends MenuItem>> getReservations() {
        return reservations;
    }
}
