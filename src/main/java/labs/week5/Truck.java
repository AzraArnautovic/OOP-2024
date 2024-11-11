package labs.week5;

public class Truck extends Vehicle implements Repairable{

    public Truck (String modelName) {
        super(modelName);
    }

    public Truck (String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String repair() {
        return "Engine overhauled and tires replaced for " + getModelName();
    }

    @Override
    public String service() {
        return "Checking engine and changing oil for " + getModelName() + ", Mileage: " + getMileage() + ", Health: " + getHealth();
    }

    @Override
    public int expectedLifespan() {
        return 300000;
    }

    public void haul(int loadWeight){
        int currentHealth = getHealth();

        if (loadWeight > 5000){
            int damage = (loadWeight - 5000) / 100;
            currentHealth -= damage;

            super.setHealth(currentHealth);
        }
        if (getHealth() < 30) {
            int newLifespan = getExpectedLifespan() - 20000;  // Reduce expected lifespan
            super.setExpectedLifespan(newLifespan);
        }
    }
}
