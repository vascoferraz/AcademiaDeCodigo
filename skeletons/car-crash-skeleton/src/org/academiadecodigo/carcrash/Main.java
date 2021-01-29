package org.academiadecodigo.carcrash;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Game g = new Game(5, 5, 1);

        g.init(); // Creates a bunch of cars and randomly puts them in the field
        g.start(); // Starts the car crash animation

    }
}
