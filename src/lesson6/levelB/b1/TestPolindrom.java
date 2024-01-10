package javaCore.src.lesson6.levelB.b1;

import java.util.Scanner;

public class TestPolindrom {
    void print() {
        System.out.print("Введите слово для проверки: ");
        String inputString = new Scanner(System.in).nextLine();
        String toUp = inputString.toUpperCase();
        String replaceSpaces = toUp.replaceAll(" ", "");
        StringBuilder rever = new StringBuilder(replaceSpaces);
        String reversalLine = rever.toString();
        if (replaceSpaces.equals(reversalLine)) {
            System.out.println("Слово/словосочетание полиндром");
        } else {
            System.out.println("Слово/словосочетание не полиндром");
        }
    }
}

