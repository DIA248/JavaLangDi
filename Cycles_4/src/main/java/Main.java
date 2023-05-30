import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int row = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int lengthSize = in.nextInt();
        System.out.println("Введите ширину массива: ");
        int widthSize = in.nextInt();

        double[][] myArray = new double[lengthSize][widthSize];
        System.out.println("Введите элементы массива:\n");

        for (int i = 0; i < lengthSize; i++) {
            for (int j = 0; j < widthSize; j++) {
                myArray[i][j] = in.nextDouble();
            }
        }

        in.close();

        for (int i = 0; i < myArray[row].length; i++) {
            System.out.print(myArray[row][i] * 3 + " ");
        }
    }
}

