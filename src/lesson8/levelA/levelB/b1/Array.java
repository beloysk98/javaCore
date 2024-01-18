package javaCore.src.lesson8.levelA.levelB.b1;

/*
Создать обобщённый класс Array, который хранит в себе массив объектов в количестве 10 шт по умолчанию.
Реализовать метод setElement, который будет сохранять в первую свободную ячейку элемент.
 Реализовать метод getElement, который будет выводить элемент по заданному индексу
 Реализовать метод contains, который будет проверять содержится ли уже такой элемент в массиве.
 Реализовать метод getIndex, который на входе будет принимать элемент, а на выходе индекс этого элемента в массиве.
 Создать класс Run и в методе main проверить работу каждого метода.
 */
public class Array<T> {
    private Object[] array = new Object[10];

    public void setElement(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = element;
                return;
            }
        }
        System.out.println("В масиве нет пустых ячеек");
    }

    public Object getElement(int index) {
        if (index < 0 || index >= array.length) {
            return "Индекс выходит за пределы длинны массива";
        }
        return array[index];
    }

    public String contains(T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return "Такое значение есть в масиве";
            }
        }
        return "Такого значения нет в масиве";
    }

    public String getIndex(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return String.valueOf(i);
            }
        }
        return "Такого элемента нет";
    }

    public void printArray() {
        for (Object i : array) {
            System.out.print(i + "\t");
        }
    }
}
