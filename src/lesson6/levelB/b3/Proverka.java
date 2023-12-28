package javaCore.src.lesson6.levelB.b3;

public class Proverka {
    final String vowels = "аАуУоОыЫэЭяЯюЮёЁиИеЕaAeEiIoOuUyY";

    public int proverka(String inputText) {
        int numberVowels = 0;
        for (int i = 0; i < inputText.length(); i++) {
            char test = inputText.charAt(i);
            if (vowels.indexOf(test) != -1) {
                numberVowels++;
            }
        }

        return numberVowels;
    }
}
