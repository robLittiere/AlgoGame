package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        char menu = 'm';        //to know where the player is in the menu 'r'; 'm'; 'p'; 'q';

        while (menu != 'q'){
            menu = gameMenu.menu(menu);
        }
    }
}
/*
public class Main {

    public static void main(String[] args) {

        String[][] gameBoard = PrintGame.createTable();
        PrintGame.printBoard(gameBoard);
        System.out.println();
        System.out.println();

        System.out.println("bienvenue");

        int j = 2;

        while (true){
            if (j % 2 == 0){
                System.out.println("It's player 1 turn, You're the red ball, don't forget !!");
                System.out.println();
                System.out.println();

                PlayerMove.Player1Move(gameBoard);
                PrintGame.printBoard(gameBoard);
            }

            else {
                System.out.println("It's player 2 turn, You're the blue ball, don't forget !!");
                System.out.println();
                System.out.println();

                PlayerMove.Player2Move(gameBoard);
                PrintGame.printBoard(gameBoard);
            }
            j++;
        }
    }
}
 */