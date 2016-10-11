package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by Roman on 04.10.2016.
 */
public class Homework1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number0 = sc.nextInt();
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();


        if (number0 > number1 && number0 > number2) {
            System.out.println("max" + number0);
        } else if (number0 < number1 && number0 < number2) {
            System.out.println("min");
        }if (number1 > number0 && number1 > number2) {
            System.out.println("max" + number1);
        } else if (number1 < number0 && number1 < number0) {
            System.out.println("min");
        } if (number2 > number1 && number2 > number0) {
            System.out.println("max" + number2);
        } else if (number2 > number1 && number2 > number0) {
            System.out.println("min");
        }
    }
}

//
//
//