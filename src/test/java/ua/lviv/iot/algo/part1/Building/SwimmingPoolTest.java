package ua.lviv.iot.algo.part1.Building;

import org.junit.Assert;
import org.junit.Test;
import ua.lviv.iot.algo.part1.Building.SwimmingPool;

public class SwimmingPoolTest {
    private SwimmingPool testObj = new SwimmingPool();

    @Test
    public void shouldReturnSupportedSports() {
        Assert.assertEquals(testObj.getSupportedSports(), "Swim");
    }

}
