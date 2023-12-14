package javaCore.src.lesson3.levelC.c1;

/*
Создайте двумерный массив чисел размером 4"строки" х 5"столбцов"(20 Элементов)" и заполните его случайными числами от 0 до 99.
 Вывести в консоль получившийся массив.
 */
public class Run {
    public static void main(String[] args) {
        int[][] twoArray = new int[4][5];
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[0].length; j++) {
                twoArray[i][j] = (int) (Math.random() * 100);
                System.out.print("\t" + twoArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
