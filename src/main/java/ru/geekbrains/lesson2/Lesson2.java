package ru.geekbrains.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Lesson2 {

    public static void main(String[] args) {

        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise41();
        exercise5();
    }

    /*
    Задание 1.
    Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
    */
    private static void exercise1() {
        int[] numbs = new int[10];

        // Рандомно заполняем массив единицами и нулями
        for (int i = 0; i < numbs.length; i++) {
            int n = i % 2;
            numbs[i] = n;
        }
        System.out.println("\nМассив был\n" + Arrays.toString(numbs));
        // Заменяем единицы на нули и наоборот
        for (int i = 0; i < numbs.length; i++) {
            int arrayNum = numbs[i];
            switch (arrayNum) {
                case 0 -> numbs[i] = 1;
                case 1 -> numbs[i] = 0;
                default -> System.out.println("Ни один из case не сработал");
            }
        }
        System.out.println("Массив стал\n" + Arrays.toString(numbs));
    }

    /*
    Задание 2.
    Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    */
    private static void exercise2() {

        int[] numbs = new int[8];

        for (int i = 1; i < numbs.length; i++) {
            int n = numbs[(i - 1)] + 3;
            numbs[i] = n;
        }
        System.out.println("\nМассив задания 2\n" + Arrays.toString(numbs));
    }

    /*
    Задание 3.
    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    private static void exercise3() {

        int[] numbs = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] < 6) {
                numbs[i] = numbs[i] << 1;
            }
        }
        System.out.println("\nМассив задания 3\n" + Arrays.toString(numbs));
    }

    /*
    Задание 4.
    Создать квадратный двумерный целочисленный массив (количество строк
    и столбцов одинаковое), и с помощью цикла(-ов) заполнить его
    диагональные элементы единицами;
     */
    private static void exercise4() {

        int[][] numbs = new int[15][15];
        System.out.println("\nМассив задания 4");

        for (int i = 0; i < numbs.length; i++) {
            numbs[i][i] = 1;   //Строится первая диагональ

            for (int j = 0; j < numbs[i].length; j++) {
                int lastJ = (((numbs[i].length) - 1) - i); // В цикле вычисляю последний элемент J со сдвигом на предыдущий.
                numbs[i][lastJ] = 1;
                System.out.print(numbs[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
    Второй вариант решения задачи 4
    */
    private static void exercise41() {

        int[][] numbs = new int[5][5];
        System.out.println("\nМассив задания 4 (второй вариант)");

        for (int i = 0; i < numbs.length; i++) {
            for (int j = 0; j < numbs[i].length; j++) {
                int lastj = (((numbs[i].length) - 1) - i);

                if (i == j) {       //Сравниваем значения I и J, строим левую диагональ
                    numbs[i][j] = 1;
                }
                numbs[i][lastj] = 1;
                System.out.print(numbs[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
        Задать одномерный массив и найти в нем минимальный
        и максимальный элементы (без помощи интернета);
     */
    private static void exercise5() {
    /*
    Создаем и заполняем рандомный массив
    */
        Random rnd = new Random();
        int[] numbs = new int[10];
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = rnd.nextInt(100);
        }
        System.out.println("\nМассив задания 5\n" + Arrays.toString(numbs));

        int min = numbs[0];
        int max = numbs[0];
        int len = numbs.length;
    /*
    Сравниваем первый элемент со вторым, если второй
    Меньший из них записываем в min, так сравниваются все последующие
    элементы с min.
    */
        for (int numb : numbs) {
            if (numb < min) {
                min = numb;
            }
        }
    /*
    Сравниваем первый элемент со вторым, если второй
    больший из них записываем в max, так сравниваются все последующие
    элементы с max.
    */
        for (int i = 0; i < len; i++) {
            if (numbs[i] > max) {
                max = numbs[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Минимальное значение: " + max);
    }
}



