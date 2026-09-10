package hw.hw4.user;

import java.util.Objects;

public class Skill {
    private final String title;
    private final int exp;

    public Skill(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    public String getTitle() { return title; }
    public int getExp() { return exp; }

    @Override
    public String toString() { return title + " (" + exp + " років)"; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Skill skill)) return false;
        return exp == skill.exp && Objects.equals(title, skill.title);
    }

    @Override
    public int hashCode() { return Objects.hash(title, exp); }
}
