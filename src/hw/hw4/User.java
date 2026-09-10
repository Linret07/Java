package hw.hw4;

import java.util.List;
import java.util.Objects;

public class User {
    private final int id;
    private final String name;
    private final String surname;
    private final String email;
    private final int age;
    private final Gender gender;
    private final List<Skill> skills;
    private final CarInfo car;

    public User(int id, String name, String surname, String email, int age,
                Gender gender, List<Skill> skills, CarInfo car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = List.copyOf(skills);
        this.car = car;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public Gender getGender() { return gender; }
    public List<Skill> getSkills() { return skills; }

    @Override
    public String toString() {
        return id + ": " + name + " " + surname + ", " + age + " років, " + gender
                + ", skills=" + skills.size() + ", car=" + car.model();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return id == user.id;
    }

    @Override
    public int hashCode() { return Objects.hash(id); }
}
