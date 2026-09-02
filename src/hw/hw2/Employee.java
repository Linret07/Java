package hw.hw2;

import java.util.List;

public class Employee {
    private final int id;
    private final String name;
    private final String surname;
    private final String email;
    private final int age;
    private final Gender gender;
    private final List<Skill> skills;
    private final Car car;

    public Employee(int id, String name, String surname, String email, int age,
                    Gender gender, List<Skill> skills, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", skills=" + skills +
                ", car=" + car + '}';
    }
}
