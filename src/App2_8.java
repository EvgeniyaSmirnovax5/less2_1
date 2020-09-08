import java.util.Arrays;

public class App2_8 {

    public static void main(String[] args) {
        int[] arr = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        Arrays.sort(arr);
        int len = arr.length;
        System.out.println("Максимальное значение: "+arr[len-1]);

        int positive_sum = 0;
        int positive_num = 0;

        int negative_sum = 0;
        int negative_num = 0;
        int even_neg_sum = 0;

        for (int i = len - 1; i >= 0; i--) {
            if (arr[i] >0) {
                positive_sum += arr[i];
                positive_num++;
            }
            if (arr[i] <0) {
                negative_sum += arr[i];
                negative_num++;
                if ((arr[i] % 2) == 0)
                    even_neg_sum += arr[i];
            }
        }
        System.out.println("Сумма положительных элементов: "+positive_sum);
        System.out.println("Сумма четных отрицательных элементов: "+even_neg_sum);
        System.out.println("Количество положительных элементов: "+positive_num);
        System.out.println("Ср. арифметическое отрицательных элементов: "+(double)negative_sum/negative_num);
    }
}
