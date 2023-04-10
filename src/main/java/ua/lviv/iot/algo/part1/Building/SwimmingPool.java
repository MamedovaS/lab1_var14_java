package ua.lviv.iot.algo.part1.Building;
import lombok.*;

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
}
