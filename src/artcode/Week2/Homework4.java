package ua.artcode.homework.Week2;

/**
 * Created by Roman on 15-Oct-16.
// */
//Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
//        который получается в результате суммы arr1[i] + arr2[i]
public class Homework4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int sum = 0;
        for (int i = 0; i< arr1.length; i++) {
            sum+= arr1[i] + arr2[i];
        }
        System.out.println(sum);
    }
}
