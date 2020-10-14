package com.company;

import java.util.Scanner;

public class PlayerDestroyCase {

    public static String[][] destroyCase(String [][] table){

        System.out.println("Maintenant choisit une case à détruire ");
        System.out.println("Tu dois d'abord choisir une lettre de 'a' à 'k' qui sera la colonne ");
        Scanner userinput = new Scanner(System.in);

        String Xcoordinate = userinput.next();


        if (Xcoordinate.equals("a")){
            Xcoordinate = "0";
        }
        else if (Xcoordinate.equals("b")){
            Xcoordinate = "1";
        }
        else if (Xcoordinate.equals("c")){
            Xcoordinate = "2";
        }
        else if (Xcoordinate.equals("d")){
            Xcoordinate = "3";
        }
        else if (Xcoordinate.equals("e")){
            Xcoordinate = "4";
        }
        else if (Xcoordinate.equals("f")){
            Xcoordinate = "5";
        }
        else if (Xcoordinate.equals("g")){
            Xcoordinate = "6";
        }
        else if (Xcoordinate.equals("h")){
            Xcoordinate = "7";
        }
        else if (Xcoordinate.equals("i")){
            Xcoordinate = "8";
        }
        else if (Xcoordinate.equals("j")){
            Xcoordinate = "9";
        }
        else if (Xcoordinate.equals("k")){
            Xcoordinate = "10";
        }



        System.out.println("Tu dois maintenant choisir un chiffre de 0 à 10, ce chiffre correspond à la ligne ");
        int Ycoordinate = userinput.nextInt();


        table[Integer.parseInt(Xcoordinate)][Ycoordinate] = "X ";

        return table;

    }



}
