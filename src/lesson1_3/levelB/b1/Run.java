package javaCore.src.lesson1_3.levelB.b1;
/*
В методе main класса Run создайте переменную и присвойте ей произвольное положительное число.
 Напишите код, который будет вычислять значение корня квадратного из переменной и выводить ответ в консоль.
 */
public class Run {
    public static void main(String[] args) {
        int var1 = 83;
        double x = Math.sqrt(var1);
        System.out.println("Квадратный корень из числа: "+var1+" ,равен: "+x);
    }
}
