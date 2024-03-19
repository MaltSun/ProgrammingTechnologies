import java.util.Scanner;//количество цифр в этом числе, а так же сумму этих чисел

public class Task08 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number= scan.nextInt();
   int summ=0;
int count=0;
        while (number > 0) {
            summ+=number%10;
            number=number/10;
            count++;
        }
        System.out.println("Сумма"+ summ);
        System.out.printf("Количество цифр"+count);
    }
}
