package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

public class Turret extends Car {

    private Position pos;

    public Turret() {
        super(0);
        this.pos = new Position(Field.getWidth()/2, Field.getHeight()/2);
    }

    @Override
    public Position getPos() {
        return pos;
    }

}
