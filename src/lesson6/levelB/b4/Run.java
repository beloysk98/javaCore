package javaCore.src.lesson6.levelB.b4;

import java.util.Scanner;

/*
Напишите программу для определения оператора РБ по номеру телефона.
 Создать класс Run и в методе main проверить работу этой программы.
 */
public class Run {
    public static void main(String[] args) {
        Proverka prov = new Proverka();
        prov.operator(inputNumber());
    }

    private static String inputNumber() {
        System.out.println("Введите номер для проверки: ");
        return new Scanner(System.in).nextLine();
    }
}
