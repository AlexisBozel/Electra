package org.lip6.fr.ws;

import java.util.ArrayList;
import java.util.List;

public class Terrain {
    private final TerrainType type;
    private final double elevation;
    private final List<Obstacle> obstacles;

    public Terrain(TerrainType type, double elevation) {
        this.type = type;
        this.elevation = elevation;
        this.obstacles = new ArrayList<>();
    }

    public boolean isNavigable() {
        return false;
    }

    public List<Obstacle> getObstacles() {
        return new ArrayList<>(obstacles);
    }

    public double getElevation() {
        return elevation;
    }

    public void addObstacle(Obstacle obstacle) {
        obstacles.add(obstacle);
    }
}
