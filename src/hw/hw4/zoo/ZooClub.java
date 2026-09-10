package hw.hw4.zoo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    private final Map<Person, List<Pet>> club = new LinkedHashMap<>();

    public void addMember(Person person) { club.putIfAbsent(person, new ArrayList<>()); }

    public void addPet(Person person, Pet pet) {
        addMember(person);
        club.get(person).add(pet);
    }

    public void removePetFromOwner(Person person, Pet pet) {
        club.computeIfPresent(person, (owner, pets) -> {
            pets.remove(pet);
            return pets;
        });
    }

    public void removeMember(Person person) { club.remove(person); }

    public void removePetFromAllOwners(Pet pet) {
        club.values().forEach(pets -> pets.removeIf(pet::equals));
    }

    public void printClub() {
        club.forEach((person, pets) -> System.out.println(person + " -> " + pets));
    }
}
