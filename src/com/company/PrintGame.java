package com.company;

public class PrintGame {

    /**
     * Print the game board as it is at it's time.
     * @param table
     */
    public static void printBoard(String[][] table) {

        /** Print game board **/
        int line = 0;
        int column = 0;

        //Print the whole grid.
        System.out.println(" A    B    C    D    E    F   G    H    I   J    K");
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
     * @return the board as it is
     */
    public static String[][] createTable(){
        String[][] table = new String[10][11];
        int column = 0;
        int line = 0;


        /** Fill the game baord **/
        for (line = 0; line < 10; line++) {
            for (column = 0; column < 11; column++) {
                table[line][column] = "⬛"; //fill the board with black cells
            }
        }

        //add the players on the board

        table[4][5] = gameMenu.player1Design;
        table[5][5] = gameMenu.player2Design;

        return table;

    }
}
