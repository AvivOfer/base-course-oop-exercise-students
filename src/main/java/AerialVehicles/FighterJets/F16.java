package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;

public class F16 extends AerialVehicle implements AerialAttackVehicle, AerialBdaVehicle, FighterJet {
    private int nMissiles;
    private String missileType;
    private String cameraType;

    public F16(String cameraType, int nMissiles, String missileType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReady) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReady);
        this.nMissiles = nMissiles;
        this.missileType = missileType;
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
    public String getVehicleType() {
        return getClass().getSimpleName();
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
    public void check() {
        if (hoursOfFlightSinceLastRepair > MAX_HOURS_SINCE_LAST_CHECK_ALLOWED) {
            repair();
        }
    }
}