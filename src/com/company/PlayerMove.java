package com.company;

import java.util.Scanner;

public class PlayerMove {

    /**
     * To print the possible movement the player can do
     * @param table the table of the game
     * @param player the player that are playing the turn
     */
    public static void possibleMovement(String[][] table, String player){

        //Get players position
        int positionLine = PlayerPosition.getPlayerPositionLine(table, player);
        int positionCol = PlayerPosition.getPlayerPositionCol(table, player);
        boolean lose = true;

        System.out.println("Hey! look what you can do:\n");

        if (
                ((positionCol-1) != -1)&&
                        !((table[positionLine][positionCol - 1].equals("\uD83D\uDD35")) ||
                                (table[positionLine][positionCol - 1].equals("\uD83D\uDD34")) ||
                                (table[positionLine][positionCol - 1].equals("⬜")))
        ){
            System.out.println("    -Move to the left: 'q' ");
            lose = false;
        }
        if(
                (positionCol+1 != 11)&&
                        !((table[positionLine][positionCol + 1].equals("\uD83D\uDD35")) ||
                                (table[positionLine][positionCol + 1].equals("\uD83D\uDD34")) ||
                                (table[positionLine][positionCol + 1].equals("⬜")))
        ){
            System.out.println("    -Move to the right: 'd' ");
            lose = false;
        }
        if(
                ((positionLine-1) != -1) &&
                        !((table[positionLine - 1][positionCol].equals("\uD83D\uDD35")) ||
                                (table[positionLine - 1][positionCol].equals("\uD83D\uDD34")) ||
                                (table[positionLine - 1][positionCol].equals("⬜")))
        ){
            System.out.println("    -Move to the top 'z' ");
            lose = false;
        }
        if(
                (positionLine+1 != 10)&&
                        !((table[positionLine + 1][positionCol].equals("\uD83D\uDD35")) ||
                                (table[positionLine + 1][positionCol].equals("\uD83D\uDD34")) ||
                                (table[positionLine + 1][positionCol].equals("⬜")))
        ){
            System.out.println("    -Move to the bottom: 's' ");
            lose = false;
        }
        if(lose){
            System.out.println("    Sorry no movement can be accomplished, you lose");
        }
    }

    /**
     * A function that allows us to move players to an adjacent cell
     * @param table -- the game board as it is before
     * @return Game board with the players position updated
     */
    public static String[][] PlayerMove(String[][] table, String player){

        //Get players position
        int positionLine = PlayerPosition.getPlayerPositionLine(table, player);
        int positionCol = PlayerPosition.getPlayerPositionCol(table, player);


        //Add a user input
        Scanner input = new Scanner(System.in);

        possibleMovement(table,player);

        /*
         * This while loop allows the player to choose in which direction to move. He can choose to move to the top, bottom, left or right
         * If the value he enters is incorrect, he'll have to enter a new value until it is correct
         * Everytime the value gets checked to see if the movement is possible. There are three possible errors :
         *          if the user tries to move out of the board
         *          if the user tries to move on a destroyed cell
         *          if the user tries to move on his opponent's cell
         */
        while (true) {
            String choiceOfAction = input.next();
            if (choiceOfAction.equals("d")) {  //Check choice
                if ((positionCol + 1) == 11) {  //If out of bonds
                    System.out.println("You tried to cheat by going out of the board ! You really thought you'd teleport ?     Pass your turn.");
                    break;
                }

                //Check if next position is already occupied
                else if (table[positionLine][positionCol + 1].equals("\uD83D\uDD35") || table[positionLine][positionCol + 1].equals("\uD83D\uDD34") || table[positionLine][positionCol + 1].equals("⬜"))  {
                    System.out.println("You cannot go on this cell, try again !");
                }
                // If not, it's ok
                else {
                    table[positionLine][positionCol + 1] = player;
                    table[positionLine][positionCol] = "⬛";  // Replace old players position
                    break;
                }

            }

            /*
             * The same thing repeats for every move chosen by the player
             */
            else if (choiceOfAction.equals("q")) {
                if ((positionCol - 1) == -1) {
                    System.out.println("You tried to cheat by going out of the board ! You really thought you'd teleport ?     Pass your turn.");
                    break;
                }

                else if (table[positionLine][positionCol - 1].equals("\uD83D\uDD35") ||
                        table[positionLine][positionCol - 1].equals("\uD83D\uDD34") ||
                        table[positionLine][positionCol - 1].equals("⬜")) {
                    System.out.println("You cannot go on this cell, try again !");
                }

                else {
                    table[positionLine][positionCol - 1] = player;
                    table[positionLine][positionCol] = "⬛";
                    break;
                }

            }
            else if (choiceOfAction.equals("z")) {
                if ((positionLine - 1) == -1) {
                    System.out.println("You tried to cheat by going out of the board ! You really thought you'd teleport ?     Pass your turn.");
                    break;
                }

                else if (table[positionLine - 1][positionCol].equals("\uD83D\uDD35") || table[positionLine - 1][positionCol].equals("\uD83D\uDD34") || table[positionLine - 1][positionCol ].equals("⬜"))  {
                    System.out.println("You cannot go on this cell, try again !");
                }

                else {
                    table[positionLine - 1][positionCol] = player;
                    table[positionLine][positionCol] = "⬛";
                    break;
                }

            }
            else if (choiceOfAction.equals("s")) {

                if ((positionLine + 1) == 10) {
                    System.out.println("You tried to cheat by going out of the board ! You really thought you'd teleport ?     Pass your turn.");
                     break;
                }

                else if (table[positionLine + 1][positionCol].equals("\uD83D\uDD35") || table[positionLine + 1][positionCol].equals("\uD83D\uDD34") || table[positionLine + 1][positionCol].equals("⬜"))  {
                    System.out.println("You cannot go on this cell, try again !");
                }

                else {
                    table[positionLine + 1][positionCol] = player;
                    table[positionLine][positionCol] = "⬛";
                    break;
                }
            }

            else {
                System.out.println("You tried to cheat by going out of the board ! You really thought you'd teleport ?     Pass your turn.");
            }
        }

        return table;
    }
}