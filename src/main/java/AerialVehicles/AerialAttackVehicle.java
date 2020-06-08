package AerialVehicles;

public interface AerialAttackVehicle{
    int nMissiles();

    void SetNMissiles(int nMissiles);

    String getMissileType();

    void setMissileType(String missileType);

    String getPilotName();
    String getTarget();
    String getVehicleType();


    default String attack(){
        String toReturn = getPilotName() + ": " + getVehicleType() + " Attacking " + getTarget() + " with: " + getMissileType() + "X" + nMissiles();
        System.out.println(toReturn);
        return toReturn;
    }
}