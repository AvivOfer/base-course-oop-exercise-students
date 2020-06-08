package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;

public class Zik extends AerialVehicle implements Hermes, AerialIntelligenceVehicle, AerialBdaVehicle {
    private String sensorType;
    private String cameraType;


    public Zik(String cameraType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReady) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReady);
        this.sensorType = sensorType;
        this.cameraType = cameraType;
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
