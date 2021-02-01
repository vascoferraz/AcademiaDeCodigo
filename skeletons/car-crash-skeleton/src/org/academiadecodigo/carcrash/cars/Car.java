package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    /**
     * The position of the car on the grid
     */
    private Position pos;
    private int x;
    private int y;

    private boolean stopCar;
    private int speed;

    int randomXY = (int) (Math.random() * 2);

    public Car(int speed) {
        this.pos = new Position( (int) (Math.random() * Field.getWidth()), (int) (Math.random() * Field.getHeight()) );
        this.speed = speed;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos() {

        randomXY = (int) (Math.random() * 2);

        if (randomXY % 2 == 0) {
            pos.setCol(speed);
        }

        if (randomXY % 2 == 1) {
            pos.setRow(speed);
        }
    }

    public boolean isCrashed() {
        return stopCar;
    }

    public void stopCar() {
        stopCar = true;
    }

    public int speed() { return speed; }


    @Override
    public String toString() {
        return isCrashed() ? "C" : this.getClass().getSimpleName().substring(0, 1);
    }
}
