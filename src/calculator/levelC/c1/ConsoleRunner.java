package javaCore.src.calculator.levelC.c1;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scalar sc = new Scalar();
        printText();
        sc.add((new Scanner(System.in).nextDouble()), new Scanner(System.in).nextDouble());
        printText();
        sc.divide((new Scanner(System.in).nextDouble()), new Scanner(System.in).nextDouble());
        printText();
        sc.multiply((new Scanner(System.in).nextDouble()), new Scanner(System.in).nextDouble());
        printText();
        sc.subtract((new Scanner(System.in).nextDouble()), new Scanner(System.in).nextDouble());
    }

    private static void printText() {
        System.out.println("Введите значение");
    }
}
