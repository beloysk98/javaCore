package javaCore.src.lesson8.levelB.b1;

/*
1    Создать обобщённый класс Array, который хранит в себе массив объектов в количестве 10 шт по умолчанию.
 Реализовать метод setElement, который будет сохранять в первую свободную ячейку элемент.
 Реализовать метод getElement, который будет выводить элемент по заданному индексу
 Реализовать метод contains, который будет проверять содержится ли уже такой элемент в массиве.
 Реализовать метод getIndex, который на входе будет принимать элемент, а на выходе индекс этого элемента в массиве.
 Создать класс Run и в методе main проверить работу каждого метода.
 2   Дополнить первое задание созданием метода printArray, который будет выводить в консоль все элементы,
  которые хранятся в массиве. Проверить работу этого метода.
 3  Дополнить первое задание созданием функционала, который будет расширять вместимость массива в 2 раза,
 если при добавлении нового элемента в массив все ячейки уже заняты. Проверить работу этого метода.


 */
public class Array {
    private Object[] array = new Object[10];
    private Object[] arrayCopy = new Object[array.length * 2];

    public void setElement(Object element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = element;
                return;
            }
        }
        System.arraycopy(array, 0, arrayCopy, 0, array.length);
        for (int g = 0; g < arrayCopy.length; g++) {
            if (arrayCopy[g] == null) {
                arrayCopy[g] = element;
                return;
            }
        }
    }

    public Object getElement(int index) {
        if (index < 0 || index >= arrayCopy.length) {
            return "Индекс выходит за пределы длинны массива.";
        }
        return "Элемент под индексом: " + arrayCopy[index];
    }

    public String contains(Object value) {
        for (int i = 0; i < arrayCopy.length; i++) {
            if (arrayCopy[i].equals(value)) {
                return "Такое значение есть в масиве.";
            }
        }
        return "Такого значения нет в масиве.";
    }

    public String getIndex(Object element) {
        for (int i = 0; i < arrayCopy.length; i++) {
            if (arrayCopy[i].equals(element)) {
                return "Индекс введеного элемента: " + i + ".";
            }
        }
        return "Такого элемента нет.";
    }

    public void printArray() {
        for (int i = 0; i < arrayCopy.length; i++) {
            if (arrayCopy[i] != null) {
                System.out.print(arrayCopy[i] + ", ");
            } else {
                break;
            }
        }
    }
}
