package javaCore.src.lesson2_2.levelB.b4;
/*
Написать программу, в которой в консоле мы вводим число,
а она говорит какое это число, простое или составное.
 */

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value0 = scan.nextInt(); // value0 - это плохое не информативное имя. переименуй его в название из имени которого будет понятно что там хранится.
        int temp = 2; // для чего тут переменной temp присваивается число 2?
        boolean prostoe = true;
        for (int i = 2; i <= value0 / 2; i++) {
            temp = value0 % i;
            if (temp == 0) {
                prostoe = false;
                break;
            }
        }
        if (prostoe) {
            System.out.println(value0 + " - простое число");
        } else {
            System.out.println(value0 + " - составное число");
        }

    }
}