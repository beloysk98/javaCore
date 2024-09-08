package javaCore.src.lesson9.levelB.b2;

import java.util.*;

/*
Создать класс MyArrayList с имплементацией интерфейса List<T>. Не использовать реализацию ArrayList из JDK,
 но можно подсмотреть в неё!
 Реализовать методы:
toString()
add(T element)
remove(int index)
get(int index)
set(int index, T element)
add(int index, T element)
addAll(Collection<? extends T> c)


 */
public class MyArrayList<T> implements List<T> {
    private Object[] objects;
    private int defaultCapacity = 10;
    private int size;

    public MyArrayList() {
        this.objects = new Object[defaultCapacity];
        size = 1;
    }

    @Override
    public boolean add(T t) {
        objects[size-1] = t;
        size++;
        int newLenght;
        if (objects.length < size) {
            newLenght = (int) (size * 1.5);
            Object[] newObjects = new Object[newLenght];

            for (int i = 0; i < objects.length; i++) {
                newObjects[i]=objects[i];
            }
            objects=newObjects;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = -1;
        for (int i = 0; i< objects.length; i++){
            if (o.equals(objects[i])){
                index=i;
                break;
            }
        }
        if (index!=-1){
            for (int i=index; i<objects.length-1;i++){
                objects[i]=objects[i+1];
            }
            return true;
        }

        return false;
    }

    @Override
    public T get(int index) {
        return (T) objects[index];
    }

    @Override
    public T set(int index, T element) {
        objects[index] = element;
        return (T) objects[index];
    }

    @Override
    public void add(int index, T element) {
        objects[index] = element;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
       Object[] newObjects= new Object[objects.length+c.size()];
       System.arraycopy(objects,0,newObjects,0,objects.length);
       int i = objects.length;
       for (T element : c){
           newObjects[i++]=element;
       }
       objects = newObjects;
        return false;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "element=" + Arrays.toString(objects) +
                '}';
    }

    @Override
    public boolean isEmpty() {
        return false;
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
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
