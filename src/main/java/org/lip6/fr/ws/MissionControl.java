package org.lip6.fr.ws;

import java.util.ArrayList;
import java.util.List;

public class MissionControl {
    private final List<Rover> rovers;

    public MissionControl() {
        this.rovers = new ArrayList<>();
    }

    public void sendCommands(int roverId, char[] commands) {
    }

    public String getRoverStatus(int roverId){
        return null;
    }

    public void initializeRover(double latitude, double longitude, CardinalPoint direction) {
    }
}
