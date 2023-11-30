package javaCore.src.lesson1_2.levelC.c2;

/*
Создайте enum класс с перечислением месяцев года.
Создайте метод, который на вход принимает значение месяца, а на выходе отдаёт пору года.
 В методе main класса Run вызовите этот метод и выведите в консоль результат работы этого метода.
 */
public class Run {
    public static void main(String[] args) {
        System.out.println(Mounth.getSeason(Mounth.AUGUST));

    }
}

