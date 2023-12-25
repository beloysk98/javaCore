package javaCore.src.lesson5_2.levelC.c1;
/*
    Создать классы с полями и методами реализующие принципы ООП на примере сущности Person.
Требования:
    минимум 1 уровень наследования.
    хотя бы 1 класс потомок должен содержать метод, которого нет у родительского класса.
    показать пример инкапсуляции.
	Создать класс Run и в методе main продемонстрируйте работу методов классов.
 */

public class Person {
    private String name;
    private int age;
    private String gender;
    private int height;
    private int weight;

    public void interFace() {
        System.out.printf("Имя: %s\nВозраст: %s\nГендер: %s\nРост: %s\nВес: %s\n", name, age, gender, height, weight);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

