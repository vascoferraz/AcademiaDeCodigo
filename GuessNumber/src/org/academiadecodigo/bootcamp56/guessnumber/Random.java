package org.academiadecodigo.bootcamp56.guessnumber;

public class Random {

    public static int random (int max) {
        int randNum;
        randNum = (int)Math.ceil(Math.random() * max);
        //System.out.println(randNum);
        return randNum;
    }


}
