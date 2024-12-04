package org.lip6.fr.ws;

public class Obstacle {
    private final double size;
    private final boolean temporary;
    private final Coordinates coordinates;

    public Obstacle(double size, boolean temporary, Coordinates coordinates) {
        this.size = size;
        this.temporary = temporary;
        this.coordinates = coordinates;
    }

    public boolean isPassable() {
        return  false;
    }

    public double getCollisionRadius() {
        return size;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
}

