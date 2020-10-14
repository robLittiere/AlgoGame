package com.company;

import java.util.Scanner;

public class PlayerMove {


    /**
     * A function that allows us to move player 1 to a new position
     * @param table
     * @return Game board with player 1's position updated
     */

    public static String[][] PlayerMove(String[][] table, String player){

        //To get the position of the player
        int positionLine = PlayerPosition.getPlayerPositionLine(table, player);
        int positionCol = PlayerPosition.getPlayerPositionCol(table, player);

        Scanner inpout = new Scanner(System.in);

        System.out.println("Hey! look what you can do:");
        System.out.println("Move to the right: 'd' ");
        System.out.println("Move to the left: 'q' ");
        System.out.println("Move to the top: 'z' ");
        System.out.println("Move to the bottom: 's' ");


        while (true) {
            String choiceOfAction = inpout.next();
            if (choiceOfAction.equals("d")) {
                if ((positionCol + 1) == 11) {
                    System.out.println("You try to cheat while ou leave the screen! You believe that can teleport you or something ? Ok, pass your turn now, cheater");
                    break;
                }

                else if (table[positionLine][positionCol + 1].equals("\uD83D\uDD35") || table[positionLine][positionCol + 1].equals("\uD83D\uDD34") || table[positionLine][positionCol + 1].equals("⬜"))  {
                    System.out.println("You can't go to this cell, Retry!");
                }

                else {
                    table[positionLine][positionCol + 1] = player;
                    table[positionLine][positionCol] = "⬛";
                    break;
                }

            }
            else if (choiceOfAction.equals("q")) {
                if ((positionCol - 1) == -1) {
                    System.out.println("You try to cheat while ou leave the screen! You believe that can teleport you or something ? Ok, pass your turn now, cheater");
                    break;
                }

                else if (table[positionLine][positionCol - 1].equals("\uD83D\uDD35") || table[positionLine][positionCol - 1].equals("\uD83D\uDD34") || table[positionLine][positionCol - 1].equals("⬜")) {
                    System.out.println("You can't go to this cell, Retry!");
                }

                else {
                    table[positionLine][positionCol - 1] = player;
                    table[positionLine][positionCol] = "⬛";
                    break;
                }

            }
            else if (choiceOfAction.equals("z")) {
                if ((positionLine - 1) == -1) {
                    System.out.println("You try to cheat while ou leave the screen! You believe that can teleport you or something ? Ok, pass your turn now, cheater");
                    break;
                }

                else if (table[positionLine - 1][positionCol].equals("\uD83D\uDD35") || table[positionLine - 1][positionCol].equals("\uD83D\uDD34") || table[positionLine - 1][positionCol ].equals("⬜"))  {
                    System.out.println("You can't go to this cell, Retry!");
                }

                else {
                    table[positionLine - 1][positionCol] = player;
                    table[positionLine][positionCol] = "⬛";
                    break;
                }

            }
            else if (choiceOfAction.equals("s")) {

                if ((positionLine + 1) == 10) {
                    System.out.println("You try to cheat while ou leave the screen! You believe that can teleport you or something ? Ok, pass your turn now, cheater");
                     break;
                }

                else if (table[positionLine + 1][positionCol].equals("\uD83D\uDD35") || table[positionLine + 1][positionCol].equals("\uD83D\uDD34") || table[positionLine + 1][positionCol].equals("⬜"))  {
                    System.out.println("You can't go to this cell, Retry!");
                }

                else {
                    table[positionLine + 1][positionCol] = player;
                    table[positionLine][positionCol] = "⬛";
                    break;
                }
            }

            else {
                gameMenu.printError();
            }
        }

        return table;
    }
}