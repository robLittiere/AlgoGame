package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class PrintGame {

    /**
     * Print the game board as it is at it's time.
     * @param table the table of the game
     */
    public static void printBoard(String[][] table) {

        /* Print game board **/
        int line;
        int column;

        //Print the whole grid.
        System.out.println("  A    B    C    D   E    F   G    H    I   J    K");
        System.out.println("------------------------------------------------------");
        for (line = 0; line < 10; line++) {
            System.out.print("| ");
            for (column = 0; column < 11; column++) {
                if (column == 10){
                    System.out.println(table[line][column] + " | " + line);
                }
                else {
                    System.out.print(table[line][column] + " | ");
                }
            }
            System.out.println("------------------------------------------------------");
        }
    }

    /**
     * Create the board to initiate a game.
     * @return the board as it is.
     */
    public static String[][] createTable(){
        String[][] table = new String[10][11];
        int column;
        int line;


        /* Fill the game baord **/
        for (line = 0; line < 10; line++) {
            for (column = 0; column < 11; column++) {
                table[line][column] = "⬛"; //fill the board with black cells
            }
        }

        //add the players on the board
        int col = ThreadLocalRandom.current().nextInt(0, 10 + 1);
        int li = ThreadLocalRandom.current().nextInt(0, 9 + 1);
        table[4][5] = gameMenu.player1Design;
        table[5][5] = gameMenu.player2Design;

        return table;

    }


    /**
     * Create the board with a bonus to initiate a game.
     * @return the board game to start the game.
     */
    public static String[][] createBonusTable(){
        String[][] table = new String[10][11];
        int column;
        int line;


        /* Fill the game baord **/
        for (line = 0; line < 10; line++) {
            for (column = 0; column < 11; column++) {
                table[line][column] = "⬛"; //fill the board with black cells
            }
        }

        //add the players on the board
        int col = ThreadLocalRandom.current().nextInt(0, 10 + 1);
        int li = ThreadLocalRandom.current().nextInt(0, 9 + 1);
        if ((li == 4) && (col == 5)){
            createBonusTable();  // Used recursivitiy to not place the bonus one the player
        }
        else if ((li == 5) && (col == 5)){
            createBonusTable();  //Used recursivitiy to not place the bonus one the player
        }
        else {
            table[4][5] = gameMenu.player1Design;
            table[5][5] = gameMenu.player2Design;
            table[li][col] = "\uD83D\uDFE8";
        }

        return table;

    }
}
