package javaCore.src.lesson5_2.levelC.c2;

//пример полиморфизма
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        CommercialShop comShop = new CommercialShop();
        Supermarkets supMar = new Supermarkets();
        info(shop);
        info(comShop);
        info(supMar);

    }

    public static void info(Shop shop) {
        shop.name();
    }
}
