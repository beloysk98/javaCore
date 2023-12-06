package javaCore.src.lesson2_2.levelC.c2;

/*
Вампирами называются числа, состоящие из чётного количества цифр и полученные
перемножением пары чисел, каждое из которых содержит половину цифр результата.
Цифры берутся из исходного числа в произвольном порядке, завершающие нули недопустимы.
Пример: 1827 = 21*87; 2187 = 27*81; Необходимо написать программу, которая находит всех «вампиров»,
 состоящих из 4 цифр.
 */
public class Run {
    public static void main(String[] args) {
        Integer[] mas = new Integer[4];
        for (int i = 1000; i <= 9999; i++) {
            int value1 = i / 1000;
            int value2 = i / 100 % 10;
            int value3 = i / 10 % 10;
            int value4 = i % 10;
            if ((value1 * 10 + value2) * (value4 * 10 + value3) == i || (value2 * 10 + value1) * (value3 * 10 + value4) == i ||
                    (value1 * 10 + value3) * (value2 * 10 + value4) == i || (value3 * 10 + value1) * (value4 * 10 + value2) == i ||
                    (value1 * 10 + value4) * (value2 * 10 + value3) == i || (value4 * 10 + value1) * (value3 * 10 + value2) == i ||
                    (value1 * 10 + value2) * (value3 * 10 + value4) == i || (value2 * 10 + value1) * (value4 * 10 + value3) == i ||
                    (value2 * 10 + value4) * (value3 * 10 + value1) == i || (value4 * 10 + value2) * (value1 * 10 + value3) == i ||
                    (value1 * 10 + value4) * (value3 * 10 + value2) == i || (value4 * 10 + value1) * (value2 * 10 + value3) == i) {
                System.out.println("Число вампир: " + i);
            }
        }
    }
}
