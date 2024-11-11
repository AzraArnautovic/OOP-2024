package labs.week5;

interface Repairable {
    String repair();
}

abstract class Vehicle {
    private String modelName;
    private int mileage;
    private int health;
    public abstract String service();
    public abstract int expectedLifespan();
    private int expectedLifespan;

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

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getExpectedLifespan() {
        return expectedLifespan;
    }
    public void setExpectedLifespan(int expectedLifespan) {
        this.expectedLifespan = expectedLifespan;
    }
    public boolean needsMaintenance() {
        return health < 70;
    }

    public int calculateRemainingLifespan(int remainingLifespan) {
        int expectedLifespan = expectedLifespan();
        double healthFactor = getHealth() / 100.0;
        remainingLifespan=(int)((expectedLifespan * healthFactor) - (mileage / 100.0));
        return remainingLifespan;
    }

    public void simulateYear() {
        if (mileage > expectedLifespan() / 2) {
            health -= 5;
        }


    }

    public void performMaintenance(Vehicle vehicle) {
        if (vehicle instanceof Car car) {
            System.out.println(car.repair());
            car.drive(100);
        } else if (vehicle instanceof Truck truck) {
            System.out.println(truck.repair());
            truck.haul(50);
        } else if (vehicle instanceof Motorcycle motorcycle) {
            motorcycle.race(30);
        } else {
            System.out.println("Unknown vehicle type.");
        }
    }

}

