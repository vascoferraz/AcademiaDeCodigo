package org.academiadecodigo.bootcamp56.sniperelite.enemy;

public class SoldierEnemy extends Enemy implements Destroyable{

    private int health = 100;
    private boolean dead;

    public SoldierEnemy() {
        super();
    }

    @Override
    public void hit(int damage) {
        this.health = this.health-damage;
        System.out.println("My current health is: " + health);
        if (this.health <= 0) {
            dead = true;
        }
    }

    @Override
    public boolean isDestroyed() { return dead; }

}
