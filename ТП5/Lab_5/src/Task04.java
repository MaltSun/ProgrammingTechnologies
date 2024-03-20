import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        String input = "(a[+s)]-[(d+f)]*(d+e)";

        if (checkBrackets(input)) {
            System.out.println("Правильная строка");
        } else {
            System.out.println("Неправильная строка");
        }
    }

    public static boolean checkBrackets(String str) {
        int roundCount = 0;
        int squareCount = 0;
        boolean roundflag = false;
        boolean squareflag = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                roundCount++;
                roundflag = true;
            } else if (ch == ')') {
                if (!squareflag) {
                    return false;
                }
                roundCount--;
                if (roundCount < 0) {
                    return false;
                }
                roundflag = false;
            } else if (ch == '[') {
                squareCount++;
                squareflag = true;
            } else if (ch == ']') {
                if (!roundflag) {
                    return false;
                }
                squareCount--;
                if (squareCount < 0) {
                    return false;
                }
               squareflag = false;
            }
        }

        return roundCount == 0 && squareCount == 0;
    }
}
