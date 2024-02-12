package javaCore.src.lesson9.velelA.a2;

import java.util.ArrayList;

public class Klass {
    private ArrayList<Student> students;

    public Klass() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        this.students.add(student);
    }

    public void print() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }
}
