package ua.artcode.week1;

/**
 * Created by Roman on 09.10.2016.
 */

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cent = sc.nextInt();
        if (cent == 0 || cent >= 6 && cent <= 10) {
            System.out.println(cent + "копеек");

        } else {
            System.out.println("cent" + "копейки");


        }

    }

}
