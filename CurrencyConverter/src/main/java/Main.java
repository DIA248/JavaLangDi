import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        Scanner in = new Scanner(System.in);

        System.out.println("Курс доллара: ");
        double course = in.nextDouble();

        System.out.println("Количество рублей: ");
        double numberOfRubles = in.nextDouble();

        System.out.println("Итого: " + decimalFormat.format(numberOfRubles / course) + " долларов");
    }
}
