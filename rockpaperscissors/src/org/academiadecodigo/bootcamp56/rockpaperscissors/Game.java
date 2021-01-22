package org.academiadecodigo.bootcamp56.rockpaperscissors;

public class Game {

    Player player1 = new Player();
    Player player2 = new Player();

    // ROCK(1),
    // PAPER(2),
    // SCISSOR(3);

    public Game() {


        int player1Choice = player1.getType();
        int player2Choice = player2.getType();



        boolean gameIsFinished = false;

        while (!gameIsFinished == true) {


            if (player1Choice == 1 && player2Choice == 2) {
                System.out.println("Player 1: " + Random.ROCK);
                System.out.println("Player 2: " + Random.PAPER);
                System.out.println("Player 2: Wins");
                break;
            }

            if (player1Choice == 1 && player2Choice == 3) {
                System.out.println("Player 1: " + Random.ROCK);
                System.out.println("Player 2: " + Random.SCISSOR);
                System.out.println("Player 1: Wins");
                gameIsFinished = true;
                break;
            }

            if (player1Choice == 2 && player2Choice == 1) {
                System.out.println("Player 1: " + Random.PAPER);
                System.out.println("Player 2: " + Random.ROCK);
                System.out.println("Player 1: Wins");
                gameIsFinished = true;
                break;
            }

            if (player1Choice == 2 && player2Choice == 3) {
                System.out.println("Player 1: " + Random.PAPER);
                System.out.println("Player 2: " + Random.SCISSOR);
                System.out.println("Player 2: Wins");
                gameIsFinished = true;
                break;
            }

            if (player1Choice == 3 && player2Choice == 1) {
                System.out.println("Player 1: " + Random.SCISSOR);
                System.out.println("Player 2: " + Random.ROCK);
                System.out.println("Player 2: Wins");
                gameIsFinished = true;
                break;
            }

            if (player1Choice == 3 && player2Choice == 2) {
                System.out.println("Player 1: " + Random.SCISSOR);
                System.out.println("Player 2: " + Random.PAPER);
                System.out.println("Player 1: Wins");
                gameIsFinished = true;
                break;
            }

            else {
                Random[] type = Random.values();
                System.out.println(type[player1Choice]);
                break;
            }

        }

    }

}



