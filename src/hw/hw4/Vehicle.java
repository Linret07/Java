package hw.hw4;

public class Vehicle {
    private final String brand;
    private double enginePower;
    private final Driver owner;
    private final double price;
    private final int year;

    public Vehicle(String brand, double enginePower, Driver owner, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.owner = owner;
        this.price = price;
        this.year = year;
    }

    public void repairEngine() { enginePower *= 1.10; }
    public Driver getOwner() { return owner; }
    public double getPrice() { return price; }

    @Override
    public String toString() { return brand + " " + year + ", power=" + enginePower + ", owner=" + owner; }
}
