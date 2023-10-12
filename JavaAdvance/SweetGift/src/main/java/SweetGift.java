import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SweetGift {

    public static void main(String[] args) throws IOException {
        giftFormation();
    }

    public static void giftFormation() throws IOException {
        ArrayList<Sweets> sweets = new ArrayList<>();
        boolean formed = false;
        double totalPrice = 0;
        double totalWeight = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("""
                Из каких сладостей Вы хотите собрать подарок:\s
                1 - конфеты "CHOCO-LAPKI",\s
                2 - желейные шарики "Смешные шарики",\s
                3 - конфеты "Лёвушка",\s
                4 - леденец "Чупа-чупс",\s
                5 - закончить выбор""");

        while (!formed) {

            String choice = reader.readLine();

            switch (choice) {
                case "1" -> {
                    Candy candyChocoLap = new Candy("\"CHOCO-LAPKI\"", 200.66, 437.45, "Польша");
                    sweets.add(candyChocoLap);
                    totalWeight += candyChocoLap.getWeight();
                    totalPrice += candyChocoLap.getPrice();
                    System.out.println("Конфеты \"CHOCO-LAPKI\" добавлены в подарок");
                }
                case "2" -> {
                    Jellybean funnyBalls = new Jellybean("\"Смешные шарики\"", 59.32, 78.56,  84.75);
                    sweets.add(funnyBalls);
                    totalWeight += funnyBalls.getWeight();
                    totalPrice += funnyBalls.getPrice();
                    System.out.println("Желейные шарики \"Смешные шарики\" добавлены в подарок");
                }
                case "3" -> {
                    Candy candyLev = new Candy("\"Лёвушка\"", 119.97, 186.76, "Россия");
                    sweets.add(candyLev);
                    totalWeight += candyLev.getWeight();
                    totalPrice += candyLev.getPrice();
                    System.out.println("Конфеты \"Лёвушка\" добавлены в подарок");
                }
                case "4" -> {
                    Lollypop chupaChups = new Lollypop("\"Чупа-чупс\"", 99.23, 123.65, 6);
                    sweets.add(chupaChups);
                    totalWeight += chupaChups.getWeight();
                    totalPrice += chupaChups.getPrice();
                    System.out.println("Леденец \"Чупа-чупс\" добавлен в подарок");
                }
                case "5" -> formed = true;
            }

        }
        int count = 0;
        System.out.println("\nИнформация о всех сладостях в подарке:");
        for (Sweets sweet:sweets) {
            count++;
            System.out.println(count + ". " + sweet);
        }
        System.out.printf("\nОбщий вес подарка: %.4f гр.\nОбщая стоимость подарка: %.4f руб.%n", totalWeight, totalPrice);
    }

}