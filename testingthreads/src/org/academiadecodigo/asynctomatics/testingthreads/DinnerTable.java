package org.academiadecodigo.asynctomatics.testingthreads;

import java.util.Base64;

public class DinnerTable {

    public static void main(String[] args) {

        Boolean leftFork = new Boolean(false);
        Boolean rightFork = new Boolean(false);


        Philosopher philosopher1 = new Philosopher(leftFork, rightFork);
        Philosopher philosopher2 = new Philosopher(leftFork, rightFork);

        Thread philosopher1Thread = new Thread(philosopher1, "Philosopher 1");
        Thread philosopher2Thread = new Thread(philosopher2, "Philosopher 2");

        philosopher1Thread.start();
        philosopher2Thread.start();

    }
}
