package javaCore.src.lesson9.levelB.b1;

import java.util.List;

/*
Создать класс Group который будет
    хранить в себе номер группы и список одногруппников.
 */
public class Group {
    private int numberGroup;
    private List<Student> students;

    public Group(int numberGroup, List<Student> students) {
        this.numberGroup = numberGroup;
        this.students = students;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "№ " + numberGroup +
                ", список одногрупников = " + students;
    }
}
