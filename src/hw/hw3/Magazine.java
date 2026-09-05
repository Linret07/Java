package hw.hw3;

public class Magazine implements Printable {
    private final String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + title);
    }
}
