import java.util.Scanner;

public class Task_04 {//замена символов
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите предложение");
        String line = scan.nextLine();
        String[] letters = line.split("");

        for (int i = 0; i < letters.length; i++) {
            if (Character.isDigit(letters[i].charAt(0))) {
                letters[i] = letters[i].replace(letters[i].charAt(0), '_');
            }
            if (Character.isLowerCase(letters[i].charAt(0)))
                letters[i] = letters[i].toUpperCase();
            else
                letters[i] = letters[i].toLowerCase();

            System.out.print(letters[i]);
        }


    }
}
