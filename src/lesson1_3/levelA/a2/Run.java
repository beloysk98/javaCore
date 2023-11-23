package javaCore.src.lesson1_3.levelA.a2;

/*
Создать переменную типа byte и присвоить ей значение 5.
Используя пост-унарный  оператор увеличьте значение переменной на единицу и выведите результат в консоль.
 */
public class Run {
    public static void main(String[] args) {
        byte var = 5;
        var++;
        System.out.println(var);
    }
}
