package javaCore.src.lesson9.levelB.b1;

import java.util.ArrayList;
import java.util.List;

/*
 Создайте класс Runner, в методе main создайте один объект класса University и
    заполните все его поля данными (во всех списках должно хранится минимум 3 объекта). Выведите в консоль средний
    балл студентов по университету.
 */
public class Runner {
    public static void main(String[] args) {
        List<Student> studentsOne = new ArrayList<>();
        studentsOne.add(new Student("Влад", 5));
        studentsOne.add(new Student("Дима", 8));
        studentsOne.add(new Student("Коля", 5));


        List<Student> studentsTwo = new ArrayList<>();
        studentsTwo.add(new Student("Катя", 7));
        studentsTwo.add(new Student("Лена", 8));
        studentsTwo.add(new Student("Нина", 9));

        List<Student> studentsThree = new ArrayList<>();
        studentsThree.add(new Student("Олег", 7));
        studentsThree.add(new Student("Андрей", 8));
        studentsThree.add(new Student("Вика", 9));

        List<Group> groups = new ArrayList<>();
        groups.add(new Group(1, studentsOne));
        groups.add(new Group(1, studentsTwo));
        groups.add(new Group(1, studentsThree));

        List<Group> groupsTwo = new ArrayList<>();
        groupsTwo.add(new Group(2, studentsOne));
        groupsTwo.add(new Group(2, studentsTwo));
        groupsTwo.add(new Group(2, studentsThree));

        List<Group> groupsThree = new ArrayList<>();
        groupsThree.add(new Group(3, studentsOne));
        groupsThree.add(new Group(3, studentsTwo));
        groupsThree.add(new Group(3, studentsThree));

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(new Faculty("\nФакультет математики", groups));
        List<Faculty> facultiesTwo = new ArrayList<>();
        faculties.add(new Faculty("\nФакультет биологии", groupsTwo));
        List<Faculty> facultiesThree = new ArrayList<>();
        faculties.add(new Faculty("\nФакультет Физ. подготовка", groupsThree));
        University university = new University("Минский университет", faculties);
        System.out.println(university);
        System.out.println("Средний бал по университету: " + calculateAverageScore(university));

    }

    public static double calculateAverageScore(University university) {
        double totalScore = 0.0;
        int totalStudents = 0;

        for (Faculty faculty : university.getFaculties()) {
            for (Group group : faculty.getGroups()) {
                for (Student student : group.getStudents()) {
                    totalScore += student.getAverageScore();
                    totalStudents++;
                }
            }
        }

        return totalScore / totalStudents;
    }
}