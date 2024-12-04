package org.lip6.fr.ws;

public class Direction {
    private CardinalPoint facing;

    public Direction(CardinalPoint initialDirection) {
        this.facing = initialDirection;
    }

    public void rotate() {

    }

    public CardinalPoint getCurrentDirection() {
        return facing;
    }
}
