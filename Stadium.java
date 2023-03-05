package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@ToString(includeFieldNames = true)
//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor

public class Stadium {
    private int id=404;
    private String name;
    private final int capacity = 600;
    private int currentAttendance = 0;
    private String homeTeam;
    private String awayTeam;
    private static Stadium instance = new Stadium();

    public static Stadium getInstance() {
        return instance;
    }

    public boolean isThereFreeSits(int count) {
        int takenSits = getCapacity() - getCurrentAttendance();
        if (takenSits < count) {
            return true;
        } else {
            return false;
        }
    }

    public int addAttendies(int count) {
        if (isThereFreeSits(count)) {
            setCurrentAttendance(getCurrentAttendance() + count);
            return getCurrentAttendance();
        } else {
            System.out.println("it is too crowded");
            return getCurrentAttendance();
        }
    }

    public int decreaseAttendance() {
        if (getCurrentAttendance() >= 100) {
            setCurrentAttendance(getCurrentAttendance() - 100);
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
        Stadium orena1 = new Stadium();
        Stadium orena2 = new Stadium(969,"orena Lviv", 35, "fghjk", "kjhgf");
        Stadium orena3 = getInstance();
        Stadium orena4 = getInstance();

        Stadium listOfOrens[]=new Stadium[]{orena1,orena2,orena3,orena4};
        int i =0;
        while(i<listOfOrens.length){
            System.out.println("id"+i+": "+listOfOrens[i].getId()+"\n");
            i++;
        }

    }
}

