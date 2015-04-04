import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUmnogator {
    @Test

    public void testPlusPlus() throws Exception {
        Umnogator TestUmnogator = new Umnogator();
        double n = TestUmnogator.process(2, 2);
        assertEquals(4, n, 1e-10);
    }
    public void test1PlusMinus() throws Exception {
        Umnogator TestUmnogator = new Umnogator();
        double n = TestUmnogator.process(2, -3);
        assertEquals(-6, n, 1e-10);
    }
    public void testMinusPlus() throws Exception {
        Umnogator TestUmnogator = new Umnogator();
        double n = TestUmnogator.process(-3, 2);
        assertEquals(-6, n, 1e-10);
    }
    public void testMinusMinus() throws Exception {
        Umnogator TestUmnogator = new Umnogator();
        double n = TestUmnogator.process(-2, -3);
        assertEquals(-6, n, 1e-10);
    }
    public void testMinusNull() throws Exception {
        Umnogator TestUmnogator = new Umnogator();
        double n = TestUmnogator.process(-2, 0);
        assertEquals(0, n, 1e-10);
    }
    public void testPlusNull() throws Exception {
        Umnogator TestUmnogator = new Umnogator();
        double n = TestUmnogator.process(2, 0);
        assertEquals(0, n, 1e-10);
    }
    public void testNullNull() throws Exception {
        Umnogator TestUmnogator = new Umnogator();
        double n = TestUmnogator.process(0, 0);
        assertEquals(0, n, 1e-10);
    }
}
