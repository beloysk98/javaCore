package javaCore.src.lesson8.levelA.levelB.b1;

/*
Реализовать метод setElement, который будет сохранять в первую свободную ячейку элемент.
Реализовать метод getElement, который будет выводить элемент по заданному индексу
Реализовать метод contains, который будет проверять содержится ли уже такой элемент в массиве.
Реализовать метод getIndex, который на входе будет принимать элемент, а на выходе индекс этого элемента в массиве.
Создать класс Run и в методе main проверить работу каждого метода.
*/
public class Run {
    public static void main(String[] args) {
        Array<Object> setElemenT = new Array<>();
        setElemenT.setElement("231");
        setElemenT.setElement(542);
        setElemenT.setElement(2.5);
        setElemenT.setElement(2.5);
        setElemenT.setElement(2.5);
        setElemenT.setElement(2.5);
        setElemenT.setElement(2.5);
        setElemenT.setElement(2.5);
        setElemenT.setElement(2.5);
        setElemenT.setElement(2.5);
        setElemenT.setElement(2.5);
        Array<Object> getElemenT = new Array<>();
        getElemenT.getElement(1);
        Array<Object> conTains = new Array<>();

        //setElemenT.printArray();


    }
}
