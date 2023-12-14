package javaCore.src.lesson2_2.levelB.b4;
/*
Написать программу, в которой в консоле мы вводим число,
а она говорит какое это число, простое или составное.
 */

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputValue = scan.nextInt();
        int temp;
        boolean prostoe = true;
        for (int i = 2; i <= inputValue / 2; i++) {
            temp = inputValue % i;
            if (temp == 0) {
                prostoe = false;
                break;
            }
        }
        if (prostoe) {
            System.out.println(inputValue + " - простое число");
        } else {
            System.out.println(inputValue + " - составное число");
        }
    }
}