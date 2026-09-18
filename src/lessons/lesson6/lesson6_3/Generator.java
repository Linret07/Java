package lessons.lesson6.lesson6_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private Random random = new Random();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public List<Integer> getList2() {
        return list2;
    }

    public List<Integer> getList1() {
        return list1;
    }

    public synchronized void stageOne() throws InterruptedException {
        synchronized (this) {
            Thread.sleep(1);
            list1.add(random.nextInt(100));
        }
    }

    public synchronized void stageTwo() throws InterruptedException {
        Thread.sleep(1);
        list2.add(random.nextInt(100));
    }

    public void generate() {
        try {
            for (int i = 0; i < 1000; i++) {
                stageOne();
                stageTwo();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
