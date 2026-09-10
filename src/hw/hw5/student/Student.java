package hw.hw5.student;

public class Student {
    private final String name;
    private final int age;
    private final String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", " + age + " років, курс: " + course;
    }
}
