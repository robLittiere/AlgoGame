package com.company;

import java.util.Scanner;

public class Main {

    /*
     * The main function.
     * We launch the whole game from here. We also terminate it from here.
     */
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        char menu = 'm';        //to know where the player is in the menu 'r'; 'm'; 'p'; 'q';

        while (menu != 'q'){
            menu = gameMenu.menu(menu);
        }
        System.out.println("Goodbye, thanks for playing");
    }
}