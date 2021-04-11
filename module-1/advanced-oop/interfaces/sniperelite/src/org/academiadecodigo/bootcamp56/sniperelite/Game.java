package org.academiadecodigo.bootcamp56.sniperelite;

import org.academiadecodigo.bootcamp56.sniperelite.enemy.*;

public class Game {

    private int numberOfObjects;
    private GameObject[] gameObjects;
    private SniperRifle sniperRifle = new SniperRifle();
    private int shotsFired;


    public Game(int numberOfObjects) {
        this.numberOfObjects = numberOfObjects;
        gameObjects = new GameObject[numberOfObjects];
    }

    public void start() {

        for (int i=0 ; i<numberOfObjects ; i++) {

            gameObjects[i] = createObjects(numberOfObjects)[i];

            if (gameObjects[i] instanceof Destroyable) {
                Destroyable target = (Destroyable) gameObjects[i];

                System.out.println("*** A new \"" + target + "\" appeared on the map ***");

                while (((Destroyable) gameObjects[i]).isDestroyed() == false) {

                    double randomShoot = Math.random();

                    if (randomShoot > 0.3) {
                        System.out.println("Shooting target: " + target);
                        sniperRifle.shoot(target);
                        target.hit( (int) (Math.random() * 70) );
                        shotsFired++;
                    }
                    else {
                        System.out.println("Missed shot");
                        shotsFired++;
                    }
                }
            }


            else {
                System.out.println("*** Skipping because it is a tree ***");
            }

        }
        System.out.println("All targets are down! Number of shots fired: " + shotsFired);

    }


    public GameObject[] createObjects(int numberOfObjects) {

        for (int i=0 ; i<numberOfObjects ; i++) {

            int randomType = (int) (Math.random() * 4);

            switch(randomType){
                case 0:  gameObjects[i] = new SoldierEnemy(); break;
                case 1:  gameObjects[i] = new ArmouredEnemy(); break;
                case 2:  gameObjects[i] = new Barrel(); break;
                default: gameObjects[i] = new Tree(); break;
            }
        }
        return gameObjects;
    }


}





