package javaCore.src.lesson6.levelB.b4;

//в 26 влез только
public class Proverka {
    void operator(String inputNumber) {
        String rep = inputNumber.replaceAll("(-)|[+\\s()a-zA-Zа-яА-Я.>;:'\"<\\[,!*?^$/&%\\]{}|]", "");
        String repNew24 = rep.substring(2, 4);
        String repNew35 = rep.substring(3, 5);
        String repNew56 = rep.substring(5, 6);
        if (repNew24.equals("17") || repNew35.equals("17")) {
            System.out.println("Оператор белТелеком");
        } else if (repNew24.equals("29") || repNew35.equals("29")) {
            if (repNew56.equals("2") || repNew56.equals("5") || repNew56.equals("7") || repNew56.equals("8")) {
                System.out.println("Оператор MTC");
            } else {
                System.out.println("Оператор Velcome");
            }
        } else if (repNew24.equals("33") || repNew35.equals("33")) {
            System.out.println("Оператор MTC");
        } else if (repNew24.equals("44") || repNew35.equals("44")) {
            System.out.println("Оператор Velcome");
        } else {
            System.out.println("Такого оператора РБ не существует");
        }
    }
}