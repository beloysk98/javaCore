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

    public void print() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }
    }

}
