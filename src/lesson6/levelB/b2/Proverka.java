package javaCore.src.lesson6.levelB.b2;

import java.util.Arrays;
import java.util.Scanner;

public class Proverka {
    void proverka() {
        String inputString = inputString();
        String[] textDivision = textDivision(inputString);
        String[] deleteSpaces = deleteSpaces(textDivision);
        print(deleteSpaces);
    }

    private void print(String[] inStr) {
        System.out.println(inStr.length);
    }

    private String[] deleteSpaces(String[] inStr) {
        return Arrays.stream(inStr).filter(s -> !s.isEmpty()).toArray(String[]::new);
    }

    private String[] textDivision(String inStr) {
        return inStr.split("(\\s-)|[0-9,.\\s?!;:()<>]");
    }

    private String inputString() {
        System.out.print("Введите текст: ");
        return new Scanner(System.in).nextLine();
    }
}

