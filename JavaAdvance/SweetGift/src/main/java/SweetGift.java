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
        int totalPrice = 0;
        int totalWeight = 0;
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
                    Candy candyChocoLap = new Candy("Конфеты \"CHOCO-LAPKI\"", 200, 437, "Страна производства - Польша");
                    sweets.add(candyChocoLap);
                    totalWeight += candyChocoLap.getWeight();
                    totalPrice += candyChocoLap.getPrice();
                    System.out.println("Конфеты \"CHOCO-LAPKI\" добавлены в подарок");
                }
                case "2" -> {
                    Jellybean funnyBalls = new Jellybean("Желейные шарики \"Смешные шарики\"", 59, 78, "Калорийность - 84 ккал на 100 г.");
                    sweets.add(funnyBalls);
                    totalWeight += funnyBalls.getWeight();
                    totalPrice += funnyBalls.getPrice();
                    System.out.println("Желейные шарики \"Смешные шарики\" добавлены в подарок");
                }
                case "3" -> {
                    Candy candyLev = new Candy("Конфеты \"Лёвушка\"", 119, 186, "Страна производства - Россия");
                    sweets.add(candyLev);
                    totalWeight += candyLev.getWeight();
                    totalPrice += candyLev.getPrice();
                    System.out.println("Конфеты \"Лёвушка\" добавлены в подарок");
                }
                case "4" -> {
                    Lollypop chupaChups = new Lollypop("Леденец \"Чупа-чупс\"", 99, 123, "Вкус - мятный");
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
            System.out.println(count + ". " + sweet.getName() + " - " + sweet.getUniqueParameter());
        }
        System.out.printf("\nОбщий вес подарка: %s гр.\nОбщая стоимость подарка: %s руб.%n", totalWeight, totalPrice);
    }

}