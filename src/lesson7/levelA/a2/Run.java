package javaCore.src.lesson7.levelA.a2;

public class Run {
    public static void main(String[] args) {
        Parrot parrot = new Parrot() {
            @Override
            void say() {
                super.say();
                System.out.println("Данный попугай может говорить!");
            }
        };
        parrot.say();
    }


}
