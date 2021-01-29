package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    /** The position of the car on the grid */
    private Position pos;

    public Car () {
        this.pos = new Position();
    }

    public Position getPos() {
        return pos;
    }

    public void setPos() {
        pos.setCol();
        pos.setRow();
    }

    public boolean isCrashed() {
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName().substring(0,1);
    }
}
