import java.util.Scanner;

public class App2_3 {

        public static void main(String[] args) {

            System.out.println("Введите число: ");

            Scanner in = new Scanner(System.in);

            int num = in.nextInt();

            if (num > 0) {
                num = num + 1;
            }

            System.out.println(num);

        }
    }


