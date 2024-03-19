package Lab2;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первые координаты:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Введите вторые координаты:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (y1 > y2) {
            System.out.println("Спуск");
        } else if (y1 < y2) {
            System.out.println("Подъем");
        } else {
            System.out.println("Ровная дорога");
        }

        if (x1 != x2 && y1 != y2) {
            System.out.println("Отвесная");
        }
    }
}
