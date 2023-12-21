package javaCore.src.lesson5_2.levelA.a2;

/*
Создайте класс Person с полями name, age, gender и методами walk(), eat(), sleep().
Создайте конструктор, который в качестве параметров принимает значения name, age, gender.
 Создайте класс Run и в методе main создайте объект класса Person.
 */
class Person {
    String name;
    int age;
    String gender;

    public void walk() {
    }

    public void eat() {

    }

    public void sleep() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    void Info() {
        System.out.printf("Name: %s\nAge: %d\nGender: %s", name, age, gender);
    }
}
