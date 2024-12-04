package org.lip6.fr.ws;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    private Planet planet;
    @BeforeEach
    void setUp() {
        planet = new Planet("Earth", 50.0, new CoordinateSystem(500.0,500.0));
    }

    @Test
    void shouldMoveForward() {
        //GIVEN
        Rover rover = new Rover(new Position(0,0), new Direction(CardinalPoint.NORTH), planet);
        //WHEN
        char[] commands = {'f','f','r','f','f'};
        rover.executeCommands(commands);
        //THEN
        assertEquals(2, rover.getLocalPosition().getX());
        assertEquals(2, rover.getLocalPosition().getY());
        assertEquals(CardinalPoint.EAST, rover.getDirection());
    }
}