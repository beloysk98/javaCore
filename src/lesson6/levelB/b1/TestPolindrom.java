package javaCore.src.lesson6.levelB.b1;

import java.util.Scanner;

public class TestPolindrom {
    private Scanner scan = new Scanner(System.in);
    private String word;

    void print() {
        System.out.print("Введите слово для проверки: ");
        word = scan.nextLine();
        String replProbel = word.replaceAll(" ", "");
        StringBuilder rever = new StringBuilder(replProbel);
        rever.reverse();
        String reverString = rever.toString();
        System.out.println(rever);
        if (replProbel.equals(reverString)) {
            System.out.println("Слово/словосочетание полиндром");
        } else {
            System.out.println("Слово/словосочетание не полиндром");
        }
    }
}

