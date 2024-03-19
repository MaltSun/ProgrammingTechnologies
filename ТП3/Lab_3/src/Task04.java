import java.util.Scanner;//палиндромом

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String temp = Integer.toString(number);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newGuess[i] = temp.charAt(i) - '0';
        }

        int[] newGuess2 = new int[newGuess.length];
        for (int i = 0; i < newGuess.length; i++) {
            newGuess2[i] = newGuess[newGuess.length - 1 - i];
        }

        int flag = 0;
        for (int i = 0; i < newGuess.length; i++) {
            if (newGuess2[i] == newGuess[i]) {
                flag++;
            }
        }

        if (flag == newGuess.length) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
