package Lab_1;

public class Task10 {
    public static void main(String[] args) {

        final double height = 166.4;
        final double weight = 62.2;

        double idealWeight = height - 110;

        if (idealWeight > weight) {
            System.out.println("Вам надо набрать " + (idealWeight - weight) + " кг");

        } else {
            System.out.println("Вам надо сбросить " + (weight - idealWeight) + " кг");
        }
        if (idealWeight == weight) {
            System.out.println("У Вас идеальный вес ");
        }
    }
}
