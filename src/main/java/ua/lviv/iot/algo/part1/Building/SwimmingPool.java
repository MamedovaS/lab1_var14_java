package ua.lviv.iot.algo.part1.Building;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class SwimmingPool extends SportComplex {

    private int amountOfBathrooms;
    private double volumeOfPool;
    private int maxParticipants;

    @Override
    public String getSupportedSports() {
        return "Swim";
    }


    public String getHeaders() {
        return super.getHeaders() + ", amountOfBathrooms, volumeOfPool, maxParticipants";
    }

    public String toCSV() {
        return super.toCSV() + ", " + getAmountOfBathrooms() + ", " + getMaxParticipants() + ", " + getVolumeOfPool();
    }

}
