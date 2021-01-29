package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    /**
     * The position of the car on the grid
     */
    private Position pos;
    private boolean stopCar;

    int randomXY = (int) (Math.random() * 2);
    int randomNumberOfMoves = (int) (Math.random() * 10);

    public Car() {
        this.pos = new Position();
    }

    public Position getPos() {
        return pos;
    }

    public void setPos() {


        if (randomXY % 2 == 0 && randomNumberOfMoves > 0) {
            pos.setCol();
            randomNumberOfMoves--;
        }

        if (randomXY % 2 == 1 && randomNumberOfMoves > 0) {
            pos.setRow();
            randomNumberOfMoves--;
            }

        if (randomNumberOfMoves == 0 ) {
            randomNumberOfMoves = (int) (Math.random() * 20);
            randomXY = (int) (Math.random() * 2);
        }


}

    public boolean isCrashed() {
        return stopCar;
    }

    public void stopCar() {
        stopCar = true;
    }

    @Override
    public String toString() {
        return isCrashed() ? "C" : this.getClass().getSimpleName().substring(0, 1);
    }
}
