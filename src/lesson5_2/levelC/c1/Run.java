package javaCore.src.lesson5_2.levelC.c1;

public class Run {
    public static void main(String[] args) {
        Person igor = new Person();
        igor.setName("Игорь");
        igor.setAge(25);
        igor.setGender("Мужчина");
        igor.setHeight(187);
        igor.setWeight(75);
        igor.interFace();
        Worker worKer = new Worker();
        worKer.work();
    }
}
