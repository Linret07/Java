package lessons.lesson4.lesson4_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1001);
        integers.add(1002);
        integers.add(1003);
        integers.add(1004);
        integers.add(1005);
        System.out.println(integers);

        Integer integer = integers.get(1); // 1002
        integers.sort(Integer::compare);
        integers.forEach(integer1 -> System.out.println(integer1));

        for (Integer i : integers) {
            if (i % 2 == 0) {
                integers.remove(i);
            }
        }
    }
}
