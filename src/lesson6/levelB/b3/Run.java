package javaCore.src.lesson6.levelB.b3;

import java.util.Scanner;

/*
Напишите программу, которая определяет сколько гласных в тексте.
 Создать класс Run и в методе main проверить работу этой программы.
 */
public class Run {
    public static void main(String[] args) {
        System.out.print("Введите текс для проверки: ");
        Scanner scan = new Scanner(System.in);
        String inputText = scan.nextLine();
        Proverka prov = new Proverka();
        System.out.println(prov.proverka(inputText));
    }
}
