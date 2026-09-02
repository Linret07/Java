package hw.hw2;

public class Geo {
    private final double lat;
    private final double lng;

    public Geo(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Geo{lat=" + lat + ", lng=" + lng + '}';
    }
}
