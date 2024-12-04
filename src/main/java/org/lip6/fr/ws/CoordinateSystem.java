package org.lip6.fr.ws;

public class CoordinateSystem {
    private final double referenceLatitude;
    private final double referenceLongitude;

    public CoordinateSystem(double referenceLatitude, double referenceLongitude) {
        this.referenceLatitude = referenceLatitude;
        this.referenceLongitude = referenceLongitude;
    }

    public Position convertToLocalGrid(Coordinates coordinates) {
        return null;
    }

    public Coordinates convertToGlobalCoordinates(Position position) {
        return null;
    }
}