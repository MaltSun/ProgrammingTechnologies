package Lab2;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввведите первый коэфицент:");
        double a = scanner.nextInt();

        System.out.println("Введите второй коэфицент:");
        double b = scanner.nextInt();

        System.out.println("Введите третий коэфицент:");
        double c = scanner.nextInt();

        double discriminant = b*b-4*a*c;
        if(discriminant >= 0)
        {
            double x1= (-b-Math.sqrt(discriminant))/(2*a);
            double x2= (-b+Math.sqrt(discriminant))/(2*a);

            System.out.printf("Первый корень: "+x1);
            System.out.printf("Второй корень: "+ x2);
        }
        else System.out.printf("Нет корней");


    }
}
