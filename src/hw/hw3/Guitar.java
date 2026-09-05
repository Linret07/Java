package hw.hw3;

public class Guitar implements Instrument {
    private final int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println("Грає гітара з " + strings + " струнами");
    }
}
