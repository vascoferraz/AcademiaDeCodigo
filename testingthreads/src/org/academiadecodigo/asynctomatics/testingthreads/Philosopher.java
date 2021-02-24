package org.academiadecodigo.asynctomatics.testingthreads;


import java.util.concurrent.TimeUnit;

public class Philosopher implements Runnable {

    private Boolean leftFork;
    private Boolean rightFork;

    public Philosopher(Boolean leftFork, Boolean rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        //System.out.println(Thread.currentThread().getName());

        while (true) {

            while (leftFork == true && rightFork == true) {

                synchronized (leftFork) {
                    {
                        System.out.println(Thread.currentThread().getName() + " -> left fork");

                        synchronized (rightFork) {
                            System.out.println(Thread.currentThread().getName() + " -> right fork");
                            System.out.println(Thread.currentThread().getName() + " -> is eating");
                            System.out.println(Thread.currentThread().getName() + " -> released both forks");
                            System.out.println(Thread.currentThread().getName() + " -> is thinking");
                            System.out.println(Thread.currentThread().getName() + " --------------");

                        }
                    }
                }
            }
        }
    }
}

