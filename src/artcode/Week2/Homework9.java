package ua.artcode.homework.Week2;

import java.util.Arrays;

/**
 * Created by Roman on 19-Oct-16.
 */
//Инвертировать массив (без использования допольнительного массива
public class Homework9 {

    public static void main(String[] args) {

        int[] mas = new int[15];

        for(int i=0; i<mas.length; ++i){
            if(i == 0){
                mas[i] = 1;
            } else {
                mas[i] = mas[i-1] + 2;
            }
        }

        for(int x: mas){
            System.out.print(x+" ");
        }

        System.out.println();

        for(int i=mas.length-1; i>=0; --i){
            System.out.print(mas[i]+" ");
        }
    }
}
