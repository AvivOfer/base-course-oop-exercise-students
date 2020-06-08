package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;

public class F15 extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle, FighterJet {
    private int nMissiles;
    private String missileType;
    private String sensorType;

    public F15(String sensorType, int nMissiles, String missileType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReady) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReady);
        this.nMissiles = nMissiles;
        this.missileType = missileType;
        this.sensorType = sensorType;
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
    public String getVehicleType() {
        return getClass().getSimpleName();
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