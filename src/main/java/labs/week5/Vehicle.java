package labs.week5;

interface Repairable {
    String repair();
}

abstract class Vehicle {
    private String modelName;
    private int mileage;
    private int health;

    public Vehicle(String modelName) {
        this.modelName = modelName;
        this.mileage = 0;
        this.health = 100; }

    public Vehicle(String modelName, int mileage, int health) {
        this.modelName = modelName;
        this.mileage = mileage;
        this.health = health; }


    public String getModelName() {
        return modelName;
    }

    public int getMileage() {
        return mileage;
    }

    public int getHealth() {
        return health;
    }
    public boolean needsMaintenance() {
        return health < 70;
    }

    public int calculateRemainingLifespan() {
        int expectedLifespan = expectedLifespan();
        if (health < 50) {
            expectedLifespan -= 10000;
        }
        return expectedLifespan - mileage;
    }

    public abstract String service();
    public abstract int expectedLifespan();

    public void simulateYear() {
        if (mileage > expectedLifespan() / 2) {
            health -= 5;
        }

        int remainingLifespan = calculateRemainingLifespan();
    }

}

