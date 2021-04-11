package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarFactory;
import org.academiadecodigo.carcrash.field.Field;

public class Game {

    public static final int MANUFACTURED_CARS = 5;

    /**
     * Container of Cars
     */
    private Car[] cars;

    /**
     * Animation delay
     */
    private int delay;

    public Game(int cols, int rows, int delay) {

        Field.init(cols, rows);
        this.delay = delay;

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];
        for (int i = 0; i < cars.length-1; i++) {
            cars[i] = CarFactory.getNewCar();
            cars[MANUFACTURED_CARS-2] = CarFactory.getNewTurret();
            cars[MANUFACTURED_CARS-1] = CarFactory.getNewRocket();
        }

        Field.draw(cars);

    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            // Move all cars
            moveAllCars();

            // Update screen
            Field.draw(cars);

        }

    }

    private void moveAllCars() {

        for (int i = 0; i < cars.length; i++) {

            if (cars[i].isCrashed() == false) {

                cars[i].setPos();

                for (int j = 0; j <= cars.length-1 ; j++) {

                    for (int k = j+1; k <= cars.length-1 ; k++) {

                        if (cars[j].getPos().getCol() == cars[k].getPos().getCol() && cars[j].getPos().getRow() == cars[k].getPos().getRow()) {

                            cars[j].stopCar();
                            cars[k].stopCar();
                        }
                    }
                }
            }
        }
    }
}
