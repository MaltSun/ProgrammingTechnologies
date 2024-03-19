public class Task03 {//Самовлюблённое числа
    public static void main(String[] args) {
        int limit = 1000000;

           for (int number = 2; number <= limit; number++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}
