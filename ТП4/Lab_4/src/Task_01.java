import java.util.Scanner;

public class Task_01 {// сколько раз встречается
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку");
        String line = scan.nextLine();

        System.out.println("Введите символ");
        String characterLine = scan.nextLine();
        char character = characterLine.charAt(0);
        int counter = 0;
        int counter1 = 0;
        if (line.contains(characterLine)) {
            char[] charArray = line.toCharArray();
            for (int i =0; i< charArray.length; i++)
            {
                if (charArray[i] == character) {
                    counter1++;
                }
            }
            for (char c : charArray) {
                if (c == character) {
                    counter++;
                }
            }
            System.out.println(counter);
            System.out.println(counter1);
        } else {
            System.out.print("Не найдено");
        }
    }
}
