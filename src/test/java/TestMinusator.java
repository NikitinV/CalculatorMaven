import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMinusator {
    @Test

    public void testPlusPlus() throws Exception {
        Minusator testMinusator = new Minusator();
        double n = testMinusator.process(2, 2);
        assertEquals(0, n, 1e-10);
    }
    public void test1PlusMinus() throws Exception {
        Minusator testMinusator = new Minusator();
        double n = testMinusator.process(2, -3);
        assertEquals(5, n, 1e-10);
    }
    public void testMinusPlus() throws Exception {
        Minusator testMinusator = new Minusator();
        double n = testMinusator.process(-3, 2);
        assertEquals(-5, n, 1e-10);
    }
    public void testMinusMinus() throws Exception {
        Minusator testMinusator = new Minusator();
        double n = testMinusator.process(-2, -3);
        assertEquals(1, n, 1e-10);
    }
    public void testMinusNull() throws Exception {
        Minusator testMinusator = new Minusator();
        double n = testMinusator.process(-2, 0);
        assertEquals(-2, n, 1e-10);
    }
    public void testPlusNull() throws Exception {
        Minusator testMinusator = new Minusator();
        double n = testMinusator.process(2, 0);
        assertEquals(2, n, 1e-10);
    }
    public void testNullNull() throws Exception {
        Minusator testMinusator = new Minusator();
        double n = testMinusator.process(0, 0);
        assertEquals(0, n, 1e-10);
    }
}
