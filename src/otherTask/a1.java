package javaCore.src.otherTask;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первый вес: ");
        int firstValue = scan.nextInt();
        System.out.print("Введите второй вес: ");
        int secondValue = scan.nextInt();
        System.out.print("Введите третий вес: ");
        int thirdValue = scan.nextInt();
        if (firstValue > secondValue && firstValue > thirdValue) {
            System.out.println("Наибольший вес: " + firstValue);
        }
        if (secondValue > firstValue && secondValue > thirdValue) {
            System.out.println("Наибольший вес: " + secondValue);
        }
        if (thirdValue > secondValue && thirdValue > firstValue) {
            System.out.println("Наибольший вес: " + thirdValue);
        }
        if ((firstValue > secondValue && firstValue < thirdValue) || (firstValue < secondValue && firstValue > thirdValue)) {
            System.out.println("Средней вес: " + firstValue);
        }
        if ((secondValue < firstValue && secondValue > thirdValue) || (secondValue > firstValue && secondValue < thirdValue)) {
            System.out.println("Средней вес: " + secondValue);
        }
        if ((thirdValue > secondValue && thirdValue < firstValue) || (thirdValue > secondValue && thirdValue > firstValue)) {
            System.out.println("Средней вес: " + thirdValue);
        }
        if (firstValue < secondValue && firstValue < thirdValue) {
            System.out.println("Наименший вес : " + firstValue);
        }
        if (secondValue < firstValue && secondValue < thirdValue) {
            System.out.println("Наименший вес : " + secondValue);
        }
        if (thirdValue < firstValue && thirdValue < secondValue) {
            System.out.println("Наименший вес : " + thirdValue);
        }
    }
}