import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        while (true) {
            System.out.println("My Calculator");
            System.out.println("1 About");
            System.out.println("2 Calculator");
            System.out.println("3 Exit");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String menuIndex = null;
            try {
                menuIndex = reader.readLine();
                switch (menuIndex) {
                    case "1":
                        System.out.println("Мой каклькулятор поддерживает следующие операции");
                        for (int i = 0; i < calculator.getSigns().length; i++) {
                            System.out.println(i + ". a " + calculator.getSigns()[i] + " b");
                        }
                        break;
                    case "2": {
                        System.out.println("Введите необходимое выражение в виде А знак В");

                        try {
                            String vir = reader.readLine();
                            System.out.println(calculator.calculate(vir));
                        } catch (ArithmeticException ex) {
                            System.out.println("ошибка калькулятора" + ex.toString());
                        } catch (Exception ex) {
                            System.out.println("системная ошибка " + ex.toString());
                        }
                    }


                break;
                case "3":
                    System.exit(0);
                    break;
                default: {
                    System.out.println("Неверный пункт меню");
                }

            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
}
