package Lab2;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите время");
        int num = in.nextInt();

        if(num>= 6 && num<10)
        {
            System.out.println("Доброе уторо!");
        }
        if(num> 10 && num<17)
        {
            System.out.println("Добрый день!");
        }
        if(num>= 17 && num<=21)
        {
            System.out.println("Добрый вечер!");
        }
        if(num>21)
        {
            System.out.println("Доброй ночи!");
        }
    }

}
