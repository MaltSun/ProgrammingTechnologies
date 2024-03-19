package Lab2;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        int x = in.nextInt();

        System.out.println("Введите x");
        int y = in.nextInt();

        if(x>=0)
        {
            if(y>=0)
            System.out.println("Четверть I");
            else System.out.println("Четверть IV");
        }
        if(x<=0)
        {
            if(y>=0)
                System.out.println("Четверть II");
            else System.out.println("Четверть III");
        }

    }

}
