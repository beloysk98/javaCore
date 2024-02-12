package javaCore.src.lesson9.velelA.a3;

public class Student {
    private String name;
    private int age;
    private int rating;

    public Student() {
    }

    public Student(String name, int age, int rating) {
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Студент {" +
                "Имя='" + name + '\'' +
                ", возраст='" + age + '\'' +
                ", оценка='" + rating + "'}";
    }

}
