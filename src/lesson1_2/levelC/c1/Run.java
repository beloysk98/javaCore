package javaCore.src.lesson1_2.levelC.c1;

/*
В классе Run создайте переменную ссылочного типа MyLinkType.
 */
public class Run {
    public static void main(String[] args) {
        MyLinkType myLinkType = new MyLinkType();
        myLinkType.x+=3;
        System.out.println(myLinkType.x);
    }
}