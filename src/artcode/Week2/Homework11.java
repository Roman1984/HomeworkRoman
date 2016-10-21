package ua.artcode.homework.Week2;

// Посчитать колличество букв 'a' в строке (искомый символ может быть разным)

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();


        char [] word = text.toCharArray();
        char[] big = {'a', 'f', 'e', 'a', 'u', 'f', 'g', 'h', 'a', 'j', 'k', 'l', 'a', 'n', 'o', 'p', 'q'};
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            count++;
        }
        System.out.println(text + count);
        System.out.print(word);
    }

}