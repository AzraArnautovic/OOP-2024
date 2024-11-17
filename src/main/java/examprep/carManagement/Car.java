package examprep.carManagement;

public class Car extends Vehicle {
   private CarType carType;
   private String engineType;

    public Car(String vehicleId, String name, double rentalRate, CarType cartype, String engineType) {
        super(vehicleId, name, rentalRate);
        this.carType = cartype;
        this.engineType = engineType;
    }
    public CarType getCarType() {
        return carType;
    }
    public void setCarType(CarType carType) {
        this.carType = carType;
    }
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " ,car type: " + carType + " ,engineType: " + engineType;
    }
}
