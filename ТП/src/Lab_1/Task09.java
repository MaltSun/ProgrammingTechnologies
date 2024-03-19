package Lab_1;

public class Task09 {
    public static void main(String[] args) {
        double num1 = 3.0;
        double num2 = 2.5;

        if (hasFractionalPart(num1)) {
            System.out.println(num1 + " имеет вещественную часть");
        } else {
            System.out.println(num1 + " не имеет вещественную часть");
        }

        if (hasFractionalPart(num2)) {
            System.out.println(num2 + " имеет вещественную часть");
        } else {
            System.out.println(num2 + " не имеет вещественную часть");
        }
    }

    public static boolean hasFractionalPart(double num) {
        return num != (int) num;
    }
}
