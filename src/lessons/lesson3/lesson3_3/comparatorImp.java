package lessons.lesson3.lesson3_3;

import java.util.Comparator;

public class comparatorImp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {return o1-o2; }
}
