package com.company;

import java.util.Scanner;

public class PlayerMove {


    /**
     * A function that allows us to move player 1 to a new position
     * @param table
     * @return Game board with player 1's position updated
     */
    public static String[][] Player1Move(String[][] table){

        //On récupère la position du joueur
        int positionLine = PlayerPosition.getPlayer1PositionLine(table);
        int positionCol = PlayerPosition.getPlayer1PositionCol(table);


        //Prends une entrée en terminal
        Scanner inpout = new Scanner(System.in);

        System.out.println("Yo, voici les mouvements que tu peux faire");
        System.out.println("Pour te déplacer vers la droite, entre : d");
        System.out.println("Pour te déplacer vers la gauche, entre : q");
        System.out.println("Pour te déplacer vers le haut, entre : z");
        System.out.println("Pour te déplacer vers le bas, entre : s");

        String choiceOfAction = inpout.next();
        if (choiceOfAction.equals("d")){
            if (table[positionLine][positionCol + 1] == "\uD83D\uDD35" || table[positionLine][positionCol + 1] == "\uD83D\uDD34"){
                System.out.println("Tu as essayé de tricher, pour la peine tu passes ton tour !");
            }
            else {
                table[positionLine][positionCol + 1] = "\uD83D\uDD34";
                table[positionLine][positionCol] = "⬛";
            }
        }

        else if (choiceOfAction.equals("q")){
            if (table[positionLine][positionCol - 1] == "\uD83D\uDD35" || table[positionLine][positionCol - 1] == "\uD83D\uDD34"){
                System.out.println("Tu as essayé de tricher, pour la peine tu passes ton tour !");
            }
            else {
                table[positionLine][positionCol - 1] = "\uD83D\uDD34";
                table[positionLine][positionCol] = "⬛";
            }
        }

        else if (choiceOfAction.equals("z")){
            if (table[positionLine - 1][positionCol] == "\uD83D\uDD35" || table[positionLine - 1][positionCol] == "\uD83D\uDD34"){
                System.out.println("Tu as essayé de tricher, pour la peine tu passes ton tour !");
            }
            else {
                table[positionLine - 1][positionCol] = "\uD83D\uDD34";
                table[positionLine][positionCol] = "⬛";
            }
        }

        else if (choiceOfAction.equals("s")){
            if (table[positionLine + 1][positionCol] == "\uD83D\uDD35" || table[positionLine + 1][positionCol] == "\uD83D\uDD34"){
                System.out.println("Tu as essayé de tricher, pour la peine tu passes ton tour !");
            }
            else {
                table[positionLine + 1][positionCol] = "\uD83D\uDD34";
                table[positionLine][positionCol] = "⬛";
            }
        }

        return table;



    }


    /**
     * A function that allows us to move player 2 to a new position
     * @param table
     * @return Game board with player 2's position updated
     */
    public static String[][] Player2Move(String[][] table){

        //On récupère la position du joueur
        int positionLine = PlayerPosition.getPlayer2PositionLine(table);
        int positionCol = PlayerPosition.getPlayer2PositionCol(table);


        //Prends une entrée en terminal
        Scanner inpout = new Scanner(System.in);

        System.out.println("Yo, voici les mouvements que tu peux faire");
        System.out.println("Pour te déplacer vers la droite, entre : d");
        System.out.println("Pour te déplacer vers la gauche, entre : q");
        System.out.println("Pour te déplacer vers le haut, entre : z");
        System.out.println("Pour te déplacer vers le bas, entre : s");

        String choiceOfAction = inpout.next();
        if (choiceOfAction.equals("d")){
            if (table[positionLine][positionCol + 1] == "\uD83D\uDD35" || table[positionLine][positionCol + 1] == "\uD83D\uDD34"){
                System.out.println("Tu as essayé de tricher, pour la peine tu passes ton tour !");
            }
            else {
                table[positionLine][positionCol + 1] = "\uD83D\uDD35";
                table[positionLine][positionCol] = "⬛";
            }
        }

        else if (choiceOfAction.equals("q")){
            if (table[positionLine][positionCol - 1] == "\uD83D\uDD35" || table[positionLine][positionCol - 1] == "\uD83D\uDD34"){
                System.out.println("Tu as essayé de tricher, pour la peine tu passes ton tour !");
            }
            else {
                table[positionLine][positionCol - 1] = "\uD83D\uDD35";
                table[positionLine][positionCol] = "⬛";
            }
        }

        else if (choiceOfAction.equals("z")){
            if (table[positionLine - 1][positionCol] == "\uD83D\uDD35" || table[positionLine - 1][positionCol] == "\uD83D\uDD34"){
                System.out.println("Tu as essayé de tricher, pour la peine tu passes ton tour !");
            }
            else {
                table[positionLine - 1][positionCol] = "\uD83D\uDD35";
                table[positionLine][positionCol] = "⬛";
            }
        }

        else if (choiceOfAction.equals("s")){
            if (table[positionLine + 1][positionCol] == "\uD83D\uDD35" || table[positionLine + 1][positionCol] == "\uD83D\uDD34"){
                System.out.println("Tu as essayé de tricher, pour la peine tu passes ton tour !");
            }
            else {
                table[positionLine + 1][positionCol] = "\uD83D\uDD35";
                table[positionLine][positionCol] = "⬛";
            }
        }

        return table;



    }
}
