package Missions;


import Entities.Coordinates;

public abstract class Mission {
    private Coordinates coordinates;


    public Mission(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }


    public void begin() {
        System.out.println("Beginning Mission!");
    }
    public void cancel() {
        System.out.println("Aborting Mission!");
    }
    public void finish() {
        System.out.println("Finished Mission!");
    }
}
