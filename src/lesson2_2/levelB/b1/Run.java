package javaCore.src.lesson2_2.levelB.b1;

import java.util.Scanner;

/*
Напишите программу моделирующую открытие двери домофона по введённому коду
. Код открытия двери 1234. Если пользователь ввёл неправильный код, то сообщить об этом ему и
дать возможность снова вводить новый код до тех пор, пока он не введёт верный код.
 */
public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите код от домофона: ");
        boolean codeOn = false;
        while (!codeOn) {
            String code = scan.nextLine();
            if (codeOn = code.equals("1234")) {
                System.out.println("Дверь открыта.");
            } else {
                System.out.print("Код не верный, повторите ввод: ");
            }
        }
    }
}
