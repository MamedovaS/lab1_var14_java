package ua.lviv.iot.algo.part1.Building;

import lombok.*;

import java.lang.reflect.Field;

@Setter
@Getter

public class Stadium extends SportComplex {

    private static Stadium instance = new Stadium();

    public static final int ATTENDIES_GROUP_COUNT = 100;

    public Stadium(int id, String homeTeam, String awayTeam, String name, int currentAttendance) {
        super(name, id, currentAttendance, homeTeam, awayTeam);
    }

    public Stadium() {
    }

    public static Stadium getInstance() {
        return instance;
    }

    public boolean isThereFreeSits(int count) {
        return getFreeSits()> count;
    }

    public int addAttendies(int count) {
        if (isThereFreeSits(count)) {
            setCurrentAttendance(getCurrentAttendance() + count);
        }
        return getCurrentAttendance();
    }

    public int decreaseAttendance() {
        if (getCurrentAttendance() >= ATTENDIES_GROUP_COUNT) {
            setCurrentAttendance(getCurrentAttendance() - ATTENDIES_GROUP_COUNT);
            return getCurrentAttendance();
        }
        System.out.println("it is empty");
        return getCurrentAttendance();
    }

    public String changeHomeTeam(String teamName) {
        setHomeTeam(teamName);
        return getHomeTeam();
    }

    public String changeAwayTeam(String teamName) {
        setAwayTeam(teamName);
        return getAwayTeam();
    }


    @Override
    public String getSupportedSports() {
        return "Football";
    }

    public String getHeaders(){
        return super.getHeaders();
    }

    public String toCSV(){
        return super.toCSV();
    }
}

