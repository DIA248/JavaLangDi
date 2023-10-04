import java.util.Scanner;

public class Calculator {

    private final double num1;
    private final double num2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator calc = new Calculator(in);
        calc.operatorSelection(in);
        in.close();
    }

    /**
     * Конструктор создает экземпляр класса и запрашивает у пользователя первое и второе число
     * @param in для ввода данных из консоли
     */

    public Calculator(Scanner in) {
        System.out.println("Введите первое число: ");
        num1 = in.nextDouble();
        System.out.println("Введите второе число: ");
        num2 = in.nextDouble();
    }

    public void operatorSelection(Scanner in) {
        System.out.print("\nВведите оператор (+, -, *, /): ");
        char operator = in.next().charAt(0);
        in.close();
        switch (operator) {
            case '+':
                System.out.printf("Результат суммирования двух чисел: %.4f\n", addition(num1, num2));
                break;
            case '-':
                System.out.printf("Результат вычитания двух чисел: %.4f\n", subtraction(num1, num2));
                break;
            case '*':
                System.out.printf("Результат умножения двух чисел: %.4f\n", multiplication(num1, num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.printf("Результат деления двух чисел: %.4f\n", division(num1, num2));
                } else {
                    System.out.println("На ноль делить нельзя!");
                }
                break;
            default: System.out.println("Введен некорректный оператор");
        }
    }
    /**
     * @param x Первое число
     * @param y Второе число
     * @return Возвращает результат сложения двух чисел
     */
    private static double addition (double x, double y){
        return x + y;
    }
    /**
     * @param x Первое число
     * @param y Второе число
     * @return Возвращает результат вычитания двух чисел
     */
    private static double subtraction (double x, double y) {
        return x - y;
    }
    /**
     * @param x Первое число
     * @param y Второе число
     * @return Возвращает результат умножения двух чисел
     */
    private static double multiplication (double x, double y){
        return x * y;
    }
    /**
     * @param x Первое число
     * @param y Второе число
     * @return Возвращает результат деления двух чисел
     */
    private static double division (double x, double y){
        return x / y;
    }
}
