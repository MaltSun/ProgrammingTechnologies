import java.util.Random;
public class Task_07 {//одинаковые ли
    public static void main(String[] args) {


        Random r = new Random();
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(20);
            System.out.print(array[i] + " ");
        }
        //int[] array = {5, 5, 5, 5, 5};
        boolean allEqual = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[0]) {
                allEqual = false;
                i= array.length;
                //break;
            }
        }

        if (allEqual) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
