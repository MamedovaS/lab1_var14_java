package ua.lviv.iot.algo.part1.Building;

import java.util.*;
import java.util.stream.Collectors;

public class SportComplexManager {
    private static List<SportComplex> sportComplexList = new LinkedList<>();

    public void addSportComplex(final SportComplex sportComplex) {
        sportComplexList.add(sportComplex);
    }

    public void addSportComplexes(final List<SportComplex> sportComplexes) {
        sportComplexList.addAll(sportComplexes);
    }

    public List<SportComplex> findStadiumByFreeSit(final int count) {
        return sportComplexList
                .stream()
                .filter(sportComplex -> sportComplex instanceof Stadium)
                .filter(sportComplex -> ((Stadium) sportComplex).isThereFreeSits(count))
                .collect(Collectors.toList());
    }

    public List<SportComplex> findStadiumByTeam(String currentTeam) {
        return sportComplexList
                .stream()
                .filter(sportComplex -> sportComplex instanceof Stadium)
                .filter(stadiumWithFreeSits ->
                        ((Stadium) stadiumWithFreeSits).getHomeTeam().equals(currentTeam) || ((Stadium) stadiumWithFreeSits).getAwayTeam().equals(currentTeam))
                .collect(Collectors.toList());
    }

    public List<SportComplex> getSportComplexList() {
        return sportComplexList;
    }

    public void printSportComplexList() {
        for (SportComplex sportComplex : sportComplexList){
            sportComplex.toString();
        }
    }

}
