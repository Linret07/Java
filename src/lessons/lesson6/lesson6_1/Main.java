package lessons.lesson6.lesson6_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println(Thread.currentThread().getName() + ": " + i);
            }

            while (true) {
                // Потік продовжує працювати після завершення циклу.
            }
        };

        Thread thread0 = new Thread(runnable, "My-Thread-0");
        Thread thread1 = new Thread(runnable, "My-Thread-1");
        Thread thread2 = new Thread(runnable, "My-Thread-2");

        thread0.start();
        thread0.join();
        System.out.println("Hi");

        thread1.start();
        thread1.join();
        thread2.start();
    }
}
