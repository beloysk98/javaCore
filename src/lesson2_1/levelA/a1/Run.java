package javaCore.src.lesson2_1.levelA.a1;

import java.util.Scanner;

/*
В методе main класса Run написать код, который будет сравнивать значения переменных a и b.
После сравнения вывести в консоль информацию значение какой переменной больше.
 */
public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение первой переменной: ");
        double a= scan.nextDouble();
        System.out.print("Введите значение второй переменной: ");
        double b= scan.nextDouble();
        if (a>b){
            System.out.println("Первая переменная больше второй");
        } else {
            System.out.println("Вторая переменная больше первой");
        }

    }
}
