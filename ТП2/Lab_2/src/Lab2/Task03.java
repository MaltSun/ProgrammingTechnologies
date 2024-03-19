package Lab2;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите из списка");
        System.out.println("1. Кошечка");
        System.out.println("2. Собачка");
        System.out.println("3. Уточка");
        System.out.println("4. Курочка");
        System.out.println("5. Ослик");
        System.out.println("6. Коник");
        System.out.println("7. Коровка");
        System.out.println("8. Свинка");
        System.out.println("9. Мышка");
        System.out.println("10. Воробушек");
        int num = in.nextInt();
        switch (num)
        {case 1:
            System.out.println("Мяу-мяу-мяу");
            break;
            case 2:
                System.out.println("Гав-гав-гав");
                break;
            case 3:
                System.out.println("Кря-кря-кря");
                break;
            case 4:
                System.out.println("Ко-ко-ко");
                break;
            case 5:
                System.out.println("Иа-иа");
                break;
            case 6:
                System.out.println("И-го-го");
                break;
            case 7:
                System.out.println("Му-му-му");
                break;
            case 8:
                System.out.println("Хрю-крю-крю");
                break;
            case 9:
                System.out.println("Пи-пи-пи");
                break;
            case 10:
                System.out.println("чик-чи-рик");
                break;
        }
    }
}
