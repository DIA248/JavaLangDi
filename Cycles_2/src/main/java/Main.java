import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int n = in.nextInt();
        in.close();

        int[] myArray = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            myArray[i] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            if (!(myArray[i] % 2 == 0)) {
                sum = sum + myArray[i];
            }
        }
    }
}

