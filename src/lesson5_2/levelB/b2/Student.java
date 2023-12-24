package javaCore.src.lesson5_2.levelB.b2;

/*
Создайте класс Student с полями: имя, фамилия, возраст, группа, средний балл.
Создайте конструктор для заполнения всех полей класса. Создайте метод, который будет выводить
 в консоль всю информацию о студенте. Создайте класс Run и в методе main продемонстрируйте работу
 метода на двух объектах класса Student.
 */
public class Student {
    String name;
    String secondName;
    int age;
    int group;
    double average;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void Interface() {

        System.out.printf("Name: %s\nsecondName: %s\nage: %d\ngroup: %d\naverage: %s\n", name, secondName, age, group, average);
    }
}
