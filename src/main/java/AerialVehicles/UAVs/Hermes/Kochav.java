package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.*;

public class Kochav extends AerialVehicle implements Hermes, AerialIntelligenceVehicle, AerialAttackVehicle, AerialBdaVehicle {
    private int nMissiles;
    private String missileType;
    private String sensorType;
    private String cameraType;

    public Kochav(int nMissiles, String missileType, String cameraType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReady) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReady);
        this.nMissiles = nMissiles;
        this.missileType = missileType;
        this.sensorType = sensorType;
        this.cameraType = cameraType;
    }


    @Override
    public int nMissiles() {
        return nMissiles;
    }

    @Override
    public void SetNMissiles(int nMissiles) {
        this.nMissiles = nMissiles;
    }

    @Override
    public String getMissileType() {
        return missileType;
    }

    @Override
    public void setMissileType(String missileType) {
        this.missileType = missileType;
    }

    @Override
    public String getTarget() {
        return ((AttackMission)mission).getTarget();
    }

    @Override
    public String getCameraType() {
        return cameraType;
    }

    @Override
    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
    }

    @Override
    public String getObjective() {
        return ((BdaMission)mission).getObjective();
    }

    @Override
    public String getSensorType() {
        return sensorType;
    }

    @Override
    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    @Override
    public String getVehicleType() {
        return getClass().getSimpleName();
    }

    @Override
    public String getRegion() {
        return ((IntelligenceMission)mission).getRegion();
    }

    @Override
    public void check() {
        if (hoursOfFlightSinceLastRepair > MAX_HOURS_SINCE_LAST_CHECK_ALLOWED) {
            repair();
        }
    }
}