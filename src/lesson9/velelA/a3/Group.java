package javaCore.src.lesson9.velelA.a3;

import java.util.ArrayList;

public class Group {
    private ArrayList<Student> students;

    public Group() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        this.students.add(student);
    }

    public Student get(int index) {
        return students.get(index);
    }

    public void print() {
        System.out.println("Список группы: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
        System.out.println("\t");
    }

}
