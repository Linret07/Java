package lessons.lesson3.lesson3_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Singer> singers = new ArrayList<>();
        singers.add(new Student());
        singers.add(new User());

        Singer singer = singers.get(0);
        singer.sing();
    }
}
