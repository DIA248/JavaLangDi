import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        in.close();

        double average = (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + average);

        double rounding = Math.floor(average / 2);

        if (rounding > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}

