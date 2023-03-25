package ua.lviv.iot.algo.part1.lab1.Building;

public class SwimmingPool extends SportComplex {
private int amountOfBathrooms;
private double volumeOfPool;
private int maxParticipants;


    @Override
    public String getSupportedSports() {
        return "Swim";
    }
}
