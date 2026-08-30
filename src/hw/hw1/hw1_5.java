package hw.hw1;

class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year + ", color=" + color + "]";
    }
}
class Main5{
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, "Silver");
        System.out.println(car);
    }
}
