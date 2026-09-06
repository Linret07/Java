package lessons.lesson4.lesson4_6;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("one", 1);
        treeMap.put("two", 2);
        treeMap.put("three", 3);
        treeMap.put("four", 4);

        System.out.println(treeMap);
        Integer one = treeMap.get("one");

    }
}
