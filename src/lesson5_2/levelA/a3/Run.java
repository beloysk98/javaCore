package javaCore.src.lesson5_2.levelA.a3;

public class Run {
    public static void main(String[] args) {
        //пример многоклеточных : водоросли
        multicellular seaweed = new multicellular();
        seaweed.voice();
        //пример хордовых:асцидия
        chordates ascidia = new chordates();
        ascidia.voice();
        //пример позвоночных: рыбы
        vertebrates fish = new vertebrates();
        fish.voice();
    }
}
