package ua.artcode.homework.Week2;

import java.util.Scanner;

/**
 * Created by Roman on 19-Oct-16.
 */
// Проверить или является число простым
public class Homework10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        for(i=2; i<n ;i++)
        {
            if (n%i==0)
                System.out.println("false");
            else
                System.out.println("true ");

        }

    }

}


