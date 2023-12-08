package javaCore.src.lesson3.levelB.b3;

/*
Создайте массив из 10 элементов со случайными числами от 0 до 9. Найдите максимальное и
минимальное число с их индексами. Выведите в консоль эти значения.
 */
public class Run {
    public static void main(String[] args) {
        int[] array = new int[10];
        int valueMax = 0;
        int indexMax = 0;
        int indexMin = 0;
        System.out.print("Числа масива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + ",");
            if (valueMax < array[i]) {
                valueMax = array[i];
                indexMax = i;
            }
            if (array[0] > array[i]) {
                array[0] = array[i];
                indexMin = i;
            }

        }
        System.out.println();
        System.out.println("Максимальное число : " + valueMax + ", его индекс: " + indexMax);
        System.out.println("Минимальное число: " + array[0] + ", его индекс: " + indexMin);
    }
}