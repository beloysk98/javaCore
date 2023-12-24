package javaCore.src.lesson5_2.levelB.b1;

public class Run {
    public static void main(String[] args) {
        //колесное т-ное ср-во : повозка
        WheeledVehicle cart = new WheeledVehicle();
        cart.move();
        //автомобиль:легковой автомобиль
        Automobile passengerCar = new Automobile();
        passengerCar.move();
        //внедорожник : джип
        Suv jeep = new Suv();
        jeep.move();
    }
}
