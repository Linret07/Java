package hw.hw2;

public class Skill {
    private final String title;
    private final int exp;

    public Skill(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Skill{title='" + title + '\'' + ", exp=" + exp + '}';
    }
}
