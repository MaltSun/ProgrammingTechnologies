package Lab2;
import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату рождения в формате ДД ММ ГГГГ:");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        String[] zodiacSigns = {"Козерог", "Водолей", "Рыбы", "Овен", "Телец", "Близнецы", "Рак",
                "Лев", "Дева", "Весы", "Скорпион", "Стрелец"};

        int[] lastDaysOfSign = {20, 19, 20, 20, 20, 20, 22, 22, 22, 22, 21, 21};
        String zodiacSign;
        if (day <= lastDaysOfSign[month - 1]) {
           zodiacSign = zodiacSigns[month - 1];
        } else {
            zodiacSign=zodiacSigns[month % 12];
        }

        String[] chineseYears = {"Крыса", "Бык", "Тигр", "Кролик", "Дракон", "Змея", "Лошадь", "Овца",
                "Обезьяна", "Петух", "Собака", "Свинья"};

        int startYear = 1924;
        int index = (year - startYear) % 12;

        if (index < 0) {
            index += 12;
        }

        String chineseYear= chineseYears[index];


        System.out.println("Знак: " + zodiacSign + " Год: " + chineseYear);
    }
}
