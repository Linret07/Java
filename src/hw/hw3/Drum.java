package hw.hw3;

public class Drum implements Instrument {
    private final int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Грає барабан розміром " + size);
    }
}
