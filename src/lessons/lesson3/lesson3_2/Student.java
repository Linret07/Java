package lessons.lesson3.lesson3_2;

import lessons.lesson3.lesson3_1.Father;

public class Student extends Father implements Singer {
    @Override
    public void sing() {
    System.out.println("Alalalaaaa");
    }
}
