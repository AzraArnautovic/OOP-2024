package examprep.carManagement;

import java.util.Date;
import java.util.HashMap;

public abstract class Vehicle implements Rentable{
   private String vehicleId;
   private String name;
   private double rentalRate;
   private HashMap<Date, Integer> kilometersRecord;

    public Vehicle(String vehicleId, String name, double rentalRate){
        this.vehicleId=vehicleId;
        this.name=name;
        this.rentalRate=rentalRate;
    }
    public String getVehicleId(){
        return vehicleId;
    }
    public void setVehicleId(String vehicleId){
        this.vehicleId=vehicleId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getRentalRate(){
        return rentalRate;
    }
    public void setRentalRate(double rentalRate){
        this.rentalRate=rentalRate;
    }

    @Override
    public double applyDiscount(double discountRate){
        return rentalRate *(1-discountRate);
    }
    @Override
    public String getDescription(){
        return "name: "+ name + " vehicleId: "+ vehicleId + " rentalRate: "+ rentalRate;
    }
    public void addKilometers(Date rentalDate, int kilometers){
        kilometersRecord.put(rentalDate,kilometers);
    }
    public int getTotalKilometers(){
        int total = 0;
        for (Integer kilometer : kilometersRecord.values()){
            total += kilometer;
        }
        return total;
    }

}
