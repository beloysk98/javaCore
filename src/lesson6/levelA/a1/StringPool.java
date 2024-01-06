package javaCore.src.lesson6.levelA.a1;

/*

Сколько строк будет храниться в String Pool в результате выполнения следующего кода:


Ответ : 3 строки будет храниться, так как при создании обьекта через оператор new строка не помещается в пул строк
В переменной s4 при помощи метода intern() мы помещаем строку s3 в пул и присваеваем ее значение s4

Александр: Какие строки храниятся в String Pool?
Одинаковые строки хранятся, кроме обьектов


 */
public class StringPool {
    public static void main(String[] args) {
        String s1 = "Cat1";
        String s2 = "Cat";
        String s3 = new String("Cat");
        String s4 = s3.intern();
        System.out.println("s1==s2: " + (s1 == s2));
        System.out.println("s1==s3: " + (s1 == s3));
        System.out.println("s1==s4: " + (s1 == s4));
    }
}
