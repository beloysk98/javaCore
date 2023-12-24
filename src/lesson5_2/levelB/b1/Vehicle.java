package javaCore.src.lesson5_2.levelB.b1;

/*
Создайте класс Vehicle (транспортное средство). Добавьте в него поля view (вид), speed (скорость).
 Добавьте еще минимум 3 поля с точки зрения пассажира.
Создайте 3 класса наследника для Vehicle. В классах наследниках реализуйте метод move().
Создайте класс Run и в методе main создайте объекты классов наследников.
 */
public class Vehicle {
    String view;
    int speed;
    String color;
    int size;
    String numberOfSeats;

    void move() {
        System.out.println("Транспортное средство");
    }
}
