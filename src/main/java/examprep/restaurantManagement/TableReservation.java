package examprep.restaurantManagement;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TableReservation <T extends MenuItem> {
    String reservationId;
    Date reservationDate;
    HashMap<T, Integer> orderItems;
    int tableNumber;

    public TableReservation(String reservationId, Date reservationDate, int tableNumber) {
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
        this.tableNumber = tableNumber;
        this.orderItems = new HashMap<>();
    }

    public void addItemToOrder(T item, int quantity) {
        orderItems.put(item, quantity);
    }

    public double calculateTotalAmount() {
        double total = 0;
        for (Map.Entry<T, Integer> entry : orderItems.entrySet()) {
            double itemPrice = entry.getKey().applyDiscount(0.1);
            total += itemPrice * entry.getValue();

        }
        return total;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setOrderedItems(HashMap<T,Integer> orderedItems) {
        this.orderItems = orderedItems;
    }

    public HashMap<T,Integer> getOrderedItems() {
        return orderItems;
    }
    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }
    public int getTableNumber(){
        return tableNumber;
    }
}
