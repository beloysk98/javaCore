package javaCore.src.lesson2_1.levelA.a3;

import java.util.Scanner;

/*
В методе main класса Run объявите переменную. Используя класс Scanner проинициализируйте
 созданную переменную значением от 1 до 7, которое вводится с клавиатуры через консоль.
  Используя оператор switch напишите код, который будет на основании введённого числа выводить
  в консоль текстовую информацию: 1 - Понедельник, 2 - Вторник, 3 - Среда, 4 - Четверг, 5 - Пятница, 6 и 7 - Выходной.

 */
public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int var;
        System.out.print("Введите число от 1 до 7: ");
        var = scan.nextInt();
        if (0 < var && var <= 7) {
            switch (var) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6,7:
                    System.out.println("Выходной");
                    break;
            }

        } else {
            System.out.println("Число выходит за данный диапазон");
        }


    }
}
