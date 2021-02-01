package org.academiadecodigo.carcrash.cars;

public class CarFactory {

    public static Car getNewCar() {

        int carType = (int) (Math.random() * 2);

        Car car = new Fiat();

        switch (carType) {
            case 0: return new Fiat();
            case 1: return new Mustang();
        }
        return car;
    }

    public static Car getNewTurret() {
        return new Turret();
    }

    public static Car getNewRocket() {
        return new Rocket();
    }


}
