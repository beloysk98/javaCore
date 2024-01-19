package javaCore.src.lesson8.levelB.b1;

/*
Реализовать метод setElement, который будет сохранять в первую свободную ячейку элемент.
Реализовать метод getElement, который будет выводить элемент по заданному индексу
Реализовать метод contains, который будет проверять содержится ли уже такой элемент в массиве.
Реализовать метод getIndex, который на входе будет принимать элемент, а на выходе индекс этого элемента в массиве.
Создать класс Run и в методе main проверить работу каждого метода.
*/
public class Run {
    public static void main(String[] args) {
        Array list = new Array();
        list.setElement("231");
        list.setElement(542);
        list.setElement(2);
        list.setElement(2.5);
        list.setElement(2.5);
        list.setElement(2.5);
        list.setElement(2.5);
        list.setElement(2.5);
        list.setElement(2.5);
        list.setElement(2.5);
        list.setElement(2.9);
        list.setElement(5);
        System.out.println(list.getElement(1));
        System.out.println(list.contains(2));
        System.out.println(list.getIndex(542));
        list.printArray();


    }
}
