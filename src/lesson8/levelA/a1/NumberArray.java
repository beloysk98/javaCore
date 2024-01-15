package javaCore.src.lesson8.levelA.a1;

import java.util.Scanner;

public class NumberArray {
    double[] d = new double[5];

    public void setElement() {
        for (int i = 0; i < d.length; i++) {
            System.out.println("Ведите значение: ");
            int b = new Scanner(System.in).nextInt();
            d[i] = b;
        }
    }

    public String getElement() {
        System.out.println("Введите индекс элемента");
        int c = new Scanner(System.in).nextInt();
        return "Число под  индексом " + c + "= " + d[c];
    }

    public void printArray() {
        System.out.print("Числа в масиве: ");
        for (double i : d) {
            System.out.print(i + "\t");
        }
    }

}
