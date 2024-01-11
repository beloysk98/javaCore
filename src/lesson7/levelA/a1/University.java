package javaCore.src.lesson7.levelA.a1;

/*
Создайте класс University, который содержит поле с типом Student
. Внутренний класс Student должен хранить информацию о студенте. Создайте класс Run и в методе main выведите в
консоль информацию о студенте.

 */
public class University {
    Student igor = new Student();

    public void printInfo() {
        igor.printInfoStudent();
    }
// что-то не вижу тут внутреннего класса Student

}
