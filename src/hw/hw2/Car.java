package hw.hw2;

public class Car {
    private final String model;
    private final int year;
    private final Engine engine;

    public Car(String model, int year, int power) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(power);
    }

    @Override
    public String toString() {
        return "Car{model='" + model + '\'' +
                ", year=" + year + ", engine=" + engine + '}';
    }

    private static class Engine {
        private final int power;

        private Engine(int power) {
            this.power = power;
        }

        @Override
        public String toString() {
            return "Engine{power=" + power + '}';
        }
    }
}
