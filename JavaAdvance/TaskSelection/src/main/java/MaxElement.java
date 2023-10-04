import java.util.ArrayList;
import java.util.Scanner;


public class MaxElement {

    private final ArrayList<String> arrayOfWords;
    private final int dimension;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MaxElement words = new MaxElement(in);
        words.searchTheLongestElement();
        in.close();
    }


    /**
     * Конструктор создает экземпляр класса и запрашивает у пользователя размерность массива и сами элементы
     * @param in для ввода данных из консоли
     */

    public MaxElement(Scanner in) {
        System.out.print("Введите количество слов: ");
        dimension = in.nextInt();
        arrayOfWords = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            arrayOfWords.add(in.next());
        }
    }

    /**
     * Метод ищет и выводит на экран самое длинное слово
     */
    public void searchTheLongestElement() {
        String theLongestElement = "";
        for(int i = 0; i < dimension; i++) {
            if(theLongestElement.length() < arrayOfWords.get(i).length())
                theLongestElement = arrayOfWords.get(i);
        }
        System.out.println("Самое длинное слово: " + theLongestElement);
    }
}
