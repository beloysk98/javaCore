package javaCore.src.lesson5_2.levelC.c2;

public class NameShop implements Interface {
    public void name() {
        System.out.println("Название магазина");
    }

    public static void main(String[] args) {
        NameShop nameShop = new NameShop();
        nameShop.name();
    }
}
