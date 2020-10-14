package com.company;

public class game {

    private static boolean player = true;

    public static String[][] Game(String[][] gameBoard){

        PrintGame.printBoard(gameBoard);

        if (player) {
            System.out.println("It's player 1 turn, You're the red ball, don't forget !!");
            gameMenu.jumpLine(2);

            PlayerMove.PlayerMove(gameBoard,"\uD83D\uDD34");

            player = false;
        }
        else {
            System.out.println("It's player 2 turn, You're the blue ball, don't forget !!");
            gameMenu.jumpLine(2);

            PlayerMove.PlayerMove(gameBoard,"\uD83D\uDD35");

            player = true;
        }
        return gameBoard;
    }
}
