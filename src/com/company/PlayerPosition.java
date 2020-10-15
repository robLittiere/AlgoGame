package com.company;

public class PlayerPosition {

    /**
     * Get player's line position. It is equivalent to the Y coordinate
     * @param table, the table of the game
     * @param player, to know what player is
     * @return the line number on which the player is
     */
    public static int getPlayerPositionLine(String[][] table, String player){
        int column;
        int line;
        int positionLine = 0;

        //Search the whole board to find player's line position
        for (line = 0; line < 10; line++) {
            for (column = 0; column < 11; column++) {
                if (table[line][column].equals(player)) {
                    positionLine = line;
                }
            }
        }
        return positionLine;
    }


    /**
     * Get player 1's column position. It is equivalent to the X coordinate
     * @param table the table of the game
     * @return the column number on which the player is
     */
    public static int getPlayerPositionCol(String[][] table, String player){
        int column;
        int line;
        int positionCol = 0;

        //Search the whole board to find player's line position
        for (line = 0; line < 10; line++) {
            for (column = 0; column < 11; column++) {
                if (table[line][column].equals(player)) {
                    positionCol = column;
                }
            }
        }
        return positionCol;

    }
}
