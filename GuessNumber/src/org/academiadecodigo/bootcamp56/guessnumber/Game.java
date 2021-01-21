package org.academiadecodigo.bootcamp56.guessnumber;

import java.awt.*;

public class Game {


    Player player1 = new Player();
    Player player2 = new Player();

    public Game (int number) {

        //this.publicNumber = number;
        int randomSecret = Random.random(number);
        int value1 = player1.getNumber(number);
        int value2 = player2.getNumber(number);
        System.out.println("Random secret: " + randomSecret);
        System.out.println("Player 1: " + value1);
        System.out.println("Player 2: " + value2);

    }


}


