package javaCore.src.lesson5_2.levelB.b2;

public class Run {
    public static void main(String[] args) {
        Student Vlad = new Student();
        Vlad.setName("Влад");
        Vlad.setSecondName("Белоус");
        Vlad.setAge(25);
        Vlad.setGroup(3);
        Vlad.setAverage(6.3);
        Vlad.Interface();
        Student Oleg = new Student();
        Oleg.setName("Олег");
        Oleg.setSecondName("Иванов");
        Oleg.setAge(27);
        Oleg.setGroup(4);
        Oleg.setAverage(7.9);
        Oleg.Interface();
    }
}
