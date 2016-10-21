package ua.artcode.homework.Week2;

import java.util.Scanner;

/**
 * Created by Roman on 16-Oct-16.
// */
//Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число
 class Homework5 {
    public static void binar(int a) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        while (a != 0) {
            b = a % 2;
            System.out.print(b);
            a = a / 2;
        }
    }
    public static void main(String [] args) {
        binar(8);
    }
}

