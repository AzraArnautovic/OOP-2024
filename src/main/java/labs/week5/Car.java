package labs.week5;

    class Car extends Vehicle implements Repairable {

        public Car(String modelName) {
            super(modelName);
        }

        public Car(String modelName, int mileage, int health) {
            super(modelName, mileage, health);
        }

        @Override
        public String repair() {
            return "Engine tuned and oil changed for " + getModelName();
        }

        @Override
        public String service() {
            return "Checking engine and changing oil for " + getModelName() + ", Mileage: " + getMileage() + ", Health: " + getHealth();
        }

        @Override
        public int expectedLifespan() {
            return 150000;
        }

        public void drive(int miles) {
            super.setMileage(getMileage() + miles);
            super.setHealth(getHealth() - (miles / 100));
            if (getHealth() < 30) {
                super.setExpectedLifespan(getExpectedLifespan() - 10000);

            }
            int remainingLifespan = calculateRemainingLifespan(0);
            System.out.println("Remaining Lifespan after driving: " + remainingLifespan + " miles");
        }


    }


