package org.lip6.fr.ws;

public class Rover {
    private Position localPosition;
    private Coordinates globalCoordinates;
    private Direction direction;
    private Planet planet;

    public Rover(Position initialPosition, Direction initialDirection, Planet planet) {
        this.localPosition = initialPosition;
        this.direction = initialDirection;
        this.planet = planet;
        this.globalCoordinates = planet.getCoordinateSystem()
                .convertToGlobalCoordinates(initialPosition);
    }

    public void executeCommands(char[] commands) {
    }

    public boolean move() {
        return false;
    }

    public Position getLocalPosition() {
        return localPosition;
    }

    public Coordinates getGlobalCoordinates() {
        return globalCoordinates;
    }

    public CardinalPoint getDirection() {
        return direction.getCurrentDirection();
    }

    private boolean checkObstacle(Coordinates coordinates) {
        return false;
    }

    private void reportObstacle(Coordinates coordinates) {

    }

    private void updatePositions(Position newLocal, Coordinates newGlobal) {
        this.localPosition = newLocal;
        this.globalCoordinates = newGlobal;
    }

}
