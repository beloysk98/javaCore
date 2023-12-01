package javaCore.src.lesson2_2.levelB.b2;

import java.util.Scanner;

/*
Написать программу вычисляющую факториал натурального числа n,
которое вводится с клавиатуры в консоле.
0	1
1	1
2	2
3	6
4	24
5	120
6	720
 */
public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число для вычисления: ");
        int value = scan.nextInt();
        int faktorial = 1;
        for (int i = 1; i <= value; i++) {
            faktorial = faktorial * i;
        }
        System.out.println("Факториал числа: " + value + " равен " + faktorial);
    }
}
