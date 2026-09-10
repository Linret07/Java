package hw.hw4.vehicle;

public class Driver {
    private final String name;
    private final int age;
    private int drivingExperience;

    public Driver(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    public int getAge() { return age; }
    public int getDrivingExperience() { return drivingExperience; }
    public void attendAdvancedCourse() { drivingExperience++; }

    @Override
    public String toString() { return name + " (" + age + " років, стаж " + drivingExperience + ")"; }
}
