import java.util.Scanner;

public class App2_7 {

    public static void main(String[] args) {

        System.out.println("Введите код города: ");

        Scanner in = new Scanner(System.in);

        int code = in.nextInt();

        if (code == 905) {
            System.out.println("Москва. Стоимость разговора 41.5");
        }
        if (code == 194) {
            System.out.println("Ростов. Стоимость разговора 19.8");
        }
        if (code == 491) {
            System.out.println("Краснодар. Стоимость разговора 26.9");
        }
        if (code == 800) {
            System.out.println("Киров. Стоимость разговора 50.0");
        }

    }
}


