package org.lip6.fr.ws;

public class Coordinates {
    private final double latitude;
    private final double longitude;

    public Coordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }

    public Position toCartesian() {
       return null;
    }

    public static Coordinates fromCartesian(Position position) {
        return null;
    }
}
