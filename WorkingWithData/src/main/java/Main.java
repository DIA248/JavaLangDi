import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        String num1 = in.nextLine();

        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();

        if (Integer.parseInt(num1) > num2) {
            System.out.println("Большее значение: " + num1);
            System.out.println("Меньшее значение: " + Double.parseDouble(String.valueOf(num2)));
        } else {
            System.out.println("Большее значение: " + num2);
            System.out.println("Меньшее значение: " + Double.parseDouble(num1));
        }

    }
}

