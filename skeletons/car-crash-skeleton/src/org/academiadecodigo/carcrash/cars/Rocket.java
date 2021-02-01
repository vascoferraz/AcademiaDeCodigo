package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

public class Rocket extends Car {

    private Position pos;

    public Rocket() {
        super(3);
        this.pos = new Position(49, 12);
    }

    public Position getPos() {
        return pos;
    }

    public void setPos() {

        randomXY = (int) (Math.random() * 2);

        if (randomXY % 2 == 0) {
            pos.setCol(3);
        }

        if (randomXY % 2 == 1) {
            pos.setRow(3);
        }
    }
}

