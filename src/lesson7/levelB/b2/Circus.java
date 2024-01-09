package javaCore.src.lesson7.levelB.b2;
/*

 Создайте класс Circus в котором будет поле name и будут поля с типом Bear, Elephant, Horse.
        У каждого животного реализуйте метод iCan(), который выводит в консоль текст “я умею ходить”.
        В методе main класса Run создайте два объекта типа Circus и задайте им имена, для каждого цирка
        создайте отдельные объекты животных, которые умеют делать больше, чем просто ходить.
        /*
 */

public class Circus {
    private String name;


    void animal() {
        Bear bear = new Bear() {
            void iCan() {
                System.out.println("Я умею ходить");
            }
        };
        class Elephant {
            void iCan() {
                System.out.println("Я умею ходить");
            }
        }
        class Horse {
            void iCan() {
                System.out.println("Я умею ходить");
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Run {
        public static void main(String[] args) {
            Circus horse = new Circus();
            Circus bear = new Circus();
            horse.setName("Лошадь");
            bear.setName("Медведь");
            System.out.println(Circus.);

        }
    }

}
