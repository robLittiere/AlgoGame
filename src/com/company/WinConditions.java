package com.company;

public class WinConditions {

    /**
     *  Check if the player has lost or not
     * @param table after update
     * @param player To examine which player might have lost
     * @return a boolean value to know if the player lost
     */
    public static boolean checkIfPlayerLost(String[][] table, String player) {
        boolean matchIsWon = false;
        int positionLine = PlayerPosition.getPlayerPositionLine(table, player);
        int positionCol = PlayerPosition.getPlayerPositionCol(table, player);


        if (((positionCol + 1) == 11) || (table[positionLine][positionCol + 1].equals(gameMenu.player2Design)) || (table[positionLine][positionCol + 1].equals(gameMenu.player1Design)) || (table[positionLine][positionCol + 1].equals("⬜"))) {

            if (((positionCol - 1) == -1) || (table[positionLine][positionCol - 1].equals(gameMenu.player2Design)) || (table[positionLine][positionCol - 1].equals(gameMenu.player1Design)) || (table[positionLine][positionCol - 1].equals("⬜"))) {

                if (((positionLine - 1) == -1) || (table[positionLine - 1][positionCol].equals(gameMenu.player2Design)) || (table[positionLine - 1][positionCol].equals(gameMenu.player1Design)) || (table[positionLine - 1][positionCol].equals("⬜"))) {

                    if (((positionLine + 1) == 10) || (table[positionLine + 1][positionCol].equals(gameMenu.player2Design)) || (table[positionLine + 1][positionCol].equals(gameMenu.player1Design)) || (table[positionLine + 1][positionCol].equals("⬜"))) {
                        matchIsWon = true;
                    }
                }
            }
        }
        else {
            matchIsWon = false;
        }

        return matchIsWon;
    }
}
