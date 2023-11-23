package javaCore.src.lesson1_3.levelC.c1;

import java.util.Scanner;

/*
В методе main класса Run напишите код для нахождения высоты в разностороннем треугольнике.
 Длины сторон  a, b и c вводятся в консоле. Вывести в консоль длину высоты к стороне а.
 Сделать проверку на корректность ввода длин сторон треугольника.
 */


//              b
//             /|\
//         b  / |  \ c
//           /  |    \
//         a/___|______\c
//              d  a
public class run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину стороны ab: ");
        int varA = scan.nextInt();
        System.out.print("Введите длину стороны bc: ");
        int varB = scan.nextInt();
        System.out.print("Введите длину стороны ca: ");
        int varC = scan.nextInt();
        if (varA + varB > varC || varB + varC > varA || varA + varC > varB) {
            //p-полупериметр треугольника
            double p = (double) (varA + varB + varC) / 2;
            System.out.println("Полупериметр: " + p);
            //S-площадь треугольника
            double S = Math.sqrt((p * ((p - varA) * (p - varB) * (p - varC))));
            System.out.println("Площадь треугольника: " + S);
            //h-длина высоты к стороне а с вершины B
            double ha = (2 * S) / varC;
            System.out.println("Длина высоты к стороне a: " + ha);

        } else {
            System.out.println("Треугольник с такими сторонами не может быть!");
        }

    }
}
