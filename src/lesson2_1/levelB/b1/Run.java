package javaCore.src.lesson2_1.levelB.b1;

import java.util.Scanner;

/*
В методе main класса Run объявите переменную. Используя класс Scanner проинициализируйте созданную переменную значением
 от 1 до 12, которое вводится с клавиатуры через консоль. Используя оператор if else if  напишите код,
  который будет на основании введённого числа выводить в консоль текстовую информацию: 1, 2, 12 - зима;
   3, 4, 5 - весна; 6, 7, 8 - лето; 9, 10, 11 - осень.

 */
public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int var;
        System.out.print("Введите число от 1 до 12: ");
        var = scan.nextInt();
        if (3 <= var && var <= 5) {
            System.out.println("Весна");
        } else if (6 <= var && var <= 8) {
            System.out.println("Лето");
        } else if (9 <= var && var <= 11) {
            System.out.println("Осень");
        } else if (var == 1 || var == 2 || var == 12) {
            System.out.println("Зима");
        } else {
            System.out.println("Число выходит за диапазон.");
        }
    }
}
