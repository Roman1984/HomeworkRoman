package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by Roman on 09.10.2016.
 */
public class Homework2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number one:");
        int num1 = sc.nextInt();

        System.out.println("Enter nubmer two:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int minus = num1 - num2;

        if (num1 > num2) {
            System.out.println("Difference number: " + minus);
        } else {
            System.out.println("Sum number: " + sum);
        }
    }
}

