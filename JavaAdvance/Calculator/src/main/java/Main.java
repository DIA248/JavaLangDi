import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float num1 = in.nextFloat();
        System.out.print("Введите второе число: ");
        float num2 = in.nextFloat();
        System.out.print("\nВведите оператор (+, -, *, /): ");
        char operator = in.next().charAt(0);
        in.close();
        switch (operator) {
            case '+' -> System.out.printf("Результат суммирования двух чисел: %.4f\n", addition(num1, num2));
            case '-' -> System.out.printf("Результат вычитания двух чисел: %.4f\n", subtraction(num1, num2));
            case '*' -> System.out.printf("Результат умножения двух чисел: %.4f\n", multiplication(num1, num2));
            case '/' -> System.out.printf("Результат деления двух чисел: %.4f\n", division(num1, num2));
            default -> System.out.print("Введен некорректный оператор"); //Если было введено что-то кроме значений, указанных в case
        }
    }
    /**
     * @param x Первое число
     * @param y Второе число
     * @return Возвращает результат сложения двух чисел
     */
    private static float addition (float x, float y){
        return x + y;
    }
    /**
     * @param x Первое число
     * @param y Второе число
     * @return Возвращает результат вычитания двух чисел
     */
    private static float subtraction (float x, float y) {
        return x - y;
    }
    /**
     * @param x Первое число
     * @param y Второе число
     * @return Возвращает результат умножения двух чисел
     */
    private static float multiplication (float x, float y){
        return x * y;
    }
    /**
     * @param x Первое число
     * @param y Второе число
     * @return Возвращает результат деления двух чисел
     */
    private static float division (float x, float y){
        return x / y;
    }
}