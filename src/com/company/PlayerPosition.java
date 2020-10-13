package com.company;

public class PlayerPosition {
    /**
     * Get player 1's line position. It is equivalent to the Y coordinate
     * @param table
     * @return the line number on which the player is
     */
    public static int getPlayer1PositionLine(String[][] table){
        int column = 0;
        int line = 0;
        int positionLine = 0;

        for (line = 0; line < 10; line++) {
            for (column = 0; column < 11; column++) {
                if (table[line][column] == "\uD83D\uDD34") {
                    positionLine = line;
                }
            }
        }
        return positionLine;

    }


    /**
     * Get player 1's column position. It is equivalent to the X coordinate
     * @param table
     * @return the column number on which the player is
     */
    public static int getPlayer1PositionCol(String[][] table){
        int column = 0;
        int line = 0;
        int positionCol = 0;

        for (line = 0; line < 10; line++) {
            for (column = 0; column < 11; column++) {
                if (table[line][column] == "\uD83D\uDD34") {
                    positionCol = column;
                }
            }
        }
        return positionCol;

    }




    /**
     * Get player 2's line position. It is equivalent to the Y coordinate
     * @param table
     * @return the line number on which the player is
     */
    public static int getPlayer2PositionLine(String[][] table){
        int column = 0;
        int line = 0;
        int positionLine = 0;

        for (line = 0; line < 10; line++) {
            for (column = 0; column < 11; column++) {
                if (table[line][column] == "\uD83D\uDD35") {
                    positionLine = line;
                }
            }
        }
        return positionLine;

    }


    /**
     * Get player 2's column position. It is equivalent to the X coordinate
     * @param table
     * @return the column number on which the player is
     */
    public static int getPlayer2PositionCol(String[][] table){
        int column = 0;
        int line = 0;
        int positionCol = 0;

        for (line = 0; line < 10; line++) {
            for (column = 0; column < 11; column++) {
                if (table[line][column] == "\uD83D\uDD35") {
                    positionCol = column;
                }
            }
        }
        return positionCol;

    }





}


