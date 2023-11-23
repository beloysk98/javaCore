package javaCore.src.lesson1_2.levelA.a1;

/*
Объявление и инициализация переменных. Создайте 8 переменных каждого примитивного типа и присвойте
им любые произвольные значения.
В методе main класса Run напишите код, который будет выводить значение каждой переменной в консоль.

 */
public class Run {
    public static void main(String[] args) {
        byte byteVar = 1;
        short shortVar = 231;
        int intVar = 9836;
        long longVar = 932423L;
        float floatVar = 91238F;
        double doubleVar = 23.32;
        boolean booleanVar = false;
        char charVar = 'g';
        System.out.println("byte: "+byteVar);
        System.out.println("short: "+shortVar);
        System.out.println("int: "+intVar);
        System.out.println("long: "+longVar);
        System.out.println("float: "+floatVar);
        System.out.println("double: "+doubleVar);
        System.out.println("boolean: "+booleanVar);
        System.out.println("char: "+charVar);
    }
}