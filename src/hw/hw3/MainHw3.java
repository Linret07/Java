package hw.hw3;

public class MainHw3 {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book("Java для початківців"),
                new Magazine("Світ програмування"),
                new Book("Основи ООП"),
                new Magazine("Технології майбутнього")
        };

        for (Printable printable : printables) {
            printable.print();
        }

        Instrument[] instruments = {
                new Guitar(6),
                new Drum(40),
                new Trumpet(15)
        };

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
