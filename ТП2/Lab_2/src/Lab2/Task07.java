package Lab2;
import java.util.Scanner;
public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int x = scanner.nextInt();

        System.out.println("Введите второе число:");
        int y = scanner.nextInt();

        if ((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
            System.out.println("YES");
        }
    }
}
