package javaCore.src.lesson3.levelB.b1;

/*
В методе main класса Run создайте массив типа int из 10 элементов.
С помощью класса Random сгенерируйте случайные числа от 0 до 9 и заполните ими созданный массив.
 Выведите значения элементов массива в консоль.
 */
public class Run {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + ",");
        }
    }
}
