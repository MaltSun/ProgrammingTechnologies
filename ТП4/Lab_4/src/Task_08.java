import java.util.Arrays;
import java.util.Random;

public class Task_08 {//отрицание в квадрат
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];


        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n + 3) - 10;
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));


        boolean hasNegative = false;
        for (int num : array) {
            if (num < -1) {
                hasNegative = true;
                break;
            }
        }

        if (hasNegative) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0 && array[i] < -1) {
                    array[i] = array[i] * array[i];
                }
            }

            System.out.println("Результирующий массив: " + Arrays.toString(array));
        } else {

            System.out.println("Результирующий массив: (без изменений) " + Arrays.toString(array));
        }
    }
}
