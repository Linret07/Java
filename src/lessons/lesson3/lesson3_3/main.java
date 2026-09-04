package lessons.lesson3.lesson3_3;
import java.util.ArrayList;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(456);
        integers.add(6576788);
        integers.add(-456);
        integers.add(0);
        System.out.println(integers);
//        comparatorImp comparator = new comparatorImp();
//        integers.sort(comparator);
        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(integers);


    }
}
