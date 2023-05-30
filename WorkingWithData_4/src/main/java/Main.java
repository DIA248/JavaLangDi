import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random mRand = new Random();
        int[] myArray = new int[15];
        int maxNum = myArray[0];
        int minNum = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = mRand.nextInt(20 + 20 + 1) - 20;
        }

        for (int j : myArray) {
            if (j > maxNum)
                maxNum = j;
        }

        for (int j : myArray) {
            if (j < minNum)
                minNum = j;
        }

        System.out.println("Максимальный элемент массива: " + maxNum);
        System.out.println("Минимальный элемент массива: " + minNum);
        System.out.println("Наибольшее по модулю из максимального и минимального значений: "
                + Math.max(Math.abs(maxNum), Math.abs(minNum)));
    }
}