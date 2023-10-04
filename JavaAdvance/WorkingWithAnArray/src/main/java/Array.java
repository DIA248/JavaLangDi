public class Array {
    private final int[] numbers;

    public static void main(String[] args) {
        Array arr = new Array();
        arr.arrayDisplay();
        arr.swapArrayElements(arr.indexOfMaxNegativeInt(), arr.indexOfMinPositiveInt());
        System.out.print("После того, как поменяли местами максимальный и минимальный элемент имеем ");
        arr.arrayDisplay();
    }

    /**
     * Конструктор создает экземпляр класса с 20 рандомными числами
     */
    public Array() {
        this.numbers = new int[20];
        for (int i =0; i < 20; i++) {
            this.numbers[i] = (int) (Math.random() * 21) - 10;
        }
    }

    /**
     * Метод отображет элементы массива
     */
    public void arrayDisplay() {
        System.out.println("Массив:");
        for(int i = 0; i < 20; i++) {
            System.out.println("" + i + " \t " + this.numbers[i]);
        }
    }

    /**
     * Метод возвращает
     * @return индекс элемента массива равного максимальному отрицательному числу
     */
    public int indexOfMaxNegativeInt() {
        int currentInt = this.numbers[0];
        int currentIndex = 0;
        for(int i = 1; i < 20; i++) {
            if ((this.numbers[i] < 0 && this.numbers[i] < currentInt) || currentInt >= 0) {
                currentInt = this.numbers[i];
                currentIndex = i;
            }
        }
        if(currentInt > 0) {
            System.out.println("Нет ни одного отрицательного значения");
            return  -1;
        }
        return currentIndex;
    }

    /**
     *  Метод возвращает
     *  @return индекс элемента массива равного минимальному положительному числу
     */
    public int indexOfMinPositiveInt() {
        int requiredElement = this.numbers[0];
        int requiredIndex = 0;
        for(int i = 1; i < 20; i++) {
            if ((this.numbers[i] > 0 && this.numbers[i] < requiredElement) || requiredElement <= 0) {
                requiredElement = this.numbers[i];
                requiredIndex = i;
            }
        }
        if(requiredElement < 0) {
            System.out.println("Нет ни одного положительного значения");
            return  -1;
        }
        return requiredIndex;
    }

    /**
     * Метод меняет элементы с заданными индексами местами
     */
    public void swapArrayElements(int index1, int index2) {
        numbers[index1] ^= numbers[index2];
        numbers[index2] ^= numbers[index1];
        numbers[index1] ^= numbers[index2];
    }
}