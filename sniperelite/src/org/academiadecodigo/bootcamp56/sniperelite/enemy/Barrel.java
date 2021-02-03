package org.academiadecodigo.bootcamp56.sniperelite.enemy;

public class Barrel extends GameObject implements Destroyable{

    private BarrelType barrelType;
    private int currentStatus= 100;
    private boolean destroyed = false;

    @Override
    public void hit(int damage) {
        this.currentStatus = this.currentStatus-damage;
        System.out.println("My current health is: " + currentStatus);
        if (this.currentStatus <= 0) {
            destroyed = true;
        }
    }

    @Override
    public boolean isDestroyed() { return destroyed; }

    //@Override
    //public String getMessage() { return "A"; }



}
