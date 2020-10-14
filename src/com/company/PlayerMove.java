package com.company;

import java.util.Scanner;

public class PlayerMove {


    /**
     * A function that allows us to move player 1 to a new position
     * @param table
     * @return Game board with player 1's position updated
     */
    public static String[][] PlayerMove(String[][] table, String player){

        //On récupère la position du joueur
        int positionLine = PlayerPosition.getPlayerPositionLine(table, player);
        int positionCol = PlayerPosition.getPlayerPositionCol(table, player);


        //Prends une entrée en terminal
        Scanner inpout = new Scanner(System.in);

        System.out.println("Yo, voici les mouvements que tu peux faire");
        System.out.println("Pour te déplacer vers la droite, entre : d");
        System.out.println("Pour te déplacer vers la gauche, entre : q");
        System.out.println("Pour te déplacer vers le haut, entre : z");
        System.out.println("Pour te déplacer vers le bas, entre : s");

        String choiceOfAction = inpout.next();
        if (choiceOfAction.equals("d")){
            if ((positionCol + 1) == 11){
                System.out.println("Tu as essayé de tricher en sortant de l'écran ! Tu croyais que ça allait te téléporter ? Pour la peine tu passes ton tour !");
            }
            else if (table[positionLine][positionCol + 1].equals("\uD83D\uDD35") || table[positionLine][positionCol + 1].equals("\uD83D\uDD34")){
                System.out.println("Tu as essayé de tricher, pour la peine tu passes ton tour !");
            }
            else {
                table[positionLine][positionCol + 1] = player;
                table[positionLine][positionCol] = "⬛";
            }
        }

        else if (choiceOfAction.equals("q")){
            if ((positionCol - 1) == -1){
                System.out.println("Tu as essayé de tricher en sortant de l'écran ! Tu croyais que ça allait te téléporter ? Pour la peine tu passes ton tour !");
            }
            else if (table[positionLine][positionCol - 1].equals("\uD83D\uDD35") || table[positionLine][positionCol - 1].equals("\uD83D\uDD34")){
                System.out.println("Tu as essayé de tricher, pour la peine tu passes ton tour !");
            }
            else {
                table[positionLine][positionCol - 1] = player;
                table[positionLine][positionCol] = "⬛";
            }
        }

        else if (choiceOfAction.equals("z")){
            if ((positionLine - 1) == - 1){
                System.out.println("Tu as essayé de tricher en sortant de l'écran ! Tu croyais que ça allait te téléporter ? Pour la peine tu passes ton tour !");
            }
            else if (table[positionLine - 1][positionCol].equals("\uD83D\uDD35")|| table[positionLine - 1][positionCol].equals("\uD83D\uDD34")){
                System.out.println("Tu as essayé de tricher, pour la peine tu passes ton tour !");
            }
            else {
                table[positionLine - 1][positionCol] = player;
                table[positionLine][positionCol] = "⬛";
            }
        }

        else if (choiceOfAction.equals("s")){

            if ((positionLine + 1) == 10){
                System.out.println("Tu as essayé de tricher en sortant de l'écran ! Tu croyais que ça allait te téléporter ? Pour la peine tu passes ton tour !");
            }
            else if (table[positionLine + 1][positionCol].equals("\uD83D\uDD35") || table[positionLine + 1][positionCol].equals("\uD83D\uDD34")){
                System.out.println("Tu as essayé de tricher, pour la peine tu passes ton tour !");
            }
            else {
                table[positionLine + 1][positionCol] = player;
                table[positionLine][positionCol] = "⬛";
            }
        }

        else{
            System.out.println("tu as essayé de rentrer une lettre non valide, tricheur, tu passes ton tour");
        }

        return table;
    }
}