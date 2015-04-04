import java.util.ArrayList;


public class ExpressionValidator {
    public  ArrayList<String> signs = new ArrayList<>();

    public  void fill(String[]arr) {
        signs.clear();

        for (int i=0;i<arr.length;i++)
        {
            signs.add(arr[i]);
        }
    }

    public  ValidationResult validate(String text) {
        String[] ar = text.split(" ");
        ValidationResult retVal = new ValidationResult();
        if (ar.length == 3) {

            if (signs.contains(ar[1])) {
                try {
                    double arg1 = Double.parseDouble(ar[0]);
                    double arg2 = Double.parseDouble(ar[2]);
                    retVal.setCorrect(true);
                    return retVal;
                } catch (Exception ex) {
                    retVal.setCorrect(false);
                    retVal.setMessage("ошибка в в параметре, не число");
                    return retVal;

                }
            }
            else
            {
                retVal.setCorrect(false );
                retVal.setMessage("Не поддерживаемая операция "+ ar[1]);
                return retVal;
            }
        }
        else {
            retVal.setCorrect(false);
            retVal.setMessage("Нет трех компонентов");
            return retVal;
        }

    }

}
