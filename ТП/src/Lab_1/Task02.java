package Lab_1;

public class Task02 {
    public static void main(String[] args) {

        int n = 152;

        int a1 = n % 10;
        n=n/10;
        int a2 = n % 10;
        int a3 = n / 10;
        System.out.println("Сумма = " + (a1 + a2 + a3));

    }
}
