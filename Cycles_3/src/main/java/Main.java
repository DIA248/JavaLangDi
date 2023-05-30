import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sum = 0.00;
        double average;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = in.nextInt();

        double[] myArray = new double[size];
        System.out.println("Введите элементы массива:\n");

        for (int i = 0; i < size; i++) {
            myArray[i] = in.nextDouble();
        }

        in.close();

        for (int i = 0; i < size; i++) {
            sum = sum + myArray[i];
        }

        average = sum / size;

        for (int i = 0; i < size; i++) {
            System.out.print (myArray[i] * average + "\n");
        }
    }
}

