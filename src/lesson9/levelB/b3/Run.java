package javaCore.src.lesson9.levelB.b3;

public class Run {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        System.out.println(myHashSet.size());
        myHashSet.add("23");
        myHashSet.add("24");
        myHashSet.add("25");
        myHashSet.add("26");
        myHashSet.add("26");
        myHashSet.add("27");
        myHashSet.add("28");
        myHashSet.add("29");
        System.out.println(myHashSet.size());
        System.out.println(myHashSet.toString());
        System.out.println(myHashSet.isEmpty());
    }
}
