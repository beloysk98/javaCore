package javaCore.src.lesson6.levelA.a3;

import java.util.Scanner;

public class Info {
    private String symbolFirst;
    private String symbolSecond;
    private String first;
    private String second;

    void info() {
        String inputString = inputString();
        replaceSymbol(inputString);
        proverka();
    }

    private void replaceSymbol(String inStr) {

        first = inStr.substring(0, 1);
        if (inStr.length() > 1) {
            second = inStr.substring(0, 2);
        }
    }

    private void proverka() {
        symbolFirst = "{";
        symbolSecond = "{{";
        if (isMatrix()) {
            thisMatrix();
        } else if (isVector()) {
            thisVector();
        } else {
            thisSkalyar();
        }
    }

    private void thisSkalyar() {
        System.out.println("скаляр");
    }

    private void thisMatrix() {
        System.out.println("Матрица");
    }

    private void thisVector() {
        System.out.println("Вектор");
    }

    private boolean isVector() {
        return symbolFirst.equals(first);
    }

    private boolean isMatrix() {
        return symbolSecond.equals(second);
    }

    private String inputString() {
        System.out.println("Введите данные для проверки: ");
        return new Scanner(System.in).nextLine();
    }
}


