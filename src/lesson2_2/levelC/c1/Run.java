package javaCore.src.lesson2_2.levelC.c1;

import java.util.Scanner;

/*
Написать программу в которой в консоль вводится число, а потом в
консоль выводится текст с информацией о чётности этого числа. Вводить числа
можно неограниченное количество раз. Программа завершает свою работу при вводе в консоль слова END.
 */
public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean off = true;
        while (off) {
            System.out.print("Введите число: ");
            String value = scan.nextLine();
            if (value.equals("END")) {
                off = false;
            } else if ((Integer.parseInt(value) % 2 == 0)) {
                System.out.println("Число четное.");
            } else {
                System.out.println("Число не четное.");

            }
        }
    }
}

