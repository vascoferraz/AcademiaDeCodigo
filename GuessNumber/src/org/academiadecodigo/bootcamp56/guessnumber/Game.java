package org.academiadecodigo.bootcamp56.guessnumber;

import java.awt.*;

public class Game {

    private Player player1 = new Player();
    private Player player2 = new Player();
    private int randomSecret;

    public Game (int number) {

        randomSecret = Random.random(number);

        //System.out.println("Random secret: " + randomSecret);
        //System.out.println("Player 1: " + value1);
        //System.out.println("Player 2: " + value2);

        int value1 = player1.getNumber(number);
        if (numberIsCorrect(value1) == true) {
            System.out.println("Player 1 wins");
        }

        int value2 = player2.getNumber(number);
        if (numberIsCorrect(value2) == true) {
            System.out.println("Player 2 wins");
        }

    }

    private boolean numberIsCorrect(int playerNumber) {
        if (randomSecret == playerNumber) {
           return true;
        }

        else { return false; }

    }

}