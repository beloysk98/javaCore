package javaCore.src.lesson6.levelB.b2;

import java.util.Arrays;

public class Proverka {
    void proverka() {
        String inputText = "apple, banana, cherry ada-ae 3.2 - dad! dakd dla d.Dad da . ";
        String[] arrText = inputText.split("[^\\p{L}-]|(?<!\\w)-|-(?!\\w)");
        arrText = Arrays.stream(arrText).filter(s -> !s.isEmpty()).toArray(String[]::new);
        System.out.println(arrText.length);


    }
}

