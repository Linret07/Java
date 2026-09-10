package hw.hw4.zoo;

import java.util.Objects;

public class Pet {
    private final String name;
    private final String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() { return name + " (" + type + ")"; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return Objects.equals(name, pet.name) && Objects.equals(type, pet.type);
    }

    @Override
    public int hashCode() { return Objects.hash(name, type); }
}
