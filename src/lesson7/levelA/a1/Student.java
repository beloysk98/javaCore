package javaCore.src.lesson7.levelA.a1;

public class Student {
    private String name;
    private int age;

    private class InfoStudent {
        public void infoIgor() {
            setName("Игорь");
            setAge(26);
            System.out.println("Имя: " + getName());
            System.out.println("Возраст: " + getAge());
        }
    }

    public void printInfoStudent() {
        InfoStudent infoStudent = new InfoStudent();
        infoStudent.infoIgor();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
