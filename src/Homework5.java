package ua.artcode.week1;

import com.sun.security.auth.SolarisNumericUserPrincipal;

import java.util.Scanner;

/**
 * Created by Roman on 10.10.2016.
 */
//   Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
public class Homework5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        if (num1*num1 % 7 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
