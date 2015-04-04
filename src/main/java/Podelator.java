
public class Podelator implements IProcessor {
    @Override
    public double process(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        else {
            System.out.println("Деление на 0 запрещено");
            throw new ArithmeticException("\"Деление на 0 запрещено\"");
        }
    }
}
