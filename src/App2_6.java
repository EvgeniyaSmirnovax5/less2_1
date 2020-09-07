import java.util.Scanner;

public class App2_6 {

    public static void main(String[] args) {

        System.out.println("Введите число: ");

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if (num > 0) {
            System.out.print("Положительное ");
            if (num%2==0){
                System.out.print("четное число");}
            else
                System.out.print("нечетное число");
        }
        if (num < 0) {
            System.out.print("Отрицательное ");
            if (num%2==0){
                System.out.print("четное число");}
            else
                System.out.print("нечетное число");
        }
        if (num == 0) {
            System.out.print("Нулевое число");

        }






    }
}


