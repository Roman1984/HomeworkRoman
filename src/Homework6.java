package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by Roman on 10.10.2016.
 */
//      Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления (целую часть от деления  и остачу)
//              в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
public class Homework6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double res = num1 / num2;
        double res1 = num1 / num2;
        if (num1 % num2 == 0) {
            System.out.println("true"  + res);
        } else if (num1 / num2 != 0){
            System.out.println("false" +res1);


        }
    }
}
