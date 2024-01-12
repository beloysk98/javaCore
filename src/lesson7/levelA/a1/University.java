package javaCore.src.lesson7.levelA.a1;

/*
Создайте класс University, который содержит поле с типом Student
. Внутренний класс Student должен хранить информацию о студенте. Создайте класс Run и в методе main выведите в
консоль информацию о студенте.

 */
public class University {
    Student igor = new Student();

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

        public void printInfoStudent() {
            InfoStudent infoStudent = new InfoStudent();
            infoStudent.infoIgor();
        }
    }


    public void printInfo() {
        igor.printInfoStudent();
    }
// что-то не вижу тут внутреннего класса Student

}
