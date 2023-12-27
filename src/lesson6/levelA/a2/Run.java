package javaCore.src.lesson6.levelA.a2;

/*
Сохраните слово “дом” в переменную. Найдите длину этого слова и выведите на экран.
Переведите все буквы этой переменной в верхний регистр. Замените одну букву так,
 чтобы получилось другое слово, результат сохраните в новую переменную и выведите на экран.
 */
public class Run {
    public static void main(String[] args) {
        String home = "дом";
        System.out.println(home.length());
        System.out.println(home.toUpperCase());
        //если у нас первый символ встречается 1 раз
        System.out.println(home.replace("д", "к"));
        //если нет
        String[] repl = home.split("");
        repl[0] = "к";
        String repLace = String.join("", repl);
        System.out.println(repLace);
    }
}
