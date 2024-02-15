package javaCore.src.lesson9.levelB.b1;

/*
    Создать класс Student который будет хранить в себе имя и средний балл студента. Создать класс Group который будет
    хранить в себе номер группы и список одногруппников. Создайте класс Faculty который будет хранить в себе название
    факультета и список групп этого факультета. Создайте класс University который будет хранить в себе название
    университета и список факультетов. Создайте класс Runner, в методе main создайте один объект класса University и
    заполните все его поля данными (во всех списках должно хранится минимум 3 объекта). Выведите в консоль средний
    балл студентов по университету.

 */
public class Student {
    private String name;
    private double averageScore;

    public Student(String name, double averageScore) {
        this.name = name;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Студент: " + name +
                ", средний бал: " + averageScore;
    }
}
