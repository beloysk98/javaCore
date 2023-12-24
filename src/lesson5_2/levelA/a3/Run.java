package javaCore.src.lesson5_2.levelA.a3;

public class Run {
    public static void main(String[] args) {
        //пример многоклеточных : водоросли
        Multicellular seaweed = new Multicellular();
        seaweed.voice();
        //пример хордовых:асцидия
        Chordates ascidia = new Chordates();
        ascidia.voice();
        //пример позвоночных: рыбы
        Vertebrates fish = new Vertebrates();
        fish.voice();
    }
}
