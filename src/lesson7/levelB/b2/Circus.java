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
    private Bear bear;
    private Elephant elephant;
    private Horse horse;

    public Circus(String name) {
        this.name = name;
        this.bear = new Bear();
        this.horse = new Horse();
        this.elephant = new Elephant();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bear getBear() {
        return bear;
    }

    public void setBear(Bear bear) {
        this.bear = bear;
    }

    public Elephant getElephant() {
        return elephant;
    }

    public void setElephant(Elephant elephant) {
        this.elephant = elephant;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    public void poster() {
        System.out.println(this.name + ": ");
        this.bear.iCan();
        this.elephant.iCan();
        this.horse.iCan();
    }


    @Override
    public String toString() {
        return "Circus{" +
                "name='" + name + '\'' +
                ", bear=" + bear +
                ", elephant=" + elephant +
                ", horse=" + horse +
                '}';
    }

}