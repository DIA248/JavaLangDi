import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double num1;
        double num2;
        double answer;
        char operator;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        num1 = in.nextDouble();
        num2 = in.nextDouble();
        System.out.print("\nВведите оператор (+, -, *, /): ");
        operator = in.next().charAt(0);
        in.close();
        switch (operator) {
            case '+' -> answer = num1 + num2;
            case '-' -> answer = num1 - num2;
            case '*' -> answer = num1 * num2;
            case '/' -> answer = num1 / num2;
            default -> {
                System.out.print("Введен некорректный оператор");
                return;
            }
        }
        System.out.print("\nРезультат выполнения операции " + operator + ":\n");
        System.out.print(num1 + " " + operator + " " + num2 + " = " + answer);
    }
}