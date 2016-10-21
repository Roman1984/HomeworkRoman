package ua.artcode.homework.Week2;

/**
 * Created by Roman on 15-Oct-16.
 */
//
//Найти среднее арифметическое массива
public class Homework2 {
    public static void main(String[] args) {
            int[] numbers = {7, 10, 12, 34, 55};
            double average = 0;
            if (numbers.length > 0) {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average = sum / numbers.length;
            System.out.println(average);
        }

    }
}
