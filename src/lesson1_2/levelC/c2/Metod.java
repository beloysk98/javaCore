package javaCore.src.lesson1_2.levelC.c2;

import java.util.Scanner;

public class Metod {
    static String mounth() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите название или номер месяца: ");
        var mounth = scan.nextLine();
        if (mounth.equalsIgnoreCase("Декабрь") || mounth.equals("12")) {
            System.out.println("Это: " + myEnum.timeOfTheYear.Winter);
        } else if (mounth.equalsIgnoreCase("Январь") || mounth.equals("1")) {
            System.out.println("Это: " + myEnum.timeOfTheYear.Winter);
        } else if (mounth.equalsIgnoreCase("Февраль") || mounth.equals("2")) {
            System.out.println("Это: " + myEnum.timeOfTheYear.Winter);
        } else if (mounth.equalsIgnoreCase("Март") || mounth.equals("3")) {
            System.out.println("Это: " + myEnum.timeOfTheYear.spring);
        } else if (mounth.equalsIgnoreCase("Апрель") || mounth.equals("4")) {
            System.out.println("Это: " + myEnum.timeOfTheYear.spring);
        } else if (mounth.equalsIgnoreCase("Май") || mounth.equals("5")) {
            System.out.println("Это: " + myEnum.timeOfTheYear.spring);
        } else if (mounth.equalsIgnoreCase("Июнь") || mounth.equals("6")) {
            System.out.println("Это: " + myEnum.timeOfTheYear.summer);
        } else if (mounth.equalsIgnoreCase("Июль") || mounth.equals("7")) {
            System.out.println("Это: " + myEnum.timeOfTheYear.summer);
        } else if (mounth.equalsIgnoreCase("Август") || mounth.equals("8")) {
            System.out.println("Это: " + myEnum.timeOfTheYear.summer);
        } else if (mounth.equalsIgnoreCase("Сентябрь") || mounth.equals("9")) {
            System.out.println("Это: " + myEnum.timeOfTheYear.autumn);
        } else if (mounth.equalsIgnoreCase("Октябрь") || mounth.equals("10")) {
            System.out.println("Это: " + myEnum.timeOfTheYear.autumn);
        } else if (mounth.equalsIgnoreCase("Ноябрь") || mounth.equals("11")) {
            System.out.println("Это: " + myEnum.timeOfTheYear.autumn);
        }else {
            System.out.println("Такого месяца нет.");
        }
        return "";
    }
}
