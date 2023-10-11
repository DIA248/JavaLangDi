import java.io.*;
import java.util.*;


public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        //Прочитать слова из файла.

        Scanner in = new Scanner(new File("File/words.txt"));
        String string = in.nextLine();
        String[] words = string.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }

        // Отсортировать в алфавитном порядке.
        List<String> mapValues = new ArrayList<>(wordToCount.keySet());
        Collections.sort(mapValues);

        //Посчитать сколько раз каждое слово встречается в файле. Вывести статистику на консоль
        System.out.println("Статистика повторений в алфавитном порядке:");
        for (String sortWords : mapValues) {
            System.out.printf("\nСлово '%s' встречается в файле %d раз(а)%n",sortWords, wordToCount.get(sortWords));
        }

        //Найти слово с максимальным количеством повторений
        // (или слова, если у каких-то слов количество повторений совпадает).
        int maxValueInMap=(Collections.max(wordToCount.values()));
        System.out.println("\nСлово (или слова) с максимальным количеством повторений - количество повторений: ");
        for (Map.Entry<String, Integer> entry : wordToCount.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}