package javaCore.src.lesson1_2.levelB.b1;
/*
Явное преобразование. В методе main класса Run создайте переменную varInt типа int и присвойте ей число 130.
 Создайте переменную varByte типа byte и присвойте ей значение переменной varInt. Напишите код, который будет
  выводить значение переменных varInt и varByte в консоль. В многострочном комментарии напишите объяснение почему
  мы получили разные значения переменных varInt и varByte.
 */
public class run {
    public static void main(String[] args) {
        int varInt = 130;
        byte varByte=(byte)varInt;
        System.out.println("Переменная int: "+varInt+" и "+ "переменная byte: "+varByte);
        /*
        Так как byte имеет размер значений от -128 до 128, то при преобразовании значение выходит
        за пределы максимального значения, то отсчет начинается с -128, в итоге имеем -126.
        превышает максимальное значение на 2 значит и минимальное значение увеличится на 2
         */
    }
}