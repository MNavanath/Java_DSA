package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//
//        car.acc();
//        //this is not accesible bcz it is not Engine type variable
//        // car.brake();
//        car.start();
//        car.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
    }
}
