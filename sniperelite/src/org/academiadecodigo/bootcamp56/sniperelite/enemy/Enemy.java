package org.academiadecodigo.bootcamp56.sniperelite.enemy;

public class Enemy extends GameObject implements Destroyable {

    private int health;
    private boolean dead;

    public Enemy(){
        super();
    }

    public void hit(int damage) {
        this.health = this.health-damage;
        System.out.println("SolderEnemy health: " + health);
        if (this.health <= 0) {
            System.out.println("* SoldierEnemy was destroyed *");
            dead = true;
        }
    }

    //public boolean isDead() { return false; }

    public boolean isDestroyed() { return dead; }


    //@Override
    //public String getMessage () { return "E"; }


}
