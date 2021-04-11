package org.academiadecodigo.bootcamp56.sniperelite.enemy;

abstract public class GameObject {

    //abstract public String getMessage();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
