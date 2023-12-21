package javaCore.src.lesson5_2.levelA.a3;

public class Run {
    public static void main(String[] args) {
        fish carp = new fish(); //название рыбы
        carp.voice();
        fishFamily carpFamily = new fishFamily();//семейство рыб
        carpFamily.voice();
        squads carpLike = new squads();//карпообразные
        carpLike.voice();
    }
}
