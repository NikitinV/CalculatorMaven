import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPodelator {
    @Test

    public void testPlusPlus() throws Exception {
        Podelator testPodelator = new Podelator();
        double n = testPodelator.process(2, 2);
        assertEquals(0, n, 1e-10);
    }
    public void test1PlusMinus() throws Exception {
        Podelator testPodelator = new Podelator();
        double n = testPodelator.process(2, -3);
        assertEquals(5, n, 1e-10);
    }
    public void testMinusPlus() throws Exception {
        Podelator testPodelator = new Podelator();
        double n = testPodelator.process(-3, 2);
        assertEquals(-5, n, 1e-10);
    }
    public void testMinusMinus() throws Exception {
        Podelator testPodelator = new Podelator();
        double n = testPodelator.process(-2, -3);
        assertEquals(1, n, 1e-10);
    }

}

