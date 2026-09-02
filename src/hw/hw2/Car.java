package hw.hw2;

public class Car {
    private final String model;
    private final int year;
    private final int power;

    public Car(String model, int year, int power) {
        this.model = model;
        this.year = year;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{model='" + model + '\'' +
                ", year=" + year + ", power=" + power + '}';
    }
}
