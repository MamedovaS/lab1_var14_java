package ua.lviv.iot.algo.part1.lab1.Building;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static SportComplexManager sportComplexManager = new SportComplexManager();
    private final static int FREE_SITS = 5;

    public static void main(String[] args) {
        prepareTestData();

        sportComplexManager.printSportComplexList();

        List<SportComplex> stadiumsWithFreeSits = sportComplexManager.findStadiumByFreeSit(FREE_SITS);

        for (SportComplex sportComplex : stadiumsWithFreeSits) {
            System.out.println("id: " + sportComplex.getId() + "\n");
        }

    }

    private static void prepareTestData() {
        SportComplex sportComplexes[] = {new Stadium(),
                new Stadium(969, "fghjk", "kjhgf", "orena Lviv"),
                Stadium.getInstance(),
                new SwimmingPool()};
        List<SportComplex> sportComplexList = Arrays.asList(sportComplexes);
        sportComplexManager.addSportComplexes(sportComplexList);
        sportComplexManager.addSportComplex(new Stadium(2525, "lava", "lovo", "orena Kyiv"));
    }


}