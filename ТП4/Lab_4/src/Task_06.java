import java.util.Random;

public class Task_06 {// рандои и мин+мах
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(121) - 70;
            System.out.print(array[i] + " ");
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
