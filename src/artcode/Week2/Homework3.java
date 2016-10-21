package ua.artcode.homework.Week2;

/**
 * Created by Roman on 15-Oct-16.
 */

//Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
public class Homework3 {
    public static void main(String[] args) {
        int[] mas = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] mas1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.arraycopy(mas, 0,  mas1, 0, 9);
        for (int i = 0; i < mas1.length; i++) {
            System.out.print(mas1[i] + " ");

        }
    }
}


