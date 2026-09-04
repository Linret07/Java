package lessons.lesson3.lesson3_4;

public interface Some {
    /* public static final */ int x = 0;

    /* public */ int doSome1(int x);

    int doSome2(int x);

    String doSome3();

    default void asd() {
        System.out.println("ashjhjd");
    }
    static void qwe(){

    }
}
