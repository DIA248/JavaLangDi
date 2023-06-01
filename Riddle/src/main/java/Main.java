import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String answer;
        boolean attempt;
        int count = 0;
        int advice2 = 0;

        final String RIGHT = "Правильно!";
        final String HINT = "Подсказка";
        final String HINT_IS_NOT_AVAILABLE = "Подсказка уже недоступна";
        final String THINK_AGAIN = "Подумай еще!";
        final String ANOTHER_TIME = "Обидно, приходи в другой раз";
        final String ADVICE = "Подсказка: Упакованная болезнь";

        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        while (count < 3) {
            answer = in.nextLine();
            attempt = answer.equalsIgnoreCase("Заархивированный вирус");
            if (count == 0) {
                if (attempt) {
                    System.out.println(RIGHT);
                    break;
                } else if (answer.equalsIgnoreCase(HINT)) {
                    System.out.println(ADVICE);
                    count++;
                    advice2++;
                } else {
                    System.out.println(THINK_AGAIN);
                    count++;
                }
            } else if (count == 1) {
                if (attempt) {
                    System.out.println(RIGHT);
                    break;
                } else if (answer.equalsIgnoreCase(HINT)) {
                    System.out.println(HINT_IS_NOT_AVAILABLE);
                } else if (advice2 == 0) {
                    System.out.println(THINK_AGAIN);
                    count++;
                } else {
                    System.out.println(ANOTHER_TIME);
                    break;
                }
            } else if (count == 2) {
                if (attempt) {
                    System.out.println(RIGHT);
                    break;
                } else if (answer.equalsIgnoreCase(HINT)) {
                    System.out.println(HINT_IS_NOT_AVAILABLE);
                } else {
                    System.out.println(ANOTHER_TIME);
                    break;
                }
            }
        }
    }
}
