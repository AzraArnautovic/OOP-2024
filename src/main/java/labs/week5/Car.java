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
            setMileage(getMileage() + miles);
            setHealth(getHealth() - (miles / 100));
            if (getHealth() < 30) {
                setExpectedLifespan(getExpectedLifespan() - 10000);
            }
        }

        private void setMileage(int mileage) {

        }

        private void setHealth(int health) {

        }
    }


