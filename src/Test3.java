package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by Roman on 07.10.2016.
 */
//      Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1

     public class Test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        if (number <= 1 && number >= 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
