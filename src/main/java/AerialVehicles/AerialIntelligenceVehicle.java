package AerialVehicles;

public interface AerialIntelligenceVehicle {
    String getSensorType();
    void setSensorType(String sensorType);

    String getPilotName();
    String getVehicleType();
    String getRegion();

    default String collectIntelligence() {
        String toReturn = getPilotName() + ": " + getVehicleType() + " Collecting Data in " + getRegion() + " with sensor type: " + getSensorType();
        System.out.println(toReturn);
        return toReturn;
    }

}
