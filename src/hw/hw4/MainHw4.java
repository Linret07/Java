package hw.hw4;

import hw.hw4.user.Gender;
import hw.hw4.user.Skill;
import hw.hw4.user.User;
import hw.hw4.vehicle.CarInfo;
import hw.hw4.vehicle.Driver;
import hw.hw4.vehicle.Vehicle;
import hw.hw4.zoo.Person;
import hw.hw4.zoo.Pet;
import hw.hw4.zoo.ZooClub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class MainHw4 {
    public static void main(String[] args) {
        List<User> users = createUsers();

        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println("Користувачі за віком ↑: " + users);
        users.sort(Comparator.comparingInt(User::getAge).reversed());
        System.out.println("Користувачі за віком ↓: " + users);
        users.sort(Comparator.comparingInt(user -> user.getName().length()));
        System.out.println("Імена за довжиною ↑: " + users);
        users.sort(Comparator.comparingInt((User user) -> user.getName().length()).reversed());
        System.out.println("Імена за довжиною ↓: " + users);

        List<String> words = new ArrayList<>(List.of("java", "stream", "code", "list", "set", "array",
                "user", "object", "map", "filter", "sort", "class", "record", "skill", "pet", "car"));
        words.sort(String::compareTo);
        System.out.println("Слова за алфавітом: " + words);
        System.out.println("Слова коротші за 4: " + words.stream().filter(word -> word.length() < 4).toList());

        Set<User> men = new HashSet<>(users);
        men.forEach(System.out::println);
        men.removeIf(user -> user.getGender() == Gender.MALE);
        System.out.println("HashSet без чоловіків: " + men);

        TreeSet<User> bySkills = new TreeSet<>(Comparator.comparingInt((User user) -> user.getSkills().size())
                .thenComparing(User::getName));
        bySkills.addAll(users);
        System.out.println("TreeSet за кількістю skills ↑: " + bySkills);

        ZooClub zooClub = new ZooClub();
        Person vasya = new Person("Vasya");
        Person olena = new Person("Olena");
        Pet rex = new Pet("Rex", "dog");
        Pet murzik = new Pet("Murzik", "cat");
        zooClub.addMember(vasya);
        zooClub.addPet(vasya, rex);
        zooClub.addPet(vasya, murzik);
        zooClub.addPet(olena, new Pet("Bella", "dog"));
        zooClub.removePetFromOwner(vasya, murzik);
        zooClub.removePetFromAllOwners(rex);
        zooClub.removeMember(olena);
        zooClub.printClub();

        int[] numbers = {12, 5, 30, 7, 21, 40, 9, 18, 2, 50, 11, 33, 14, 60, 25, 6, 45, 8, 27, 10};
        int[] sortedNumbers = Arrays.stream(numbers).sorted().toArray();
        System.out.println("sorted: " + Arrays.toString(sortedNumbers));
        System.out.println("кратні 3: " + Arrays.stream(numbers).filter(number -> number % 3 == 0).boxed().toList());
        System.out.println("кратні 10: " + Arrays.stream(numbers).filter(number -> number % 10 == 0).boxed().toList());
        System.out.print("foreach: ");
        Arrays.stream(numbers).forEach(number -> System.out.print(number + " "));
        System.out.println();
        System.out.println("map x3: " + Arrays.stream(numbers).map(number -> number * 3).boxed().toList());

        List<Vehicle> fleet = createFleet();
        IntStream.range(0, fleet.size() / 2).forEach(index -> fleet.get(index).repairEngine());
        fleet.stream().map(Vehicle::getOwner)
                .filter(driver -> driver.getDrivingExperience() < 5 && driver.getAge() > 25)
                .forEach(Driver::attendAdvancedCourse);
        System.out.println("Автопарк: " + fleet);
        System.out.println("Сума покупки: " + fleet.stream().mapToDouble(Vehicle::getPrice).sum());
    }

    private static List<User> createUsers() {
        return new ArrayList<>(List.of(
                new User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE,
                        List.of(new Skill("java", 10), new Skill("js", 10), new Skill("c++", 10)),
                        new CarInfo("toyota", 2021, 250)),
                new User(2, "anna", "smith", "anna@mail.com", 24, Gender.FEMALE,
                        List.of(new Skill("java", 3)), new CarInfo("honda", 2020, 150)),
                new User(3, "oleksandr", "bond", "oleksandr@mail.com", 40, Gender.MALE,
                        List.of(new Skill("java", 12), new Skill("sql", 8)), new CarInfo("bmw", 2019, 300)),
                new User(4, "ira", "koval", "ira@mail.com", 28, Gender.FEMALE,
                        List.of(new Skill("js", 5), new Skill("html", 5)), new CarInfo("ford", 2018, 180)),
                new User(5, "max", "ivanov", "max@mail.com", 22, Gender.MALE,
                        List.of(new Skill("c++", 2), new Skill("python", 2), new Skill("sql", 1), new Skill("git", 2)),
                        new CarInfo("audi", 2022, 220)),
                new User(6, "sofia", "melnyk", "sofia@mail.com", 35, Gender.FEMALE,
                        List.of(new Skill("java", 7), new Skill("sql", 6), new Skill("docker", 4)),
                        new CarInfo("mazda", 2021, 190)),
                new User(7, "denys", "shevchenko", "denys@mail.com", 27, Gender.MALE,
                        List.of(new Skill("go", 3)), new CarInfo("kia", 2017, 140)),
                new User(8, "lena", "petrenko", "lena@mail.com", 30, Gender.FEMALE,
                        List.of(new Skill("qa", 6), new Skill("sql", 4)), new CarInfo("tesla", 2023, 280)),
                new User(9, "bohdan", "tkachenko", "bohdan@mail.com", 45, Gender.MALE,
                        List.of(new Skill("java", 15), new Skill("kotlin", 6)), new CarInfo("volvo", 2020, 250)),
                new User(10, "mia", "fox", "mia@mail.com", 26, Gender.FEMALE,
                        List.of(new Skill("design", 4)), new CarInfo("mini", 2019, 120))));
    }

    private static List<Vehicle> createFleet() {
        return List.of(
                new Vehicle("Toyota", 150, new Driver("Ivan", 30, 3), 18000, 2018),
                new Vehicle("Honda", 160, new Driver("Oleh", 35, 8), 21000, 2019),
                new Vehicle("BMW", 250, new Driver("Anna", 27, 2), 35000, 2020),
                new Vehicle("Ford", 140, new Driver("Maksym", 24, 1), 16000, 2017),
                new Vehicle("Audi", 220, new Driver("Svitlana", 42, 15), 32000, 2021),
                new Vehicle("Kia", 130, new Driver("Petro", 29, 4), 14000, 2016),
                new Vehicle("Mazda", 170, new Driver("Iryna", 31, 6), 22000, 2020),
                new Vehicle("Volvo", 200, new Driver("Denys", 26, 2), 28000, 2022));
    }
}
