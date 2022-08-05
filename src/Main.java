import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] num = {12.34, 22.55, -1.33, 56.67, -45.11, 123.10, 211.31, 21.99, -30.16, 56.43, -98.55, 115.44, 345.54, -10.1, 99.3};
        int kolichestvo = 0;
        double totalSum = 0;
        boolean check = false;
        for (double number : num) {
            if (number < 0) {
                check = true;}
            if (number > 0 && check) {
                totalSum = number + totalSum;
                kolichestvo++;
            }
        }
        double sredni = totalSum / kolichestvo;
        System.out.println("Среднее арифметическое количество положительных числ в массиве " + sredni);
        boolean isSort = false;
        while(!isSort) {
            isSort = true;
            for (int i = 1; i <num.length; i++) {
                if (num[i] < num[i-1]) {
                    double numb = num [i];
                    num[i] = num[i-1];
                    num[i -1] = numb;
                    isSort = false;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}