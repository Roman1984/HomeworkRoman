package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by Roman on 09.10.2016.
 */   //    Пользователь вводит параметр с консоли (текущий час от 0 до 24)
//    Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
public class Homework3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();

        if (time >= 9 && time <= 18) {
            System.out.println("Working");

        } else {
            System.out.println("Relax");
        }
    }
}
