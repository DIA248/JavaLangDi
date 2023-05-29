import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int unitOfMeasurement;
        double num;
        String answer;
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите что переводить: 1 - масса, 2 - расстояние\n");
        int translate = in.nextInt();

        if (translate == 1) {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна\n");
            unitOfMeasurement = in.nextInt();
            System.out.println("Введите число:\n");
            num = in.nextDouble();
            switch (unitOfMeasurement) {
                case 1 -> answer = "Граммы: " + decimalFormat.format(num) + "\nКилограммы: " + decimalFormat.format(num / 1000)
                        + "\nЦентнеры: " + decimalFormat.format(num / 100000) + "\nТонн:" + decimalFormat.format(num / 1000000);
                case 2 -> answer = "Граммы: " + decimalFormat.format(num * 1000) + "\nКилограммы: " + decimalFormat.format(num)
                        + "\nЦентнеры: " + decimalFormat.format(num / 100) + "\nТонн:" + decimalFormat.format(num / 1000);
                case 3 -> answer = "Граммы: " + decimalFormat.format(num * 100000) + "\nКилограммы: " + decimalFormat.format(num * 100)
                        + "\nЦентнеры: " + decimalFormat.format(num) + "\nТонн:" + decimalFormat.format(num / 10);
                case 4 -> answer = "Граммы: " + decimalFormat.format(num * 1000000) + "\nКилограммы: " + decimalFormat.format(num * 1000)
                        + "\nЦентнеры: " + decimalFormat.format(num * 10) + "\nТонн:" + decimalFormat.format(num);
                default -> {
                    System.out.print("Введена некорректная единица измерения");
                    return;
                }
            }
            System.out.println(answer);
        } else if (translate == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут\n");
            unitOfMeasurement = in.nextInt();
            System.out.println("Введите число:\n");
            num = in.nextDouble();
            switch (unitOfMeasurement) {
                case 1 -> answer = "Метры: " + decimalFormat.format(num) + "\nМили: " + decimalFormat.format(num / 1609.344)
                        + "\nЯрды: " + decimalFormat.format(num / 0.9144) + "\nФуты: " + decimalFormat.format(num / 0.3048);
                case 2 -> answer = "Метры: " + decimalFormat.format(num * 1609.344) + "\nМили: " + decimalFormat.format(num)
                        + "\nЯрды: " + decimalFormat.format(num / 0.00057) + "\nФуты: " + decimalFormat.format(num / 0.00019);
                case 3 -> answer = "Метры: " + decimalFormat.format(num * 0.9144) + "\nМили: " + decimalFormat.format(num * 0.00057)
                        + "\nЯрды: " + decimalFormat.format(num) + "\nФуты: " + decimalFormat.format(num / 0.33333);
                case 4 -> answer = "Метры: " + decimalFormat.format(num * 0.3048) + "\nМили: " + decimalFormat.format(num * 0.00019)
                        + "\nЯрды: " + decimalFormat.format(num * 0.33333) + "\nФуты: " + decimalFormat.format(num);
                default -> {
                    System.out.print("Введена некорректная единица измерения");
                    return;
                }
            }
            System.out.println(answer);
        }
        else {
            System.out.println("Введено некорректное значение. Необходимо ввести 1 - масса или 2 - расстояние");
        }
    }
}

