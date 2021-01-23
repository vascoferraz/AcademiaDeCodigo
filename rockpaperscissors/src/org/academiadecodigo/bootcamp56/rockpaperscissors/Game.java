package org.academiadecodigo.bootcamp56.rockpaperscissors;

public class Game {

    Player player1 = new Player();
    Player player2 = new Player();

    // ROCK(1),    // Code 1
    // PAPER(2),   // Code 2
    // SCISSOR(3); // Code 3

    public Game(int numberOfGames) {

        int player1Choice = 0;
        int player2Choice = 0;

        int numberOfWinsPlayer1 = 0;
        int numberOfWinsPlayer2 = 0;
        int numberOfTies = 0;

        Random[] type = Random.values();

        System.out.println("-----------------------------");

        while (numberOfGames > 0) {

                player1Choice = player1.getType();
                player2Choice = player2.getType();

            if (player1Choice == 1 && player2Choice == 2) {
                System.out.println("Player 1: " + type[player1Choice-1] + "  | Code: " + player1Choice);
                System.out.println("Player 2: " + type[player2Choice-1] + " | Code: " + player2Choice);
                System.out.println("Player 2: Wins");
                System.out.println("-----------------------------");
                numberOfGames--;
                numberOfWinsPlayer2++;
                continue;
            }

            if (player1Choice == 1 && player2Choice == 3) {
                System.out.println("Player 1: " + type[player1Choice-1] + "    | Code: " + player1Choice);
                System.out.println("Player 2: " + type[player2Choice-1] + " | Code: " + player2Choice);
                System.out.println("Player 1: Wins");
                System.out.println("-----------------------------");
                numberOfGames--;
                numberOfWinsPlayer1++;
                continue;
            }

            if (player1Choice == 2 && player2Choice == 1) {
                System.out.println("Player 1: " + type[player1Choice-1] + " | Code: " + player1Choice);
                System.out.println("Player 2: " + type[player2Choice-1] + "  | Code: " + player2Choice);
                System.out.println("Player 1: Wins");
                System.out.println("-----------------------------");
                numberOfGames--;
                numberOfWinsPlayer1++;
                continue;
            }

            if (player1Choice == 2 && player2Choice == 3) {
                System.out.println("Player 1: " + type[player1Choice-1] + "   | Code: " + player1Choice);
                System.out.println("Player 2: " + type[player2Choice-1] + " | Code: " + player2Choice);
                System.out.println("Player 2: Wins");
                System.out.println("-----------------------------");
                numberOfGames--;
                numberOfWinsPlayer2++;
                continue;
            }

            if (player1Choice == 3 && player2Choice == 1) {
                System.out.println("Player 1: " + type[player1Choice-1] + " | Code: " + player1Choice);
                System.out.println("Player 2: " + type[player2Choice-1] + "    | Code: " + player2Choice);
                System.out.println("Player 2: Wins");
                System.out.println("-----------------------------");
                numberOfGames--;
                numberOfWinsPlayer2++;
                continue;
            }

            if (player1Choice == 3 && player2Choice == 2) {
                System.out.println("Player 1: " + type[player1Choice-1] + " | Code: " + player1Choice);
                System.out.println("Player 2: " + type[player2Choice-1] + "   | Code: " + player2Choice);
                System.out.println("Player 1: Wins");
                System.out.println("-----------------------------");
                numberOfGames--;
                numberOfWinsPlayer1++;
                continue;
            }

            else {
                System.out.println("Player 1: " + type[player1Choice-1] + " | Code: " + player1Choice);
                System.out.println("Player 2: " + type[player2Choice-1] + " | Code: " + player2Choice);
                System.out.println("Tie");
                System.out.println("-----------------------------");
                numberOfGames--;
                numberOfTies++;
                continue;
            }

        }

        System.out.println("Player 1 total wins:  " + numberOfWinsPlayer1);
        System.out.println("Player 2 total wins:  " + numberOfWinsPlayer2);
        System.out.println("Total number of ties: " + numberOfTies);

        if (numberOfWinsPlayer1 > numberOfWinsPlayer2) {
            System.out.println("Player 1 is the winner");
        }

        if (numberOfWinsPlayer1 < numberOfWinsPlayer2) {
            System.out.println("Player 2 is the winner");
        }

        if (numberOfWinsPlayer1 == numberOfWinsPlayer2) {
            System.out.println("Tie! No winners!");
        }

        System.out.println("-----------------------------");



    }

}



