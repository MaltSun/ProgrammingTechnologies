import java.util.Scanner;

public class Task_03 {//средняя длина слова
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите предложение");
        String line = scan.nextLine();
        String[] words = line.split(" ");
        int sum = 0;

        for (String word : words) {
            sum += word.length();
        }
        System.out.println(sum / words.length);
    }
}
