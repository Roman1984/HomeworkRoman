package ua.artcode.homework.Week2;

/**
 * Created by Roman on 19-Oct-16.
 */
//Поменять местами наибольший
//        и наименьший элементы в массиве
public class Homework8 {

    public static void main(String[] args) {
        int mas[] = { 1, 43, 3, 34, 54, 6, 29, 87, 12, 45 };
        int max = mas[0];
        int imax = 0;
        int min = mas[0];
        int imin = 0;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                imax = i;
            }
            if (mas[i] < min) {
                min = mas[i];
                imin = i;
            }
        }
        mas[imin] = max;
        mas[imax] = min;
        for (int i = 0; i < mas.length; i++) {
            System.out.println("i=" + i + " a[" + i + "]=" + mas[i]);
        }
    }
}





