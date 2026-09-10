package hw.hw4;

import java.util.Objects;

public class Person {
    private final String name;

    public Person(String name) { this.name = name; }
    public String getName() { return name; }

    @Override
    public String toString() { return name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() { return Objects.hash(name); }
}
