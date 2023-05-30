import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами. " +
                "Например, \"I love java 8 Я люблю java 14 core1\" : ");
        String str = in.nextLine();
        String[] strArray = str.split("[\\d\\s\\p{L}\\p{M}&&[^\\p{Alpha}]]+");

        System.out.println("Слова, состоящие из латиницы:");

        for (String s : strArray) {
            System.out.println(s);
        }
        System.out.println("Количество слов, состоящих из латиницы: " + strArray.length);
    }
}