package lessons.lesson3.lesson3_4;

public class Main {
    public static void main(String[] args) {
        System.out.println(Some.x);
        Foo foo = new Foo() {
            @Override
            public int doSome1(int x) {
                return x;
            }
        };

        foo.asd();
        Some.qwe();
    }
}
