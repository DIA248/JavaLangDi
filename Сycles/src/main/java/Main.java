import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final double x = 5.45;
        final double y = 8.34;
        final double z = 2.98;

        int count = 0;

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
            if (count == 0) {
                if (myArray[i] == x | myArray[i] == y | myArray[i] == z) {
                    System.out.println("Данное значение имеется в константах");
                    count++;
                }
            }
        }
    }
}

