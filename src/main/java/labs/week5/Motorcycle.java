package labs.week5;

public class Motorcycle extends Vehicle {

    public Motorcycle(String modelName) {
        super(modelName);
    }

    public Motorcycle(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String service() {
        return "Motorcycle lubrication and tuning: " + getModelName() + getMileage() + getHealth();
    }

    @Override
    public int expectedLifespan() {
        return 50000;
    }

    public void race(int raceMiles) {
        setMileage(getMileage() + raceMiles);
        int healthDecrease = raceMiles / 10;  // Eg: 10% of race miles
        int currentHealth = getHealth() - healthDecrease;
        setHealth(currentHealth);

        if (getHealth() < 40) {
            int newLifespan = getExpectedLifespan() - 5000;
            setExpectedLifespan(newLifespan);
        }
    }
}