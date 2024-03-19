package Lab_1;

public class Task07 {
    public static void main(String[] args) {

        double percent = 2.6;
        double startDeposit = 156.80;

        startDeposit = startDeposit + (startDeposit * percent / 100);
        double finalDeposit = startDeposit * percent / 100 + startDeposit;

        System.out.println("сумма вклада через 2 года = " + finalDeposit);
    }
}
