package javaCore.src.lesson9.velelA.a2;
/*
Создать класс Student который будет хранить в себе имя и возраст ученика.
Создать класс Klass, который будет хранить в себе список одноклассников.

 */

public class Run {
    public static void main(String[] args) {
        Klass klass = new Klass();
        klass.add(new Student("Дима", 20));
        klass.add(new Student("Влад", 25));
        klass.print();
    }
}
