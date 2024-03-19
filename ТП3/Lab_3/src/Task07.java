import java.util.Scanner;//в обратном порядке

public class Task07 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number= scan.nextInt();

        int[] numbers = new int[]{};
        int i=0;
        while (number > 0) {
            System.out.print(number%10);
            number=number/10;
            numbers[i]=number;
        }

       // int[] numbers = new int[]{};
        for(int num: numbers){
            System.out.print(num);
        }
    }
}
