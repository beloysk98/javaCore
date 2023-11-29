package javaCore.src.lesson1_3.levelB.b3;

import java.util.Scanner;

/*
В методе main класса Run напишите программу для нахождения длины гипотенузы прямоугольного
 треугольника по теореме Пифагора. Длины катетов вводим в консоли. Длину гипотенузы вывести в консоль.
 */
public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину первого катета: ");
        // в строчке ниже у нас просто неизвестная переменная или мы более точно знаем что там хранится?
        // мы знаем что будет целое число типа int . так как при вводе другого типа будет ошибка
        int lengthA = scan.nextInt();
        // может дать более поятное название чтобы понимать что туда сохранили?
        System.out.print("Введите длину второго катета: ");
        int lengthB = scan.nextInt();
        double varKor1 = Math.pow(lengthA, 2);
        double varKor2 = Math.pow(lengthB, 2);
        double varSum = varKor1 + varKor2;
        double varHip = Math.sqrt(varSum);
        System.out.println("Длина гипотенузы равна: " + varHip);
    }
}
