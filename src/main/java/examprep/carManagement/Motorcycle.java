package examprep.carManagement;

public class Motorcycle extends Vehicle {
   private double engineCapacity;

    public Motorcycle(String vehicleId, String name, double rentalRate, double engineCapacity) {
        super(vehicleId, name, rentalRate);
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format(", engine capacity: %.2f cc", engineCapacity);
    }
}
