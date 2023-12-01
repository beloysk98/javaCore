package javaCore.src.lesson2_2.levelA.a2;

/*
В методе main класса Run объявите переменную и проинициализируйте её значением 10.
Используя цикл while выведите значение этой переменной в консоль и уменьшайте на 1 до тех пор,
пока значение этой переменной не станет равно 0.
 */
public class Run {
    public static void main(String[] args) {
        int value = 10;
        while (value <= 10 && value >= 0) {
            System.out.print(value + " ");
            value = value - 1;

        }
    }
}
