import java.util.Random;
import java.util.Scanner;
public class Task_09 {//матрица, мин+мах, наиболее повторяющиеся
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];
        Random random = new Random();


        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(101);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int min = array[0][0];
        int max = array[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Наименьший элемент: " + min);
        System.out.println("Наибольший элемент: " + max);

        boolean found = false;
        int rfr=found==true? 6:7;
        if (found== true)
        {
             rfr=6;
        }else{
            rfr=7;
        }
                for (int i = 0; i < n && !found; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = i; k < n; k++) {
                    for (int l = (k == i ? j + 1 : 0); l < n; l++)
                    {
                        if (array[i][j] == array[k][l]) {
                            System.out.println("Повторяющееся значение: " + array[i][j]);//+ " в ячейках [" + i + "," + j + "] и [" + k + "," + l + "]");
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Повторяющихся значений не найдено.");
        }
    }
}
