package javaCore.src.lesson6.levelB.b1;

import java.util.Scanner;

public class TestPolindrom {
    private String replaceSpaces;
    private String reversalLine;
    void print() {
        String inputString = inputString();
        String toUpLetters = toUpLetters(inputString);
        replaceSpaces = replaceSpaces(toUpLetters);
        reversalLine = reversalLine(replaceSpaces);
        proverka();
    }

    private String toUpLetters(String toUp) {
        return toUp.toUpperCase();
    }

    private void proverka() {
        if (isPolindrom()) {
            thisPolindrom();
        } else {
            thisNotPolindrom();
        }

    }

    private void thisNotPolindrom() {
        System.out.println("Слово/словосочетание не полиндром");
    }

    private void thisPolindrom() {
        System.out.println("Слово/словосочетание полиндром");
    }

    private boolean isPolindrom() {
        return replaceSpaces.equals(reversalLine);
    }

    private String reversalLine(String str) {
        StringBuilder rever = new StringBuilder(str);
        rever.reverse();
        return rever.toString();
    }

    private String replaceSpaces(String inStr) {
        return inStr.replaceAll(" ", "");
    }

    private String inputString() {
        System.out.print("Введите слово для проверки: ");
        return new Scanner(System.in).nextLine();
    }
}

