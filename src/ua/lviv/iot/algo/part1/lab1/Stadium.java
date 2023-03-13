package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@ToString(includeFieldNames = true)
//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor

public class Stadium {
    private int id = 404;
    private String name;
    private final int capacity = 600;
    private int currentAttendance = 0;
    private String homeTeam;
    private String awayTeam;
    private static Stadium instance = new Stadium();

    public static final int ATTENDIES_GROUP_COUNT = 100;

    public static Stadium getInstance() {
        return instance;
    }

    public boolean isThereFreeSits(int count) {
        return getCapacity() - getCurrentAttendance() < count;
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

    public static void main(String[] args) {


        Stadium listOfOrens[] = {new Stadium(), new Stadium(969, "orena Lviv", 35, "fghjk", "kjhgf"),
                getInstance(), getInstance()};
        for (Stadium oren : listOfOrens) {
            System.out.println("id: " + oren.getId() + "\n");
        }

    }
}

