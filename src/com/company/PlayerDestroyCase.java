package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PlayerDestroyCase {
    /**
     * Function that allows us to destroy a cell
     * @param table -- the game board in the state it is before the function call
     */
    public static void destroyCell(String [][] table){

        System.out.println("Now, choose a cell to destroy.");
        System.out.println("First you choose a letter among 'a' to 'k' which represent the column");

        //Initiate a scanner to get user input coordinates. Here is the Y coordinate
        Scanner userinput = new Scanner(System.in);
        String Ycoordinate;

        //Easter egg, If you try to delete your opponent character two times you'll pass your turn//
        int tries = 1;

        /*
         * Initiate infinite loop in order to force the player to play his turn avoiding any bugs
         * If user's Y coordinate is equal to one of the letter of the grid, we can get out of the loop
         */
        while (true) {
            Ycoordinate = userinput.next();

            if (Ycoordinate.equals("a")){
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
            }
            //If none of the option is valid, we go back to the beginning of the loop, reminding him his options
            else {
                System.out.println("Your entry is not valid, please choose a letter from 'a' to 'k' as presented in the grid.");
            }
        }


        System.out.println("Now, you must choose a number between 0 and 9, the number corresponds to the line coordinate");


        /*
         * Initiate infinite loop in order to force the player to play his turn avoiding any different bugs
         * If user's coordinates doesn't interfere with the other player's coordinates or a destroyed case, we break the loof and finish the turn
         */
        while (true) {

            String Xcoordinate = userinput.next();

            //Check if input is a number from 0 to 10
            if (Pattern.matches("[0-9]*", Xcoordinate) && (Integer.parseInt(Xcoordinate) < 10)
                    && (Integer.parseInt(Xcoordinate) > -1 ))
            {
                //Check if coordinates are not one of the players position
                if ((table[Integer.parseInt(Xcoordinate)][Integer.parseInt(Ycoordinate)].equals("\uD83D\uDD35"))
                        || (table[Integer.parseInt(Xcoordinate)][Integer.parseInt(Ycoordinate)].equals("\uD83D\uDD34"))) {
                    //If they are, we warn him that he cannot destroy his opponent's case
                    if(tries != 2) {
                        System.out.println("You really tried to obliterate your opponent ? You got one last chance to do right !");
                        tries++;
                    }
                    //If he does it again, he looses his turn
                    else{
                        System.out.println("I warned you, now you pass your turn.");
                        break;
                    }
                }
                //Check if coordinates correspond to a destroyed cell
                //If it is, he gets to replay his turn
                else if ((table[Integer.parseInt(Xcoordinate)][Integer.parseInt(Ycoordinate)].equals("⬜"))){
                    System.out.println("Oups, you tried to delete a cell that was already deleted, try again");
                }
                else {
                    table[Integer.parseInt(Xcoordinate)][Integer.parseInt(Ycoordinate)] = "⬜";
                    break;
                }
            }
            //If he chooses something else than a number from 0 to 9, player gets to choose again, reminding him his options
            else
                {
                System.out.println("Your entry is not valid, please choose a number between 0 and 9");
            }
        }
    }
}