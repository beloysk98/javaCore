package javaCore.src.lesson3.levelB.b2;
/*
Создайте массив из 10 элементов со случайными числами от 0 до 9.
 Напишите код для нахождения суммы массива чисел. Выведите в консоль сумму массива.
 */
public class Run {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + ",");
            sum = sum + array[i];
        }
        System.out.println();
        System.out.println("Сумма: " + sum);
    }
}
