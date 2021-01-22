package org.academiadecodigo.bootcamp56.guessnumber;

public class Player {

    private String playerName;

    public int getNumber(int number) {

         int random = Random.random(number);
         return random;
    }

}
