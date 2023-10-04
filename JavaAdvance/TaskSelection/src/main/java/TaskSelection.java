import java.util.Scanner;


public class TaskSelection {

    private final int taskNumber;

    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        TaskSelection runner = new TaskSelection(in);
        runner.run(in);
        in.close();
    }

    /**
     * Конструктор создает экземпляр класса и задает номер задания
     * @param in для ввода данных из консоли
     */
    private TaskSelection(Scanner in) {
        System.out.println("""
                Введите номер задания:\s
                1 - калькулятор,\s
                2 - поиск максимального слова""");
        taskNumber = Integer.parseInt(in.nextLine());
    }

    /**
     * Исходя из номера задания выполняет задание.
     * @param in для ввода данных из консоли
     */
    public void run (Scanner in) {
        switch (taskNumber) {
            case 1 -> {
                Calculator calc = new Calculator(in);
                calc.operatorSelection(in);
            }
            case 2 -> {
                MaxElement words = new MaxElement(in);
                words.searchTheLongestElement();
            }
            default -> System.out.println("Нет задания с таким номером");
        }
    }
}
