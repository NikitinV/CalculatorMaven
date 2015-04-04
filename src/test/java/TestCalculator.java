
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    @Test

    public void testPlus() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(true, calculator.getProcessorHashMap().containsKey("+"));
        assertEquals(true,  calculator.getProcessorHashMap().get("+") instanceof Plusator);

    }

    @Test
    public void testMinus() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(true, calculator.getProcessorHashMap().containsKey("-"));
        assertEquals(true,  calculator.getProcessorHashMap().get("-") instanceof Minusator);
    }

    @Test
    public void testPodelator() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(true, calculator.getProcessorHashMap().containsKey("/"));
        assertEquals(true,  calculator.getProcessorHashMap().get("/") instanceof Podelator);
    }

    @Test
    public void testUmnogit() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(true, calculator.getProcessorHashMap().containsKey("*"));
        assertEquals(true,  calculator.getProcessorHashMap().get("*") instanceof Umnogator);
    }

}