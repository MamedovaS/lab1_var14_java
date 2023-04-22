package ua.lviv.iot.algo.part1.Building;

import junit.framework.TestCase;
import lombok.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import java.util.*;

public class SportComplexManagerTest {
    private SportComplexManager manager;
    public static final int  NUM_FOR_TEST_FINDING_BY_FREE_SITS=10;

    @Before
    public void setUp() {
        manager = new SportComplexManager();
        List<SportComplex> sportComplexes = new LinkedList<>();
        sportComplexes.add(new Stadium(321, "asd", "gfd", "hjk", 551));
        sportComplexes.add(new Stadium(123, "zxc", "vbn", "mnb", 600));
        sportComplexes.add(new SwimmingPool());
    }

    @Test
    public void shouldAddSportComplex() {

        Assert.assertNotNull(manager.getSportComplexList());
    }

    @Test
    public void shouldFindStadiumByFreeSit() {

        var results = manager.findStadiumByFreeSit(NUM_FOR_TEST_FINDING_BY_FREE_SITS);

        Assert.assertEquals(0, results.size());

        for (var stadium : results) {
            Assert.assertTrue(stadium.getFreeSits() > NUM_FOR_TEST_FINDING_BY_FREE_SITS);
        }
    }

    @Test
    public void shouldFindStadiumByTeam() {

        var results = manager.findStadiumByTeam("asd");

        for (var stadium : results){
            Assert.assertEquals( stadium.getHomeTeam(), "asd");
        }
    }

    @Test
    public void shouldReturnSportComplexList() {
        Assert.assertNotNull(manager.getSportComplexList());
    }


}
