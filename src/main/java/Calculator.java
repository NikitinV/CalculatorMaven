import java.util.HashMap;


public class Calculator {
    HashMap<String, IProcessor> processorHashMap = new HashMap<>();
    ExpressionValidator validator = new ExpressionValidator();

    public HashMap<String, IProcessor> getProcessorHashMap() {
        return processorHashMap;
    }

    private void fill() {
        processorHashMap.put("+", new Plusator());
        processorHashMap.put("-", new Minusator());
        processorHashMap.put("*", new Umnogator());
        processorHashMap.put("/", new Podelator());
    }

    public Calculator() {
        fill();
        validator.fill(getSigns());
    }
    public  String[] getSigns () {
        int i=0;
        return  (String[]) processorHashMap.keySet().toArray(new String[processorHashMap.size()]);

    }
    public double calculate (String text){

        ValidationResult checkResult =validator.validate(text);
        if (checkResult.isCorrect())
        {
        String[] ar = text.split(" ");
        double arg1 = Double.parseDouble(ar[0]);
        double arg2 = Double.parseDouble(ar[2]);
        String sign = ar[1];
        return processorHashMap.get(sign).process(arg1,arg2);}
        else
        {
         throw (   new ArithmeticException(checkResult.getMessage()));
        }
    }
}
