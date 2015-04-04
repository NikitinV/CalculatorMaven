import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlusator {
    @Test

    public void testPlusPlus() throws Exception {
    Plusator testPlusator = new Plusator();
        double n = testPlusator.process(2, 2);
        assertEquals(4, n, 1e-10);
    }
    public void test1PlusMinus() throws Exception {
        Plusator testPlusator = new Plusator();
        double n = testPlusator.process(2, -3);
        assertEquals(-1, n, 1e-10);
    }
    public void testMinusPlus() throws Exception {
        Plusator testPlusator = new Plusator();
        double n = testPlusator.process(-3, 2);
        assertEquals(-1, n, 1e-10);
    }
    public void testMinusMinus() throws Exception {
        Plusator testPlusator = new Plusator();
        double n = testPlusator.process(-2, -3);
        assertEquals(-5, n, 1e-10);
    }
    public void testMinusNull() throws Exception {
        Plusator testPlusator = new Plusator();
        double n = testPlusator.process(-2, 0);
        assertEquals(-2, n, 1e-10);
    }
    public void testPlusNull() throws Exception {
        Plusator testPlusator = new Plusator();
        double n = testPlusator.process(2, 0);
        assertEquals(2, n, 1e-10);
    }
    public void testNullNull() throws Exception {
        Plusator testPlusator = new Plusator();
        double n = testPlusator.process(0, 0);
        assertEquals(0, n, 1e-10);
    }
}
