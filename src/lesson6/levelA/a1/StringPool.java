package javaCore.src.lesson6.levelA.a1;

/*

Сколько строк будет храниться в String Pool в результате выполнения следующего кода:

Ответ: Две строки, строка s3 то отбьектБ, a s4 присваиваем ссылку на s3

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
