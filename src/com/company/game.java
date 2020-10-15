package com.company;

public class game {

    public static boolean player = rdmPlayer();

    /**
     * To select a player to begin at random
     * rdmValue is a double which is between 0 and 1 because of the .random()
     * @return the player to begin
     */
    public static boolean rdmPlayer(){
        double rdmValue = Math.random();
        if (rdmValue <= 0.5){
            player = true;
        }
        else {
            player = false;
        }
        System.out.println(player);
        return player;
    }

    /**
     * This function print the game board and make the players play their turn. Then return the game board as it is after the players turn
     * @param gameBoard Receive the base game board to print it for the players
     * @param player1 Receive the player 1 Design
     * @param player2 Receive the player 2 Design
     */
    public static void Game(String[][] gameBoard, String player1, String player2){

        //Print the initial board game and initiate Player's variables

        PrintGame.printBoard(gameBoard);

        //Initiate a random player's turn
        if (player) {
            System.out.println("It's "+ gameMenu.player1 +"'s turn \uD83D\uDD34, You're the red ball, don't forget !!");
            gameMenu.jumpLine(2);

            PlayerMove.PlayerMove(gameBoard, player1, player2);
            PrintGame.printBoard(gameBoard);
            PlayerDestroyCase.destroyCell(gameBoard);

            player = false;
        }

        //Initiate the second player's turn
        else {
            System.out.println("It's " + gameMenu.player2 + "'s turn \uD83D\uDD35, You're the blue ball, don't forget !!");
            gameMenu.jumpLine(2);

            PlayerMove.PlayerMove(gameBoard, player2, player1);
            PrintGame.printBoard(gameBoard);
            PlayerDestroyCase.destroyCell(gameBoard);

            player = true;
        }
    }
}
