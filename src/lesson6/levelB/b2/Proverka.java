package javaCore.src.lesson6.levelB.b2;

import java.util.Arrays;
import java.util.Scanner;

public class Proverka {
    Scanner scan = new Scanner(System.in);
    void proverka() {
        System.out.print("Введите текст: ");
        String inputText = scan.nextLine();
        String[] arrText = inputText.split("(\\s-)|[0-9,.\\s?!;:()<>]");
        arrText = Arrays.stream(arrText).filter(s -> !s.isEmpty()).toArray(String[]::new);
        System.out.println(arrText.length);


    }
}

