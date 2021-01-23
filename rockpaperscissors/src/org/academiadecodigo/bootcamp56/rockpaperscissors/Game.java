package org.academiadecodigo.bootcamp56.rockpaperscissors;

public class Game {

    Player player1 = new Player();
    Player player2 = new Player();

    // ROCK(1),    // Code 1
    // PAPER(2),   // Code 2
    // SCISSOR(3); // Code 3

    public Game() {


        int player1Choice = player1.getType();
        int player2Choice = player2.getType();

        Random[] type = Random.values();

        boolean gameIsFinished = false;

        while (!gameIsFinished == true) {


            if (player1Choice == 1 && player2Choice == 2) {
                System.out.println("Player 1: " + type[player1Choice-1] + "   | Code: " + player1Choice);
                System.out.println("Player 2: " + type[player2Choice-1] + " | Code: " + player2Choice);
                System.out.println("Player 2: Wins");
                gameIsFinished = true;
                break;
            }

            if (player1Choice == 1 && player2Choice == 3) {
                System.out.println("Player 1: " + type[player1Choice-1] + "    | Code: " + player1Choice);
                System.out.println("Player 2: " + type[player2Choice-1] + " | Code: " + player2Choice);
                System.out.println("Player 1: Wins");
                gameIsFinished = true;
                break;
            }

            if (player1Choice == 2 && player2Choice == 1) {
                System.out.println("Player 1: " + type[player1Choice-1] + " | Code: " + player1Choice);
                System.out.println("Player 2: " + type[player2Choice-1] + "  | Code: " + player2Choice);
                System.out.println("Player 1: Wins");
                gameIsFinished = true;
                break;
            }

            if (player1Choice == 2 && player2Choice == 3) {
                System.out.println("Player 1: " + type[player1Choice-1] + "   | Code: " + player1Choice);
                System.out.println("Player 2: " + type[player2Choice-1] + " | Code: " + player2Choice);
                System.out.println("Player 2: Wins");
                gameIsFinished = true;
                break;
            }

            if (player1Choice == 3 && player2Choice == 1) {
                System.out.println("Player 1: " + type[player1Choice-1] + " | Code: " + player1Choice);
                System.out.println("Player 2: " + type[player2Choice-1] + "    | Code: " + player2Choice);
                System.out.println("Player 2: Wins");
                gameIsFinished = true;
                break;
            }

            if (player1Choice == 3 && player2Choice == 2) {
                System.out.println("Player 1: " + type[player1Choice-1] + " | Code: " + player1Choice);
                System.out.println("Player 2: " + type[player2Choice-1] + "   | Code: " + player2Choice);
                System.out.println("Player 1: Wins");
                gameIsFinished = true;
                break;
            }

            else {
                System.out.println("Player 1: " + type[player1Choice-1] + " | Code: " + player1Choice);
                System.out.println("Player 2: " + type[player2Choice-1] + " | Code: " + player2Choice);
                System.out.println("Tie");
                gameIsFinished = true;
                break;
            }

        }

    }

}



