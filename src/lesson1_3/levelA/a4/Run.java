package javaCore.src.lesson1_3.levelA.a4;

/*Создайте две переменные и присвойте им одинаковые значения.
 С помощью оператора сравнения сравните значения двух переменных и выведите ответ в консоль.

 */
public class Run {
    public static void main(String[] args) {
        int var1 = 9;
        int var2 = 9;
        boolean var = var1 == var2;
        System.out.println("Эти значения одинаковы? " + var);
        if (var==true){
            System.out.println("Значение двух переменных одинаковы");
        } else {
            System.out.println("Значения двух переменных разные");
        }
        if (var1 == var2) {
            System.out.println("Значение двух переменных одинаковы");
        } else {
            System.out.println("Значения двух переменных разные");
        }
    }
}
