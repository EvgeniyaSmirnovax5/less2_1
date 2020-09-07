import java.util.Scanner;

public class App2_2 {

    public static void main(String[] args) {
        System.out.println("Введите число: ");

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if (num > 99 && num < 1000) { // условие, в котором проверяется трехзначное число

            int c = num % 10; //остаток от деления на 10, т.е. последняя цифра

            int b = (num % 100) / 10;

            int a = num / 100; //делим исходное число нацело на 100 - первая цифра

            int sum = a + b + c;

            System.out.println("Сумма цифр: " + sum);
        }
    }


}