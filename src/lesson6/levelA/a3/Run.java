package javaCore.src.lesson6.levelA.a3;

/*
Написать метод, который на вход принимает строку, а на выводе говорит, это скаляр, вектор или матрица.
“1”           скаляр

“{1, 2, 3}”     вектор

“{{1,2}, {3, 4}}”    матрица

 */
public class Run {
    private static final String str1 = "1";
    private static final String str2 = "{1, 2, 3}";
    private static final String str3 = "{{1,2}, {3, 4}}";

    public static void main(String[] args) {
        Info ad = new Info();
        ad.info(str1);
        ad.info(str2);
        ad.info(str3);

    }
}
