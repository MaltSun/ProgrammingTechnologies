public class Task_01 {// Числа Фибоначчи
    public static void main(String[] args)
    {
        int number1 = 0;
        int number2= 1;

        System.out.println(number1);
        System.out.println(number2);

        while (number1+number2 < 10000000) {
            int change=number2;
            number2+=number1;
            System.out.println(number2);
            number1=change;
        }
    }
}
