package Lab2;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер билета");
        int number = scanner.nextInt();

        int sum1 = number%10+ (number/10)%10+(number/100)%10;
        number=number/1000;
        int sum2 = number%10+ (number/10)%10+(number/100)%10;

        if (sum1==sum2) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
