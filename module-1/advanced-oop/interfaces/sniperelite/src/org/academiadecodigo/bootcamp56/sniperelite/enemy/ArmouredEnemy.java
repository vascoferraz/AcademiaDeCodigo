package org.academiadecodigo.bootcamp56.sniperelite.enemy;

public class ArmouredEnemy extends Enemy implements Destroyable {

    private int health = 100;
    private int armour = 100;
    private boolean dead = false;

    public ArmouredEnemy() {
        super();
    }

    @Override
    public void hit(int damage) {

        if (this.armour > 0) {
            this.armour = this.armour - damage;
            System.out.println("ArmouredEnemy armour status: " + armour);
        }

        if (this.armour <= 0) {
            this.health = this.health - damage;
            System.out.println("ArmouredEnemy health: " + health);
        }

        if (this.health <= 0) {
            System.out.println("* ArmouredEnemy was destroyed *");
            dead = true;
        }
    }

    @Override
    public boolean isDestroyed() { return dead; }

}
