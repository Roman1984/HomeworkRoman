package ua.artcode.homework.Week2;


//Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
public class Homework6 {
    public static void main(String[] args) {
        int SIZE = 10;
        int res = 0;
        int res1 = 0;
        int[][] mas = new int[SIZE][SIZE];
        for (int i = 0; i < mas.length; i++) {
            int size = (int) (Math.round(Math.random() * 50) + 25);
            mas[i] = new int[size];
            System.out.print(mas[i].length);
        }

        for (int i = 0; i < mas.length; i++) {
            int size1 = (int) (Math.round(Math.random() * 50) + 25);
            mas[i] = new int[size1];
            System.out.print(mas[i].length);




        }

    }
}



