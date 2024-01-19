package javaCore.src.lesson8.levelA.a1;

import java.util.Scanner;
/*
Создать класс NumberArray, который может хранить в себе массив только из 5 числовых типов.
 Реализовать методы setElement и getElement которые будут сохранять и получать элементы по заданному индексу.
 Реализовать метод printArray, который будет выводить в консоль все данные хранящиеся в этом классе.
 Создать класс Run и в методе main создать объект класса NumberArray сохранив в него 5 чисел,
 выведите эти числа в консоль.
 */

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
