package javaCore.src.lesson9.levelB.b3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/*
Создать класс MyHashSet с имплементацией интерфейса Set<T>. Не использовать реализацию HashSet из JDK,
 но можно подсмотреть в неё!
 Реализовать методы:
toString()
size()
isEmpty()
add(T e)
remove(Object o)
contains(Object o)
addAll(Collection<?> c)
containsAll(Collection<?> c)
removeAll(Collection<?> c)

Примечание: на все остальные методы интерфейса сделать заглушки без реализации.

 */
public class MyHashSet<T> implements Set<T> {
    private Object[] objects;
    private static final int defaultCapacity = 5;
    private int size;

    public MyHashSet() {
        this.objects = new Object[defaultCapacity];
    }

    @Override
    public boolean add(T t) {
        int newLenght;
        if (size == objects.length) {
            newLenght = (int) (size * 1.5);
            Object[] newObjects = new Object[newLenght];
            for (int i = 0; i < objects.length; i++) {
                newObjects[i] = objects[i];
            }
            objects = newObjects;
            objects[size++] = t;
            return true;
        }

        for (int i = 0; i < size; i++) {
            if (objects[i].equals(t)) {
                return false;
            }
        }

        objects[size++] = t;
        return true;
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "objects=" + Arrays.toString(objects) +
                ", size=" + size +
                '}';
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
