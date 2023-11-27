package javaCore.src.lesson2_1.levelB.b2;

import java.util.Scanner;

/*
В методе main класса Run используя тернарный оператор напишите код, который считывает с консоли
введённое число и после проверки на чётность выводит в консоль информацию об этом числе.
 */
public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int var;
        System.out.print("Введите число для проверки на четность: ");
        var = scan.nextInt();
        String var1 = (var % 2 == 0) ? "Число четное." : "Число не четное.";
        System.out.println(var1);
    }
}
