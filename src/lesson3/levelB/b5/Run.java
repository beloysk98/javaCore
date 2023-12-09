package javaCore.src.lesson3.levelB.b5;
/*
Создайте массив из 10 элементов со случайными числами от 0 до 9.
Найти и вывести в консоль два наименьших (минимальных) элемента массива.
Они могут быть как равными между собой (оба являться минимальными), так и отличаться друг от друга.
 */

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        int[] array = new int[10];
        int minValue = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(array);
        System.out.println("Два наименших элемента массива: " + array[0] + "," + array[1] + ".");
    }
}