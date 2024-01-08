package javaCore.src.lesson6.levelC.c1;

import java.util.Arrays;
import java.util.Comparator;

public class Proverka {
    public void info() {
        String[] splitverhik = splitVersh();
        Arrays.sort(splitverhik, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        for (String sentence : splitverhik) {
            System.out.println(sentence);
        }


    }

    private String[] splitVersh() {
        Versh vershik = new Versh();
        return vershik.versh.split("\\.");
    }

}
