package hw.hw5.course;

public class StudentCourse {
    private final int id;
    private final String name;
    private final int courseId;

    public StudentCourse(int id, String name, int courseId) {
        this.id = id;
        this.name = name;
        this.courseId = courseId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCourseId() {
        return courseId;
    }
}
