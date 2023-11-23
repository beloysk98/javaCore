package javaCore.src.lesson1_3.levelB.b2;

import java.util.Scanner;

/*
В методе main класса Run объявите переменную
. Используя класс Scanner проинициализируйте созданную переменную значением, которое вводится с клавиатуры через консоль.
Напишите код, который возводит в третью степень число, которое мы ввели в консоли, и выведите результат в консоль.
 */
public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int var1= scan.nextInt();
        System.out.println(Math.pow(var1,3));
    }
}
