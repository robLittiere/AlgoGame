package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PlayerDestroyCase {

    public static String[][] destroyCase(String [][] table){

        System.out.println("Maintenant choisit une case à détruire ");
        System.out.println("Tu dois d'abord choisir une lettre de 'a' à 'k' qui sera la colonne ");
        Scanner userinput = new Scanner(System.in);
        String Ycoordinate = "a";

        //Easter egg, If you try to delet your opponent caracter two times you pass your turn//
        int tries = 1;

        while (true) {
            Ycoordinate = userinput.next();

            if (Ycoordinate.equals("a")) {
                Ycoordinate = "0";
                break;
            } else if (Ycoordinate.equals("b")) {
                Ycoordinate = "1";
                break;
            } else if (Ycoordinate.equals("c")) {
                Ycoordinate = "2";
                break;
            } else if (Ycoordinate.equals("d")) {
                Ycoordinate = "3";
                break;
            } else if (Ycoordinate.equals("e")) {
                Ycoordinate = "4";
                break;
            } else if (Ycoordinate.equals("f")) {
                Ycoordinate = "5";
                break;
            } else if (Ycoordinate.equals("g")) {
                Ycoordinate = "6";
                break;
            } else if (Ycoordinate.equals("h")) {
                Ycoordinate = "7";
                break;
            } else if (Ycoordinate.equals("i")) {
                Ycoordinate = "8";
                break;
            } else if (Ycoordinate.equals("j")) {
                Ycoordinate = "9";
                break;
            } else if (Ycoordinate.equals("k")) {
                Ycoordinate = "10";
                break;
            } else {
                System.out.println("Your entry is not valid, please choose a letter from 'a' to 'k' as presented in the grid.");
            }
        }




        System.out.println("Tu dois maintenant choisir un chiffre de 0 à 10, ce chiffre correspond à la ligne. ");

        while (true) {

            String Xcoordinate = userinput.next();

            if (Pattern.matches("[0-9]*", Xcoordinate) && (Integer.parseInt(Xcoordinate) < 10)
                    && (Integer.parseInt(Xcoordinate) > -1 ))
            {
                if ((table[Integer.parseInt(Xcoordinate)][Integer.parseInt(Ycoordinate)].equals("\uD83D\uDD35"))
                        || (table[Integer.parseInt(Xcoordinate)][Integer.parseInt(Ycoordinate)].equals("\uD83D\uDD34"))) {
                    if(tries != 2) {
                        System.out.println("You really tried to obliterate your opponent ? You got one last chance to do right ");
                        tries++;
                    }

                    else{
                        System.out.println("I warned you, now you pass your turn.");
                        break;
                    }

                }

                else {
                    table[Integer.parseInt(Xcoordinate)][Integer.parseInt(Ycoordinate)] = "⬜";
                    break;
                }

            }

            else
                {
                System.out.println("Your entry is not valid, please choose a number between 0 and 9");
            }
        }







        return table;

    }



}
