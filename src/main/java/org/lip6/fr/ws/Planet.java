package org.lip6.fr.ws;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    private final String name;
    private final double radius;
    private final double circumference;
    private final CoordinateSystem coordinateSystem;

    public Planet(String name, double radius, CoordinateSystem coordinateSystem) {
        this.name = name;
        this.radius = radius;
        this.circumference = 2 * Math.PI * radius;
        this.coordinateSystem = coordinateSystem;
    }

    public CoordinateSystem getCoordinateSystem() {
        return coordinateSystem;
    }

    public Coordinates wrapCoordinates(double latitude, double longitude) {
        return null;
    }

    public void addObstacle(Coordinates coordinates, Obstacle obstacle) {

    }
}
