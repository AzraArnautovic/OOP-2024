package examprep.restaurantManagement;

public interface Billable {
    double applyDiscount(double discountRate);
    String getDescription();
}
