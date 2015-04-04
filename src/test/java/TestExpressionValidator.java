
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExpressionValidator {


    private ExpressionValidator createValidator()
    {
        ExpressionValidator validator = new ExpressionValidator();
        String[] operations = new String[]{"+","-","*","/"};
        validator.fill(operations);
        return validator;
    }
    @Test
    public void testCheckAddHappy() throws Exception {
        ExpressionValidator validator= createValidator();
       ValidationResult result =   validator.validate("2 + 2");
        assertEquals(true, result.isCorrect());
       // assertEquals(true, result.isCorrect(), 1e-10);
    }
    @Test
    public void testCheckNoComponents() throws Exception {
        ExpressionValidator validator= createValidator();
        ValidationResult result =   validator.validate("2+2");
        assertEquals(false, result.isCorrect());
        assertEquals("Нет трех компонентов", result.getMessage());
    }
    @Test
    public void testCheckFirstParametrUnhappy() throws Exception {
        ExpressionValidator validator= createValidator();
        ValidationResult result =   validator.validate("a + 2");
        assertEquals(false, result.isCorrect());
        assertEquals("ошибка в в параметре, не число", result.getMessage());
    }
    @Test
    public void testCheckSecondParametrUnhappy() throws Exception {
        ExpressionValidator validator= createValidator();
        ValidationResult result =   validator.validate("2 + a");
        assertEquals(false, result.isCorrect());
        assertEquals("ошибка в в параметре, не число", result.getMessage());
    }
    @Test
    public void testCheckMinusHappy() throws Exception {
        ExpressionValidator validator = createValidator();
        ValidationResult result = validator.validate("2 - 2");
        assertEquals(true, result.isCorrect());
    }

    @Test
    public void testCheckMultiplayHappy() throws Exception {
        ExpressionValidator validator = createValidator();
        ValidationResult result = validator.validate("2 * 2");
        assertEquals(true, result.isCorrect());
    }

    @Test
    public void testCheckDivHappy() throws Exception {
        ExpressionValidator validator = createValidator();
        ValidationResult result = validator.validate("2 / 2");
        assertEquals(true, result.isCorrect());
    }
    @Test
    public void testCheckUnCorrectSimbol() throws Exception {
        ExpressionValidator validator = createValidator();
        ValidationResult result = validator.validate("2 % 2");
        assertEquals("Не поддерживаемая операция %", result.getMessage());
        assertEquals(false, result.isCorrect());
    }
}
