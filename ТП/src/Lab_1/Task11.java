package Lab_1;

public class Task11 {
    public static void main(String[] args) {
        int second = 10000000;
        int day = second / 86400;
        int hour = (second - (day * 86400)) / 3600;
        int minute = (second - (day * 86400) - (hour * 3600)) / 60;
        second = second - (day * 86400) - (hour * 3600) - (minute * 60);
        System.out.printf("%d дней %d часов %d минут %d секунд ", day, hour, minute, second);
    }
}
