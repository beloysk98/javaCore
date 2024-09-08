package javaCore.src.lesson9.levelB.b2;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        List<Object> colection = new ArrayList<>();
        colection.add(20);
        colection.add(21);
        colection.add(22);
        colection.add(23);
        colection.add(24);
        colection.add(25);
        colection.add(26);
        colection.add(27);
        colection.add(28);
        colection.add(29);
        colection.add(30);
        colection.add(31);
        colection.add(31);
        colection.add(33);
        colection.add(34);
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("5");
        myArrayList.add("6");
        myArrayList.add("7");
        myArrayList.add("8");
        myArrayList.add("9");
        myArrayList.add("10");
        myArrayList.add("11");
        System.out.println("Вывод  "+myArrayList);
        myArrayList.remove("4");
        System.out.println("Вывод масива после удаления значения "+myArrayList);
        System.out.println("Получаем элемент под индексом "+myArrayList.get(2));
        System.out.println("Устанавливаем элемент под индексом "+myArrayList.set(2,"4"));
        System.out.println("Вывод размера масива "+myArrayList.size());
        myArrayList.addAll(colection);
        System.out.println(myArrayList);
    }
}
