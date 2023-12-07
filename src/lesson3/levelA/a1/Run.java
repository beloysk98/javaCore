package javaCore.src.lesson3.levelA.a1;

/*
В методе main класса Run объявите массив и присвойте ему произвольных 5 значений.
 Выведите в консоль размер массива. Выведите в консоль третий элемент массива.
 */
public class Run {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array.length);
        System.out.println(array[2]);
    }
}
