package javaCore.src.lesson1_2.levelC.c2;

public enum Season {
    WINTER("Холодно"), AUTUMN("Желто"), SUMMER("Жарко"), SPRING("Трава");
    String info;

    Season(String info) {

    }

    public String getInfo() {
        return info;
    }

}
