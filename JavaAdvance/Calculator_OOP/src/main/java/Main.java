import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final double num1;
        final double num2;

        try {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            num1 = in.nextDouble();
            System.out.println("Введите второе число: ");
            num2 = in.nextDouble();
            System.out.print("\nВведите оператор (+, -, *, /, log): ");
            String operator = in.next();
            Calculator calculator = new Calculator();

            System.out.printf("Результат операции: %.4f\n", calculator.performOperation(operator, num1, num2));

        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Exception: Некорректный ввод числа");
        }
    }
}