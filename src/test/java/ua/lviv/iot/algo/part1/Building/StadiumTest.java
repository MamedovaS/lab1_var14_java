package ua.lviv.iot.algo.part1.Building;

import org.junit.Assert;
import org.junit.Test;

public class StadiumTest {
    public static final int ATTENDIES_GROUP_COUNT = 100;

    private Stadium testObj = new Stadium(123, "zxc", "vbn", "mnb", 600);

    @Test
    public void shouldCheckIfThereFreeSitsAndReturnTrue() {
        testObj.isThereFreeSits(5);

        Assert.assertTrue(testObj.isThereFreeSits(5));
    }

    @Test
    public void shouldCheckIfThereFreeSitsAndReturnFalse() {
        testObj.isThereFreeSits(601);

        Assert.assertFalse(testObj.isThereFreeSits(601));
    }

    @Test
    public void shouldAddAttendies() {
        testObj.addAttendies(5);

        Assert.assertTrue(testObj.getCurrentAttendance() <= testObj.getCapacity());
    }

    @Test
    public void shouldDecreaseAttendance() {
        testObj.decreaseAttendance();

        Assert.assertTrue(testObj.getCurrentAttendance() >= 0);
    }

    @Test
    public void shouldChangeHomeTeam() {
        testObj.changeHomeTeam("zxc");

        Assert.assertEquals(testObj.getHomeTeam(), "zxc");
    }

    @Test
    public void shouldChangeAwayTeam() {
        testObj.changeAwayTeam("asd");

        Assert.assertEquals(testObj.getAwayTeam(), "asd");
    }

    @Test
    public void shouldReturnSupportedSports() {
        Assert.assertEquals(testObj.getSupportedSports(), "Football");
    }
}
