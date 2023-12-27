package javaCore.src.lesson5_2.levelC.c2;

/*
    Создать классы с полями и методами реализующие принципы ООП на примере сущности Shop.
Требования:
    минимум 2 уровня наследования.
    хотя бы 1 класс потомок должен содержать метод, которого нет у родительского класса.
    показать пример полиморфизма с интерфейсом.
	Создать класс Run и в методе main продемонстрируйте работу методов классов.
 */
public class Shop {
    private int size;
    private String color;
    private String assortment;

    public Shop() {

    }

    public Shop(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void name() {
        System.out.println("Название магазина");
    }

}
