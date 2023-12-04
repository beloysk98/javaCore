package javaCore.src.lesson2_2.levelB.b3;

import java.util.Scanner;

/*
Написать программу для вывода в консоль n первых чисел Фибоначчи. Число n вводится в консоле.
 */
public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int value = scan.nextInt();
        int value0 = 0;
        int value1 = 1;
        int value2;
        System.out.print(value0 + " " + value1 + " ");
        for (int i = 3; i <= value; i++) {
            value2 = value0 + value1;
            System.out.print(value2 + " ");
            value0 = value1;
            value1 = value2;
        }

    }
}
