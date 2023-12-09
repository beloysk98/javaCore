package javaCore.src.lesson3.levelC.c1;

/*
Создайте двумерный массив чисел размером 4"строки" х 5"столбцов"(20 Элементов)" и заполните его случайными числами от 0 до 99.
 Вывести в консоль получившийся массив.
 */
public class Run {
    public static void main(String[] args) {
        int[][] twoArray = new int[4][5];
        //int [][] twoArray= new int {{1,2,3,4,5}{6,7,8,9,10}{11,12,13,14,15}{16,17,18,19,20}}
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[0].length; j++) {
                twoArray[i][j] = (int) (Math.random() * 100);
                System.out.print(" " + twoArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
