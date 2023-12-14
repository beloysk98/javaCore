package javaCore.src.lesson3.levelB.b4;

/*
Создайте массив из 10 элементов со случайными числами от 0 до 9.
 Найти и вывести в консоль те элементы массива, значения которых меньше среднего арифметического,
 взятого от всех элементов массива.
 */
public class Run {
    public static void main(String[] args) {
        double sum = 0;
        double average;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            sum = array[i] + sum;
        }
        average = sum / array.length;
        System.out.print("Элементы меньше среднего арифметического = ");
        for (int i : array) {
            if (i < average) {
                System.out.print(i + " ");
            }
        }
        // для 0 2 7 3 2 7 9 4 1 9   average = 4.4
        // вывело: Элементы меньше среднего арифметического= 0,2,3,2,1,

        // куда 4 пропало?
    }
}