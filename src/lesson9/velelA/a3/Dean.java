package javaCore.src.lesson9.velelA.a3;

import java.util.ArrayList;

/*
Создать класс Dean, в котором в методе main декан будет проверять успеваемость группы студентов.
Для этого создайте объект класса Group и заполните его поля, должно быть минимум 20 человек в группе.
Средний балл студенту нужно задать в диапазоне от 4 до 10 с помощью генератора случайных чисел.
Далее декану нужно сформировать список тех, у кого средний балл 6 и выше, чтобы он знал кому давать стипендию.
Для этого с помощью итератора нужно перебрать список группы и удалить из списка всех у кого балл ниже 6.
 Вывести на консоль список всей группы (с оценками) и на следующей строке список тех, кому дадут стипендию.
 */
public class Dean {
    static Group da = new Group();
    static ArrayList<Integer> ratings = new ArrayList<>();
    static ArrayList<Integer> stipendia = new ArrayList<>();

    public static void main(String[] args) {
        da.add(new Student("Олег", 24, rating()));
        da.add(new Student("Коля", 25, rating()));
        da.add(new Student("Слава", 24, rating()));
        da.add(new Student("Дима", 25, rating()));
        da.add(new Student("Влад", 26, rating()));
        da.add(new Student("Вадим", 24, rating()));
        da.add(new Student("Саша", 25, rating()));
        da.add(new Student("Эдик", 24, rating()));
        da.add(new Student("Сергей", 25, rating()));
        da.add(new Student("Витя", 25, rating()));
        da.add(new Student("Виталя", 26, rating()));
        da.add(new Student("Гриша", 25, rating()));
        da.add(new Student("Катя", 25, rating()));
        da.add(new Student("Оля", 24, rating()));
        da.add(new Student("Лена", 25, rating()));
        da.add(new Student("Алина", 24, rating()));
        da.add(new Student("Даша", 25, rating()));
        da.add(new Student("Маша", 24, rating()));
        da.add(new Student("Света", 24, rating()));
        da.add(new Student("Таня", 25, rating()));
        //da.print();
        sredn();
    }

    private static int rating() {
        double g = (Math.random() * 7 + 4);
        ratings.add((int) g);
        return (int) g;
    }

    private static void sredn() {
        for (int i = 0; i < ratings.size(); i++) {
            if (ratings.get(i) >= 6) {
                stipendia.add(ratings.get(i));
            }
        }
    }
}
