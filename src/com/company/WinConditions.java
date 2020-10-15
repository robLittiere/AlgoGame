package com.company;

public class WinConditions {

    public static boolean checkIfPlayerLost(String[][] table, String player) {
        boolean matchIsWon = false;
        int positionLine = PlayerPosition.getPlayerPositionLine(table, player);
        int positionCol = PlayerPosition.getPlayerPositionCol(table, player);


        if (((positionCol + 1) == 11) || (table[positionLine][positionCol + 1].equals("\uD83D\uDD35")) || (table[positionLine][positionCol + 1].equals("\uD83D\uDD34")) || (table[positionLine][positionCol + 1].equals("⬜"))) {

            if (((positionCol - 1) == -1) || (table[positionLine][positionCol - 1].equals("\uD83D\uDD35")) || (table[positionLine][positionCol - 1].equals("\uD83D\uDD34")) || (table[positionLine][positionCol - 1].equals("⬜"))) {

                if (((positionLine - 1) == -1) || (table[positionLine - 1][positionCol].equals("\uD83D\uDD35")) || (table[positionLine - 1][positionCol].equals("\uD83D\uDD34")) || (table[positionLine - 1][positionCol].equals("⬜"))) {

                    if (((positionLine + 1) == 10) || (table[positionLine + 1][positionCol].equals("\uD83D\uDD35")) || (table[positionLine + 1][positionCol].equals("\uD83D\uDD34")) || (table[positionLine + 1][positionCol].equals("⬜"))) {
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
