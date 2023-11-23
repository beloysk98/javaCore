package javaCore.src.lesson2_1.levelA.a2;

import java.util.Scanner;

/*
В методе main класса Run объявите переменную. Используя класс Scanner проинициализируйте созданную
переменную значением от 1 до 7, которое вводится с клавиатуры через консоль. Используя оператор if else if
 напишите код, который будет на основании введённого числа выводить в консоль соответствующую текстовую информацию
 о дне недели.
 */
public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double var;
        System.out.print("Введите число от 1 до 7: ");
        var= scan.nextDouble();
        if (var==1){
            System.out.println("Это понедельник");
        } else if(var==2){
            System.out.println("Это вторник");
        } else if (var==3) {
            System.out.println("Это среда");
        } else if (var==4) {
            System.out.println("Это четверг");
        }else if (var==5) {
            System.out.println("Это пятница");
        }else if (var==6) {
            System.out.println("Это субота");
        }else {
            System.out.println("Это воскресенье");
        }
    }
}
