import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("- Ввод: ");
        String str = in.nextLine();
        String[] strArray = str.split("");

            if (Objects.equals(strArray[0], "x")) {

                int y = Integer.parseInt(strArray[2]);
                int z = Integer.parseInt(strArray[4]);

                if (Objects.equals(strArray[1], "+")) {
                    System.out.println("- Вывод: " + (z - y));
                } else if (Objects.equals(strArray[1], "-")) {
                    System.out.println("- Вывод: " + (z + y));
                }
            } else if (Objects.equals(strArray[2], "x")) {

                int x = Integer.parseInt(strArray[0]);
                int z = Integer.parseInt(strArray[4]);

                if (Objects.equals(strArray[1], "+")) {
                    System.out.println("- Вывод: " + (z - x));
                } else if (Objects.equals(strArray[1], "-")) {
                    System.out.println("- Вывод: " + (x - z));
                }
            } else if (Objects.equals(strArray[4], "x")) {

                int y = Integer.parseInt(strArray[2]);
                int x = Integer.parseInt(strArray[0]);

                if (Objects.equals(strArray[1], "+")) {
                    System.out.println("- Вывод: " + (x + y));
                } else if (Objects.equals(strArray[1], "-")) {
                    System.out.println("- Вывод: " + (x - y));
                }
            }
    }
}
