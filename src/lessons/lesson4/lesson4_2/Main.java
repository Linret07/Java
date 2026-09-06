package lessons.lesson4.lesson4_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("ashghjsagdj1");
        strings.add("ashghjsagdj2");
        strings.add("ashghjsagdj3");
        strings.add("ashghjsagdj4");
        strings.add("ashghjsagdj5");
        strings.set(1, "qwe");

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1001);
        integers.add(1002);
        integers.add(1003);
        integers.add(1004);
        integers.add(1005);
        System.out.println(integers);

    }
}
