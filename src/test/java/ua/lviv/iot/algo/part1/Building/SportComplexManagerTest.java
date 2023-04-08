package ua.lviv.iot.algo.part1.Building;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class SportComplexManagerTest{
    private static List<SportComplex> testSportComplexList = new LinkedList<>();
    private SportComplexManager testOdj = new SportComplexManager();

    @Test
    public void shouldAddSportComplex() {
        SportComplex sportComplex = new Stadium();

        testOdj.addSportComplex(sportComplex);

        Assert.assertEquals(testOdj.getSportComplexList().get(0), sportComplex);
    }

    @Test
    public void shouldAddSportComplexes() {
        List<SportComplex> sportComplexes = new LinkedList<>();
        sportComplexes.add(new Stadium());
        sportComplexes.add(new Stadium());

        testOdj.addSportComplexes(sportComplexes);

        Assert.assertEquals(testOdj.getSportComplexList().get(0), sportComplexes.get(0));
    }

    @Test
    public void shouldFindStadiumByFreeSit() {
        List<SportComplex> sportComplexes = new LinkedList<>();
        sportComplexes.add(new Stadium(321, "asd", "gfd", "hjk", 550));
        sportComplexes.add(new Stadium(123, "zxc", "vbn", "mnb", 600));
        sportComplexes.add(new SwimmingPool());

        testOdj.findStadiumByFreeSit(10);

        Assert.assertNotNull(testOdj.findStadiumByFreeSit(10));
    }

    @Test
    public void shouldFindStadiumByTeam() {
        List<SportComplex> sportComplexes = new LinkedList<>();
        sportComplexes.add(new Stadium(321, "asd", "gfd", "hjk", 550));
        sportComplexes.add(new Stadium(123, "zxc", "vbn", "mnb", 600));
        sportComplexes.add(new SwimmingPool());

        testOdj.findStadiumByTeam("asd");

        Assert.assertNotNull(testOdj.findStadiumByTeam("asd"));
    }

    @Test
    public void shouldReturnSportComplexList() {
        Assert.assertNotNull(testOdj.getSportComplexList());
    }


}
