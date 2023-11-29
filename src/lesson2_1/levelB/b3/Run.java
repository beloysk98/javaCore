package javaCore.src.lesson2_1.levelB.b3;

import java.util.Scanner;

/*
В методе main класса Run напишите код для нахождения корней квадратного уравнения,
коэффициенты a, b и c вводить через консоль.
 */
public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение а: ");
        int varA = scan.nextInt();
        System.out.print("Введите значение b: ");
        int varB = scan.nextInt();
        System.out.print("Введите значение с: ");
        int varC = scan.nextInt();
        // Дискриминант D = b*b - 4ac
        //D>0 два корня ; D==0 два равных корня:; D<0 действительных корней нет
        double D;
        D = (varB * varB) - ((4 * varA * varC));
        if (varA == 0) {
            System.out.println("Переменная 'a' не может быть равна нулю.");
        } else {
            if (D > 0) {
                double x1 = (-varB + D) / (2 * varA);
                double x2 = (-varB - D) / (2 * varA);
                System.out.print("Дискриминант больше 0, имеем два действительных корня: " + x1 + " и " + x2);
            } else if (D == 0) {
                double x3 = (double) -varB / (2 * varA);
                System.out.print("Дискриминант равен 0, имеем два равных корня: " + x3);
            } else {
                System.out.print("Решение не имеет действительных корней.");
            }
        }
    }
}
