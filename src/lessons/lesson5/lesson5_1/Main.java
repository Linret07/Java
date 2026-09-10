package lessons.lesson5.lesson5_1;

public class Main {
    public static void main(String[] args) {
        try {
            calc(10, 0);
        } catch (IndexOutOfBoundsException e) {
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public static void calc(int a, int b) throws RuntimeException, IndexOutOfBoundsException {
        int[] values = new int[b];
        System.out.println(values[a]);
    }
}
