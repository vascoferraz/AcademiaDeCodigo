package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.grid.GridType;

public class CarCrashX {

    public static void main(String[] args) throws InterruptedException {

        //Game g = new Game(GridType.LANTERNA, 80, 25, 200);
        Game g = new Game(GridType.SIMPLE_GFX, 80, 25, 200);

        g.init();
        g.start();

    }

}
