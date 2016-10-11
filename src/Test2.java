package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by Roman on 07.10.2016.
 */
public class Test2 {
//    Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int sum = number1 + number2;
        if (sum >= 11 && sum <= 19) {
            System.out.println("Сумма чисел: " + sum);
        }
         else {
            System.out.println("false");
        }
    }
}
