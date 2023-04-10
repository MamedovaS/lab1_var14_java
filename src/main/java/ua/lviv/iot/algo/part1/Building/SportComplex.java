package ua.lviv.iot.algo.part1.Building;

import lombok.*;

@Setter
@Getter
@ToString
//@NoArgsConstructor
@RequiredArgsConstructor
//@AllArgsConstructor

public abstract class SportComplex {
    private String name;
    private int id = 404;
    private final int capacity = 600;
    private int currentAttendance = 0;
    private int freeSits = capacity - currentAttendance;
    private String homeTeam;
    private String awayTeam;

    public SportComplex(String name, int id, int currentAttendance, String homeTeam,String awayTeam ) {
        this.name = name;
        this.id = id;
        this.currentAttendance=currentAttendance;
        this.homeTeam=homeTeam;
        this.awayTeam=awayTeam;
    }

    public SportComplex(String name, int currentAttendance, int id) {
        this.name = name;
        this.currentAttendance = currentAttendance;
        this.id = id;
    }

    protected abstract String getSupportedSports();
}
