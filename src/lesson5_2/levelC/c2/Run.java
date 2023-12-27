package javaCore.src.lesson5_2.levelC.c2;

public class Run {
    public static void main(String[] args) {
        //полиморфизм(один метод может рабоать с разными параметрами)
        Shop shops = new Shop();
        Shop shop = new Shop(23);

        CommercialShop comShop = new CommercialShop();
        Supermarkets supMar = new Supermarkets();
        shops.name();
        shop.name();
        comShop.name();
        supMar.name();
        supMar.pizzaDepartment();
        Info nameShop = new Worker();
        Info d = new Products();
        nameShop.name();
        d.name();


    }
}

