import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
                 System.out.print("Input a number:");
        int num = in.nextInt();
        int a; //остаток от деления на 10, т.е. последняя цифра
         a = num % 10;


        System.out.println("Последняя цифра:" +a );
        in.close();
    }
}


