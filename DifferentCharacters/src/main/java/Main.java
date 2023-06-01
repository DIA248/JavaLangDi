import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = in1.nextInt();
        String[] str = new String[n];
        Scanner in2 = new Scanner(System.in);
        for (int i = 0; i < str.length; i++) {
            System.out.println("Строка " + (i + 1) + ":");
            str[i] = in2.nextLine();
        }

        int[] count = new int[n];

        for (int i = 0; i < str.length; i++) {
            for (int j = i; j < str[i].length(); j++) {
                char temp = ' ';
                for (int f = j; f < str[i].length(); f++) {
                    if (str[i].charAt(j) != str[i].charAt(f) && temp != str[i].charAt(f)) {
                        temp = str[i].charAt(f);
                        count[i]++;
                    }
                }
            }
        }
        int max = 0;
        String answer = "";
        for (int i = 0; i < count.length; i++) {
            if (max <= count[i]) {
                max = count[i];
                answer = str[i];
            }
        }
        System.out.println("Ответ: " + answer);
    }
}
