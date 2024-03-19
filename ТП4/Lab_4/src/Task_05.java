import java.util.Scanner;

public class Task_05 {//равные ли по количеству символов
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите предложение");
        String line1 = scan.nextLine();
        String[] letters1 = line1.split(",");
        System.out.println("Введите предложение");
        String line2 = scan.nextLine();
        String[] letters2 = line2.split(" ");

        for (int i = 0; i < letters1.length; i++)
        {
            if(letters1[i].length()!=letters2[i].length())
            {
                System.out.printf("Не является");
              break;
            }
            System.out.printf("является");
        }
    }
}
