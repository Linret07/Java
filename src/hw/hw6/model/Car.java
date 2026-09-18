package hw.hw6.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    @Enumerated(EnumType.STRING)
    private CarType type;

    private int power;
    private BigDecimal price;
    private int year;

    protected Car() {
    }

    public Car(String model, CarType type, int power, BigDecimal price, int year) {
        this.model = model;
        this.type = type;
        this.power = power;
        this.price = price;
        this.year = year;
    }

    public Long getId() { return id; }
    public String getModel() { return model; }
    public CarType getType() { return type; }
    public int getPower() { return power; }
    public BigDecimal getPrice() { return price; }
    public int getYear() { return year; }
}
