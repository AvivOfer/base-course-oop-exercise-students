package AerialVehicles;

import Missions.Mission;


public abstract class AerialVehicle {
    protected String pilotName;
    protected Mission mission;
    protected int hoursOfFlightSinceLastRepair;
    protected boolean isReady;

    public AerialVehicle(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReady) {
        this.pilotName = pilotName;
        this.mission = mission;
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
        this.isReady = isReady;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public int getHoursOfFlightSinceLastRepair() {
        return hoursOfFlightSinceLastRepair;
    }

    public void setHoursOfFlightSinceLastRepair(int nHoursSinceLastCheck) {
        this.hoursOfFlightSinceLastRepair = nHoursSinceLastCheck;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public void flyTo(int longitude, int latitude) {
        System.out.println("Flying to :" + longitude + ", " + latitude);
    }

    public void land() {
        System.out.println("Landing");
    }

    public abstract void check();

    public void repair() {
        isReady = true;
        hoursOfFlightSinceLastRepair = 0;
    }
}
