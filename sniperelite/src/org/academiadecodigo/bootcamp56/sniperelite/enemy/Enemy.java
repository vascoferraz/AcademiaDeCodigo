package org.academiadecodigo.bootcamp56.sniperelite.enemy;

public class Enemy extends GameObject implements Destroyable {

    private int health;
    private boolean dead;

    public Enemy(){
        super();
    }

    public void hit(int i) {
        int random = (int) (Math.random() * 10);
        this.health = this.health-random;
        System.out.println("My current health is: " + health);
        if (this.health <= 0) {
            dead = true;
        }
    }

    //public boolean isDead() { return false; }

    public boolean isDestroyed() { return dead; }


    //@Override
    //public String getMessage () { return "E"; }



}
