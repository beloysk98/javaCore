package javaCore.src.lesson6.levelB.b4;

//в 26 влез только
public class Proverka {

    private String repNew24;
    private String repNew35;
    private String repNew56;

    void operator(String inputNumber) {
        fillCode(inputNumber);
        if (isTown()) {
            System.out.println("Оператор белТелеком");
        } else if (isHybrid()) {
            checkFirstNumber();
        } else if (isMTS()) {
            System.out.println("Оператор MTC");
        } else if (isA1()) {
            System.out.println("Оператор Velcome");
        } else {
            System.out.println("Такого оператора РБ не существует");
        }
    }

    private void fillCode(String inputNumber) {
        String rep = inputNumber.replaceAll("(-)|[+\\s()a-zA-Zа-яА-Я.>;:'\"<\\[,!*?^$/&%\\]{}|]", "");
        repNew24 = rep.substring(2, 4);
        repNew35 = rep.substring(3, 5);
        repNew56 = rep.substring(5, 6);
    }

    private void checkFirstNumber() {
        if (isNumberMTS()) {
            System.out.println("Оператор MTC");
        } else {
            System.out.println("Оператор Velcome");
        }
    }

    private boolean isNumberMTS() {
        return repNew56.equals("2") || repNew56.equals("5") || repNew56.equals("7") || repNew56.equals("8");
    }

    private boolean isHybrid() {
        return repNew24.equals("29") || repNew35.equals("29");
    }

    private boolean isTown() {
        return repNew24.equals("17") || repNew35.equals("17");
    }

    private boolean isA1() {
        return repNew24.equals("44") || repNew35.equals("44");
    }

    private boolean isMTS() {
        return repNew24.equals("33") || repNew35.equals("33");
    }

}