package javaCore.src.lesson1_2.levelA.a2;

/*
Неявное преобразование. В методе main класса Run создайте переменную varByte типа
byte и присвойте этой переменной число 10. Создайте переменную varShort типа
short и присвойте этой переменной значение переменной varByte. Напишите код,
который будет выводить значение переменных varByte и varShort в консоль
 */
public class Run {
    public static void main(String[] args) {
        byte varByte = 10;
        short varShort=varByte;
        System.out.println("byte: "+varByte);
        System.out.println("short: "+varShort);

    }
}
