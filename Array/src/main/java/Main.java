public class Main {
    public static void main(String[] args) {
        int[] myArray = {8, 3, 7, 1, 9};
        int change = myArray[0];
        myArray[0] = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = change;

        int sum =  myArray [0] + myArray[myArray.length / 2];
        System.out.println(sum);

    }
}