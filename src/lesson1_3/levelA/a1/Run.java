package javaCore.src.lesson1_3.levelA.a1;
/*
Создать две переменные типа int и проинициализировать их значениями 4 и 3. Написать код,
который выводит в консоль их сумму, разность, произведение, частное.

 */
public class Run {
    public static void main(String[] args) {
        int var1=4;
        int var2=3;
        System.out.println("Сумма чисел: "+(var1+var2));
        System.out.println("Разность чисел: "+(var1-var2));
        System.out.println("Произведение чисел: "+(var1*var2));
        System.out.println("Деление чисел: "+((float)var1/var2));
    }
}
