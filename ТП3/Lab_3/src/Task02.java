public class Task02 { //Простое число
    public static void main(String[] args) {

        for (int number = 2; number <= 1000000; number++) {
            boolean answer = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    answer = false;
                    break;
                }
            }

            if (answer) {
                System.out.println(number);
            }
        }
    }
}
