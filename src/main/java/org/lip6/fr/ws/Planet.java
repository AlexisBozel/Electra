package org.lip6.fr.ws;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    private final String name;
    private final double radius;
    private final double circumference;
    private final List<Terrain> terrains;
    private final CoordinateSystem coordinateSystem;

    public Planet(String name, double radius, List<Terrain> terrains, CoordinateSystem coordinateSystem) {
        this.name = name;
        this.radius = radius;
        this.circumference = 2 * Math.PI * radius;
        this.terrains = new ArrayList<>(terrains);
        this.coordinateSystem = coordinateSystem;
    }

    public CoordinateSystem getCoordinateSystem() {
        return coordinateSystem;
    }

    public Coordinates wrapCoordinates(double latitude, double longitude) {
        return null;
    }

    public Terrain getTerrainAt(Coordinates coordinates) {
        return null;
    }

    public void addObstacle(Coordinates coordinates, Obstacle obstacle) {

    }
}
