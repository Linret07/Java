package hw.hw3;

public class Trumpet implements Instrument {
    private final int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Грає труба діаметром " + diameter);
    }
}
