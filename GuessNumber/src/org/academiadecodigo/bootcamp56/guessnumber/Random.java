package org.academiadecodigo.bootcamp56.guessnumber;

public class Random {

    public static int random (int max) {

        int randNum = (int)Math.ceil(Math.random() * max);
        return randNum;
    }


}
