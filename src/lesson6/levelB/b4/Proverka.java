package javaCore.src.lesson6.levelB.b4;

import java.util.Scanner;
/*
Velcom A1 +375 29 или 8029 1/3/6/9
          +375 44 или 8044 все номера
MTC         +375 29 или 8029 2/5/7/8
            +375 33 или 8033 все номера
Life        +375 25 или 8025 все номера

Городской(Бел телеком) +375 17 или 8017 все номера

 */

public class Proverka {
    void operator() {
        System.out.println("Введите номер для проверки: ");
        String inputNumber = new Scanner(System.in).nextLine();
        String rep = inputNumber.replaceAll("(-)|[+\\s()a-zA-Zа-яА-Я.>;:'\"<\\[,!*?^$/&%\\]{}|]", "");
        String srav = rep.substring(0, 2);
        if (srav.equals("80")) {
            String repNew23 = rep.substring(2, 4);
            switch (repNew23) {
                case "17":
                    System.out.println("Оператор белТелеком");
                    break;
                case "33":
                    System.out.println("Оператор MTC");
                    break;
                case "29":
                    String repNew232 = rep.substring(5);
                    // 2/5/7/8
                    if (repNew232.equals("2") || repNew232.equals("5") || repNew232.equals("7") || repNew232.equals("8")) {
                        System.out.println("Оператор MTC");
                        //1/3/6/9
                    } else {
                        System.out.println("Оператор Velcome");
                    }
                    break;
                case "25":
                    System.out.println("Оператор life");
                    break;
                case "44":
                    System.out.println("Оператор Velcome");
                    break;
            }
        } else {
            String repNew = rep.substring(3, 5);
            switch (repNew) {
                case "17":
                    System.out.println("Оператор белТелеком");
                    break;
                case "33":
                    System.out.println("Оператор MTC");
                    break;
                case "29":
                    String repNew232 = rep.substring(5, 6);
                    // 2/5/7/8
                    if (repNew232.equals("2") || repNew232.equals("5") || repNew232.equals("7") || repNew232.equals("8")) {
                        System.out.println("Оператор MTC");
                        //1/3/6/9
                    } else {
                        System.out.println("Оператор Velcome");
                    }
                    break;
                case "25":
                    System.out.println("Оператор life");
                    break;
                case "44":
                    System.out.println("Оператор Velcome");
                    break;
            }

        }
    }
}
