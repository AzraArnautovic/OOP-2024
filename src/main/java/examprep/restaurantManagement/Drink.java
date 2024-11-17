package examprep.restaurantManagement;

import java.awt.*;

public class Drink extends MenuItem {
    double volume;

    public Drink(String code, String name, double price, double volume){
        super(code, name, price);
        this.volume = volume;
    }
    public double getVolume(){
        return volume;
    }
    public void setVolume(double volume){
        this.volume=volume;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + ", volume : " + volume + " ml";

    }
}
