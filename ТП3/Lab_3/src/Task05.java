public class Task05 {// должны делиться на 12345
    public static void main(String[] args) {
        int count = 0;

        for (int number = 10000000; number < 100000000; number++) {
            boolean[] digits = new boolean[10];
            int temp = number;
            boolean answer = false;

            while (temp > 0) {
                int digit = temp % 10;
                if (digits[digit]) {
                    answer = true;

                    //break;
                }
                digits[digit] = true;
                temp /= 10;
            }


            if (!answer && number % 12345 == 0) {
                count++;
            }
        }

        System.out.println("Количество таких чисел: " + count);
    }
}
