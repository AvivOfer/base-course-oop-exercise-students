package AerialVehicles;

public interface AerialBdaVehicle {
    String getCameraType();
    void setCameraType(String cameraType);

    String getPilotName();
    String getVehicleType();
    String getObjective();

    default String preformBda() {
        String toReturn = getPilotName() + ": " + getVehicleType() + " taking pictures of " + getObjective() + " with: " + getCameraType() + " camera";
        System.out.println(toReturn);
        return toReturn;
    }
}
