package javaCore.src.lesson2_2.levelA.a3;

/*
В методе main класса Run напишите код для нахождения суммы чисел от 1 до 10.
 */
public class Run {
    public static void main(String[] args) {
        int value = 1;
        for (int i = 2; i <= 10; i++) {
            value = value + i;
            System.out.print(value + " ");
        }
    }
}
