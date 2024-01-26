package javaCore.src.lesson9.velelA.a1;

import java.util.ArrayList;

/*
Создать список ArrayList который хранит в себе все цвета радуги. Вывести их в консоль.

 */
public class Run {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Красный");
        colors.add("Оранжевый");
        colors.add("Жёлтый");
        colors.add("Зелёный");
        colors.add("Голубой");
        colors.add("Синий");
        colors.add("Фиолетовый");
        System.out.println("Цвета радуги: ");
        for (String i : colors) {
            System.out.println(i);
        }
    }
}
