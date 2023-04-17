package ua.lviv.iot.algo.part1.Building;

import org.junit.Assert;
import org.junit.Test;

public class StadiumTest {
    public static final int ATTENDIES_GROUP_COUNT = 100;

    private Stadium stadium = new Stadium(123, "zxc", "vbn", "mnb", 600);

    @Test
    public void shouldCheckIfThereFreeSitsAndReturnTrue() {
        stadium.isThereFreeSits(5);

        Assert.assertTrue(stadium.isThereFreeSits(5));
    }

    @Test
    public void shouldCheckIfThereFreeSitsAndReturnFalse() {
        stadium.isThereFreeSits(601);

        Assert.assertFalse(stadium.isThereFreeSits(601));
    }

    @Test
    public void shouldAddAttendies() {
        stadium.addAttendies(5);

        Assert.assertTrue(stadium.getCurrentAttendance() <= stadium.getCapacity());
    }

    @Test
    public void shouldDecreaseAttendance() {
        stadium.decreaseAttendance();

        Assert.assertTrue(stadium.getCurrentAttendance() >= 0);
    }

    @Test
    public void shouldChangeHomeTeam() {
        stadium.changeHomeTeam("zxc");

        Assert.assertEquals(stadium.getHomeTeam(), "zxc");
    }

    @Test
    public void shouldChangeAwayTeam() {
        stadium.changeAwayTeam("asd");

        Assert.assertEquals(stadium.getAwayTeam(), "asd");
    }

    @Test
    public void shouldReturnSupportedSports() {
        Assert.assertEquals(stadium.getSupportedSports(), "Football");
    }

    @Test
    public void shouldGetHeaders(){

    }
}
